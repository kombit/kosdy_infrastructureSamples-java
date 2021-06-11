
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
 * <p>Java class for AttributListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributListeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Egenskaber" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}EgenskaberType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AttributListeType", propOrder = {
    "egenskaber",
    "lokalUdvidelseListe"
})
public class AttributListeType {

    @XmlElement(name = "Egenskaber")
    protected List<EgenskaberType> egenskaber;
    @XmlElement(name = "LokalUdvidelseListe", namespace = "urn:oio:sts:generelledefinitioner:1.2.4.0")
    protected LokalUdvidelseListeType lokalUdvidelseListe;

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
     * {@link EgenskaberType }
     * 
     * 
     */
    public List<EgenskaberType> getEgenskaber() {
        if (egenskaber == null) {
            egenskaber = new ArrayList<EgenskaberType>();
        }
        return this.egenskaber;
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

    public AttributListeType withEgenskaber(EgenskaberType... values) {
        if (values!= null) {
            for (EgenskaberType value: values) {
                getEgenskaber().add(value);
            }
        }
        return this;
    }

    public AttributListeType withEgenskaber(Collection<EgenskaberType> values) {
        if (values!= null) {
            getEgenskaber().addAll(values);
        }
        return this;
    }

    public AttributListeType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
