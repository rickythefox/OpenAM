//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.06.11 at 10:33:54 AM PDT 
//


package com.sun.identity.liberty.ws.common.jaxb.assertion.impl;

public class AdviceTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _AssertionIDReferenceOrAssertionOrAny;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getAssertionIDReferenceOrAssertionOrAny() {
        if (_AssertionIDReferenceOrAssertionOrAny == null) {
            _AssertionIDReferenceOrAssertionOrAny = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _AssertionIDReferenceOrAssertionOrAny;
    }

    public java.util.List getAssertionIDReferenceOrAssertionOrAny() {
        return _getAssertionIDReferenceOrAssertionOrAny();
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AdviceTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_AssertionIDReferenceOrAssertionOrAny == null)? 0 :_AssertionIDReferenceOrAssertionOrAny.size());
        while (idx1 != len1) {
            {
                java.lang.Object o = _AssertionIDReferenceOrAssertionOrAny.get(idx1);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsBody(((com.sun.xml.bind.JAXBObject) _AssertionIDReferenceOrAssertionOrAny.get(idx1 ++)), "AssertionIDReferenceOrAssertionOrAny");
                } else {
                    if (o instanceof java.lang.Object) {
                        context.childAsBody(((com.sun.xml.bind.JAXBObject) _AssertionIDReferenceOrAssertionOrAny.get(idx1 ++)), "AssertionIDReferenceOrAssertionOrAny");
                    } else {
                        com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "AssertionIDReferenceOrAssertionOrAny", o);
                    }
                }
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_AssertionIDReferenceOrAssertionOrAny == null)? 0 :_AssertionIDReferenceOrAssertionOrAny.size());
        while (idx1 != len1) {
            {
                java.lang.Object o = _AssertionIDReferenceOrAssertionOrAny.get(idx1);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _AssertionIDReferenceOrAssertionOrAny.get(idx1 ++)), "AssertionIDReferenceOrAssertionOrAny");
                } else {
                    if (o instanceof java.lang.Object) {
                        idx1 += 1;
                    } else {
                        com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "AssertionIDReferenceOrAssertionOrAny", o);
                    }
                }
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_AssertionIDReferenceOrAssertionOrAny == null)? 0 :_AssertionIDReferenceOrAssertionOrAny.size());
        while (idx1 != len1) {
            {
                java.lang.Object o = _AssertionIDReferenceOrAssertionOrAny.get(idx1);
                if (o instanceof com.sun.xml.bind.JAXBObject) {
                    context.childAsURIs(((com.sun.xml.bind.JAXBObject) _AssertionIDReferenceOrAssertionOrAny.get(idx1 ++)), "AssertionIDReferenceOrAssertionOrAny");
                } else {
                    if (o instanceof java.lang.Object) {
                        idx1 += 1;
                    } else {
                        com.sun.identity.federation.jaxb.entityconfig.impl.runtime.Util.handleTypeMismatchError(context, this, "AssertionIDReferenceOrAssertionOrAny", o);
                    }
                }
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.assertion.AdviceType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gramm"
+"ar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expression"
+"\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000bex"
+"pandedExpq\u0000~\u0000\u0002xpppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002x"
+"q\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\n"
+"psq\u0000~\u0000\u0000q\u0000~\u0000\npsr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom"
+".sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAtt"
+"ributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\np\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0006q\u0000~\u0000\np"
+"sr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000"
+"\tnameClassq\u0000~\u0000\u000exq\u0000~\u0000\u0003q\u0000~\u0000\npsr\u00002com.sun.msv.grammar.Expressio"
+"n$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\t\u0001q\u0000~\u0000\u0016sr\u0000 com.su"
+"n.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar"
+".NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$Ep"
+"silonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0017q\u0000~\u0000\u001csr\u0000#com.sun.msv.gr"
+"ammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/St"
+"ring;L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000Mcom.sun.identity.liberty.w"
+"s.common.jaxb.assertion.AssertionIDReferenceElementt\u0000+http:/"
+"/java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\rq\u0000~\u0000\np\u0000sq\u0000~\u0000\u0000ppsq"
+"\u0000~\u0000\u0006q\u0000~\u0000\npsq\u0000~\u0000\u0013q\u0000~\u0000\npq\u0000~\u0000\u0016q\u0000~\u0000\u001aq\u0000~\u0000\u001csq\u0000~\u0000\u001dt\u0000Bcom.sun.identi"
+"ty.liberty.ws.common.jaxb.assertion.AssertionElementq\u0000~\u0000!sq\u0000"
+"~\u0000\rq\u0000~\u0000\np\u0000sq\u0000~\u0000\u0013ppq\u0000~\u0000\u0016sr\u0000\'com.sun.msv.grammar.DifferenceNam"
+"eClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000eL\u0000\u0003nc2q\u0000~\u0000\u000exq\u0000~\u0000\u0019q\u0000~\u0000\u001asr\u0000#com.su"
+"n.msv.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u000eL\u0000\u0003nc2q\u0000~"
+"\u0000\u000exq\u0000~\u0000\u0019sr\u0000&com.sun.msv.grammar.NamespaceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0001L\u0000\fnamespaceURIq\u0000~\u0000\u001exq\u0000~\u0000\u0019t\u0000\u0000sq\u0000~\u0000.t\u0000%urn:oasis:names:tc:SA"
+"ML:1.0:assertionsq\u0000~\u0000.q\u0000~\u0000!q\u0000~\u0000\u001csr\u0000\"com.sun.msv.grammar.Expr"
+"essionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/Expr"
+"essionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPo"
+"ol$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$"
+"Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\b\u0001pq\u0000~\u0000\u0012q\u0000~\u0000$q\u0000~\u0000\u0011q"
+"\u0000~\u0000#q\u0000~\u0000\u000bq\u0000~\u0000\u0005q\u0000~\u0000\fq\u0000~\u0000\bx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "--");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AdviceTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("AssertionIDReference" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAssertionIDReferenceOrAssertionOrAny().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Assertion" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAssertionIDReferenceOrAssertionOrAny().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (!(("" == ___uri)||("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri))) {
                            java.lang.Object co = spawnWildcard(1, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAssertionIDReferenceOrAssertionOrAny().add(co);
                            }
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("AssertionIDReference" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAssertionIDReferenceOrAssertionOrAny().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionIDReferenceElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Assertion" == ___local)&&("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri)) {
                            _getAssertionIDReferenceOrAssertionOrAny().add(((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.assertion.impl.AssertionElementImpl.class), 1, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (!(("" == ___uri)||("urn:oasis:names:tc:SAML:1.0:assertion" == ___uri))) {
                            java.lang.Object co = spawnWildcard(1, ___uri, ___local, ___qname, __atts);
                            if (co!= null) {
                                _getAssertionIDReferenceOrAssertionOrAny().add(co);
                            }
                            return ;
                        }
                        state = 1;
                        continue outer;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
                        continue outer;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
                        continue outer;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  0 :
                        state = 1;
                        continue outer;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  1 :
                            revertToParentFromText(value);
                            return ;
                        case  0 :
                            state = 1;
                            continue outer;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
