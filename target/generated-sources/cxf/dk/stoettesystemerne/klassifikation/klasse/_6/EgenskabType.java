
package dk.stoettesystemerne.klassifikation.klasse._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for EgenskabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EgenskabType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virkning" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}BrugervendtNoegleTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}BeskrivelseTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}EksempelTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}OmfangTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TitelTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}RetskildeTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}AendringsnotatTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/klassifikation/klasse/6/}Soegeord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EgenskabType", propOrder = {
    "virkning",
    "brugervendtNoegleTekst",
    "beskrivelseTekst",
    "eksempelTekst",
    "omfangTekst",
    "titelTekst",
    "retskildeTekst",
    "aendringsnotatTekst",
    "soegeord"
})
public class EgenskabType {

    @XmlElement(name = "Virkning", namespace = "urn:oio:sagdok:3.0.0")
    protected VirkningType virkning;
    @XmlElement(name = "BrugervendtNoegleTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String brugervendtNoegleTekst;
    @XmlElement(name = "BeskrivelseTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String beskrivelseTekst;
    @XmlElement(name = "EksempelTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String eksempelTekst;
    @XmlElement(name = "OmfangTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String omfangTekst;
    @XmlElement(name = "TitelTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String titelTekst;
    @XmlElement(name = "RetskildeTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String retskildeTekst;
    @XmlElement(name = "AendringsnotatTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String aendringsnotatTekst;
    @XmlElement(name = "Soegeord")
    protected List<SoegeordType> soegeord;

    /**
     * Gets the value of the virkning property.
     * 
     * @return
     *     possible object is
     *     {@link VirkningType }
     *     
     */
    public VirkningType getVirkning() {
        return virkning;
    }

    /**
     * Sets the value of the virkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirkningType }
     *     
     */
    public void setVirkning(VirkningType value) {
        this.virkning = value;
    }

    /**
     * Gets the value of the brugervendtNoegleTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugervendtNoegleTekst() {
        return brugervendtNoegleTekst;
    }

    /**
     * Sets the value of the brugervendtNoegleTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugervendtNoegleTekst(String value) {
        this.brugervendtNoegleTekst = value;
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
     * Gets the value of the eksempelTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEksempelTekst() {
        return eksempelTekst;
    }

    /**
     * Sets the value of the eksempelTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEksempelTekst(String value) {
        this.eksempelTekst = value;
    }

    /**
     * Gets the value of the omfangTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOmfangTekst() {
        return omfangTekst;
    }

    /**
     * Sets the value of the omfangTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOmfangTekst(String value) {
        this.omfangTekst = value;
    }

    /**
     * Gets the value of the titelTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitelTekst() {
        return titelTekst;
    }

    /**
     * Sets the value of the titelTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitelTekst(String value) {
        this.titelTekst = value;
    }

    /**
     * Gets the value of the retskildeTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetskildeTekst() {
        return retskildeTekst;
    }

    /**
     * Sets the value of the retskildeTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetskildeTekst(String value) {
        this.retskildeTekst = value;
    }

    /**
     * Gets the value of the aendringsnotatTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAendringsnotatTekst() {
        return aendringsnotatTekst;
    }

    /**
     * Sets the value of the aendringsnotatTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAendringsnotatTekst(String value) {
        this.aendringsnotatTekst = value;
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

    public EgenskabType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public EgenskabType withBrugervendtNoegleTekst(String value) {
        setBrugervendtNoegleTekst(value);
        return this;
    }

    public EgenskabType withBeskrivelseTekst(String value) {
        setBeskrivelseTekst(value);
        return this;
    }

    public EgenskabType withEksempelTekst(String value) {
        setEksempelTekst(value);
        return this;
    }

    public EgenskabType withOmfangTekst(String value) {
        setOmfangTekst(value);
        return this;
    }

    public EgenskabType withTitelTekst(String value) {
        setTitelTekst(value);
        return this;
    }

    public EgenskabType withRetskildeTekst(String value) {
        setRetskildeTekst(value);
        return this;
    }

    public EgenskabType withAendringsnotatTekst(String value) {
        setAendringsnotatTekst(value);
        return this;
    }

    public EgenskabType withSoegeord(SoegeordType... values) {
        if (values!= null) {
            for (SoegeordType value: values) {
                getSoegeord().add(value);
            }
        }
        return this;
    }

    public EgenskabType withSoegeord(Collection<SoegeordType> values) {
        if (values!= null) {
            getSoegeord().addAll(values);
        }
        return this;
    }

}
