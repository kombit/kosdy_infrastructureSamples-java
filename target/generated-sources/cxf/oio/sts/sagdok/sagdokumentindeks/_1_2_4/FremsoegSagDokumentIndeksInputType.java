
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FremsoegSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FremsoegSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SagUuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DokumentUuid" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoegUdtryk" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SoegUdtrykType" minOccurs="0"/&gt;
 *         &lt;element name="Filter" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}FremsoegFilterSagDokumentIndeksInputType" minOccurs="0"/&gt;
 *         &lt;element name="Sortering" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}FremsoegSorteringSagDokumentIndeksInputType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FremsoegSagDokumentIndeksInputType", propOrder = {
    "sagUuid",
    "dokumentUuid",
    "soegUdtryk",
    "filter",
    "sortering"
})
public class FremsoegSagDokumentIndeksInputType {

    @XmlElement(name = "SagUuid")
    protected List<String> sagUuid;
    @XmlElement(name = "DokumentUuid")
    protected List<String> dokumentUuid;
    @XmlElement(name = "SoegUdtryk")
    protected SoegUdtrykType soegUdtryk;
    @XmlElement(name = "Filter")
    protected FremsoegFilterSagDokumentIndeksInputType filter;
    @XmlElement(name = "Sortering")
    protected FremsoegSorteringSagDokumentIndeksInputType sortering;

    /**
     * Gets the value of the sagUuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagUuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSagUuid() {
        if (sagUuid == null) {
            sagUuid = new ArrayList<String>();
        }
        return this.sagUuid;
    }

    /**
     * Gets the value of the dokumentUuid property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentUuid property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentUuid().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDokumentUuid() {
        if (dokumentUuid == null) {
            dokumentUuid = new ArrayList<String>();
        }
        return this.dokumentUuid;
    }

    /**
     * Gets the value of the soegUdtryk property.
     * 
     * @return
     *     possible object is
     *     {@link SoegUdtrykType }
     *     
     */
    public SoegUdtrykType getSoegUdtryk() {
        return soegUdtryk;
    }

    /**
     * Sets the value of the soegUdtryk property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoegUdtrykType }
     *     
     */
    public void setSoegUdtryk(SoegUdtrykType value) {
        this.soegUdtryk = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FremsoegFilterSagDokumentIndeksInputType }
     *     
     */
    public FremsoegFilterSagDokumentIndeksInputType getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FremsoegFilterSagDokumentIndeksInputType }
     *     
     */
    public void setFilter(FremsoegFilterSagDokumentIndeksInputType value) {
        this.filter = value;
    }

    /**
     * Gets the value of the sortering property.
     * 
     * @return
     *     possible object is
     *     {@link FremsoegSorteringSagDokumentIndeksInputType }
     *     
     */
    public FremsoegSorteringSagDokumentIndeksInputType getSortering() {
        return sortering;
    }

    /**
     * Sets the value of the sortering property.
     * 
     * @param value
     *     allowed object is
     *     {@link FremsoegSorteringSagDokumentIndeksInputType }
     *     
     */
    public void setSortering(FremsoegSorteringSagDokumentIndeksInputType value) {
        this.sortering = value;
    }

    public FremsoegSagDokumentIndeksInputType withSagUuid(String... values) {
        if (values!= null) {
            for (String value: values) {
                getSagUuid().add(value);
            }
        }
        return this;
    }

    public FremsoegSagDokumentIndeksInputType withSagUuid(Collection<String> values) {
        if (values!= null) {
            getSagUuid().addAll(values);
        }
        return this;
    }

    public FremsoegSagDokumentIndeksInputType withDokumentUuid(String... values) {
        if (values!= null) {
            for (String value: values) {
                getDokumentUuid().add(value);
            }
        }
        return this;
    }

    public FremsoegSagDokumentIndeksInputType withDokumentUuid(Collection<String> values) {
        if (values!= null) {
            getDokumentUuid().addAll(values);
        }
        return this;
    }

    public FremsoegSagDokumentIndeksInputType withSoegUdtryk(SoegUdtrykType value) {
        setSoegUdtryk(value);
        return this;
    }

    public FremsoegSagDokumentIndeksInputType withFilter(FremsoegFilterSagDokumentIndeksInputType value) {
        setFilter(value);
        return this;
    }

    public FremsoegSagDokumentIndeksInputType withSortering(FremsoegSorteringSagDokumentIndeksInputType value) {
        setSortering(value);
        return this;
    }

}
