
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegeordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegeordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoegeordIdentifikator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}BeskrivelseTekst" minOccurs="0"/&gt;
 *         &lt;element name="SoegeordKategoriTekst" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegeordType", propOrder = {
    "soegeordIdentifikator",
    "beskrivelseTekst",
    "soegeordKategoriTekst"
})
public class SoegeordType {

    @XmlElement(name = "SoegeordIdentifikator")
    protected String soegeordIdentifikator;
    @XmlElement(name = "BeskrivelseTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String beskrivelseTekst;
    @XmlElement(name = "SoegeordKategoriTekst")
    protected String soegeordKategoriTekst;

    /**
     * Gets the value of the soegeordIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoegeordIdentifikator() {
        return soegeordIdentifikator;
    }

    /**
     * Sets the value of the soegeordIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoegeordIdentifikator(String value) {
        this.soegeordIdentifikator = value;
    }

    /**
     * Gets the value of the beskrivelseTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrivelseTekst() {
        return beskrivelseTekst;
    }

    /**
     * Sets the value of the beskrivelseTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrivelseTekst(String value) {
        this.beskrivelseTekst = value;
    }

    /**
     * Gets the value of the soegeordKategoriTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoegeordKategoriTekst() {
        return soegeordKategoriTekst;
    }

    /**
     * Sets the value of the soegeordKategoriTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoegeordKategoriTekst(String value) {
        this.soegeordKategoriTekst = value;
    }

    public SoegeordType withSoegeordIdentifikator(String value) {
        setSoegeordIdentifikator(value);
        return this;
    }

    public SoegeordType withBeskrivelseTekst(String value) {
        setBeskrivelseTekst(value);
        return this;
    }

    public SoegeordType withSoegeordKategoriTekst(String value) {
        setSoegeordKategoriTekst(value);
        return this;
    }

}
