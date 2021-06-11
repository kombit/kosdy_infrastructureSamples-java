
package dk.serviceplatformen.xml.schemas.authoritycontext._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.serviceplatformen.xml.schemas.authoritycontext._1 package. 
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

    private final static QName _AuthorityContext_QNAME = new QName("http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/", "AuthorityContext");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.serviceplatformen.xml.schemas.authoritycontext._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthorityContextType }
     * 
     */
    public AuthorityContextType createAuthorityContextType() {
        return new AuthorityContextType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorityContextType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AuthorityContextType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/", name = "AuthorityContext")
    public JAXBElement<AuthorityContextType> createAuthorityContext(AuthorityContextType value) {
        return new JAXBElement<AuthorityContextType>(_AuthorityContext_QNAME, AuthorityContextType.class, null, value);
    }

}
