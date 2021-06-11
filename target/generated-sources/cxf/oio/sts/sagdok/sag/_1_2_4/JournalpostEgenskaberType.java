
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.OffentlighedUndtagetType;


/**
 * <p>Java class for JournalpostEgenskaberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalpostEgenskaberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Dokumenttitel" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}OffentlighedUndtaget" minOccurs="0"/&gt;
 *         &lt;element name="JournalnotatEgenskaber" type="{urn:oio:sts:sagdok:sag:1.2.4.0}JournalnotatEgenskaberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalpostEgenskaberType", propOrder = {
    "dokumenttitel",
    "offentlighedUndtaget",
    "journalnotatEgenskaber"
})
public class JournalpostEgenskaberType {

    @XmlElement(name = "Dokumenttitel")
    protected String dokumenttitel;
    @XmlElement(name = "OffentlighedUndtaget", namespace = "urn:oio:sagdok:3.0.0")
    protected OffentlighedUndtagetType offentlighedUndtaget;
    @XmlElement(name = "JournalnotatEgenskaber")
    protected JournalnotatEgenskaberType journalnotatEgenskaber;

    /**
     * Gets the value of the dokumenttitel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokumenttitel() {
        return dokumenttitel;
    }

    /**
     * Sets the value of the dokumenttitel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokumenttitel(String value) {
        this.dokumenttitel = value;
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
     * Gets the value of the journalnotatEgenskaber property.
     * 
     * @return
     *     possible object is
     *     {@link JournalnotatEgenskaberType }
     *     
     */
    public JournalnotatEgenskaberType getJournalnotatEgenskaber() {
        return journalnotatEgenskaber;
    }

    /**
     * Sets the value of the journalnotatEgenskaber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalnotatEgenskaberType }
     *     
     */
    public void setJournalnotatEgenskaber(JournalnotatEgenskaberType value) {
        this.journalnotatEgenskaber = value;
    }

    public JournalpostEgenskaberType withDokumenttitel(String value) {
        setDokumenttitel(value);
        return this;
    }

    public JournalpostEgenskaberType withOffentlighedUndtaget(OffentlighedUndtagetType value) {
        setOffentlighedUndtaget(value);
        return this;
    }

    public JournalpostEgenskaberType withJournalnotatEgenskaber(JournalnotatEgenskaberType value) {
        setJournalnotatEgenskaber(value);
        return this;
    }

}
