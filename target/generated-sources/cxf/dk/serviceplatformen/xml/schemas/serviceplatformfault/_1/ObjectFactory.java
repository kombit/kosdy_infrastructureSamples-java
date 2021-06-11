
package dk.serviceplatformen.xml.schemas.serviceplatformfault._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.serviceplatformen.xml.schemas.serviceplatformfault._1 package. 
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

    private final static QName _ServiceplatformFault_QNAME = new QName("http://serviceplatformen.dk/xml/schemas/ServiceplatformFault/1/", "ServiceplatformFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.serviceplatformen.xml.schemas.serviceplatformfault._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceplatformFaultType }
     * 
     */
    public ServiceplatformFaultType createServiceplatformFaultType() {
        return new ServiceplatformFaultType();
    }

    /**
     * Create an instance of {@link ErrorListType }
     * 
     */
    public ErrorListType createErrorListType() {
        return new ErrorListType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceplatformFaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceplatformFaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/schemas/ServiceplatformFault/1/", name = "ServiceplatformFault")
    public JAXBElement<ServiceplatformFaultType> createServiceplatformFault(ServiceplatformFaultType value) {
        return new JAXBElement<ServiceplatformFaultType>(_ServiceplatformFault_QNAME, ServiceplatformFaultType.class, null, value);
    }

}
