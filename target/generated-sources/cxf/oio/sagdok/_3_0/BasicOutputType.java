
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.stoettesystemerne.klassifikation.klasse._6.LaesOutputType;


/**
 * <p>Java class for BasicOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BasicOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}StandardRetur"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicOutputType", propOrder = {
    "standardRetur"
})
@XmlSeeAlso({
    OpretOutputType.class,
    LaesOutputType.class
})
public class BasicOutputType {

    @XmlElement(name = "StandardRetur", required = true)
    protected StandardReturType standardRetur;

    /**
     * Gets the value of the standardRetur property.
     * 
     * @return
     *     possible object is
     *     {@link StandardReturType }
     *     
     */
    public StandardReturType getStandardRetur() {
        return standardRetur;
    }

    /**
     * Sets the value of the standardRetur property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardReturType }
     *     
     */
    public void setStandardRetur(StandardReturType value) {
        this.standardRetur = value;
    }

    public BasicOutputType withStandardRetur(StandardReturType value) {
        setStandardRetur(value);
        return this;
    }

}
