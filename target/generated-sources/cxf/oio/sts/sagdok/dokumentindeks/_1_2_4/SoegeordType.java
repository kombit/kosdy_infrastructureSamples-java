
package oio.sts.sagdok.dokumentindeks._1_2_4;

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
 *         &lt;element name="Beskrivelse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SoegeordKategori" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "beskrivelse",
    "soegeordKategori"
})
public class SoegeordType {

    @XmlElement(name = "SoegeordIdentifikator")
    protected String soegeordIdentifikator;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;
    @XmlElement(name = "SoegeordKategori")
    protected String soegeordKategori;

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
     * Gets the value of the beskrivelse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeskrivelse() {
        return beskrivelse;
    }

    /**
     * Sets the value of the beskrivelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeskrivelse(String value) {
        this.beskrivelse = value;
    }

    /**
     * Gets the value of the soegeordKategori property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoegeordKategori() {
        return soegeordKategori;
    }

    /**
     * Sets the value of the soegeordKategori property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoegeordKategori(String value) {
        this.soegeordKategori = value;
    }

    public SoegeordType withSoegeordIdentifikator(String value) {
        setSoegeordIdentifikator(value);
        return this;
    }

    public SoegeordType withBeskrivelse(String value) {
        setBeskrivelse(value);
        return this;
    }

    public SoegeordType withSoegeordKategori(String value) {
        setSoegeordKategori(value);
        return this;
    }

}
