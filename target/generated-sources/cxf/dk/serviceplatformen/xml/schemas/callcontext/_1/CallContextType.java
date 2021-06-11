
package dk.serviceplatformen.xml.schemas.callcontext._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/CallContext/1/}OnBehalfOfUser" minOccurs="0"/&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/CallContext/1/}CallersServiceCallIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{http://serviceplatformen.dk/xml/schemas/CallContext/1/}AccountingInfo" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallContextType", propOrder = {

})
public class CallContextType {

    @XmlElement(name = "OnBehalfOfUser")
    protected String onBehalfOfUser;
    @XmlElement(name = "CallersServiceCallIdentifier")
    protected String callersServiceCallIdentifier;
    @XmlElement(name = "AccountingInfo")
    protected String accountingInfo;

    /**
     * Gets the value of the onBehalfOfUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnBehalfOfUser() {
        return onBehalfOfUser;
    }

    /**
     * Sets the value of the onBehalfOfUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnBehalfOfUser(String value) {
        this.onBehalfOfUser = value;
    }

    /**
     * Gets the value of the callersServiceCallIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallersServiceCallIdentifier() {
        return callersServiceCallIdentifier;
    }

    /**
     * Sets the value of the callersServiceCallIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallersServiceCallIdentifier(String value) {
        this.callersServiceCallIdentifier = value;
    }

    /**
     * Gets the value of the accountingInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingInfo() {
        return accountingInfo;
    }

    /**
     * Sets the value of the accountingInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingInfo(String value) {
        this.accountingInfo = value;
    }

    public CallContextType withOnBehalfOfUser(String value) {
        setOnBehalfOfUser(value);
        return this;
    }

    public CallContextType withCallersServiceCallIdentifier(String value) {
        setCallersServiceCallIdentifier(value);
        return this;
    }

    public CallContextType withAccountingInfo(String value) {
        setAccountingInfo(value);
        return this;
    }

}
