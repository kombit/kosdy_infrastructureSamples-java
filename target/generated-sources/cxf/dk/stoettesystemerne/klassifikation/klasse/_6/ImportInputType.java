
package dk.stoettesystemerne.klassifikation.klasse._6;

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
 *         &lt;element ref="{http://stoettesystemerne.dk/klassifikation/klasse/6/}Klasse"/&gt;
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
    "klasse"
})
public class ImportInputType {

    @XmlElement(name = "Klasse", required = true)
    protected KlasseType klasse;

    /**
     * Gets the value of the klasse property.
     * 
     * @return
     *     possible object is
     *     {@link KlasseType }
     *     
     */
    public KlasseType getKlasse() {
        return klasse;
    }

    /**
     * Sets the value of the klasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasseType }
     *     
     */
    public void setKlasse(KlasseType value) {
        this.klasse = value;
    }

    public ImportInputType withKlasse(KlasseType value) {
        setKlasse(value);
        return this;
    }

}
