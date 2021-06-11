
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for VariantEgenskaberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariantEgenskaberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Virkning" type="{urn:oio:sagdok:3.0.0}VirkningType" minOccurs="0"/&gt;
 *         &lt;element name="ArkiveringIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="DelvisSkannetIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OffentliggoerelseIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ProduktionIndikator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Lokation" minOccurs="0"&gt;
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
@XmlType(name = "VariantEgenskaberType", propOrder = {
    "virkning",
    "arkiveringIndikator",
    "delvisSkannetIndikator",
    "offentliggoerelseIndikator",
    "produktionIndikator",
    "lokation"
})
public class VariantEgenskaberType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;
    @XmlElement(name = "ArkiveringIndikator")
    protected Boolean arkiveringIndikator;
    @XmlElement(name = "DelvisSkannetIndikator")
    protected Boolean delvisSkannetIndikator;
    @XmlElement(name = "OffentliggoerelseIndikator")
    protected Boolean offentliggoerelseIndikator;
    @XmlElement(name = "ProduktionIndikator")
    protected Boolean produktionIndikator;
    @XmlElement(name = "Lokation")
    protected String lokation;

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
     * Gets the value of the arkiveringIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArkiveringIndikator() {
        return arkiveringIndikator;
    }

    /**
     * Sets the value of the arkiveringIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArkiveringIndikator(Boolean value) {
        this.arkiveringIndikator = value;
    }

    /**
     * Gets the value of the delvisSkannetIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDelvisSkannetIndikator() {
        return delvisSkannetIndikator;
    }

    /**
     * Sets the value of the delvisSkannetIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDelvisSkannetIndikator(Boolean value) {
        this.delvisSkannetIndikator = value;
    }

    /**
     * Gets the value of the offentliggoerelseIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOffentliggoerelseIndikator() {
        return offentliggoerelseIndikator;
    }

    /**
     * Sets the value of the offentliggoerelseIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOffentliggoerelseIndikator(Boolean value) {
        this.offentliggoerelseIndikator = value;
    }

    /**
     * Gets the value of the produktionIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProduktionIndikator() {
        return produktionIndikator;
    }

    /**
     * Sets the value of the produktionIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProduktionIndikator(Boolean value) {
        this.produktionIndikator = value;
    }

    /**
     * Gets the value of the lokation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokation() {
        return lokation;
    }

    /**
     * Sets the value of the lokation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokation(String value) {
        this.lokation = value;
    }

    public VariantEgenskaberType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public VariantEgenskaberType withArkiveringIndikator(Boolean value) {
        setArkiveringIndikator(value);
        return this;
    }

    public VariantEgenskaberType withDelvisSkannetIndikator(Boolean value) {
        setDelvisSkannetIndikator(value);
        return this;
    }

    public VariantEgenskaberType withOffentliggoerelseIndikator(Boolean value) {
        setOffentliggoerelseIndikator(value);
        return this;
    }

    public VariantEgenskaberType withProduktionIndikator(Boolean value) {
        setProduktionIndikator(value);
        return this;
    }

    public VariantEgenskaberType withLokation(String value) {
        setLokation(value);
        return this;
    }

}
