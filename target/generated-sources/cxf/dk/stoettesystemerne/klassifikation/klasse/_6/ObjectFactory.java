
package dk.stoettesystemerne.klassifikation.klasse._6;

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
 * generated in the dk.stoettesystemerne.klassifikation.klasse._6 package. 
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

    private final static QName _Klasse_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "Klasse");
    private final static QName _AttributListe_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "AttributListe");
    private final static QName _TilstandListe_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "TilstandListe");
    private final static QName _RelationListe_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "RelationListe");
    private final static QName _Registrering_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "Registrering");
    private final static QName _Egenskab_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "Egenskab");
    private final static QName _PubliceretStatus_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "PubliceretStatus");
    private final static QName _Soegeord_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "Soegeord");
    private final static QName _RegistreringBesked_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "RegistreringBesked");
    private final static QName _ImportInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "ImportInput");
    private final static QName _ImportOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "ImportOutput");
    private final static QName _OpretInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "OpretInput");
    private final static QName _OpretOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "OpretOutput");
    private final static QName _RetInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "RetInput");
    private final static QName _RetOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "RetOutput");
    private final static QName _PassiverInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "PassiverInput");
    private final static QName _PassiverOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "PassiverOutput");
    private final static QName _SletInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "SletInput");
    private final static QName _SletOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "SletOutput");
    private final static QName _LaesInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "LaesInput");
    private final static QName _LaesOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "LaesOutput");
    private final static QName _ListInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "ListInput");
    private final static QName _ListOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "ListOutput");
    private final static QName _SoegInput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "SoegInput");
    private final static QName _SoegOutput_QNAME = new QName("http://stoettesystemerne.dk/klassifikation/klasse/6/", "SoegOutput");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.stoettesystemerne.klassifikation.klasse._6
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link KlasseType }
     * 
     */
    public KlasseType createKlasseType() {
        return new KlasseType();
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
     * Create an instance of {@link RegistreringType }
     * 
     */
    public RegistreringType createRegistreringType() {
        return new RegistreringType();
    }

    /**
     * Create an instance of {@link EgenskabType }
     * 
     */
    public EgenskabType createEgenskabType() {
        return new EgenskabType();
    }

    /**
     * Create an instance of {@link PubliceretStatusType }
     * 
     */
    public PubliceretStatusType createPubliceretStatusType() {
        return new PubliceretStatusType();
    }

    /**
     * Create an instance of {@link SoegeordType }
     * 
     */
    public SoegeordType createSoegeordType() {
        return new SoegeordType();
    }

    /**
     * Create an instance of {@link RegistreringBeskedType }
     * 
     */
    public RegistreringBeskedType createRegistreringBeskedType() {
        return new RegistreringBeskedType();
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
     * Create an instance of {@link FiltreretOejebliksbilledeType }
     * 
     */
    public FiltreretOejebliksbilledeType createFiltreretOejebliksbilledeType() {
        return new FiltreretOejebliksbilledeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "Klasse")
    public JAXBElement<KlasseType> createKlasse(KlasseType value) {
        return new JAXBElement<KlasseType>(_Klasse_QNAME, KlasseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributListeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributListeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "AttributListe")
    public JAXBElement<AttributListeType> createAttributListe(AttributListeType value) {
        return new JAXBElement<AttributListeType>(_AttributListe_QNAME, AttributListeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TilstandListeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TilstandListeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "TilstandListe")
    public JAXBElement<TilstandListeType> createTilstandListe(TilstandListeType value) {
        return new JAXBElement<TilstandListeType>(_TilstandListe_QNAME, TilstandListeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationListeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelationListeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "RelationListe")
    public JAXBElement<RelationListeType> createRelationListe(RelationListeType value) {
        return new JAXBElement<RelationListeType>(_RelationListe_QNAME, RelationListeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistreringType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "Registrering")
    public JAXBElement<RegistreringType> createRegistrering(RegistreringType value) {
        return new JAXBElement<RegistreringType>(_Registrering_QNAME, RegistreringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgenskabType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EgenskabType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "Egenskab")
    public JAXBElement<EgenskabType> createEgenskab(EgenskabType value) {
        return new JAXBElement<EgenskabType>(_Egenskab_QNAME, EgenskabType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PubliceretStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PubliceretStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "PubliceretStatus")
    public JAXBElement<PubliceretStatusType> createPubliceretStatus(PubliceretStatusType value) {
        return new JAXBElement<PubliceretStatusType>(_PubliceretStatus_QNAME, PubliceretStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegeordType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegeordType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "Soegeord")
    public JAXBElement<SoegeordType> createSoegeord(SoegeordType value) {
        return new JAXBElement<SoegeordType>(_Soegeord_QNAME, SoegeordType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringBeskedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistreringBeskedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "RegistreringBesked")
    public JAXBElement<RegistreringBeskedType> createRegistreringBesked(RegistreringBeskedType value) {
        return new JAXBElement<RegistreringBeskedType>(_RegistreringBesked_QNAME, RegistreringBeskedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportInputType }{@code >}
     */
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "ImportInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "ImportOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "OpretInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "OpretOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "RetInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "RetOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "PassiverInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "PassiverOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "SletInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "SletOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "LaesInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "LaesOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "ListInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "ListOutput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "SoegInput")
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
    @XmlElementDecl(namespace = "http://stoettesystemerne.dk/klassifikation/klasse/6/", name = "SoegOutput")
    public JAXBElement<SoegOutputType> createSoegOutput(SoegOutputType value) {
        return new JAXBElement<SoegOutputType>(_SoegOutput_QNAME, SoegOutputType.class, null, value);
    }

}
