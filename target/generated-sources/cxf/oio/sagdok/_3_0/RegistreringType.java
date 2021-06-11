
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RegistreringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}NoteTekst" minOccurs="0"/&gt;
 *         &lt;element name="Tidspunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}LivscyklusKode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}BrugerRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringType", propOrder = {
    "noteTekst",
    "tidspunkt",
    "livscyklusKode",
    "brugerRef"
})
@XmlSeeAlso({
    dk.stoettesystemerne.klassifikation.klasse._6.RegistreringType.class
})
public class RegistreringType {

    @XmlElement(name = "NoteTekst")
    protected String noteTekst;
    @XmlElement(name = "Tidspunkt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tidspunkt;
    @XmlElement(name = "LivscyklusKode")
    @XmlSchemaType(name = "string")
    protected LivscyklusKodeType livscyklusKode;
    @XmlElement(name = "BrugerRef")
    protected UnikIdType brugerRef;

    /**
     * Gets the value of the noteTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteTekst() {
        return noteTekst;
    }

    /**
     * Sets the value of the noteTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteTekst(String value) {
        this.noteTekst = value;
    }

    /**
     * Gets the value of the tidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTidspunkt() {
        return tidspunkt;
    }

    /**
     * Sets the value of the tidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTidspunkt(XMLGregorianCalendar value) {
        this.tidspunkt = value;
    }

    /**
     * Gets the value of the livscyklusKode property.
     * 
     * @return
     *     possible object is
     *     {@link LivscyklusKodeType }
     *     
     */
    public LivscyklusKodeType getLivscyklusKode() {
        return livscyklusKode;
    }

    /**
     * Sets the value of the livscyklusKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LivscyklusKodeType }
     *     
     */
    public void setLivscyklusKode(LivscyklusKodeType value) {
        this.livscyklusKode = value;
    }

    /**
     * Gets the value of the brugerRef property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getBrugerRef() {
        return brugerRef;
    }

    /**
     * Sets the value of the brugerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setBrugerRef(UnikIdType value) {
        this.brugerRef = value;
    }

    public RegistreringType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

    public RegistreringType withTidspunkt(XMLGregorianCalendar value) {
        setTidspunkt(value);
        return this;
    }

    public RegistreringType withLivscyklusKode(LivscyklusKodeType value) {
        setLivscyklusKode(value);
        return this;
    }

    public RegistreringType withBrugerRef(UnikIdType value) {
        setBrugerRef(value);
        return this;
    }

}
