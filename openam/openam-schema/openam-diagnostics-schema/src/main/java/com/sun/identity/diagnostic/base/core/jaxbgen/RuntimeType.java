//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.08 at 08:59:44 DU CEST 
//


package com.sun.identity.diagnostic.base.core.jaxbgen;


/**
 * Java content class for anonymous complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/aldaris/temp/openam10/opensso/products/amserver/source/com/sun/identity/diagnostic/base/config/service.xsd line 67)
 * <p>
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}load-on-startup"/>
 *         &lt;element ref="{}libraries"/>
 *         &lt;element ref="{}resource-bundles"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface RuntimeType {


    /**
     * Gets the value of the libraries property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesType}
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesElement}
     */
    com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesType getLibraries();

    /**
     * Sets the value of the libraries property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesType}
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesElement}
     */
    void setLibraries(com.sun.identity.diagnostic.base.core.jaxbgen.LibrariesType value);

    /**
     * Gets the value of the loadOnStartup property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupElement}
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupType}
     */
    com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupType getLoadOnStartup();

    /**
     * Sets the value of the loadOnStartup property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupElement}
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupType}
     */
    void setLoadOnStartup(com.sun.identity.diagnostic.base.core.jaxbgen.LoadOnStartupType value);

    /**
     * Gets the value of the resourceBundles property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesType}
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesElement}
     */
    com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesType getResourceBundles();

    /**
     * Sets the value of the resourceBundles property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesType}
     *     {@link com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesElement}
     */
    void setResourceBundles(com.sun.identity.diagnostic.base.core.jaxbgen.ResourceBundlesType value);

}
