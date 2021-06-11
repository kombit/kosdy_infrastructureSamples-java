
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}NoteTekst" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetInputType", propOrder = {
    "uuidIdentifikator",
    "noteTekst"
})
@XmlSeeAlso({
    dk.stoettesystemerne.klassifikation.klasse._6.RetInputType.class
})
public class RetInputType {

    @XmlElement(name = "UUIDIdentifikator", required = true)
    protected String uuidIdentifikator;
    @XmlElement(name = "NoteTekst")
    protected String noteTekst;

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
     * Gets the value of the noteTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTekst() {
        return noteTekst;
    }

    /**
     * Sets the value of the noteTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTekst(String value) {
        this.noteTekst = value;
    }

    public RetInputType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    public RetInputType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

}
