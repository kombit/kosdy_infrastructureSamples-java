
package oio.sts.sagdok.dokumentindeks._1_2_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
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
 *         &lt;element name="Titel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Beskrivelse" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="4096"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BrevDato" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="OffentlighedUndtaget" type="{urn:oio:sagdok:3.0.0}OffentlighedUndtagetType" minOccurs="0"/&gt;
 *         &lt;element name="VersionIdentifikator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="UnderversionIdentifikator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Kassationskode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Dokumentnummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Foelsomhed" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}FoelsomhedType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}Type" minOccurs="0"/&gt;
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
    "titel",
    "beskrivelse",
    "brevDato",
    "offentlighedUndtaget",
    "versionIdentifikator",
    "underversionIdentifikator",
    "kassationskode",
    "dokumentnummer",
    "foelsomhed",
    "type"
})
public class EgenskaberType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;
    @XmlElement(name = "BrugervendtNoegle")
    protected String brugervendtNoegle;
    @XmlElement(name = "Titel")
    protected String titel;
    @XmlElement(name = "Beskrivelse")
    protected String beskrivelse;
    @XmlElement(name = "BrevDato")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar brevDato;
    @XmlElement(name = "OffentlighedUndtaget")
    protected OffentlighedUndtagetType offentlighedUndtaget;
    @XmlElement(name = "VersionIdentifikator")
    protected BigInteger versionIdentifikator;
    @XmlElement(name = "UnderversionIdentifikator")
    protected BigInteger underversionIdentifikator;
    @XmlElement(name = "Kassationskode")
    protected String kassationskode;
    @XmlElement(name = "Dokumentnummer")
    protected String dokumentnummer;
    @XmlElement(name = "Foelsomhed")
    @XmlSchemaType(name = "string")
    protected FoelsomhedType foelsomhed;
    @XmlElement(name = "Type")
    @XmlSchemaType(name = "string")
    protected Type type;

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
     * Gets the value of the brevDato property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBrevDato() {
        return brevDato;
    }

    /**
     * Sets the value of the brevDato property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBrevDato(XMLGregorianCalendar value) {
        this.brevDato = value;
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
     * Gets the value of the versionIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersionIdentifikator() {
        return versionIdentifikator;
    }

    /**
     * Sets the value of the versionIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersionIdentifikator(BigInteger value) {
        this.versionIdentifikator = value;
    }

    /**
     * Gets the value of the underversionIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnderversionIdentifikator() {
        return underversionIdentifikator;
    }

    /**
     * Sets the value of the underversionIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnderversionIdentifikator(BigInteger value) {
        this.underversionIdentifikator = value;
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
     * Gets the value of the dokumentnummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumentnummer() {
        return dokumentnummer;
    }

    /**
     * Sets the value of the dokumentnummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumentnummer(String value) {
        this.dokumentnummer = value;
    }

    /**
     * Gets the value of the foelsomhed property.
     * 
     * @return
     *     possible object is
     *     {@link FoelsomhedType }
     *     
     */
    public FoelsomhedType getFoelsomhed() {
        return foelsomhed;
    }

    /**
     * Sets the value of the foelsomhed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoelsomhedType }
     *     
     */
    public void setFoelsomhed(FoelsomhedType value) {
        this.foelsomhed = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Type }
     *     
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Type }
     *     
     */
    public void setType(Type value) {
        this.type = value;
    }

    public EgenskaberType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public EgenskaberType withBrugervendtNoegle(String value) {
        setBrugervendtNoegle(value);
        return this;
    }

    public EgenskaberType withTitel(String value) {
        setTitel(value);
        return this;
    }

    public EgenskaberType withBeskrivelse(String value) {
        setBeskrivelse(value);
        return this;
    }

    public EgenskaberType withBrevDato(XMLGregorianCalendar value) {
        setBrevDato(value);
        return this;
    }

    public EgenskaberType withOffentlighedUndtaget(OffentlighedUndtagetType value) {
        setOffentlighedUndtaget(value);
        return this;
    }

    public EgenskaberType withVersionIdentifikator(BigInteger value) {
        setVersionIdentifikator(value);
        return this;
    }

    public EgenskaberType withUnderversionIdentifikator(BigInteger value) {
        setUnderversionIdentifikator(value);
        return this;
    }

    public EgenskaberType withKassationskode(String value) {
        setKassationskode(value);
        return this;
    }

    public EgenskaberType withDokumentnummer(String value) {
        setDokumentnummer(value);
        return this;
    }

    public EgenskaberType withFoelsomhed(FoelsomhedType value) {
        setFoelsomhed(value);
        return this;
    }

    public EgenskaberType withType(Type value) {
        setType(value);
        return this;
    }

}
