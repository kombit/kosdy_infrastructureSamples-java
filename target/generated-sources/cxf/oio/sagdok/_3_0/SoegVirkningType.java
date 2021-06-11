
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegVirkningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegVirkningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}FraTidspunkt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilTidspunkt" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}AktoerRef" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}AktoerTypeKode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}NoteTekst" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegVirkningType", propOrder = {
    "fraTidspunkt",
    "tilTidspunkt",
    "aktoerRef",
    "aktoerTypeKode",
    "noteTekst"
})
public class SoegVirkningType {

    @XmlElement(name = "FraTidspunkt")
    protected TidspunktType fraTidspunkt;
    @XmlElement(name = "TilTidspunkt")
    protected TidspunktType tilTidspunkt;
    @XmlElement(name = "AktoerRef")
    protected UnikIdType aktoerRef;
    @XmlElement(name = "AktoerTypeKode")
    @XmlSchemaType(name = "string")
    protected AktoerTypeKodeType aktoerTypeKode;
    @XmlElement(name = "NoteTekst")
    protected String noteTekst;

    /**
     * Gets the value of the fraTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getFraTidspunkt() {
        return fraTidspunkt;
    }

    /**
     * Sets the value of the fraTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setFraTidspunkt(TidspunktType value) {
        this.fraTidspunkt = value;
    }

    /**
     * Gets the value of the tilTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getTilTidspunkt() {
        return tilTidspunkt;
    }

    /**
     * Sets the value of the tilTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setTilTidspunkt(TidspunktType value) {
        this.tilTidspunkt = value;
    }

    /**
     * Gets the value of the aktoerRef property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getAktoerRef() {
        return aktoerRef;
    }

    /**
     * Sets the value of the aktoerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setAktoerRef(UnikIdType value) {
        this.aktoerRef = value;
    }

    /**
     * Gets the value of the aktoerTypeKode property.
     * 
     * @return
     *     possible object is
     *     {@link AktoerTypeKodeType }
     *     
     */
    public AktoerTypeKodeType getAktoerTypeKode() {
        return aktoerTypeKode;
    }

    /**
     * Sets the value of the aktoerTypeKode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AktoerTypeKodeType }
     *     
     */
    public void setAktoerTypeKode(AktoerTypeKodeType value) {
        this.aktoerTypeKode = value;
    }

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

    public SoegVirkningType withFraTidspunkt(TidspunktType value) {
        setFraTidspunkt(value);
        return this;
    }

    public SoegVirkningType withTilTidspunkt(TidspunktType value) {
        setTilTidspunkt(value);
        return this;
    }

    public SoegVirkningType withAktoerRef(UnikIdType value) {
        setAktoerRef(value);
        return this;
    }

    public SoegVirkningType withAktoerTypeKode(AktoerTypeKodeType value) {
        setAktoerTypeKode(value);
        return this;
    }

    public SoegVirkningType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

}
