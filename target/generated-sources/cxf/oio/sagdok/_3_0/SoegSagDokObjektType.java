
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegSagDokObjektType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegSagDokObjektType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}SoegRegistrering" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}SoegVirkning" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegSagDokObjektType", propOrder = {
    "uuidIdentifikator",
    "soegRegistrering",
    "soegVirkning"
})
public class SoegSagDokObjektType {

    @XmlElement(name = "UUIDIdentifikator")
    protected String uuidIdentifikator;
    @XmlElement(name = "SoegRegistrering")
    protected SoegRegistreringType soegRegistrering;
    @XmlElement(name = "SoegVirkning")
    protected SoegVirkningType soegVirkning;

    /**
     * Gets the value of the uuidIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUIDIdentifikator() {
        return uuidIdentifikator;
    }

    /**
     * Sets the value of the uuidIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUIDIdentifikator(String value) {
        this.uuidIdentifikator = value;
    }

    /**
     * Gets the value of the soegRegistrering property.
     * 
     * @return
     *     possible object is
     *     {@link SoegRegistreringType }
     *     
     */
    public SoegRegistreringType getSoegRegistrering() {
        return soegRegistrering;
    }

    /**
     * Sets the value of the soegRegistrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoegRegistreringType }
     *     
     */
    public void setSoegRegistrering(SoegRegistreringType value) {
        this.soegRegistrering = value;
    }

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

    public SoegSagDokObjektType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    public SoegSagDokObjektType withSoegRegistrering(SoegRegistreringType value) {
        setSoegRegistrering(value);
        return this;
    }

    public SoegSagDokObjektType withSoegVirkning(SoegVirkningType value) {
        setSoegVirkning(value);
        return this;
    }

}
