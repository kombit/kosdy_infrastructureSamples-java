
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
 * <p>Java class for FremsoegFilterSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FremsoegFilterSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="DokumentVis" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}DokumentVisType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SagVis" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SagVisType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DokumentInkluder" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}DokumentInkluderFilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SagInkluder" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SagInkluderFilterType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FremsoegFilterSagDokumentIndeksInputType", propOrder = {
    "dokumentVisOrSagVisOrDokumentInkluder"
})
public class FremsoegFilterSagDokumentIndeksInputType {

    @XmlElements({
        @XmlElement(name = "DokumentVis", type = DokumentVisType.class),
        @XmlElement(name = "SagVis", type = SagVisType.class),
        @XmlElement(name = "DokumentInkluder", type = DokumentInkluderFilterType.class),
        @XmlElement(name = "SagInkluder", type = SagInkluderFilterType.class)
    })
    protected List<Object> dokumentVisOrSagVisOrDokumentInkluder;

    /**
     * Gets the value of the dokumentVisOrSagVisOrDokumentInkluder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentVisOrSagVisOrDokumentInkluder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentVisOrSagVisOrDokumentInkluder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DokumentVisType }
     * {@link SagVisType }
     * {@link DokumentInkluderFilterType }
     * {@link SagInkluderFilterType }
     * 
     * 
     */
    public List<Object> getDokumentVisOrSagVisOrDokumentInkluder() {
        if (dokumentVisOrSagVisOrDokumentInkluder == null) {
            dokumentVisOrSagVisOrDokumentInkluder = new ArrayList<Object>();
        }
        return this.dokumentVisOrSagVisOrDokumentInkluder;
    }

    public FremsoegFilterSagDokumentIndeksInputType withDokumentVisOrSagVisOrDokumentInkluder(Object... values) {
        if (values!= null) {
            for (Object value: values) {
                getDokumentVisOrSagVisOrDokumentInkluder().add(value);
            }
        }
        return this;
    }

    public FremsoegFilterSagDokumentIndeksInputType withDokumentVisOrSagVisOrDokumentInkluder(Collection<Object> values) {
        if (values!= null) {
            getDokumentVisOrSagVisOrDokumentInkluder().addAll(values);
        }
        return this;
    }

}
