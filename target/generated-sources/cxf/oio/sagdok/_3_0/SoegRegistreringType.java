
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegRegistreringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegRegistreringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}FraTidspunkt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilTidspunkt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}LivscyklusKode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}BrugerRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegRegistreringType", propOrder = {
    "fraTidspunkt",
    "tilTidspunkt",
    "livscyklusKode",
    "brugerRef"
})
public class SoegRegistreringType {

    @XmlElement(name = "FraTidspunkt")
    protected TidspunktType fraTidspunkt;
    @XmlElement(name = "TilTidspunkt")
    protected TidspunktType tilTidspunkt;
    @XmlElement(name = "LivscyklusKode")
    @XmlSchemaType(name = "string")
    protected LivscyklusKodeType livscyklusKode;
    @XmlElement(name = "BrugerRef")
    protected UnikIdType brugerRef;

    /**
     * Gets the value of the fraTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getFraTidspunkt() {
        return fraTidspunkt;
    }

    /**
     * Sets the value of the fraTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setFraTidspunkt(TidspunktType value) {
        this.fraTidspunkt = value;
    }

    /**
     * Gets the value of the tilTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getTilTidspunkt() {
        return tilTidspunkt;
    }

    /**
     * Sets the value of the tilTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setTilTidspunkt(TidspunktType value) {
        this.tilTidspunkt = value;
    }

    /**
     * Gets the value of the livscyklusKode property.
     * 
     * @return
     *     possible object is
     *     {@link LivscyklusKodeType }
     *     
     */
    public LivscyklusKodeType getLivscyklusKode() {
        return livscyklusKode;
    }

    /**
     * Sets the value of the livscyklusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LivscyklusKodeType }
     *     
     */
    public void setLivscyklusKode(LivscyklusKodeType value) {
        this.livscyklusKode = value;
    }

    /**
     * Gets the value of the brugerRef property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getBrugerRef() {
        return brugerRef;
    }

    /**
     * Sets the value of the brugerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setBrugerRef(UnikIdType value) {
        this.brugerRef = value;
    }

    public SoegRegistreringType withFraTidspunkt(TidspunktType value) {
        setFraTidspunkt(value);
        return this;
    }

    public SoegRegistreringType withTilTidspunkt(TidspunktType value) {
        setTilTidspunkt(value);
        return this;
    }

    public SoegRegistreringType withLivscyklusKode(LivscyklusKodeType value) {
        setLivscyklusKode(value);
        return this;
    }

    public SoegRegistreringType withBrugerRef(UnikIdType value) {
        setBrugerRef(value);
        return this;
    }

}
