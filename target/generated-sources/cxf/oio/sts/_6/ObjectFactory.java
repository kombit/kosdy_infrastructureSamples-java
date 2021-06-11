
package oio.sts._6;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oio.sts._6 package. 
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

    private final static QName _CVRNummerTekst_QNAME = new QName("urn:oio:sts:6", "CVR-NummerTekst");
    private final static QName _SENummerTekst_QNAME = new QName("urn:oio:sts:6", "SE-NummerTekst");
    private final static QName _PNummerTekst_QNAME = new QName("urn:oio:sts:6", "P-NummerTekst");
    private final static QName _CPRNummerTekst_QNAME = new QName("urn:oio:sts:6", "CPR-NummerTekst");
    private final static QName _NavnTekst_QNAME = new QName("urn:oio:sts:6", "NavnTekst");
    private final static QName _AdresseTekst_QNAME = new QName("urn:oio:sts:6", "AdresseTekst");
    private final static QName _MyndighedsKode_QNAME = new QName("urn:oio:sts:6", "MyndighedsKode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oio.sts._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "CVR-NummerTekst")
    public JAXBElement<String> createCVRNummerTekst(String value) {
        return new JAXBElement<String>(_CVRNummerTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "SE-NummerTekst")
    public JAXBElement<String> createSENummerTekst(String value) {
        return new JAXBElement<String>(_SENummerTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "P-NummerTekst")
    public JAXBElement<String> createPNummerTekst(String value) {
        return new JAXBElement<String>(_PNummerTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "CPR-NummerTekst")
    public JAXBElement<String> createCPRNummerTekst(String value) {
        return new JAXBElement<String>(_CPRNummerTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "NavnTekst")
    public JAXBElement<String> createNavnTekst(String value) {
        return new JAXBElement<String>(_NavnTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "AdresseTekst")
    public JAXBElement<String> createAdresseTekst(String value) {
        return new JAXBElement<String>(_AdresseTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:6", name = "MyndighedsKode")
    public JAXBElement<String> createMyndighedsKode(String value) {
        return new JAXBElement<String>(_MyndighedsKode_QNAME, String.class, null, value);
    }

}
