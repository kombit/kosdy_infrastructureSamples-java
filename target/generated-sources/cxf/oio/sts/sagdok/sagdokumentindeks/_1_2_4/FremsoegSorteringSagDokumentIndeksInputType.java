
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
 * <p>Java class for FremsoegSorteringSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FremsoegSorteringSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="SagSortering" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SagSorteringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DokumentSortering" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}DokumentSorteringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FremsoegSorteringSagDokumentIndeksInputType", propOrder = {
    "sagSorteringOrDokumentSortering"
})
public class FremsoegSorteringSagDokumentIndeksInputType {

    @XmlElements({
        @XmlElement(name = "SagSortering", type = SagSorteringType.class),
        @XmlElement(name = "DokumentSortering", type = DokumentSorteringType.class)
    })
    protected List<Object> sagSorteringOrDokumentSortering;

    /**
     * Gets the value of the sagSorteringOrDokumentSortering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagSorteringOrDokumentSortering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagSorteringOrDokumentSortering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SagSorteringType }
     * {@link DokumentSorteringType }
     * 
     * 
     */
    public List<Object> getSagSorteringOrDokumentSortering() {
        if (sagSorteringOrDokumentSortering == null) {
            sagSorteringOrDokumentSortering = new ArrayList<Object>();
        }
        return this.sagSorteringOrDokumentSortering;
    }

    public FremsoegSorteringSagDokumentIndeksInputType withSagSorteringOrDokumentSortering(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getSagSorteringOrDokumentSortering().add(value);
            }
        }
        return this;
    }

    public FremsoegSorteringSagDokumentIndeksInputType withSagSorteringOrDokumentSortering(Collection<Object> values) {
        if (values!= null) {
            getSagSorteringOrDokumentSortering().addAll(values);
        }
        return this;
    }

}
