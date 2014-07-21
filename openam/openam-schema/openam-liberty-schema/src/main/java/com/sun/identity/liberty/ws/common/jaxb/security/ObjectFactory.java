//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.security;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.common.jaxb.security package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(20, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.common.jaxb.security.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.security.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ProxySubjectElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxySubjectElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ValidityRestrictionConditionType.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ValidityRestrictionConditionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.SessionContextStatementType.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextStatementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ProxyTransitedStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxyTransitedStatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.SessionContextStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextStatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.MessageAuthenticationElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.MessageAuthenticationElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.SessionContextType.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ValidityRestrictionConditionElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ValidityRestrictionConditionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.RequesterAuthorizationElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.RequesterAuthorizationElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ProxyInfoConfirmationType.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxyInfoConfirmationTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementType.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.SessionContextElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.security.ProxyInfoConfirmationDataElement.class), "com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxyInfoConfirmationDataElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "ProxyInfoConfirmationData"), (com.sun.identity.liberty.ws.common.jaxb.security.ProxyInfoConfirmationDataElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "SessionContext"), (com.sun.identity.liberty.ws.common.jaxb.security.SessionContextElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "SessionContextStatement"), (com.sun.identity.liberty.ws.common.jaxb.security.SessionContextStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "MessageAuthentication"), (com.sun.identity.liberty.ws.common.jaxb.security.MessageAuthenticationElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "ProxySubject"), (com.sun.identity.liberty.ws.common.jaxb.security.ProxySubjectElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "ProxyTransitedStatement"), (com.sun.identity.liberty.ws.common.jaxb.security.ProxyTransitedStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "ValidityRestrictionCondition"), (com.sun.identity.liberty.ws.common.jaxb.security.ValidityRestrictionConditionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "ResourceAccessStatement"), (com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sec:2003-08", "RequesterAuthorization"), (com.sun.identity.liberty.ws.common.jaxb.security.RequesterAuthorizationElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.common.jaxb.security
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of ProxySubjectElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ProxySubjectElement createProxySubjectElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxySubjectElementImpl();
    }

    /**
     * Create an instance of ValidityRestrictionConditionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ValidityRestrictionConditionType createValidityRestrictionConditionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ValidityRestrictionConditionTypeImpl();
    }

    /**
     * Create an instance of SessionContextStatementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.SessionContextStatementType createSessionContextStatementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextStatementTypeImpl();
    }

    /**
     * Create an instance of ProxyTransitedStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ProxyTransitedStatementElement createProxyTransitedStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxyTransitedStatementElementImpl();
    }

    /**
     * Create an instance of SessionContextStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.SessionContextStatementElement createSessionContextStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextStatementElementImpl();
    }

    /**
     * Create an instance of MessageAuthenticationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.MessageAuthenticationElement createMessageAuthenticationElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.MessageAuthenticationElementImpl();
    }

    /**
     * Create an instance of MessageAuthenticationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.MessageAuthenticationElement createMessageAuthenticationElement(javax.xml.namespace.QName value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.MessageAuthenticationElementImpl(value);
    }

    /**
     * Create an instance of SessionContextType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.SessionContextType createSessionContextType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextTypeImpl();
    }

    /**
     * Create an instance of ValidityRestrictionConditionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ValidityRestrictionConditionElement createValidityRestrictionConditionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ValidityRestrictionConditionElementImpl();
    }

    /**
     * Create an instance of RequesterAuthorizationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.RequesterAuthorizationElement createRequesterAuthorizationElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.RequesterAuthorizationElementImpl();
    }

    /**
     * Create an instance of RequesterAuthorizationElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.RequesterAuthorizationElement createRequesterAuthorizationElement(javax.xml.namespace.QName value)
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.RequesterAuthorizationElementImpl(value);
    }

    /**
     * Create an instance of ProxyInfoConfirmationType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ProxyInfoConfirmationType createProxyInfoConfirmationType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxyInfoConfirmationTypeImpl();
    }

    /**
     * Create an instance of ResourceAccessStatementType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementType createResourceAccessStatementType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementTypeImpl();
    }

    /**
     * Create an instance of SessionContextElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.SessionContextElement createSessionContextElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.SessionContextElementImpl();
    }

    /**
     * Create an instance of ResourceAccessStatementElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ResourceAccessStatementElement createResourceAccessStatementElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ResourceAccessStatementElementImpl();
    }

    /**
     * Create an instance of ProxyInfoConfirmationDataElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.security.ProxyInfoConfirmationDataElement createProxyInfoConfirmationDataElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.security.impl.ProxyInfoConfirmationDataElementImpl();
    }

}