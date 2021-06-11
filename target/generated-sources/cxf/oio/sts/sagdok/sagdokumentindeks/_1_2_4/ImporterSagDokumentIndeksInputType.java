
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.SagDokObjektType;
import oio.sts.sagdok.dokumentindeks._1_2_4.DokumentIndeksType;
import oio.sts.sagdok.sag._1_2_4.SagType;


/**
 * <p>Java class for ImporterSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImporterSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="DokumentIndeks" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}DokumentIndeksType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SagIndeks" type="{urn:oio:sts:sagdok:sag:1.2.4.0}SagType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImporterSagDokumentIndeksInputType", propOrder = {
    "dokumentIndeksOrSagIndeks"
})
public class ImporterSagDokumentIndeksInputType {

    @XmlElements({
        @XmlElement(name = "DokumentIndeks", type = DokumentIndeksType.class),
        @XmlElement(name = "SagIndeks", type = SagType.class)
    })
    protected List<SagDokObjektType> dokumentIndeksOrSagIndeks;

    /**
     * Gets the value of the dokumentIndeksOrSagIndeks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentIndeksOrSagIndeks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentIndeksOrSagIndeks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DokumentIndeksType }
     * {@link SagType }
     * 
     * 
     */
    public List<SagDokObjektType> getDokumentIndeksOrSagIndeks() {
        if (dokumentIndeksOrSagIndeks == null) {
            dokumentIndeksOrSagIndeks = new ArrayList<SagDokObjektType>();
        }
        return this.dokumentIndeksOrSagIndeks;
    }

    public ImporterSagDokumentIndeksInputType withDokumentIndeksOrSagIndeks(SagDokObjektType... values) {
        if (values!= null) {
            for (SagDokObjektType value: values) {
                getDokumentIndeksOrSagIndeks().add(value);
            }
        }
        return this;
    }

    public ImporterSagDokumentIndeksInputType withDokumentIndeksOrSagIndeks(Collection<SagDokObjektType> values) {
        if (values!= null) {
            getDokumentIndeksOrSagIndeks().addAll(values);
        }
        return this;
    }

}
