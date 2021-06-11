
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagSorteringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagSorteringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Element" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SagSorteringFilterType"/&gt;
 *         &lt;element name="Retning" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SorteringFilterRetningType"/&gt;
 *         &lt;element name="Prioritet" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SagSorteringType", propOrder = {
    "element",
    "retning",
    "prioritet"
})
public class SagSorteringType {

    @XmlElement(name = "Element", required = true)
    @XmlSchemaType(name = "string")
    protected SagSorteringFilterType element;
    @XmlElement(name = "Retning", required = true)
    @XmlSchemaType(name = "string")
    protected SorteringFilterRetningType retning;
    @XmlElement(name = "Prioritet", required = true)
    protected BigInteger prioritet;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link SagSorteringFilterType }
     *     
     */
    public SagSorteringFilterType getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link SagSorteringFilterType }
     *     
     */
    public void setElement(SagSorteringFilterType value) {
        this.element = value;
    }

    /**
     * Gets the value of the retning property.
     * 
     * @return
     *     possible object is
     *     {@link SorteringFilterRetningType }
     *     
     */
    public SorteringFilterRetningType getRetning() {
        return retning;
    }

    /**
     * Sets the value of the retning property.
     * 
     * @param value
     *     allowed object is
     *     {@link SorteringFilterRetningType }
     *     
     */
    public void setRetning(SorteringFilterRetningType value) {
        this.retning = value;
    }

    /**
     * Gets the value of the prioritet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrioritet() {
        return prioritet;
    }

    /**
     * Sets the value of the prioritet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrioritet(BigInteger value) {
        this.prioritet = value;
    }

    public SagSorteringType withElement(SagSorteringFilterType value) {
        setElement(value);
        return this;
    }

    public SagSorteringType withRetning(SorteringFilterRetningType value) {
        setRetning(value);
        return this;
    }

    public SagSorteringType withPrioritet(BigInteger value) {
        setPrioritet(value);
        return this;
    }

}
