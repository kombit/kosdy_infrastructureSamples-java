
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DynamicFlerRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFlerRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}FlerRelationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Rolle" type="{urn:oio:sagdok:3.0.0}UuidLabelInputType"/&gt;
 *         &lt;element name="Type" type="{urn:oio:sagdok:3.0.0}UuidLabelInputType"/&gt;
 *         &lt;element name="Indeks" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFlerRelationType", propOrder = {
    "rolle",
    "type",
    "indeks"
})
@XmlSeeAlso({
    AdresseFlerRelationType.class,
    OpgaverFlerRelationType.class
})
public class DynamicFlerRelationType
    extends FlerRelationType
{

    @XmlElement(name = "Rolle", required = true)
    protected UuidLabelInputType rolle;
    @XmlElement(name = "Type", required = true)
    protected UuidLabelInputType type;
    @XmlElement(name = "Indeks", required = true)
    protected String indeks;

    /**
     * Gets the value of the rolle property.
     * 
     * @return
     *     possible object is
     *     {@link UuidLabelInputType }
     *     
     */
    public UuidLabelInputType getRolle() {
        return rolle;
    }

    /**
     * Sets the value of the rolle property.
     * 
     * @param value
     *     allowed object is
     *     {@link UuidLabelInputType }
     *     
     */
    public void setRolle(UuidLabelInputType value) {
        this.rolle = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link UuidLabelInputType }
     *     
     */
    public UuidLabelInputType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link UuidLabelInputType }
     *     
     */
    public void setType(UuidLabelInputType value) {
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

    public DynamicFlerRelationType withRolle(UuidLabelInputType value) {
        setRolle(value);
        return this;
    }

    public DynamicFlerRelationType withType(UuidLabelInputType value) {
        setType(value);
        return this;
    }

    public DynamicFlerRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public DynamicFlerRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public DynamicFlerRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
