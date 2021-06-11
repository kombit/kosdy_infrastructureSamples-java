
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.UuidNoteInputType;
import oio.sts.generelleoperationer._1_2_4.LaesIndeksInputType;
import oio.sts.generelleoperationer._1_2_4.ListIndeksInputType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oio.sts.sagdok.sagindeks._1_2_4 package. 
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

    private final static QName _SagIndeksEgenskaber_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "SagIndeksEgenskaber");
    private final static QName _SagsaktoerLokalUdvidelse_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "SagsaktoerLokalUdvidelse");
    private final static QName _SagsklasseLokalUdvidelse_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "SagsklasseLokalUdvidelse");
    private final static QName _SagspartLokalUdvidelse_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "SagspartLokalUdvidelse");
    private final static QName _SagsgenstandeLokalUdvidelse_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "SagsgenstandeLokalUdvidelse");
    private final static QName _Sikkerhedsprofil_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "Sikkerhedsprofil");
    private final static QName _SagsitsystemRelation_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "SagsitsystemRelation");
    private final static QName _LaesInput_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "LaesInput");
    private final static QName _ListInput_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "ListInput");
    private final static QName _FjernInput_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "FjernInput");
    private final static QName _FjernOutput_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "FjernOutput");
    private final static QName _KasserInput_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "KasserInput");
    private final static QName _KasserOutput_QNAME = new QName("urn:oio:sts:sagdok:sagindeks:1.2.4.0", "KasserOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oio.sts.sagdok.sagindeks._1_2_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EgenskaberType }
     * 
     */
    public EgenskaberType createEgenskaberType() {
        return new EgenskaberType();
    }

    /**
     * Create an instance of {@link SagsaktoerLokalUdvidelseType }
     * 
     */
    public SagsaktoerLokalUdvidelseType createSagsaktoerLokalUdvidelseType() {
        return new SagsaktoerLokalUdvidelseType();
    }

    /**
     * Create an instance of {@link SagsklasseLokalUdvidelseType }
     * 
     */
    public SagsklasseLokalUdvidelseType createSagsklasseLokalUdvidelseType() {
        return new SagsklasseLokalUdvidelseType();
    }

    /**
     * Create an instance of {@link SagspartLokalUdvidelseType }
     * 
     */
    public SagspartLokalUdvidelseType createSagspartLokalUdvidelseType() {
        return new SagspartLokalUdvidelseType();
    }

    /**
     * Create an instance of {@link SagsgenstandeLokalUdvidelseType }
     * 
     */
    public SagsgenstandeLokalUdvidelseType createSagsgenstandeLokalUdvidelseType() {
        return new SagsgenstandeLokalUdvidelseType();
    }

    /**
     * Create an instance of {@link SikkerhedsprofilRelationType }
     * 
     */
    public SikkerhedsprofilRelationType createSikkerhedsprofilRelationType() {
        return new SikkerhedsprofilRelationType();
    }

    /**
     * Create an instance of {@link SagsitsystemRelationType }
     * 
     */
    public SagsitsystemRelationType createSagsitsystemRelationType() {
        return new SagsitsystemRelationType();
    }

    /**
     * Create an instance of {@link KasserInputType }
     * 
     */
    public KasserInputType createKasserInputType() {
        return new KasserInputType();
    }

    /**
     * Create an instance of {@link SoegeordType }
     * 
     */
    public SoegeordType createSoegeordType() {
        return new SoegeordType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgenskaberType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EgenskaberType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "SagIndeksEgenskaber")
    public JAXBElement<EgenskaberType> createSagIndeksEgenskaber(EgenskaberType value) {
        return new JAXBElement<EgenskaberType>(_SagIndeksEgenskaber_QNAME, EgenskaberType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagsaktoerLokalUdvidelseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagsaktoerLokalUdvidelseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "SagsaktoerLokalUdvidelse")
    public JAXBElement<SagsaktoerLokalUdvidelseType> createSagsaktoerLokalUdvidelse(SagsaktoerLokalUdvidelseType value) {
        return new JAXBElement<SagsaktoerLokalUdvidelseType>(_SagsaktoerLokalUdvidelse_QNAME, SagsaktoerLokalUdvidelseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagsklasseLokalUdvidelseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagsklasseLokalUdvidelseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "SagsklasseLokalUdvidelse")
    public JAXBElement<SagsklasseLokalUdvidelseType> createSagsklasseLokalUdvidelse(SagsklasseLokalUdvidelseType value) {
        return new JAXBElement<SagsklasseLokalUdvidelseType>(_SagsklasseLokalUdvidelse_QNAME, SagsklasseLokalUdvidelseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagspartLokalUdvidelseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagspartLokalUdvidelseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "SagspartLokalUdvidelse")
    public JAXBElement<SagspartLokalUdvidelseType> createSagspartLokalUdvidelse(SagspartLokalUdvidelseType value) {
        return new JAXBElement<SagspartLokalUdvidelseType>(_SagspartLokalUdvidelse_QNAME, SagspartLokalUdvidelseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagsgenstandeLokalUdvidelseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagsgenstandeLokalUdvidelseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "SagsgenstandeLokalUdvidelse")
    public JAXBElement<SagsgenstandeLokalUdvidelseType> createSagsgenstandeLokalUdvidelse(SagsgenstandeLokalUdvidelseType value) {
        return new JAXBElement<SagsgenstandeLokalUdvidelseType>(_SagsgenstandeLokalUdvidelse_QNAME, SagsgenstandeLokalUdvidelseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SikkerhedsprofilRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SikkerhedsprofilRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "Sikkerhedsprofil")
    public JAXBElement<SikkerhedsprofilRelationType> createSikkerhedsprofil(SikkerhedsprofilRelationType value) {
        return new JAXBElement<SikkerhedsprofilRelationType>(_Sikkerhedsprofil_QNAME, SikkerhedsprofilRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagsitsystemRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagsitsystemRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "SagsitsystemRelation")
    public JAXBElement<SagsitsystemRelationType> createSagsitsystemRelation(SagsitsystemRelationType value) {
        return new JAXBElement<SagsitsystemRelationType>(_SagsitsystemRelation_QNAME, SagsitsystemRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaesIndeksInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LaesIndeksInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "LaesInput")
    public JAXBElement<LaesIndeksInputType> createLaesInput(LaesIndeksInputType value) {
        return new JAXBElement<LaesIndeksInputType>(_LaesInput_QNAME, LaesIndeksInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListIndeksInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListIndeksInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "ListInput")
    public JAXBElement<ListIndeksInputType> createListInput(ListIndeksInputType value) {
        return new JAXBElement<ListIndeksInputType>(_ListInput_QNAME, ListIndeksInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "FjernInput")
    public JAXBElement<UuidNoteInputType> createFjernInput(UuidNoteInputType value) {
        return new JAXBElement<UuidNoteInputType>(_FjernInput_QNAME, UuidNoteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "FjernOutput")
    public JAXBElement<BasicOutputType> createFjernOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_FjernOutput_QNAME, BasicOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KasserInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KasserInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "KasserInput")
    public JAXBElement<KasserInputType> createKasserInput(KasserInputType value) {
        return new JAXBElement<KasserInputType>(_KasserInput_QNAME, KasserInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sagindeks:1.2.4.0", name = "KasserOutput")
    public JAXBElement<BasicOutputType> createKasserOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_KasserOutput_QNAME, BasicOutputType.class, null, value);
    }

}
