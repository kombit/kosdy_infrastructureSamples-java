
package dk.kombit.xml.schemas.requestheader._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{http://kombit.dk/xml/schemas/RequestHeader/1/}TransactionUUID"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestHeaderType", propOrder = {

})
public class RequestHeaderType {

    @XmlElement(name = "TransactionUUID", required = true)
    protected String transactionUUID;

    /**
     * Gets the value of the transactionUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionUUID() {
        return transactionUUID;
    }

    /**
     * Sets the value of the transactionUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionUUID(String value) {
        this.transactionUUID = value;
    }

    public RequestHeaderType withTransactionUUID(String value) {
        setTransactionUUID(value);
        return this;
    }

}
