
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5 package. 
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

    private final static QName _FjernRequest_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "FjernRequest");
    private final static QName _FjernResponse_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "FjernResponse");
    private final static QName _ImporterRequest_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "ImporterRequest");
    private final static QName _ImporterResponse_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "ImporterResponse");
    private final static QName _OpdaterRequest_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "OpdaterRequest");
    private final static QName _OpdaterResponse_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "OpdaterResponse");
    private final static QName _FremsoegRequest_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "FremsoegRequest");
    private final static QName _FremsoegResponse_QNAME = new QName("http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", "FremsoegResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FjernRequestType }
     * 
     */
    public FjernRequestType createFjernRequestType() {
        return new FjernRequestType();
    }

    /**
     * Create an instance of {@link FjernResponseType }
     * 
     */
    public FjernResponseType createFjernResponseType() {
        return new FjernResponseType();
    }

    /**
     * Create an instance of {@link ImporterRequestType }
     * 
     */
    public ImporterRequestType createImporterRequestType() {
        return new ImporterRequestType();
    }

    /**
     * Create an instance of {@link ImporterResponseType }
     * 
     */
    public ImporterResponseType createImporterResponseType() {
        return new ImporterResponseType();
    }

    /**
     * Create an instance of {@link OpdaterRequestType }
     * 
     */
    public OpdaterRequestType createOpdaterRequestType() {
        return new OpdaterRequestType();
    }

    /**
     * Create an instance of {@link OpdaterResponseType }
     * 
     */
    public OpdaterResponseType createOpdaterResponseType() {
        return new OpdaterResponseType();
    }

    /**
     * Create an instance of {@link FremsoegRequestType }
     * 
     */
    public FremsoegRequestType createFremsoegRequestType() {
        return new FremsoegRequestType();
    }

    /**
     * Create an instance of {@link FremsoegResponseType }
     * 
     */
    public FremsoegResponseType createFremsoegResponseType() {
        return new FremsoegResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FjernRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FjernRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "FjernRequest")
    public JAXBElement<FjernRequestType> createFjernRequest(FjernRequestType value) {
        return new JAXBElement<FjernRequestType>(_FjernRequest_QNAME, FjernRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FjernResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FjernResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "FjernResponse")
    public JAXBElement<FjernResponseType> createFjernResponse(FjernResponseType value) {
        return new JAXBElement<FjernResponseType>(_FjernResponse_QNAME, FjernResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImporterRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImporterRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "ImporterRequest")
    public JAXBElement<ImporterRequestType> createImporterRequest(ImporterRequestType value) {
        return new JAXBElement<ImporterRequestType>(_ImporterRequest_QNAME, ImporterRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImporterResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImporterResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "ImporterResponse")
    public JAXBElement<ImporterResponseType> createImporterResponse(ImporterResponseType value) {
        return new JAXBElement<ImporterResponseType>(_ImporterResponse_QNAME, ImporterResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpdaterRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpdaterRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "OpdaterRequest")
    public JAXBElement<OpdaterRequestType> createOpdaterRequest(OpdaterRequestType value) {
        return new JAXBElement<OpdaterRequestType>(_OpdaterRequest_QNAME, OpdaterRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpdaterResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpdaterResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "OpdaterResponse")
    public JAXBElement<OpdaterResponseType> createOpdaterResponse(OpdaterResponseType value) {
        return new JAXBElement<OpdaterResponseType>(_OpdaterResponse_QNAME, OpdaterResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FremsoegRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FremsoegRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "FremsoegRequest")
    public JAXBElement<FremsoegRequestType> createFremsoegRequest(FremsoegRequestType value) {
        return new JAXBElement<FremsoegRequestType>(_FremsoegRequest_QNAME, FremsoegRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FremsoegResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FremsoegResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://serviceplatformen.dk/xml/wsdl/soap11/SagDokument/SagDokumentIndeks/5/", name = "FremsoegResponse")
    public JAXBElement<FremsoegResponseType> createFremsoegResponse(FremsoegResponseType value) {
        return new JAXBElement<FremsoegResponseType>(_FremsoegResponse_QNAME, FremsoegResponseType.class, null, value);
    }

}
