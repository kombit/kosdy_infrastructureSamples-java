
package oio.sagdok._3_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnikReturType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnikReturType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}StandardReturType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnikReturType", propOrder = {
    "type",
    "uuidIdentifikator"
})
public class UnikReturType
    extends StandardReturType
{

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "UUIDIdentifikator", required = true)
    protected String uuidIdentifikator;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the uuidIdentifikator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUIDIdentifikator() {
        return uuidIdentifikator;
    }

    /**
     * Sets the value of the uuidIdentifikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUIDIdentifikator(String value) {
        this.uuidIdentifikator = value;
    }

    public UnikReturType withType(String value) {
        setType(value);
        return this;
    }

    public UnikReturType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    @Override
    public UnikReturType withStatusKode(BigInteger value) {
        setStatusKode(value);
        return this;
    }

    @Override
    public UnikReturType withFejlbeskedTekst(String value) {
        setFejlbeskedTekst(value);
        return this;
    }

}
