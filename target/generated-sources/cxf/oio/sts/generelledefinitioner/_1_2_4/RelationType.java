
package oio.sts.generelledefinitioner._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.sagdok.dokumentindeks._1_2_4.DokumentitsystemRelationType;
import oio.sts.sagdok.sag._1_2_4.JournalpostRelationType;
import oio.sts.sagdok.sagindeks._1_2_4.SagsitsystemRelationType;


/**
 * <p>Java class for RelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Virkning" type="{urn:oio:sagdok:3.0.0}VirkningType" minOccurs="0"/&gt;
 *         &lt;element name="Rolle" type="{urn:oio:sagdok:3.0.0}UnikIdType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{urn:oio:sagdok:3.0.0}UnikIdType" minOccurs="0"/&gt;
 *         &lt;element name="Indeks" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="36"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReferenceID" type="{urn:oio:sagdok:3.0.0}UnikIdType" minOccurs="0"/&gt;
 *         &lt;element name="LokalUdvidelseListe" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}LokalUdvidelseListeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationType", propOrder = {
    "virkning",
    "rolle",
    "type",
    "indeks",
    "referenceID",
    "lokalUdvidelseListe"
})
@XmlSeeAlso({
    oio.sts.sagdok.sagindeks._1_2_4.SikkerhedsprofilRelationType.class,
    SagsitsystemRelationType.class,
    JournalpostRelationType.class,
    oio.sts.sagdok.dokumentindeks._1_2_4.SikkerhedsprofilRelationType.class,
    DokumentitsystemRelationType.class
})
public class RelationType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;
    @XmlElement(name = "Rolle")
    protected UnikIdType rolle;
    @XmlElement(name = "Type")
    protected UnikIdType type;
    @XmlElement(name = "Indeks")
    protected String indeks;
    @XmlElement(name = "ReferenceID")
    protected UnikIdType referenceID;
    @XmlElement(name = "LokalUdvidelseListe")
    protected LokalUdvidelseListeType lokalUdvidelseListe;

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
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setRolle(UnikIdType value) {
        this.rolle = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setType(UnikIdType value) {
        this.type = value;
    }

    /**
     * Gets the value of the indeks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndeks() {
        return indeks;
    }

    /**
     * Sets the value of the indeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndeks(String value) {
        this.indeks = value;
    }

    /**
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setReferenceID(UnikIdType value) {
        this.referenceID = value;
    }

    /**
     * Gets the value of the lokalUdvidelseListe property.
     * 
     * @return
     *     possible object is
     *     {@link LokalUdvidelseListeType }
     *     
     */
    public LokalUdvidelseListeType getLokalUdvidelseListe() {
        return lokalUdvidelseListe;
    }

    /**
     * Sets the value of the lokalUdvidelseListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link LokalUdvidelseListeType }
     *     
     */
    public void setLokalUdvidelseListe(LokalUdvidelseListeType value) {
        this.lokalUdvidelseListe = value;
    }

    public RelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public RelationType withRolle(UnikIdType value) {
        setRolle(value);
        return this;
    }

    public RelationType withType(UnikIdType value) {
        setType(value);
        return this;
    }

    public RelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    public RelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

    public RelationType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
