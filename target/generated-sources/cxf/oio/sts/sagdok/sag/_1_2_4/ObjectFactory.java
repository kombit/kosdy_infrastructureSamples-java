
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.LaesInputType;
import oio.sagdok._3_0.ListInputType;
import oio.sagdok._3_0.OpretOutputType;
import oio.sagdok._3_0.SoegOutputType;
import oio.sagdok._3_0.UuidNoteInputType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oio.sts.sagdok.sag._1_2_4 package. 
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

    private final static QName _Sag_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "Sag");
    private final static QName _ImportInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "ImportInput");
    private final static QName _ImportOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "ImportOutput");
    private final static QName _OpretInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "OpretInput");
    private final static QName _OpretOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "OpretOutput");
    private final static QName _RetInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "RetInput");
    private final static QName _RetOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "RetOutput");
    private final static QName _PassiverInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "PassiverInput");
    private final static QName _PassiverOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "PassiverOutput");
    private final static QName _SletInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "SletInput");
    private final static QName _SletOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "SletOutput");
    private final static QName _LaesInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "LaesInput");
    private final static QName _LaesOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "LaesOutput");
    private final static QName _ListInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "ListInput");
    private final static QName _ListOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "ListOutput");
    private final static QName _SoegInput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "SoegInput");
    private final static QName _SoegOutput_QNAME = new QName("urn:oio:sts:sagdok:sag:1.2.4.0", "SoegOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oio.sts.sagdok.sag._1_2_4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SagType }
     * 
     */
    public SagType createSagType() {
        return new SagType();
    }

    /**
     * Create an instance of {@link ImportInputType }
     * 
     */
    public ImportInputType createImportInputType() {
        return new ImportInputType();
    }

    /**
     * Create an instance of {@link OpretInputType }
     * 
     */
    public OpretInputType createOpretInputType() {
        return new OpretInputType();
    }

    /**
     * Create an instance of {@link RetInputType }
     * 
     */
    public RetInputType createRetInputType() {
        return new RetInputType();
    }

    /**
     * Create an instance of {@link LaesOutputType }
     * 
     */
    public LaesOutputType createLaesOutputType() {
        return new LaesOutputType();
    }

    /**
     * Create an instance of {@link ListOutputType }
     * 
     */
    public ListOutputType createListOutputType() {
        return new ListOutputType();
    }

    /**
     * Create an instance of {@link SoegInputType }
     * 
     */
    public SoegInputType createSoegInputType() {
        return new SoegInputType();
    }

    /**
     * Create an instance of {@link RegistreringType }
     * 
     */
    public RegistreringType createRegistreringType() {
        return new RegistreringType();
    }

    /**
     * Create an instance of {@link AttributListeType }
     * 
     */
    public AttributListeType createAttributListeType() {
        return new AttributListeType();
    }

    /**
     * Create an instance of {@link TilstandListeType }
     * 
     */
    public TilstandListeType createTilstandListeType() {
        return new TilstandListeType();
    }

    /**
     * Create an instance of {@link RelationListeType }
     * 
     */
    public RelationListeType createRelationListeType() {
        return new RelationListeType();
    }

    /**
     * Create an instance of {@link EgenskaberType }
     * 
     */
    public EgenskaberType createEgenskaberType() {
        return new EgenskaberType();
    }

    /**
     * Create an instance of {@link FremdriftType }
     * 
     */
    public FremdriftType createFremdriftType() {
        return new FremdriftType();
    }

    /**
     * Create an instance of {@link JournalpostRelationType }
     * 
     */
    public JournalpostRelationType createJournalpostRelationType() {
        return new JournalpostRelationType();
    }

    /**
     * Create an instance of {@link JournalpostEgenskaberType }
     * 
     */
    public JournalpostEgenskaberType createJournalpostEgenskaberType() {
        return new JournalpostEgenskaberType();
    }

    /**
     * Create an instance of {@link JournalnotatEgenskaberType }
     * 
     */
    public JournalnotatEgenskaberType createJournalnotatEgenskaberType() {
        return new JournalnotatEgenskaberType();
    }

    /**
     * Create an instance of {@link FiltreretOejebliksbilledeType }
     * 
     */
    public FiltreretOejebliksbilledeType createFiltreretOejebliksbilledeType() {
        return new FiltreretOejebliksbilledeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "Sag")
    public JAXBElement<SagType> createSag(SagType value) {
        return new JAXBElement<SagType>(_Sag_QNAME, SagType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "ImportInput")
    public JAXBElement<ImportInputType> createImportInput(ImportInputType value) {
        return new JAXBElement<ImportInputType>(_ImportInput_QNAME, ImportInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "ImportOutput")
    public JAXBElement<BasicOutputType> createImportOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_ImportOutput_QNAME, BasicOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpretInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpretInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "OpretInput")
    public JAXBElement<OpretInputType> createOpretInput(OpretInputType value) {
        return new JAXBElement<OpretInputType>(_OpretInput_QNAME, OpretInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpretOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpretOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "OpretOutput")
    public JAXBElement<OpretOutputType> createOpretOutput(OpretOutputType value) {
        return new JAXBElement<OpretOutputType>(_OpretOutput_QNAME, OpretOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "RetInput")
    public JAXBElement<RetInputType> createRetInput(RetInputType value) {
        return new JAXBElement<RetInputType>(_RetInput_QNAME, RetInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "RetOutput")
    public JAXBElement<BasicOutputType> createRetOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_RetOutput_QNAME, BasicOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "PassiverInput")
    public JAXBElement<UuidNoteInputType> createPassiverInput(UuidNoteInputType value) {
        return new JAXBElement<UuidNoteInputType>(_PassiverInput_QNAME, UuidNoteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "PassiverOutput")
    public JAXBElement<BasicOutputType> createPassiverOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_PassiverOutput_QNAME, BasicOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "SletInput")
    public JAXBElement<UuidNoteInputType> createSletInput(UuidNoteInputType value) {
        return new JAXBElement<UuidNoteInputType>(_SletInput_QNAME, UuidNoteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "SletOutput")
    public JAXBElement<BasicOutputType> createSletOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_SletOutput_QNAME, BasicOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaesInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LaesInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "LaesInput")
    public JAXBElement<LaesInputType> createLaesInput(LaesInputType value) {
        return new JAXBElement<LaesInputType>(_LaesInput_QNAME, LaesInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaesOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LaesOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "LaesOutput")
    public JAXBElement<LaesOutputType> createLaesOutput(LaesOutputType value) {
        return new JAXBElement<LaesOutputType>(_LaesOutput_QNAME, LaesOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "ListInput")
    public JAXBElement<ListInputType> createListInput(ListInputType value) {
        return new JAXBElement<ListInputType>(_ListInput_QNAME, ListInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "ListOutput")
    public JAXBElement<ListOutputType> createListOutput(ListOutputType value) {
        return new JAXBElement<ListOutputType>(_ListOutput_QNAME, ListOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "SoegInput")
    public JAXBElement<SoegInputType> createSoegInput(SoegInputType value) {
        return new JAXBElement<SoegInputType>(_SoegInput_QNAME, SoegInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sts:sagdok:sag:1.2.4.0", name = "SoegOutput")
    public JAXBElement<SoegOutputType> createSoegOutput(SoegOutputType value) {
        return new JAXBElement<SoegOutputType>(_SoegOutput_QNAME, SoegOutputType.class, null, value);
    }

}
