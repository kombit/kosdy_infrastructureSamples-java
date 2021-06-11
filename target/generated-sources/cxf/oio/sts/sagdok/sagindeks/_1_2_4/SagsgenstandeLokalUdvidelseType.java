
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagsgenstandeLokalUdvidelseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagsgenstandeLokalUdvidelseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tekstfelt" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1024"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SagsgenstandeLokalUdvidelseType", propOrder = {
    "tekstfelt"
})
public class SagsgenstandeLokalUdvidelseType {

    @XmlElement(name = "Tekstfelt")
    protected String tekstfelt;

    /**
     * Gets the value of the tekstfelt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTekstfelt() {
        return tekstfelt;
    }

    /**
     * Sets the value of the tekstfelt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTekstfelt(String value) {
        this.tekstfelt = value;
    }

    public SagsgenstandeLokalUdvidelseType withTekstfelt(String value) {
        setTekstfelt(value);
        return this;
    }

}
