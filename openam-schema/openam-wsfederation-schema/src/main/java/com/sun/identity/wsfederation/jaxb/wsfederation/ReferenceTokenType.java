//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:34:16 AM PDT 
//


package com.sun.identity.wsfederation.jaxb.wsfederation;


/**
 * Java content class for ReferenceTokenType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/wsfederation/ws-federation.xsd line 311)
 * <p>
 * <pre>
 * &lt;complexType name="ReferenceTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenceEPR" type="{http://www.w3.org/2005/08/addressing}EndpointReferenceType" maxOccurs="unbounded"/>
 *         &lt;element name="ReferenceDigest" type="{http://schemas.xmlsoap.org/ws/2006/12/federation}ReferenceDigestType" minOccurs="0"/>
 *         &lt;element name="ReferenceType" type="{http://schemas.xmlsoap.org/ws/2006/12/federation}AttributeExtensibleURI" minOccurs="0"/>
 *         &lt;element name="SerialNo" type="{http://schemas.xmlsoap.org/ws/2006/12/federation}AttributeExtensibleURI" minOccurs="0"/>
 *         &lt;any/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ReferenceTokenType {


    /**
     * Gets the value of the Any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link java.lang.Object}
     * 
     */
    java.util.List getAny();

    /**
     * Gets the value of the referenceDigest property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.wsfederation.jaxb.wsfederation.ReferenceDigestType}
     */
    com.sun.identity.wsfederation.jaxb.wsfederation.ReferenceDigestType getReferenceDigest();

    /**
     * Sets the value of the referenceDigest property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.wsfederation.jaxb.wsfederation.ReferenceDigestType}
     */
    void setReferenceDigest(com.sun.identity.wsfederation.jaxb.wsfederation.ReferenceDigestType value);

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI}
     */
    com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI getReferenceType();

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI}
     */
    void setReferenceType(com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI value);

    /**
     * Gets the value of the serialNo property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI}
     */
    com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI getSerialNo();

    /**
     * Sets the value of the serialNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI}
     */
    void setSerialNo(com.sun.identity.wsfederation.jaxb.wsfederation.AttributeExtensibleURI value);

    /**
     * Gets the value of the ReferenceEPR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ReferenceEPR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceEPR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.wsfederation.jaxb.wsaddr.EndpointReferenceType}
     * 
     */
    java.util.List getReferenceEPR();

}
