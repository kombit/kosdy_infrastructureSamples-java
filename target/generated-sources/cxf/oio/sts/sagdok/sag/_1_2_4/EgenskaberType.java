
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.OffentlighedUndtagetType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for EgenskaberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EgenskaberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Virkning" type="{urn:oio:sagdok:3.0.0}VirkningType" minOccurs="0"/&gt;
 *         &lt;element name="BrugervendtNoegle" type="{urn:oio:sagdok:3.0.0}BrugervendtNoegleTekst" minOccurs="0"/&gt;
 *         &lt;element name="AfleveretIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Beskrivelse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4096"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HjemmelSpecifikation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1024"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kassationskode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OffentlighedUndtaget" type="{urn:oio:sagdok:3.0.0}OffentlighedUndtagetType" minOccurs="0"/&gt;
 *         &lt;element name="PrincipielIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Sagsnummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Titel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EgenskaberType", propOrder = {
    "virkning",
    "brugervendtNoegle",
    "afleveretIndikator",
    "beskrivelse",
    "hjemmelSpecifikation",
    "kassationskode",
    "offentlighedUndtaget",
    "principielIndikator",
    "sagsnummer",
    "titel"
})
public class EgenskaberType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;
    @XmlElement(name = "BrugervendtNoegle")
    protected String brugervendtNoegle;
    @XmlElement(name = "AfleveretIndikator")
    protected Boolean afleveretIndikator;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;
    @XmlElement(name = "HjemmelSpecifikation")
    protected String hjemmelSpecifikation;
    @XmlElement(name = "Kassationskode")
    protected String kassationskode;
    @XmlElement(name = "OffentlighedUndtaget")
    protected OffentlighedUndtagetType offentlighedUndtaget;
    @XmlElement(name = "PrincipielIndikator")
    protected Boolean principielIndikator;
    @XmlElement(name = "Sagsnummer")
    protected String sagsnummer;
    @XmlElement(name = "Titel")
    protected String titel;

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
     * Gets the value of the afleveretIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAfleveretIndikator() {
        return afleveretIndikator;
    }

    /**
     * Sets the value of the afleveretIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAfleveretIndikator(Boolean value) {
        this.afleveretIndikator = value;
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
     * Gets the value of the hjemmelSpecifikation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHjemmelSpecifikation() {
        return hjemmelSpecifikation;
    }

    /**
     * Sets the value of the hjemmelSpecifikation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHjemmelSpecifikation(String value) {
        this.hjemmelSpecifikation = value;
    }

    /**
     * Gets the value of the kassationskode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKassationskode() {
        return kassationskode;
    }

    /**
     * Sets the value of the kassationskode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKassationskode(String value) {
        this.kassationskode = value;
    }

    /**
     * Gets the value of the offentlighedUndtaget property.
     * 
     * @return
     *     possible object is
     *     {@link OffentlighedUndtagetType }
     *     
     */
    public OffentlighedUndtagetType getOffentlighedUndtaget() {
        return offentlighedUndtaget;
    }

    /**
     * Sets the value of the offentlighedUndtaget property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffentlighedUndtagetType }
     *     
     */
    public void setOffentlighedUndtaget(OffentlighedUndtagetType value) {
        this.offentlighedUndtaget = value;
    }

    /**
     * Gets the value of the principielIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrincipielIndikator() {
        return principielIndikator;
    }

    /**
     * Sets the value of the principielIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrincipielIndikator(Boolean value) {
        this.principielIndikator = value;
    }

    /**
     * Gets the value of the sagsnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSagsnummer() {
        return sagsnummer;
    }

    /**
     * Sets the value of the sagsnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSagsnummer(String value) {
        this.sagsnummer = value;
    }

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    public EgenskaberType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public EgenskaberType withBrugervendtNoegle(String value) {
        setBrugervendtNoegle(value);
        return this;
    }

    public EgenskaberType withAfleveretIndikator(Boolean value) {
        setAfleveretIndikator(value);
        return this;
    }

    public EgenskaberType withBeskrivelse(String value) {
        setBeskrivelse(value);
        return this;
    }

    public EgenskaberType withHjemmelSpecifikation(String value) {
        setHjemmelSpecifikation(value);
        return this;
    }

    public EgenskaberType withKassationskode(String value) {
        setKassationskode(value);
        return this;
    }

    public EgenskaberType withOffentlighedUndtaget(OffentlighedUndtagetType value) {
        setOffentlighedUndtaget(value);
        return this;
    }

    public EgenskaberType withPrincipielIndikator(Boolean value) {
        setPrincipielIndikator(value);
        return this;
    }

    public EgenskaberType withSagsnummer(String value) {
        setSagsnummer(value);
        return this;
    }

    public EgenskaberType withTitel(String value) {
        setTitel(value);
        return this;
    }

}
