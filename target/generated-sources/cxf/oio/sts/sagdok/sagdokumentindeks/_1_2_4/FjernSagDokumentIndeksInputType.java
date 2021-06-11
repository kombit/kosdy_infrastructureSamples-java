
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;


/**
 * <p>Java class for FjernSagDokumentIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FjernSagDokumentIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="SagUuid" type="{urn:oio:sagdok:3.0.0}UnikIdType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="SoegUdtryk" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SoegUdtrykType" minOccurs="0"/&gt;
 *         &lt;element name="EfterladSagsloeseDokumenter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FjernSagDokumentIndeksInputType", propOrder = {
    "sagUuid",
    "soegUdtryk",
    "efterladSagsloeseDokumenter"
})
public class FjernSagDokumentIndeksInputType {

    @XmlElement(name = "SagUuid")
    protected List<UnikIdType> sagUuid;
    @XmlElement(name = "SoegUdtryk")
    protected SoegUdtrykType soegUdtryk;
    @XmlElement(name = "EfterladSagsloeseDokumenter")
    protected Boolean efterladSagsloeseDokumenter;

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
     * {@link UnikIdType }
     * 
     * 
     */
    public List<UnikIdType> getSagUuid() {
        if (sagUuid == null) {
            sagUuid = new ArrayList<UnikIdType>();
        }
        return this.sagUuid;
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
     * Gets the value of the efterladSagsloeseDokumenter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEfterladSagsloeseDokumenter() {
        return efterladSagsloeseDokumenter;
    }

    /**
     * Sets the value of the efterladSagsloeseDokumenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEfterladSagsloeseDokumenter(Boolean value) {
        this.efterladSagsloeseDokumenter = value;
    }

    public FjernSagDokumentIndeksInputType withSagUuid(UnikIdType... values) {
        if (values!= null) {
            for (UnikIdType value: values) {
                getSagUuid().add(value);
            }
        }
        return this;
    }

    public FjernSagDokumentIndeksInputType withSagUuid(Collection<UnikIdType> values) {
        if (values!= null) {
            getSagUuid().addAll(values);
        }
        return this;
    }

    public FjernSagDokumentIndeksInputType withSoegUdtryk(SoegUdtrykType value) {
        setSoegUdtryk(value);
        return this;
    }

    public FjernSagDokumentIndeksInputType withEfterladSagsloeseDokumenter(Boolean value) {
        setEfterladSagsloeseDokumenter(value);
        return this;
    }

}
