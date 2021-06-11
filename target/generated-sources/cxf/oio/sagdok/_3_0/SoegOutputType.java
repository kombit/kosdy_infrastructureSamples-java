
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}StandardRetur"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}IdListe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegOutputType", propOrder = {
    "standardRetur",
    "idListe"
})
public class SoegOutputType {

    @XmlElement(name = "StandardRetur", required = true)
    protected StandardReturType standardRetur;
    @XmlElement(name = "IdListe")
    protected IdListeType idListe;

    /**
     * Gets the value of the standardRetur property.
     * 
     * @return
     *     possible object is
     *     {@link StandardReturType }
     *     
     */
    public StandardReturType getStandardRetur() {
        return standardRetur;
    }

    /**
     * Sets the value of the standardRetur property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardReturType }
     *     
     */
    public void setStandardRetur(StandardReturType value) {
        this.standardRetur = value;
    }

    /**
     * Gets the value of the idListe property.
     * 
     * @return
     *     possible object is
     *     {@link IdListeType }
     *     
     */
    public IdListeType getIdListe() {
        return idListe;
    }

    /**
     * Sets the value of the idListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdListeType }
     *     
     */
    public void setIdListe(IdListeType value) {
        this.idListe = value;
    }

    public SoegOutputType withStandardRetur(StandardReturType value) {
        setStandardRetur(value);
        return this;
    }

    public SoegOutputType withIdListe(IdListeType value) {
        setIdListe(value);
        return this;
    }

}
