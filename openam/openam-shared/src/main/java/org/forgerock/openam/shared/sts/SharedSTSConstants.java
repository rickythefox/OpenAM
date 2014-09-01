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
 * Copyright 2014 ForgeRock AS. All rights reserved.
 */

package org.forgerock.openam.shared.sts;

/**
 * Defines some constants shared between the openam-sts module and the sts ViewBean/Model in openam-console.
 */
public class SharedSTSConstants {
    /*
    The name of the json field in the json rest-sts publish invocation that references the field which allows the
    marshalling logic in the RestSTSPublishServiceRequestHandler to distinguish between programmatic invocations via
    the client stk classes, which will publish with state generated by calling toJson() on an instance of the RestSTSInstanceConfig
    class, and the RestSecurityTokenServiceViewBean, which will publish with state harvested from the ViewBean property
     sheet, and will thus be in the format of Map<String, Set<String>>.
     */
    public static final String REST_STS_PUBLISH_INVOCATION_CONTEXT = "invocation_context";

    /*
    Used  as the value for the REST_STS_PUBLISH_INVOCATION_CONTEXT key for invocations to the rest sts publish service
    issued by the RestSecurityTokenServiceViewBean.
     */
    public static final String REST_STS_PUBLISH_INVOCATION_CONTEXT_VIEW_BEAN = "invocation_context_view_bean";

    /*
    Used as the key to the JsonValue corresponding to a wrapped Map<String, Set<String>> or the output of
    RestSTSInstanceConfig#toJson(), depending upon the invocation context.
     */
    public static final String REST_STS_PUBLISH_INSTANCE_STATE = "instance_state";

    /*
    This field referenced in RestDeploymentConfig.DEPLOYMENT_REALM. It is the name of the key of the json field referencing
    the realm in which the rest instance is deployed, which also matches the name of the AttributeSchema element defined in restSTS.xml
     */
    public static final String DEPLOYMENT_REALM = "deployment-realm";

    /*
    This field referenced in SAML2Config.TOKEN_LIFETIME. It is the name of the key of the json field referencing
    the token lifetime of issued saml2 assertions, which also matches the name of the AttributeSchema element defined in restSTS.xml
     */
    public static final String SAML2_TOKEN_LIFETIME = "saml2-token-lifetime-seconds";

    /*
    This field referenced in SAML2Config.SIGN_ASSERTION. It is the name of the key of the json field referencing
    whether the issued assertion should be signed, which also matches the name of the AttributeSchema element defined in restSTS.xml
     */
    public static final String SAML2_SIGN_ASSERTION = "saml2-sign-assertion";

    /*
    This field referenced in RestDeploymentConfig.URI_ELEMENT. It is the name of the key of the json field referencing
    the realm-relative url element where a published rest instance is to be exposed, which also matches the name of the
    AttributeSchema element defined in restSTS.xml
     */
    public static final String DEPLOYMENT_URL_ELEMENT = "deployment-url-element";

    /*
    This field referenced in STSInstanceConfig.ISSUER_NAME. It is the name of the key of the json field referencing
    the token issuer name, which also matches the name of the AttributeSchema element defined in restSTS.xml
     */
    public static final String ISSUER_NAME = "issuer-name";

    /*
    This field referenced in RestSTSInstanceConfig.SUPPORTED_TOKEN_TRANSLATIONS. It is the name of the key of the json field referencing
    the set of token transformations, which also matches the name of the AttributeSchema element defined in restSTS.xml
     */
    public static final String SUPPORTED_TOKEN_TRANSFORMS = "supported-token-transforms";

    /*
    The next 6 fields are referenced by the KeystoreConfig class. They define the names of the key of the json fields referencing
    keystore configuration state, which also matches the name of the related AttributeSchema elements defined in restSTS.xml
     */
    public static final String KEYSTORE_FILE_NAME = "keystore-filename";
    public static final String KEYSTORE_PASSWORD = "keystore-password";
    public static final String SIGNATURE_KEY_ALIAS = "keystore-signature-key-alias";
    public static final String ENCRYPTION_KEY_ALIAS = "keystore-encryption-key-alias";
    public static final String SIGNATURE_KEY_PASSWORD = "keystore-signature-key-password";
    public static final String ENCRYPTION_KEY_PASSWORD = "keystore-encryption-key-password";


    public static final String FORWARD_SLASH = "/";

    /*
    The url element at which the rest publish service is exposed. The rest-sts-publish corresponds to the entry in web.xml
    defining the servlet-mapping for the rest-sts-publish servlet.
     */
    public static final String REST_PUBLISH_SERVICE_URL_ELEMENT = "/rest-sts-publish/publish";

    /*
    The url constituent, appended to the REST_PUBLISH_SERVICE_URL_ELEMENT, which will trigger a POST to the rest-sts-publish
    crest service to create a new rest sts instance.
     */
    public static final String REST_PUBLISH_SERVICE_CREATE_ACTION_URL_ELEMENT = "?_action=create";

    public static final String CONTENT_TYPE = "Content-Type";
    public static final String APPLICATION_JSON = "application/json";
}
