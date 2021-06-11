
package dk.stoettesystemerne.organisation._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for GyldighedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GyldighedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virkning" minOccurs="0"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/6/}GyldighedStatusKode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GyldighedType", propOrder = {
    "virkning",
    "gyldighedStatusKode"
})
public class GyldighedType {

    @XmlElement(name = "Virkning", namespace = "urn:oio:sagdok:3.0.0")
    protected VirkningType virkning;
    @XmlElement(name = "GyldighedStatusKode", required = true)
    @XmlSchemaType(name = "string")
    protected GyldighedStatusKodeType gyldighedStatusKode;

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
     * Gets the value of the gyldighedStatusKode property.
     * 
     * @return
     *     possible object is
     *     {@link GyldighedStatusKodeType }
     *     
     */
    public GyldighedStatusKodeType getGyldighedStatusKode() {
        return gyldighedStatusKode;
    }

    /**
     * Sets the value of the gyldighedStatusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GyldighedStatusKodeType }
     *     
     */
    public void setGyldighedStatusKode(GyldighedStatusKodeType value) {
        this.gyldighedStatusKode = value;
    }

    public GyldighedType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public GyldighedType withGyldighedStatusKode(GyldighedStatusKodeType value) {
        setGyldighedStatusKode(value);
        return this;
    }

}
