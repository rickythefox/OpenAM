//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.secext;


/**
 * This type is used for password elements per Section 4.1.
 * Java content class for PasswordString complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/Users/allan/A-SVN/trunk/opensso/products/federation/library/xsd/liberty/secext.xsd line 46)
 * <p>
 * <pre>
 * &lt;complexType name="PasswordString">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://schemas.xmlsoap.org/ws/2003/06/secext>AttributedString">
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}QName" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface PasswordString
    extends com.sun.identity.liberty.ws.common.jaxb.secext.AttributedString
{


    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.namespace.QName}
     */
    javax.xml.namespace.QName getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.namespace.QName}
     */
    void setType(javax.xml.namespace.QName value);

}
