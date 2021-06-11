
package oio.sagdok._3_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StandardReturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardReturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}StatusKode"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}FejlbeskedTekst" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardReturType", propOrder = {
    "statusKode",
    "fejlbeskedTekst"
})
@XmlSeeAlso({
    UnikReturType.class
})
public class StandardReturType {

    @XmlElement(name = "StatusKode", required = true)
    protected BigInteger statusKode;
    @XmlElement(name = "FejlbeskedTekst")
    protected String fejlbeskedTekst;

    /**
     * Gets the value of the statusKode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStatusKode() {
        return statusKode;
    }

    /**
     * Sets the value of the statusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStatusKode(BigInteger value) {
        this.statusKode = value;
    }

    /**
     * Gets the value of the fejlbeskedTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFejlbeskedTekst() {
        return fejlbeskedTekst;
    }

    /**
     * Sets the value of the fejlbeskedTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFejlbeskedTekst(String value) {
        this.fejlbeskedTekst = value;
    }

    public StandardReturType withStatusKode(BigInteger value) {
        setStatusKode(value);
        return this;
    }

    public StandardReturType withFejlbeskedTekst(String value) {
        setFejlbeskedTekst(value);
        return this;
    }

}
