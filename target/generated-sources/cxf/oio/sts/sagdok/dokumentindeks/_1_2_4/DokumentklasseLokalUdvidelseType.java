
package oio.sts.sagdok.dokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentklasseLokalUdvidelseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentklasseLokalUdvidelseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Klassetitel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BrugervendtNoegle" type="{urn:oio:sagdok:3.0.0}BrugervendtNoegleTekst" minOccurs="0"/&gt;
 *         &lt;element name="Soegeord" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}SoegeordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentklasseLokalUdvidelseType", propOrder = {
    "klassetitel",
    "brugervendtNoegle",
    "soegeord"
})
public class DokumentklasseLokalUdvidelseType {

    @XmlElement(name = "Klassetitel")
    protected String klassetitel;
    @XmlElement(name = "BrugervendtNoegle")
    protected String brugervendtNoegle;
    @XmlElement(name = "Soegeord")
    protected List<SoegeordType> soegeord;

    /**
     * Gets the value of the klassetitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKlassetitel() {
        return klassetitel;
    }

    /**
     * Sets the value of the klassetitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKlassetitel(String value) {
        this.klassetitel = value;
    }

    /**
     * Gets the value of the brugervendtNoegle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugervendtNoegle() {
        return brugervendtNoegle;
    }

    /**
     * Sets the value of the brugervendtNoegle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugervendtNoegle(String value) {
        this.brugervendtNoegle = value;
    }

    /**
     * Gets the value of the soegeord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soegeord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoegeord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoegeordType }
     * 
     * 
     */
    public List<SoegeordType> getSoegeord() {
        if (soegeord == null) {
            soegeord = new ArrayList<SoegeordType>();
        }
        return this.soegeord;
    }

    public DokumentklasseLokalUdvidelseType withKlassetitel(String value) {
        setKlassetitel(value);
        return this;
    }

    public DokumentklasseLokalUdvidelseType withBrugervendtNoegle(String value) {
        setBrugervendtNoegle(value);
        return this;
    }

    public DokumentklasseLokalUdvidelseType withSoegeord(SoegeordType... values) {
        if (values!= null) {
            for (SoegeordType value: values) {
                getSoegeord().add(value);
            }
        }
        return this;
    }

    public DokumentklasseLokalUdvidelseType withSoegeord(Collection<SoegeordType> values) {
        if (values!= null) {
            getSoegeord().addAll(values);
        }
        return this;
    }

}
