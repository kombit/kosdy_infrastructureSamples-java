
package dk.stoettesystemerne.klassifikation.klasse._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for PubliceretStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PubliceretStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virkning" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}ErPubliceretIndikator" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PubliceretStatusType", propOrder = {
    "virkning",
    "erPubliceretIndikator"
})
public class PubliceretStatusType {

    @XmlElement(name = "Virkning", namespace = "urn:oio:sagdok:3.0.0")
    protected VirkningType virkning;
    @XmlElement(name = "ErPubliceretIndikator", namespace = "urn:oio:sagdok:3.0.0")
    protected Boolean erPubliceretIndikator;

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
     * Gets the value of the erPubliceretIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isErPubliceretIndikator() {
        return erPubliceretIndikator;
    }

    /**
     * Sets the value of the erPubliceretIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setErPubliceretIndikator(Boolean value) {
        this.erPubliceretIndikator = value;
    }

    public PubliceretStatusType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public PubliceretStatusType withErPubliceretIndikator(Boolean value) {
        setErPubliceretIndikator(value);
        return this;
    }

}
