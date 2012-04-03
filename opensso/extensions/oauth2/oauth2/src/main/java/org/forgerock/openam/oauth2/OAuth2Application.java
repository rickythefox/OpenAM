/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright © 2012 ForgeRock. All rights reserved.
 */

package org.forgerock.openam.oauth2;

import org.forgerock.openam.oauth2.internal.ClientIdentityVerifier;
import org.forgerock.openam.oauth2.internal.UserIdentityVerifier;
import org.forgerock.openam.oauth2.store.impl.DefaultOAuthTokenStoreImpl;
import org.forgerock.restlet.ext.oauth2.OAuth2;
import org.forgerock.restlet.ext.oauth2.OAuth2Utils;
import org.forgerock.restlet.ext.oauth2.OAuthProblemException;
import org.forgerock.restlet.ext.oauth2.model.ClientApplication;
import org.forgerock.restlet.ext.oauth2.provider.ClientVerifier;
import org.forgerock.restlet.ext.oauth2.provider.OAuth2FlowFinder;
import org.forgerock.restlet.ext.oauth2.provider.OAuth2RealmRouter;
import org.forgerock.restlet.ext.oauth2.provider.OAuth2TokenStore;
import org.forgerock.restlet.ext.oauth2.provider.ValidationServerResource;
import org.forgerock.restlet.ext.openam.OpenAMParameters;
import org.forgerock.restlet.ext.openam.internal.OpenAMServerAuthorizer;
import org.forgerock.restlet.ext.openam.server.OpenAMServletAuthenticator;
import org.restlet.Application;
import org.restlet.Client;
import org.restlet.Context;
import org.restlet.Request;
import org.restlet.Restlet;
import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.ext.servlet.ServletUtils;
import org.restlet.routing.Router;
import org.restlet.security.ChallengeAuthenticator;
import org.restlet.security.Verifier;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * A NAME does ...
 * <p/>
 * <pre>
 * <!-- Servlet to Restlet adapter declaration (Mandatory) -->
 * <servlet>
 * <servlet-name>RestletAdapter</servlet-name>
 * <servlet-class>org.restlet.ext.servlet.ServerServlet</servlet-class>
 *
 * <!-- Your application class name (Optional - For mode 3) -->
 * <init-param>
 * <param-name>org.restlet.application</param-name>
 * <param-value>org.forgerock.openam.oauth2.OAuth2Application</param-value>
 * </init-param>
 *
 * <!-- List of supported client protocols (Optional - Only in mode 3) -->
 * <init-param>
 * <param-name>org.restlet.clients</param-name>
 * <param-value>RIAP CLAP FILE</param-value>
 * </init-param>
 * </servlet>
 *
 * <!-- servlet declaration -->
 *
 * <servlet-mapping>
 * <servlet-name>RestletAdapter</servlet-name>
 * <url-pattern>/oauth2/*</url-pattern>
 * </servlet-mapping>
 * </pre>
 *
 * @author Laszlo Hordos
 */
public class OAuth2Application extends Application {

    private URI redirectURI = null;

    @Override
    public Restlet createInboundRoot() {
        OAuth2RealmRouter root = new OAuth2RealmRouter(getContext());
        root.attachDefaultRealm(activate());

        // Add TokenInfo Resource
        OAuth2Utils.setTokenStore(getTokenStore(), getContext());
        root.attach(OAuth2Utils.getTokenInfoPath(getContext()), ValidationServerResource.class);

        return root;
    }

