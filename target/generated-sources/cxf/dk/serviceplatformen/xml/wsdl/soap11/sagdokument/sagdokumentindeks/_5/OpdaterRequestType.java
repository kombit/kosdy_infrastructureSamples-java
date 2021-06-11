
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.serviceplatformen.xml.schemas.authoritycontext._1.AuthorityContextType;
import dk.serviceplatformen.xml.schemas.callcontext._1.CallContextType;
import oio.sts.sagdok.sagdokumentindeks._1_2_4.OpdaterSagDokumentIndeksInputType;


/**
 * <p>Java class for OpdaterRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpdaterRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/CallContext/1/}CallContext" minOccurs="0"/&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/}AuthorityContext" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}OpdaterSagDokumentIndeksInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpdaterRequestType", propOrder = {
    "callContext",
    "authorityContext",
    "opdaterSagDokumentIndeksInput"
})
public class OpdaterRequestType {

    @XmlElement(name = "CallContext", namespace = "http://serviceplatformen.dk/xml/schemas/CallContext/1/")
    protected CallContextType callContext;
    @XmlElement(name = "AuthorityContext", namespace = "http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/")
    protected AuthorityContextType authorityContext;
    @XmlElement(name = "OpdaterSagDokumentIndeksInput", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", required = true)
    protected OpdaterSagDokumentIndeksInputType opdaterSagDokumentIndeksInput;

    /**
     * Gets the value of the callContext property.
     * 
     * @return
     *     possible object is
     *     {@link CallContextType }
     *     
     */
    public CallContextType getCallContext() {
        return callContext;
    }

    /**
     * Sets the value of the callContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CallContextType }
     *     
     */
    public void setCallContext(CallContextType value) {
        this.callContext = value;
    }

    /**
     * Gets the value of the authorityContext property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityContextType }
     *     
     */
    public AuthorityContextType getAuthorityContext() {
        return authorityContext;
    }

    /**
     * Sets the value of the authorityContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityContextType }
     *     
     */
    public void setAuthorityContext(AuthorityContextType value) {
        this.authorityContext = value;
    }

    /**
     * Gets the value of the opdaterSagDokumentIndeksInput property.
     * 
     * @return
     *     possible object is
     *     {@link OpdaterSagDokumentIndeksInputType }
     *     
     */
    public OpdaterSagDokumentIndeksInputType getOpdaterSagDokumentIndeksInput() {
        return opdaterSagDokumentIndeksInput;
    }

    /**
     * Sets the value of the opdaterSagDokumentIndeksInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpdaterSagDokumentIndeksInputType }
     *     
     */
    public void setOpdaterSagDokumentIndeksInput(OpdaterSagDokumentIndeksInputType value) {
        this.opdaterSagDokumentIndeksInput = value;
    }

    public OpdaterRequestType withCallContext(CallContextType value) {
        setCallContext(value);
        return this;
    }

    public OpdaterRequestType withAuthorityContext(AuthorityContextType value) {
        setAuthorityContext(value);
        return this;
    }

    public OpdaterRequestType withOpdaterSagDokumentIndeksInput(OpdaterSagDokumentIndeksInputType value) {
        setOpdaterSagDokumentIndeksInput(value);
        return this;
    }

}
