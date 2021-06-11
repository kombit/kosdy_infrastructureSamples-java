
package oio.sagdok._3_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MultipleOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="UnikRetur" type="{urn:oio:sagdok:3.0.0}UnikReturType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element name="StandardRetur" type="{urn:oio:sagdok:3.0.0}StandardReturType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MultipleOutputType", propOrder = {
    "unikRetur",
    "standardRetur"
})
public class MultipleOutputType {

    @XmlElement(name = "UnikRetur")
    protected List<UnikReturType> unikRetur;
    @XmlElement(name = "StandardRetur")
    protected List<StandardReturType> standardRetur;

    /**
     * Gets the value of the unikRetur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unikRetur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnikRetur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnikReturType }
     * 
     * 
     */
    public List<UnikReturType> getUnikRetur() {
        if (unikRetur == null) {
            unikRetur = new ArrayList<UnikReturType>();
        }
        return this.unikRetur;
    }

    /**
     * Gets the value of the standardRetur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardRetur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardRetur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardReturType }
     * 
     * 
     */
    public List<StandardReturType> getStandardRetur() {
        if (standardRetur == null) {
            standardRetur = new ArrayList<StandardReturType>();
        }
        return this.standardRetur;
    }

    public MultipleOutputType withUnikRetur(UnikReturType... values) {
        if (values!= null) {
            for (UnikReturType value: values) {
                getUnikRetur().add(value);
            }
        }
        return this;
    }

    public MultipleOutputType withUnikRetur(Collection<UnikReturType> values) {
        if (values!= null) {
            getUnikRetur().addAll(values);
        }
        return this;
    }

    public MultipleOutputType withStandardRetur(StandardReturType... values) {
        if (values!= null) {
            for (StandardReturType value: values) {
                getStandardRetur().add(value);
            }
        }
        return this;
    }

    public MultipleOutputType withStandardRetur(Collection<StandardReturType> values) {
        if (values!= null) {
            getStandardRetur().addAll(values);
        }
        return this;
    }

}
