
package oio.sagdok._3_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdListeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdListeType", propOrder = {
    "uuidIdentifikator"
})
public class IdListeType {

    @XmlElement(name = "UUIDIdentifikator")
    protected List<String> uuidIdentifikator;

    /**
     * Gets the value of the uuidIdentifikator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuidIdentifikator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUUIDIdentifikator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUUIDIdentifikator() {
        if (uuidIdentifikator == null) {
            uuidIdentifikator = new ArrayList<String>();
        }
        return this.uuidIdentifikator;
    }

    public IdListeType withUUIDIdentifikator(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUUIDIdentifikator().add(value);
            }
        }
        return this;
    }

    public IdListeType withUUIDIdentifikator(Collection<String> values) {
        if (values!= null) {
            getUUIDIdentifikator().addAll(values);
        }
        return this;
    }

}
