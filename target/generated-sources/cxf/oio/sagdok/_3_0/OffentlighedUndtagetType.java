
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffentlighedUndtagetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffentlighedUndtagetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TitelAlternativTekst"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}OffentlighedUndtagetHjemmelTekst"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffentlighedUndtagetType", propOrder = {
    "titelAlternativTekst",
    "offentlighedUndtagetHjemmelTekst"
})
public class OffentlighedUndtagetType {

    @XmlElement(name = "TitelAlternativTekst", required = true)
    protected String titelAlternativTekst;
    @XmlElement(name = "OffentlighedUndtagetHjemmelTekst", required = true)
    protected String offentlighedUndtagetHjemmelTekst;

    /**
     * Gets the value of the titelAlternativTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelAlternativTekst() {
        return titelAlternativTekst;
    }

    /**
     * Sets the value of the titelAlternativTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelAlternativTekst(String value) {
        this.titelAlternativTekst = value;
    }

    /**
     * Gets the value of the offentlighedUndtagetHjemmelTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffentlighedUndtagetHjemmelTekst() {
        return offentlighedUndtagetHjemmelTekst;
    }

    /**
     * Sets the value of the offentlighedUndtagetHjemmelTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffentlighedUndtagetHjemmelTekst(String value) {
        this.offentlighedUndtagetHjemmelTekst = value;
    }

    public OffentlighedUndtagetType withTitelAlternativTekst(String value) {
        setTitelAlternativTekst(value);
        return this;
    }

    public OffentlighedUndtagetType withOffentlighedUndtagetHjemmelTekst(String value) {
        setOffentlighedUndtagetHjemmelTekst(value);
        return this;
    }

}
