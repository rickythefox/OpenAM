/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2010 ForgeRock AS. All Rights Reserved
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
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 */

package org.forgerock.openam.entitlement;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Holds the context of the policy evaluation making it available to policy
 * conditions.
 *
 * @author Steve Ferris steve.ferris@forgerock.com
 * @supported.all.api
 */
public class PrivilegeEvaluatorContext implements Serializable {
    private String realm;
    private String resourceName;
    private String applicationName;
    private Map<String, Object> attributes = new HashMap(2);

    /**
     * Creates a new Privilege Evaluator Context
     *
     * @param realm The realm of the policy evaluation
     * @param resourceName The resource being evaluated
     * @param applicationName The application being evaluated
     */
    public PrivilegeEvaluatorContext(String realm,
                                     String resourceName,
                                     String applicationName) {
        this.realm = realm;
        this.resourceName = resourceName;
        this.applicationName = applicationName;
    }

    /**
     * Return the realm
     *
     * @return The realm
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Return the resource name
     *
     * @return The resource name
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Return the application name
     *
     * @return The application name
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Set an attribute on the context
     *
     * @param key The key of the attribute
     * @param value The value
     */
    public void setAttribute(String key, Object value) {
        attributes.put(key, value);
    }

    /**
     * Fetch an attribute from the map
     *
     * @param key The key of the attribute
     * @return The value
     */
    public Object getAttributes(String key) {
        return attributes.get(key);
    }
}
