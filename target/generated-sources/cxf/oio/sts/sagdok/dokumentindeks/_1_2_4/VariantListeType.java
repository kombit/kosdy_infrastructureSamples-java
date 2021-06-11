
package oio.sts.sagdok.dokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseListeType;


/**
 * <p>Java class for VariantListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VariantListeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Variant" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}VariantType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:generelledefinitioner:1.2.4.0}LokalUdvidelseListe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VariantListeType", propOrder = {
    "variant",
    "lokalUdvidelseListe"
})
public class VariantListeType {

    @XmlElement(name = "Variant")
    protected List<VariantType> variant;
    @XmlElement(name = "LokalUdvidelseListe", namespace = "urn:oio:sts:generelledefinitioner:1.2.4.0")
    protected LokalUdvidelseListeType lokalUdvidelseListe;

    /**
     * Gets the value of the variant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VariantType }
     * 
     * 
     */
    public List<VariantType> getVariant() {
        if (variant == null) {
            variant = new ArrayList<VariantType>();
        }
        return this.variant;
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

    public VariantListeType withVariant(VariantType... values) {
        if (values!= null) {
            for (VariantType value: values) {
                getVariant().add(value);
            }
        }
        return this;
    }

    public VariantListeType withVariant(Collection<VariantType> values) {
        if (values!= null) {
            getVariant().addAll(values);
        }
        return this;
    }

    public VariantListeType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
