
package dk.stoettesystemerne.organisation._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.stoettesystemerne.organisation._6 package. 
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

    private final static QName _Aktoer_QNAME = new QName("http://stoettesystemerne.dk/organisation/6/", "Aktoer");
    private final static QName _Gyldighed_QNAME = new QName("http://stoettesystemerne.dk/organisation/6/", "Gyldighed");
    private final static QName _GyldighedStatusKode_QNAME = new QName("http://stoettesystemerne.dk/organisation/6/", "GyldighedStatusKode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.stoettesystemerne.organisation._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AktoerType }
     * 
     */
    public AktoerType createAktoerType() {
        return new AktoerType();
    }

    /**
     * Create an instance of {@link GyldighedType }
     * 
     */
    public GyldighedType createGyldighedType() {
        return new GyldighedType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/organisation/6/", name = "Aktoer")
    public JAXBElement<AktoerType> createAktoer(AktoerType value) {
        return new JAXBElement<AktoerType>(_Aktoer_QNAME, AktoerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GyldighedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GyldighedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/organisation/6/", name = "Gyldighed")
    public JAXBElement<GyldighedType> createGyldighed(GyldighedType value) {
        return new JAXBElement<GyldighedType>(_Gyldighed_QNAME, GyldighedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GyldighedStatusKodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GyldighedStatusKodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/organisation/6/", name = "GyldighedStatusKode")
    public JAXBElement<GyldighedStatusKodeType> createGyldighedStatusKode(GyldighedStatusKodeType value) {
        return new JAXBElement<GyldighedStatusKodeType>(_GyldighedStatusKode_QNAME, GyldighedStatusKodeType.class, null, value);
    }

}
