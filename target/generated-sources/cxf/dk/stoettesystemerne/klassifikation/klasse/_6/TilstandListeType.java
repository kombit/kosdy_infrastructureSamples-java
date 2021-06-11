
package dk.stoettesystemerne.klassifikation.klasse._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://stoettesystemerne.dk/klassifikation/klasse/6/}PubliceretStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "publiceretStatus"
})
public class TilstandListeType {

    @XmlElement(name = "PubliceretStatus")
    protected List<PubliceretStatusType> publiceretStatus;

    /**
     * Gets the value of the publiceretStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publiceretStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPubliceretStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PubliceretStatusType }
     * 
     * 
     */
    public List<PubliceretStatusType> getPubliceretStatus() {
        if (publiceretStatus == null) {
            publiceretStatus = new ArrayList<PubliceretStatusType>();
        }
        return this.publiceretStatus;
    }

    public TilstandListeType withPubliceretStatus(PubliceretStatusType... values) {
        if (values!= null) {
            for (PubliceretStatusType value: values) {
                getPubliceretStatus().add(value);
            }
        }
        return this;
    }

    public TilstandListeType withPubliceretStatus(Collection<PubliceretStatusType> values) {
        if (values!= null) {
            getPubliceretStatus().addAll(values);
        }
        return this;
    }

}
