
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}SoegVirkning" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}ReferenceID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegRelationType", propOrder = {
    "soegVirkning",
    "referenceID"
})
@XmlSeeAlso({
    SoegJournalPostRelationType.class
})
public class SoegRelationType {

    @XmlElement(name = "SoegVirkning")
    protected SoegVirkningType soegVirkning;
    @XmlElement(name = "ReferenceID")
    protected UnikIdType referenceID;

    /**
     * Gets the value of the soegVirkning property.
     * 
     * @return
     *     possible object is
     *     {@link SoegVirkningType }
     *     
     */
    public SoegVirkningType getSoegVirkning() {
        return soegVirkning;
    }

    /**
     * Sets the value of the soegVirkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoegVirkningType }
     *     
     */
    public void setSoegVirkning(SoegVirkningType value) {
        this.soegVirkning = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setReferenceID(UnikIdType value) {
        this.referenceID = value;
    }

    public SoegRelationType withSoegVirkning(SoegVirkningType value) {
        setSoegVirkning(value);
        return this;
    }

    public SoegRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