    public Restlet activate() {
        Context childContext = getContext().createChildContext();
        Router root = new Router(childContext);

        URI currentURI = getCurrentURI();
        redirectURI = currentURI.resolve("../oauth2demo/redirect");

        OpenAMParameters parameters = new OpenAMParameters();
        OpenAMServletAuthenticator authenticator = new OpenAMServletAuthenticator(childContext, parameters);
        // This endpoint protected by OpenAM Filter
        root.attach(OAuth2Utils.getAuthorizePath(childContext), authenticator);

        OpenAMServerAuthorizer authorizer = new OpenAMServerAuthorizer();
        authenticator.setNext(authorizer);


        // Define Authorization Endpoint
        OAuth2FlowFinder finder = new OAuth2FlowFinder(childContext, OAuth2.EndpointType.AUTHORIZATION_ENDPOINT).supportAuthorizationCode().supportClientCredentials().supportImplicit().supportPassword();
        authorizer.setNext(finder);


        ChallengeAuthenticator filter = new ChallengeAuthenticator(childContext, ChallengeScheme.HTTP_BASIC, "/");
        filter.setVerifier(new ClientIdentityVerifier(new OpenAMParameters(), Arrays.asList(redirectURI.toString())));

        //ClientAuthenticationFilter filter = new ClientAuthenticationFilter(childContext);
        // Try to authenticate the client The verifier MUST set
        //filter.setVerifier(getClientVerifier());
        root.attach(OAuth2Utils.getAccessTokenPath(childContext), filter);


        // Define Token Endpoint
        finder = new OAuth2FlowFinder(childContext, OAuth2.EndpointType.TOKEN_ENDPOINT).supportAuthorizationCode().supportClientCredentials().supportImplicit().supportPassword();
        filter.setNext(finder);


        //Configure context
        childContext.setDefaultVerifier(getUserVerifier());
        OAuth2Utils.setClientVerifier(getClientVerifier(), childContext);
        OAuth2Utils.setTokenStore(getTokenStore(), childContext);
        OAuth2Utils.setContextRealm("/", childContext);

        return root;
    }

    public ClientVerifier getClientVerifier() {
        return new TestClientVerifier();
    }

    public Verifier getUserVerifier() {
        return new UserIdentityVerifier(new OpenAMParameters());
    }

    public OAuth2TokenStore getTokenStore() {
        return new DefaultOAuthTokenStoreImpl();
    }

    // TEST


    protected URI getCurrentURI() {
        Object o = getContext().getAttributes().get(OAuth2Application.class.getName());
        URI root = null;

        if (o instanceof String) {
            String PATH = (String) o;
            root = URI.create(PATH.endsWith("/") ? PATH : PATH + "/");
        } else {
            Request request = Request.getCurrent();
            if (null != request) {
                HttpServletRequest servletRequest = ServletUtils.getRequest(request);
                String scheme = servletRequest.getScheme();             // http
                String serverName = servletRequest.getServerName();     // localhost
                int serverPort = servletRequest.getServerPort();        // 8080
                String contextPath = servletRequest.getContextPath();   // /openam
                String servletPath = servletRequest.getServletPath();   // /oauth2demo
                //String pathInfo = servletRequest.getPathInfo();         // /static/index.html
                //String queryString = servletRequest.getQueryString();          // d=789

                try {
                    root = new URI(scheme, null, serverName, serverPort, contextPath + servletPath + "/", null, null);
                } catch (URISyntaxException e) {
                    // Should not happen
                }
            }
        }
        if (null == root) {
            throw new RuntimeException("OAuth2DemoApplication can not detect current context");
        }
        return root;
    }

    private class TestClientVerifier implements ClientVerifier {

        @Override
        public ClientApplication verify(ChallengeResponse challengeResponse) throws OAuthProblemException {
            return new TestClientApplication();
        }

        @Override
        public ClientApplication verify(String client_id, String client_secret) throws OAuthProblemException {
            return new TestClientApplication();
        }

        @Override
        public Collection<ChallengeScheme> getRequiredAuthenticationScheme(String client_id) {
            return null;
        }

        @Override
        public ClientApplication findClient(String client_id) {
            return new TestClientApplication();
        }
    }

    private class TestClientApplication implements ClientApplication {

        @Override
        public String getClientId() {
            return "cid";
        }

        @Override
        public ClientType getClientType() {
            return ClientType.CONFIDENTIAL;
        }

        @Override
        public Set<URI> getRedirectionURIs() {
            Set<URI> cfg = new HashSet<URI>(1);
            cfg.add(URI.create("http://local.identitas.no:9085/openam/oauth2test/code-token.html"));
            cfg.add(redirectURI);
            return Collections.unmodifiableSet(cfg);
        }

        @Override
        public String getAccessTokenType() {
            return OAuth2.Bearer.BEARER;
        }

        @Override
        public String getClientAuthenticationSchema() {
            return null;
        }

        @Override
        public Set<String> allowedGrantScopes() {
            Set<String> scope = new HashSet<String>();
            scope.add("read");
            scope.add("write");
            return Collections.unmodifiableSet(scope);
        }

        @Override
        public Set<String> defaultGrantScopes() {
            Set<String> scope = new HashSet<String>();
            scope.add("read");
            return Collections.unmodifiableSet(scope);
        }

        @Override
        public boolean isAutoGrant() {
            return false;
        }
    }

}
