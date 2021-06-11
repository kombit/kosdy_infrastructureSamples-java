
package oio.sts.generelledefinitioner._1_2_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oio.sts.generelledefinitioner._1_2_4 package. 
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

    private final static QName _LokalUdvidelseListe_QNAME = new QName("urn:oio:sts:generelledefinitioner:1.2.4.0", "LokalUdvidelseListe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oio.sts.generelledefinitioner._1_2_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LokalUdvidelseListeType }
     * 
     */
    public LokalUdvidelseListeType createLokalUdvidelseListeType() {
        return new LokalUdvidelseListeType();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link LokalUdvidelseType }
     * 
     */
    public LokalUdvidelseType createLokalUdvidelseType() {
        return new LokalUdvidelseType();
    }

    /**
     * Create an instance of {@link RegistreringType }
     * 
     */
    public RegistreringType createRegistreringType() {
        return new RegistreringType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LokalUdvidelseListeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LokalUdvidelseListeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:generelledefinitioner:1.2.4.0", name = "LokalUdvidelseListe")
    public JAXBElement<LokalUdvidelseListeType> createLokalUdvidelseListe(LokalUdvidelseListeType value) {
        return new JAXBElement<LokalUdvidelseListeType>(_LokalUdvidelseListe_QNAME, LokalUdvidelseListeType.class, null, value);
    }

}
