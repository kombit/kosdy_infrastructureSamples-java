
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.serviceplatformen.xml.schemas.authoritycontext._1.AuthorityContextType;
import dk.serviceplatformen.xml.schemas.callcontext._1.CallContextType;
import oio.sts.sagdok.sagdokumentindeks._1_2_4.FjernSagDokumentIndeksInputType;


/**
 * <p>Java class for FjernRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FjernRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/CallContext/1/}CallContext" minOccurs="0"/&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/}AuthorityContext" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}FjernSagDokumentIndeksInput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FjernRequestType", propOrder = {
    "callContext",
    "authorityContext",
    "fjernSagDokumentIndeksInput"
})
public class FjernRequestType {

    @XmlElement(name = "CallContext", namespace = "http://serviceplatformen.dk/xml/schemas/CallContext/1/")
    protected CallContextType callContext;
    @XmlElement(name = "AuthorityContext", namespace = "http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/")
    protected AuthorityContextType authorityContext;
    @XmlElement(name = "FjernSagDokumentIndeksInput", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", required = true)
    protected FjernSagDokumentIndeksInputType fjernSagDokumentIndeksInput;

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
     * Gets the value of the fjernSagDokumentIndeksInput property.
     * 
     * @return
     *     possible object is
     *     {@link FjernSagDokumentIndeksInputType }
     *     
     */
    public FjernSagDokumentIndeksInputType getFjernSagDokumentIndeksInput() {
        return fjernSagDokumentIndeksInput;
    }

    /**
     * Sets the value of the fjernSagDokumentIndeksInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FjernSagDokumentIndeksInputType }
     *     
     */
    public void setFjernSagDokumentIndeksInput(FjernSagDokumentIndeksInputType value) {
        this.fjernSagDokumentIndeksInput = value;
    }

    public FjernRequestType withCallContext(CallContextType value) {
        setCallContext(value);
        return this;
    }

    public FjernRequestType withAuthorityContext(AuthorityContextType value) {
        setAuthorityContext(value);
        return this;
    }

    public FjernRequestType withFjernSagDokumentIndeksInput(FjernSagDokumentIndeksInputType value) {
        setFjernSagDokumentIndeksInput(value);
        return this;
    }

}
