
package oio.sts.sagdok.dokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VariantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Variant" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Egenskaber" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}VariantEgenskaberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariantType", propOrder = {
    "variant",
    "egenskaber"
})
public class VariantType {

    @XmlElement(name = "Variant")
    protected String variant;
    @XmlElement(name = "Egenskaber")
    protected List<VariantEgenskaberType> egenskaber;

    /**
     * Gets the value of the variant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariant() {
        return variant;
    }

    /**
     * Sets the value of the variant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariant(String value) {
        this.variant = value;
    }

    /**
     * Gets the value of the egenskaber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egenskaber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEgenskaber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariantEgenskaberType }
     * 
     * 
     */
    public List<VariantEgenskaberType> getEgenskaber() {
        if (egenskaber == null) {
            egenskaber = new ArrayList<VariantEgenskaberType>();
        }
        return this.egenskaber;
    }

    public VariantType withVariant(String value) {
        setVariant(value);
        return this;
    }

    public VariantType withEgenskaber(VariantEgenskaberType... values) {
        if (values!= null) {
            for (VariantEgenskaberType value: values) {
                getEgenskaber().add(value);
            }
        }
        return this;
    }

    public VariantType withEgenskaber(Collection<VariantEgenskaberType> values) {
        if (values!= null) {
            getEgenskaber().addAll(values);
        }
        return this;
    }

}
