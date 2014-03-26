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

package org.forgerock.openam.sts.persistence;

import org.forgerock.openam.sts.config.user.STSInstanceConfig;

/**
 * @see org.forgerock.openam.sts.persistence.STSInstancePersister
 * It may be that this class will ultimately reference the SMS in OpenAM to persist(remove) the json corresponding to the
 * STSInstanceConfig. For now, the implementation remains empty.
 */
public class STSInstancePersisterImpl implements STSInstancePersister {
    public void persistSTSInstance(STSInstanceConfig instance) {

    }

    public void removeSTSInstance(String realmPath) {

    }
}
