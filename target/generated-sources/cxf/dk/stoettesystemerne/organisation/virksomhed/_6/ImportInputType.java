
package dk.stoettesystemerne.organisation.virksomhed._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/virksomhed/6/}Virksomhed"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportInputType", propOrder = {
    "virksomhed"
})
public class ImportInputType {

    @XmlElement(name = "Virksomhed", required = true)
    protected VirksomhedType virksomhed;

    /**
     * Gets the value of the virksomhed property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedType }
     *     
     */
    public VirksomhedType getVirksomhed() {
        return virksomhed;
    }

    /**
     * Sets the value of the virksomhed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedType }
     *     
     */
    public void setVirksomhed(VirksomhedType value) {
        this.virksomhed = value;
    }

    public ImportInputType withVirksomhed(VirksomhedType value) {
        setVirksomhed(value);
        return this;
    }

}
