/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.keyvault.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the X509 component of a certificate.
 */
public class X509CertificateProperties {
    /**
     * The subject name. Should be a valid X509 distinguished Name.
     */
    @JsonProperty(value = "subject")
    private String subject;

    /**
     * The enhanced key usage.
     */
    @JsonProperty(value = "ekus")
    private List<String> ekus;

    /**
     * The subject alternative names.
     */
    @JsonProperty(value = "sans")
    private SubjectAlternativeNames subjectAlternativeNames;

    /**
     * List of key usages.
     */
    @JsonProperty(value = "key_usage")
    private List<KeyUsageType> keyUsage;

    /**
     * The duration that the ceritifcate is valid in months.
     */
    @JsonProperty(value = "validity_months")
    private Integer validityInMonths;

    /**
     * Get the subject value.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Set the subject value.
     *
     * @param subject the subject value to set
     * @return the X509CertificateProperties object itself.
     */
    public X509CertificateProperties withSubject(String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Get the ekus value.
     *
     * @return the ekus value
     */
    public List<String> ekus() {
        return this.ekus;
    }

    /**
     * Set the ekus value.
     *
     * @param ekus the ekus value to set
     * @return the X509CertificateProperties object itself.
     */
    public X509CertificateProperties withEkus(List<String> ekus) {
        this.ekus = ekus;
        return this;
    }

    /**
     * Get the subjectAlternativeNames value.
     *
     * @return the subjectAlternativeNames value
     */
    public SubjectAlternativeNames subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * Set the subjectAlternativeNames value.
     *
     * @param subjectAlternativeNames the subjectAlternativeNames value to set
     * @return the X509CertificateProperties object itself.
     */
    public X509CertificateProperties withSubjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    /**
     * Get the keyUsage value.
     *
     * @return the keyUsage value
     */
    public List<KeyUsageType> keyUsage() {
        return this.keyUsage;
    }

    /**
     * Set the keyUsage value.
     *
     * @param keyUsage the keyUsage value to set
     * @return the X509CertificateProperties object itself.
     */
    public X509CertificateProperties withKeyUsage(List<KeyUsageType> keyUsage) {
        this.keyUsage = keyUsage;
        return this;
    }

    /**
     * Get the validityInMonths value.
     *
     * @return the validityInMonths value
     */
    public Integer validityInMonths() {
        return this.validityInMonths;
    }

    /**
     * Set the validityInMonths value.
     *
     * @param validityInMonths the validityInMonths value to set
     * @return the X509CertificateProperties object itself.
     */
    public X509CertificateProperties withValidityInMonths(Integer validityInMonths) {
        this.validityInMonths = validityInMonths;
        return this;
    }

}
