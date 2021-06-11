
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="RetDokumentIndeks" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}RetInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RetSagIndeks" type="{urn:oio:sts:sagdok:sag:1.2.4.0}RetInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetSagDokumentIndeksInputType", propOrder = {
    "retDokumentIndeksOrRetSagIndeks"
})
public class RetSagDokumentIndeksInputType {

    @XmlElements({
        @XmlElement(name = "RetDokumentIndeks", type = oio.sts.sagdok.dokumentindeks._1_2_4.RetInputType.class),
        @XmlElement(name = "RetSagIndeks", type = oio.sts.sagdok.sag._1_2_4.RetInputType.class)
    })
    protected List<oio.sagdok._3_0.RetInputType> retDokumentIndeksOrRetSagIndeks;

    /**
     * Gets the value of the retDokumentIndeksOrRetSagIndeks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retDokumentIndeksOrRetSagIndeks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetDokumentIndeksOrRetSagIndeks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link oio.sts.sagdok.dokumentindeks._1_2_4.RetInputType }
     * {@link oio.sts.sagdok.sag._1_2_4.RetInputType }
     * 
     * 
     */
    public List<oio.sagdok._3_0.RetInputType> getRetDokumentIndeksOrRetSagIndeks() {
        if (retDokumentIndeksOrRetSagIndeks == null) {
            retDokumentIndeksOrRetSagIndeks = new ArrayList<oio.sagdok._3_0.RetInputType>();
        }
        return this.retDokumentIndeksOrRetSagIndeks;
    }

    public RetSagDokumentIndeksInputType withRetDokumentIndeksOrRetSagIndeks(oio.sagdok._3_0.RetInputType... values) {
        if (values!= null) {
            for (oio.sagdok._3_0.RetInputType value: values) {
                getRetDokumentIndeksOrRetSagIndeks().add(value);
            }
        }
        return this;
    }

    public RetSagDokumentIndeksInputType withRetDokumentIndeksOrRetSagIndeks(Collection<oio.sagdok._3_0.RetInputType> values) {
        if (values!= null) {
            getRetDokumentIndeksOrRetSagIndeks().addAll(values);
        }
        return this;
    }

}
