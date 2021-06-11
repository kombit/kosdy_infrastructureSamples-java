
package dk.stoettesystemerne.organisation.organisation._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.stoettesystemerne.organisation._6.GyldighedType;
import oio.sagdok._3_0.LokalUdvidelseType;


/**
 * <p>Java class for TilstandListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TilstandListeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/6/}Gyldighed" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TilstandListeType", propOrder = {
    "gyldighed",
    "lokalUdvidelse"
})
public class TilstandListeType {

    @XmlElement(name = "Gyldighed", namespace = "http://stoettesystemerne.dk/organisation/6/")
    protected List<GyldighedType> gyldighed;
    @XmlElement(name = "LokalUdvidelse", namespace = "urn:oio:sagdok:3.0.0")
    protected LokalUdvidelseType lokalUdvidelse;

    /**
     * Gets the value of the gyldighed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gyldighed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGyldighed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GyldighedType }
     * 
     * 
     */
    public List<GyldighedType> getGyldighed() {
        if (gyldighed == null) {
            gyldighed = new ArrayList<GyldighedType>();
        }
        return this.gyldighed;
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

    public TilstandListeType withGyldighed(GyldighedType... values) {
        if (values!= null) {
            for (GyldighedType value: values) {
                getGyldighed().add(value);
            }
        }
        return this;
    }

    public TilstandListeType withGyldighed(Collection<GyldighedType> values) {
        if (values!= null) {
            getGyldighed().addAll(values);
        }
        return this;
    }

    public TilstandListeType withLokalUdvidelse(LokalUdvidelseType value) {
        setLokalUdvidelse(value);
        return this;
    }

}
