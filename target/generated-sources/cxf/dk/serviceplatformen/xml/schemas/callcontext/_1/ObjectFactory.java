
package dk.serviceplatformen.xml.schemas.callcontext._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.serviceplatformen.xml.schemas.callcontext._1 package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _CallContext_QNAME = new QName("http://serviceplatformen.dk/xml/schemas/CallContext/1/", "CallContext");
    private final static QName _OnBehalfOfUser_QNAME = new QName("http://serviceplatformen.dk/xml/schemas/CallContext/1/", "OnBehalfOfUser");
    private final static QName _CallersServiceCallIdentifier_QNAME = new QName("http://serviceplatformen.dk/xml/schemas/CallContext/1/", "CallersServiceCallIdentifier");
    private final static QName _AccountingInfo_QNAME = new QName("http://serviceplatformen.dk/xml/schemas/CallContext/1/", "AccountingInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.serviceplatformen.xml.schemas.callcontext._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CallContextType }
     * 
     */
    public CallContextType createCallContextType() {
        return new CallContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CallContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CallContextType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/schemas/CallContext/1/", name = "CallContext")
    public JAXBElement<CallContextType> createCallContext(CallContextType value) {
        return new JAXBElement<CallContextType>(_CallContext_QNAME, CallContextType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/schemas/CallContext/1/", name = "OnBehalfOfUser")
    public JAXBElement<String> createOnBehalfOfUser(String value) {
        return new JAXBElement<String>(_OnBehalfOfUser_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/schemas/CallContext/1/", name = "CallersServiceCallIdentifier")
    public JAXBElement<String> createCallersServiceCallIdentifier(String value) {
        return new JAXBElement<String>(_CallersServiceCallIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/schemas/CallContext/1/", name = "AccountingInfo")
    public JAXBElement<String> createAccountingInfo(String value) {
        return new JAXBElement<String>(_AccountingInfo_QNAME, String.class, null, value);
    }

}
