/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Sku of Azure Spring Cloud.
 */
public class SkuInner {
    /**
     * Name of the Sku.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Tier of the Sku.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /**
     * Current capacity of the target resource.
     */
    @JsonProperty(value = "capacity")
    private Integer capacity;

    /**
     * Get name of the Sku.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the Sku.
     *
     * @param name the name value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get tier of the Sku.
     *
     * @return the tier value
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set tier of the Sku.
     *
     * @param tier the tier value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get current capacity of the target resource.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

    /**
     * Set current capacity of the target resource.
     *
     * @param capacity the capacity value to set
     * @return the SkuInner object itself.
     */
    public SkuInner withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

}
