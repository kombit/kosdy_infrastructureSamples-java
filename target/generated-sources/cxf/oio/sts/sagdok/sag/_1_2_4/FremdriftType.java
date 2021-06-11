
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for FremdriftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FremdriftType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Virkning" type="{urn:oio:sagdok:3.0.0}VirkningType" minOccurs="0"/&gt;
 *         &lt;element name="FremdriftStatusKode" type="{urn:oio:sts:sagdok:sag:1.2.4.0}FremdriftStatusKodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FremdriftType", propOrder = {
    "virkning",
    "fremdriftStatusKode"
})
public class FremdriftType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;
    @XmlElement(name = "FremdriftStatusKode")
    @XmlSchemaType(name = "string")
    protected FremdriftStatusKodeType fremdriftStatusKode;

    /**
     * Gets the value of the virkning property.
     * 
     * @return
     *     possible object is
     *     {@link VirkningType }
     *     
     */
    public VirkningType getVirkning() {
        return virkning;
    }

    /**
     * Sets the value of the virkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirkningType }
     *     
     */
    public void setVirkning(VirkningType value) {
        this.virkning = value;
    }

    /**
     * Gets the value of the fremdriftStatusKode property.
     * 
     * @return
     *     possible object is
     *     {@link FremdriftStatusKodeType }
     *     
     */
    public FremdriftStatusKodeType getFremdriftStatusKode() {
        return fremdriftStatusKode;
    }

    /**
     * Sets the value of the fremdriftStatusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FremdriftStatusKodeType }
     *     
     */
    public void setFremdriftStatusKode(FremdriftStatusKodeType value) {
        this.fremdriftStatusKode = value;
    }

    public FremdriftType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public FremdriftType withFremdriftStatusKode(FremdriftStatusKodeType value) {
        setFremdriftStatusKode(value);
        return this;
    }

}
