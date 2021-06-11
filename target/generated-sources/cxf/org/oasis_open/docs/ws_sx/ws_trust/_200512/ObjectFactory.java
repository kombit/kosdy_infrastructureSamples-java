
package org.oasis_open.docs.ws_sx.ws_trust._200512;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.oasis_open.docs.ws_sx.ws_trust._200512 package. 
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

    private final static QName _RequestSecurityToken_QNAME = new QName("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "RequestSecurityToken");
    private final static QName _RequestSecurityTokenResponse_QNAME = new QName("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "RequestSecurityTokenResponse");
    private final static QName _RequestSecurityTokenResponseCollection_QNAME = new QName("http://docs.oasis-open.org/ws-sx/ws-trust/200512", "RequestSecurityTokenResponseCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.oasis_open.docs.ws_sx.ws_trust._200512
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestSecurityTokenType }
     * 
     */
    public RequestSecurityTokenType createRequestSecurityTokenType() {
        return new RequestSecurityTokenType();
    }

    /**
     * Create an instance of {@link RequestSecurityTokenResponseType }
     * 
     */
    public RequestSecurityTokenResponseType createRequestSecurityTokenResponseType() {
        return new RequestSecurityTokenResponseType();
    }

    /**
     * Create an instance of {@link RequestSecurityTokenResponseCollectionType }
     * 
     */
    public RequestSecurityTokenResponseCollectionType createRequestSecurityTokenResponseCollectionType() {
        return new RequestSecurityTokenResponseCollectionType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSecurityTokenType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestSecurityTokenType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", name = "RequestSecurityToken")
    public JAXBElement<RequestSecurityTokenType> createRequestSecurityToken(RequestSecurityTokenType value) {
        return new JAXBElement<RequestSecurityTokenType>(_RequestSecurityToken_QNAME, RequestSecurityTokenType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSecurityTokenResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestSecurityTokenResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", name = "RequestSecurityTokenResponse")
    public JAXBElement<RequestSecurityTokenResponseType> createRequestSecurityTokenResponse(RequestSecurityTokenResponseType value) {
        return new JAXBElement<RequestSecurityTokenResponseType>(_RequestSecurityTokenResponse_QNAME, RequestSecurityTokenResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestSecurityTokenResponseCollectionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RequestSecurityTokenResponseCollectionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/ws-sx/ws-trust/200512", name = "RequestSecurityTokenResponseCollection")
    public JAXBElement<RequestSecurityTokenResponseCollectionType> createRequestSecurityTokenResponseCollection(RequestSecurityTokenResponseCollectionType value) {
        return new JAXBElement<RequestSecurityTokenResponseCollectionType>(_RequestSecurityTokenResponseCollection_QNAME, RequestSecurityTokenResponseCollectionType.class, null, value);
    }

}
