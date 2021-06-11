
package dk.kombit.xml.schemas.requestheader._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.kombit.xml.schemas.requestheader._1 package. 
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

    private final static QName _RequestHeader_QNAME = new QName("http://kombit.dk/xml/schemas/RequestHeader/1/", "RequestHeader");
    private final static QName _TransactionUUID_QNAME = new QName("http://kombit.dk/xml/schemas/RequestHeader/1/", "TransactionUUID");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.kombit.xml.schemas.requestheader._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestHeaderType }
     * 
     */
    public RequestHeaderType createRequestHeaderType() {
        return new RequestHeaderType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestHeaderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://kombit.dk/xml/schemas/RequestHeader/1/", name = "RequestHeader")
    public JAXBElement<RequestHeaderType> createRequestHeader(RequestHeaderType value) {
        return new JAXBElement<RequestHeaderType>(_RequestHeader_QNAME, RequestHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://kombit.dk/xml/schemas/RequestHeader/1/", name = "TransactionUUID")
    public JAXBElement<String> createTransactionUUID(String value) {
        return new JAXBElement<String>(_TransactionUUID_QNAME, String.class, null, value);
    }

}
