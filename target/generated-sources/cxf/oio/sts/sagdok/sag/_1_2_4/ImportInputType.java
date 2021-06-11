
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sag" type="{urn:oio:sts:sagdok:sag:1.2.4.0}SagType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportInputType", propOrder = {
    "sag"
})
public class ImportInputType {

    @XmlElement(name = "Sag", required = true)
    protected SagType sag;

    /**
     * Gets the value of the sag property.
     * 
     * @return
     *     possible object is
     *     {@link SagType }
     *     
     */
    public SagType getSag() {
        return sag;
    }

    /**
     * Sets the value of the sag property.
     * 
     * @param value
     *     allowed object is
     *     {@link SagType }
     *     
     */
    public void setSag(SagType value) {
        this.sag = value;
    }

    public ImportInputType withSag(SagType value) {
        setSag(value);
        return this;
    }

}
