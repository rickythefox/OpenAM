/*
 * DO NOT REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2013-2014 ForgeRock AS. All rights reserved.
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * http://forgerock.org/license/CDDLv1.0.html
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at http://forgerock.org/license/CDDLv1.0.html
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions copyright [year] [name of copyright owner]"
 */

package org.forgerock.openam.forgerockrest.server;

import com.iplanet.am.util.SystemProperties;
import com.sun.identity.authentication.client.AuthClientUtils;
import com.sun.identity.shared.Constants;
import com.sun.identity.shared.debug.Debug;
import org.forgerock.json.fluent.JsonValue;
import org.forgerock.json.resource.ActionRequest;
import org.forgerock.json.resource.CollectionResourceProvider;
import org.forgerock.json.resource.CreateRequest;
import org.forgerock.json.resource.DeleteRequest;
import org.forgerock.json.resource.NotFoundException;
import org.forgerock.json.resource.NotSupportedException;
import org.forgerock.json.resource.PatchRequest;
import org.forgerock.json.resource.QueryRequest;
import org.forgerock.json.resource.QueryResultHandler;
import org.forgerock.json.resource.ReadRequest;
import org.forgerock.json.resource.Resource;
import org.forgerock.json.resource.ResourceException;
import org.forgerock.json.resource.ResultHandler;
import org.forgerock.json.resource.ServerContext;
import org.forgerock.json.resource.UpdateRequest;
import org.forgerock.openam.forgerockrest.RestUtils;
import org.forgerock.openam.rest.resource.RealmContext;
import org.forgerock.openam.services.RestSecurity;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Represents Server Information that can be queried via a REST interface.
 *
 * This resources acts as a read only resource for the moment.
 *
 * @author alin.brici@forgerock.com
 */
public class ServerInfoResource implements CollectionResourceProvider {

    private static Debug debug = Debug.getInstance("frRest");
    
    /**
     * Retrieves the cookie domains set on the server
     * @param context Current Server Context
     * @param request Request from client to retrieve id
     * @param handler Result handler which handles error or success
     */
    private void getCookieDomains(ServerContext context, String resourceId,  ReadRequest request,
            ResultHandler<Resource> handler) {
        JsonValue result = new JsonValue(new LinkedHashMap<String, Object>(1));
        Set<String> cookieDomains;
        Resource resource;
        int rev;
        try {
            cookieDomains = AuthClientUtils.getCookieDomains();
            rev = cookieDomains.hashCode();
            result.put("domains", cookieDomains);
            resource = new Resource(resourceId, Integer.toString(rev), result);
            handler.handleResult(resource);
        } catch (Exception e) {
            debug.error("ServerInforResource.getCookieDomains:: Cannot retrieve cookie domains." + e);
            handler.handleError(new NotFoundException(e.getMessage()));
        }
    }
    /**
     * Retrieves all server info set on the server
     * @param context Current Server Context
     * @param request Request from client to retrieve id
     * @param handler Result handler which handles error or success
     */
    private void getAllServerInfo(ServerContext context, String resourceId,  ReadRequest request,
            ResultHandler<Resource> handler, final String realm) {
        JsonValue result = new JsonValue(new LinkedHashMap<String, Object>(1));
        Set<String> cookieDomains;
        Resource resource;
        RestSecurity restSecurity = new RestSecurity(realm);
        try {
            cookieDomains = AuthClientUtils.getCookieDomains();
            result.put("domains", cookieDomains);
            result.put("cookieName", SystemProperties.get(Constants.AM_COOKIE_NAME,"iPlanetDirectoryPro"));
            result.put("forgotPassword", String.valueOf(restSecurity.isForgotPassword()));
            result.put("selfRegistration", String.valueOf(restSecurity.isSelfRegistration()));
            resource = new Resource(resourceId, Integer.toString(result.asMap().hashCode()), result);
            handler.handleResult(resource);
        } catch (Exception e) {
            debug.error("ServerInforResource.getAllServerInfo:: Cannot retrieve all server info. " + e);
            handler.handleError(new NotFoundException(e.getMessage()));
        }
    }
    /**
     * {@inheritDoc}
     */
    public void actionCollection(ServerContext context, ActionRequest request, ResultHandler<JsonValue> handler) {
        RestUtils.generateUnsupportedOperation(handler);
    }

    /**
     * {@inheritDoc}
     */
    public void actionInstance(ServerContext context, String s, ActionRequest request,
            ResultHandler<JsonValue> handler) {
        //To change body of implemented methods use File | Settings | File Templates.
        RestUtils.generateUnsupportedOperation(handler);
    }

    /**
     * {@inheritDoc}
     */
    public void createInstance(ServerContext context, CreateRequest request, ResultHandler<Resource> handler) {
        RestUtils.generateUnsupportedOperation(handler);
    }

    /**
     * {@inheritDoc}
     */
    public void deleteInstance(ServerContext context, String s, DeleteRequest request,
            ResultHandler<Resource> handler) {
        RestUtils.generateUnsupportedOperation(handler);    }

    /**
     * {@inheritDoc}
     */
    public void patchInstance(ServerContext context, String s, PatchRequest request, ResultHandler<Resource> handler) {
        RestUtils.generateUnsupportedOperation(handler);
    }

    /**
     * {@inheritDoc}
     */
    public void queryCollection(ServerContext context, QueryRequest request, QueryResultHandler handler) {
        RestUtils.generateUnsupportedOperation(handler);
    }

    /**
     * {@inheritDoc}
     */
    public void readInstance(ServerContext context, String s, ReadRequest request, ResultHandler<Resource> handler) {

        RealmContext realmContext = context.asContext(RealmContext.class);
        String realm = realmContext.getRealm();

        if(s.equalsIgnoreCase("cookieDomains")) {
            getCookieDomains(context, s, request, handler);
        } else if (s.equalsIgnoreCase("*")) { 
            getAllServerInfo(context, s, request, handler, realm);
        } else { // for now this is the only case coming in, so fail if otherwise
            final ResourceException e = new NotSupportedException("ResourceId not supported: " + s);
            handler.handleError(e);
        }
    }

    /**
     * {@inheritDoc}
     */
    public void updateInstance(ServerContext context, String s, UpdateRequest request,
            ResultHandler<Resource> handler) {
        RestUtils.generateUnsupportedOperation(handler);
    }
}