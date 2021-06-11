
package dk.stoettesystemerne.organisation.organisation._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.LokalUdvidelseType;


/**
 * <p>Java class for AttributListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributListeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}Egenskab" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}LokalUdvidelse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributListeType", propOrder = {
    "egenskab",
    "lokalUdvidelse"
})
public class AttributListeType {

    @XmlElement(name = "Egenskab")
    protected List<EgenskabType> egenskab;
    @XmlElement(name = "LokalUdvidelse", namespace = "urn:oio:sagdok:3.0.0")
    protected LokalUdvidelseType lokalUdvidelse;

    /**
     * Gets the value of the egenskab property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the egenskab property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEgenskab().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EgenskabType }
     * 
     * 
     */
    public List<EgenskabType> getEgenskab() {
        if (egenskab == null) {
            egenskab = new ArrayList<EgenskabType>();
        }
        return this.egenskab;
    }

    /**
     * Gets the value of the lokalUdvidelse property.
     * 
     * @return
     *     possible object is
     *     {@link LokalUdvidelseType }
     *     
     */
    public LokalUdvidelseType getLokalUdvidelse() {
        return lokalUdvidelse;
    }

    /**
     * Sets the value of the lokalUdvidelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LokalUdvidelseType }
     *     
     */
    public void setLokalUdvidelse(LokalUdvidelseType value) {
        this.lokalUdvidelse = value;
    }

    public AttributListeType withEgenskab(EgenskabType... values) {
        if (values!= null) {
            for (EgenskabType value: values) {
                getEgenskab().add(value);
            }
        }
        return this;
    }

    public AttributListeType withEgenskab(Collection<EgenskabType> values) {
        if (values!= null) {
            getEgenskab().addAll(values);
        }
        return this;
    }

    public AttributListeType withLokalUdvidelse(LokalUdvidelseType value) {
        setLokalUdvidelse(value);
        return this;
    }

}
