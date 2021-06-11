
package oio.sagdok._3_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegJournalPostRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegJournalPostRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}SoegRelationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}JournalPostIdentifikator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TitelTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}IndeksIdentifikator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}OffentlighedUndtaget" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilhoersforholdKode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegJournalPostRelationType", propOrder = {
    "journalPostIdentifikator",
    "titelTekst",
    "indeksIdentifikator",
    "offentlighedUndtaget",
    "tilhoersforholdKode"
})
public class SoegJournalPostRelationType
    extends SoegRelationType
{

    @XmlElement(name = "JournalPostIdentifikator")
    protected String journalPostIdentifikator;
    @XmlElement(name = "TitelTekst")
    protected String titelTekst;
    @XmlElement(name = "IndeksIdentifikator")
    protected BigInteger indeksIdentifikator;
    @XmlElement(name = "OffentlighedUndtaget")
    protected OffentlighedUndtagetType offentlighedUndtaget;
    @XmlElement(name = "TilhoersforholdKode")
    @XmlSchemaType(name = "string")
    protected TilhoersforholdKodeType tilhoersforholdKode;

    /**
     * Gets the value of the journalPostIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJournalPostIdentifikator() {
        return journalPostIdentifikator;
    }

    /**
     * Sets the value of the journalPostIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJournalPostIdentifikator(String value) {
        this.journalPostIdentifikator = value;
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
     * Gets the value of the indeksIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndeksIdentifikator() {
        return indeksIdentifikator;
    }

    /**
     * Sets the value of the indeksIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndeksIdentifikator(BigInteger value) {
        this.indeksIdentifikator = value;
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
     * Gets the value of the tilhoersforholdKode property.
     * 
     * @return
     *     possible object is
     *     {@link TilhoersforholdKodeType }
     *     
     */
    public TilhoersforholdKodeType getTilhoersforholdKode() {
        return tilhoersforholdKode;
    }

    /**
     * Sets the value of the tilhoersforholdKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilhoersforholdKodeType }
     *     
     */
    public void setTilhoersforholdKode(TilhoersforholdKodeType value) {
        this.tilhoersforholdKode = value;
    }

    public SoegJournalPostRelationType withJournalPostIdentifikator(String value) {
        setJournalPostIdentifikator(value);
        return this;
    }

    public SoegJournalPostRelationType withTitelTekst(String value) {
        setTitelTekst(value);
        return this;
    }

    public SoegJournalPostRelationType withIndeksIdentifikator(BigInteger value) {
        setIndeksIdentifikator(value);
        return this;
    }

    public SoegJournalPostRelationType withOffentlighedUndtaget(OffentlighedUndtagetType value) {
        setOffentlighedUndtaget(value);
        return this;
    }

    public SoegJournalPostRelationType withTilhoersforholdKode(TilhoersforholdKodeType value) {
        setTilhoersforholdKode(value);
        return this;
    }

    @Override
    public SoegJournalPostRelationType withSoegVirkning(SoegVirkningType value) {
        setSoegVirkning(value);
        return this;
    }

    @Override
    public SoegJournalPostRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
