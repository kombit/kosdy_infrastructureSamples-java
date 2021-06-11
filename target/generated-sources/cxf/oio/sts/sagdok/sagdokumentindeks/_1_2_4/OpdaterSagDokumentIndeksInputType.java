
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.RetInputType;


/**
 * <p>Java class for OpdaterSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpdaterSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="OpdaterDokumentIndeks" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}OpdaterDokumentIndeksInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OpdaterSagIndeks" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}OpdaterSagIndeksInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpdaterSagDokumentIndeksInputType", propOrder = {
    "opdaterDokumentIndeksOrOpdaterSagIndeks"
})
public class OpdaterSagDokumentIndeksInputType {

    @XmlElements({
        @XmlElement(name = "OpdaterDokumentIndeks", type = OpdaterDokumentIndeksInputType.class),
        @XmlElement(name = "OpdaterSagIndeks", type = OpdaterSagIndeksInputType.class)
    })
    protected List<RetInputType> opdaterDokumentIndeksOrOpdaterSagIndeks;

    /**
     * Gets the value of the opdaterDokumentIndeksOrOpdaterSagIndeks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opdaterDokumentIndeksOrOpdaterSagIndeks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpdaterDokumentIndeksOrOpdaterSagIndeks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpdaterDokumentIndeksInputType }
     * {@link OpdaterSagIndeksInputType }
     * 
     * 
     */
    public List<RetInputType> getOpdaterDokumentIndeksOrOpdaterSagIndeks() {
        if (opdaterDokumentIndeksOrOpdaterSagIndeks == null) {
            opdaterDokumentIndeksOrOpdaterSagIndeks = new ArrayList<RetInputType>();
        }
        return this.opdaterDokumentIndeksOrOpdaterSagIndeks;
    }

    public OpdaterSagDokumentIndeksInputType withOpdaterDokumentIndeksOrOpdaterSagIndeks(RetInputType... values) {
        if (values!= null) {
            for (RetInputType value: values) {
                getOpdaterDokumentIndeksOrOpdaterSagIndeks().add(value);
            }
        }
        return this;
    }

    public OpdaterSagDokumentIndeksInputType withOpdaterDokumentIndeksOrOpdaterSagIndeks(Collection<RetInputType> values) {
        if (values!= null) {
            getOpdaterDokumentIndeksOrOpdaterSagIndeks().addAll(values);
        }
        return this;
    }

}
