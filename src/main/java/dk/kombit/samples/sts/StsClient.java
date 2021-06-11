package dk.kombit.samples.sts;

import dk.kombit.samples.utils.ClientProperties;
import org.apache.cxf.Bus;
import org.apache.cxf.binding.soap.SoapBindingConstants;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.message.Attachment;
import org.apache.cxf.message.Message;
import org.apache.cxf.service.model.BindingOperationInfo;
import org.apache.cxf.staxutils.StaxUtils;
import org.apache.cxf.staxutils.W3CDOMStreamWriter;
import org.apache.cxf.ws.security.tokenstore.SecurityToken;
import org.apache.cxf.ws.security.trust.STSClient;
import org.apache.commons.codec.binary.Base64;
import org.apache.cxf.ws.security.trust.STSUtils;
import org.apache.wss4j.common.crypto.Crypto;
import org.w3c.dom.Element;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.dom.DOMSource;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Collection;

/**
 * This class defines the client for getting a token from the token service.
 */
public class StsClient extends STSClient {

    private String cvr;

    public StsClient(final Bus bus) {
        super(bus);
    }

    /**
     * The token service requires a non-standard way of supplying the certificate, so we overwrite the method.
     */
    @Override
    protected void writeElementsForRSTPublicKey(W3CDOMStreamWriter writer, X509Certificate cert)
            throws XMLStreamException, CertificateEncodingException {
        writer.writeStartElement("wst", "UseKey", namespace);
        writer.writeStartElement("wsse", "BinarySecurityToken", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        writer.writeAttribute("EncodingType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
        writer.writeAttribute("ValueType", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-x509-token-profile-1.0#X509v3");

        String encodedCert = Base64.encodeBase64String(cert.getEncoded());
        writer.writeCharacters(encodedCert);

        writer.writeEndElement();
        writer.writeEndElement();
    }

    /**
     * CVR has to be added to claims, so we overwrite the method to add claims.
     */
    @Override
    protected void addClaims(final XMLStreamWriter writer) throws XMLStreamException {
        writer.writeStartElement("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "Claims");
        writer.writeAttribute("Dialect", "http://docs.oasis-open.org/wsfed/authorization/200706/authclaims");
        writer.writeStartElement("http://docs.oasis-open.org/wsfed/authorization/200706", "ClaimType");
        writer.writeAttribute("Uri", "dk:gov:saml:attribute:CvrNumberIdentifier");
        writer.writeStartElement("Value");
        writer.writeCharacters(getCvr());
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
    }

    @Override
    public SecurityToken requestSecurityToken() throws Exception {
        return super.requestSecurityToken();
    }

    @Override
    protected void addAppliesTo(XMLStreamWriter writer, String appliesTo) throws XMLStreamException {
        if (appliesTo != null && addressingNamespace != null) {
            String policyNS = "http://schemas.xmlsoap.org/ws/2004/09/policy";
            writer.writeStartElement("wsp", "AppliesTo", policyNS);
            writer.writeNamespace("wsp", policyNS);
            writer.writeStartElement("wsa", "EndpointReference", addressingNamespace);
            writer.writeNamespace("wsa", addressingNamespace);
            writer.writeStartElement("wsa", "Address", addressingNamespace);
            writer.writeCharacters(appliesTo);
            writer.writeEndElement();
            writer.writeEndElement();
            writer.writeEndElement();
        }    }

    @Override
    protected STSResponse issue(String appliesTo, String action, String requestType, String binaryExchange) throws Exception {
        createClient();
        BindingOperationInfo boi = findOperation("/RST/Issue");

        client.getRequestContext().putAll(ctx);
        if (action != null) {
            client.getRequestContext().put(SoapBindingConstants.SOAP_ACTION, action);
        } else if (isSecureConv) {
            client.getRequestContext().put(SoapBindingConstants.SOAP_ACTION,
                    namespace + "/RST/SCT");
        } else {
            client.getRequestContext().put(SoapBindingConstants.SOAP_ACTION,
                    namespace + "/RST/Issue");
        }

        W3CDOMStreamWriter writer = new W3CDOMStreamWriter();
        writer.writeStartElement("wst", "RequestSecurityToken", namespace);
        writer.writeNamespace("wst", namespace);
        if (context != null) {
            writer.writeAttribute(null, "Context", context);
        }

        boolean wroteKeySize = false;
        String keyTypeTemplate = null;
        String sptt = null;

        if (isSpnego) {
            tokenType = STSUtils.getTokenTypeSCT(namespace);
            sendKeyType = false;
        }

        if (sptt == null) {
            addTokenType(writer);
        }

        addRequestType(requestType, writer);
        if (enableAppliesTo) {
            addAppliesTo(writer, appliesTo);
        }

        addClaims(writer);

        if (isSecureConv || enableLifetime) {
            addLifetime(writer);
        }

        // Write out renewal semantics
        // writeRenewalSemantics(writer);

        Element onBehalfOfToken = getOnBehalfOfToken();
        if (onBehalfOfToken != null) {
            writer.writeStartElement("wst", "OnBehalfOf", namespace);
            StaxUtils.copy(onBehalfOfToken, writer);
            writer.writeEndElement();
        }

        if (keyTypeTemplate == null) {
            keyTypeTemplate = writeKeyType(writer, keyType);
        }

        byte[] requestorEntropy = null;
        X509Certificate cert = null;
        Crypto crypto = null;

        if (keySize <= 0) {
            keySize = 256;
        }
        if (keyTypeTemplate != null && keyTypeTemplate.endsWith("SymmetricKey")) {
            requestorEntropy = writeElementsForRSTSymmetricKey(writer, wroteKeySize);
        } else if (keyTypeTemplate != null && keyTypeTemplate.endsWith("PublicKey")) {
            // Use the given cert, or else get it from a Crypto instance
            if (useKeyCertificate != null) {
                cert = useKeyCertificate;
            } else {
                crypto = createCrypto(false);
                cert = getCert(crypto);
            }
            writeElementsForRSTPublicKey(writer, cert);
        } else if (isSpnego || isSecureConv) {
            addKeySize(keySize, writer);
        }

        if (binaryExchange != null) {
            addBinaryExchange(binaryExchange, writer);
        }

        Element actAsSecurityToken = getActAsToken();
        if (actAsSecurityToken != null) {
            writer.writeStartElement(STSUtils.WST_NS_08_02, "ActAs");
            StaxUtils.copy(actAsSecurityToken, writer);
            writer.writeEndElement();
        }

        Element customElement = getCustomContent();
        if (customElement != null) {
            StaxUtils.copy(customElement, writer);
        }

        writer.writeEndElement();

        Object[] obj = client.invoke(boi, new DOMSource(writer.getDocument().getDocumentElement()));

        @SuppressWarnings("unchecked")
        Collection<Attachment> attachments =
                (Collection<Attachment>)client.getResponseContext().get(Message.ATTACHMENTS);
        return new STSResponse((DOMSource)obj[0], requestorEntropy, cert, crypto, attachments);    }

    @Override
    public SecurityToken requestSecurityToken(String appliesTo) throws Exception {
        return super.requestSecurityToken(appliesTo);
    }

    @Override
    public SecurityToken requestSecurityToken(String appliesTo, String binaryExchange) throws Exception {
        return super.requestSecurityToken(appliesTo, binaryExchange);
    }

    @Override
    public SecurityToken requestSecurityToken(String appliesTo, String action, String requestType, String binaryExchange) throws Exception {
        STSResponse response = issue(appliesTo, action, requestType, binaryExchange);


        SecurityToken token = createSecurityToken(getDocumentElement(response.getResponse()), response.getEntropy());

        if (response.getCert() != null) {
            token.setX509Certificate(response.getCert(), response.getCrypto());
        }
        return token;
    }

    private String getCvr() {
        if (cvr == null) {
            cvr = ClientProperties.getInstance().getMyndighedCvr();
        }

        return cvr;
    }
}
