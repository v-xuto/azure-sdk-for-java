/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.SynapseManager;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.IntegrationRuntimeAuthKeysInner;

/**
 * Type representing IntegrationRuntimeAuthKeys.
 */
public interface IntegrationRuntimeAuthKeys extends HasInner<IntegrationRuntimeAuthKeysInner>, HasManager<SynapseManager> {
    /**
     * @return the authKey1 value.
     */
    String authKey1();

    /**
     * @return the authKey2 value.
     */
    String authKey2();

}
