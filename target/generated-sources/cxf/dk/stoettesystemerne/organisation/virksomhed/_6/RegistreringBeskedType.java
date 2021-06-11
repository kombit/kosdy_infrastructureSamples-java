
package dk.stoettesystemerne.organisation.virksomhed._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegistreringBeskedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringBeskedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/virksomhed/6/}Registrering"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringBeskedType", propOrder = {
    "uuidIdentifikator",
    "registrering"
})
public class RegistreringBeskedType {

    @XmlElement(name = "UUIDIdentifikator", namespace = "urn:oio:sagdok:3.0.0", required = true)
    protected String uuidIdentifikator;
    @XmlElement(name = "Registrering", required = true)
    protected RegistreringType registrering;

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
     * Gets the value of the registrering property.
     * 
     * @return
     *     possible object is
     *     {@link RegistreringType }
     *     
     */
    public RegistreringType getRegistrering() {
        return registrering;
    }

    /**
     * Sets the value of the registrering property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistreringType }
     *     
     */
    public void setRegistrering(RegistreringType value) {
        this.registrering = value;
    }

    public RegistreringBeskedType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    public RegistreringBeskedType withRegistrering(RegistreringType value) {
        setRegistrering(value);
        return this;
    }

}
