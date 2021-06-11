
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.stoettesystemerne.klassifikation.klasse._6.KlasseType;


/**
 * <p>Java class for SagDokObjektType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagDokObjektType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SagDokObjektType", propOrder = {
    "uuidIdentifikator"
})
@XmlSeeAlso({
    KlasseType.class,
    LaesFiltreretOutputType.class
})
public class SagDokObjektType {

    @XmlElement(name = "UUIDIdentifikator", required = true)
    protected String uuidIdentifikator;

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

    public SagDokObjektType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

}
