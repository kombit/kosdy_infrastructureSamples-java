
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegUdtrykType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegUdtrykType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operation" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}AndOrType" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element name="SoegDokument" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}SoegInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SoegSag" type="{urn:oio:sts:sagdok:sag:1.2.4.0}SoegInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="NOT" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SoegUdtrykType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SoegUdtryk" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SoegUdtrykType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="SoegSagsloeseDokumenter" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}SoegInputType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegUdtrykType", propOrder = {
    "operation",
    "soegDokumentOrSoegSagOrNOT"
})
public class SoegUdtrykType {

    @XmlSchemaType(name = "string")
    protected AndOrType operation;
    @XmlElementRefs({
        @XmlElementRef(name = "SoegDokument", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoegSag", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NOT", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoegUdtryk", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoegSagsloeseDokumenter", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> soegDokumentOrSoegSagOrNOT;

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link AndOrType }
     *     
     */
    public AndOrType getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndOrType }
     *     
     */
    public void setOperation(AndOrType value) {
        this.operation = value;
    }

    /**
     * Gets the value of the soegDokumentOrSoegSagOrNOT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soegDokumentOrSoegSagOrNOT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoegDokumentOrSoegSagOrNOT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link oio.sts.sagdok.dokumentindeks._1_2_4.SoegInputType }{@code >}
     * {@link JAXBElement }{@code <}{@link oio.sts.sagdok.sag._1_2_4.SoegInputType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoegUdtrykType }{@code >}
     * {@link JAXBElement }{@code <}{@link SoegUdtrykType }{@code >}
     * {@link JAXBElement }{@code <}{@link oio.sts.sagdok.dokumentindeks._1_2_4.SoegInputType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getSoegDokumentOrSoegSagOrNOT() {
        if (soegDokumentOrSoegSagOrNOT == null) {
            soegDokumentOrSoegSagOrNOT = new ArrayList<JAXBElement<?>>();
        }
        return this.soegDokumentOrSoegSagOrNOT;
    }

    public SoegUdtrykType withOperation(AndOrType value) {
        setOperation(value);
        return this;
    }

    public SoegUdtrykType withSoegDokumentOrSoegSagOrNOT(JAXBElement<?> ... values) {
        if (values!= null) {
            for (JAXBElement<?> value: values) {
                getSoegDokumentOrSoegSagOrNOT().add(value);
            }
        }
        return this;
    }

    public SoegUdtrykType withSoegDokumentOrSoegSagOrNOT(Collection<JAXBElement<?>> values) {
        if (values!= null) {
            getSoegDokumentOrSoegSagOrNOT().addAll(values);
        }
        return this;
    }

}
