
package dk.stoettesystemerne.organisation.organisation._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;


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
 *         &lt;element name="ObjektID" type="{urn:oio:sagdok:3.0.0}UnikIdType"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}Registrering"/&gt;
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
    "objektID",
    "registrering"
})
public class RegistreringBeskedType {

    @XmlElement(name = "ObjektID", required = true)
    protected UnikIdType objektID;
    @XmlElement(name = "Registrering", required = true)
    protected RegistreringType registrering;

    /**
     * Gets the value of the objektID property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getObjektID() {
        return objektID;
    }

    /**
     * Sets the value of the objektID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setObjektID(UnikIdType value) {
        this.objektID = value;
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

    public RegistreringBeskedType withObjektID(UnikIdType value) {
        setObjektID(value);
        return this;
    }

    public RegistreringBeskedType withRegistrering(RegistreringType value) {
        setRegistrering(value);
        return this;
    }

}
