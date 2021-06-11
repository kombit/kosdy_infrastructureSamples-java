
package oio.sts.generelledefinitioner._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.sagdok.sagindeks._1_2_4.EgenskaberType;


/**
 * <p>Java class for LokalUdvidelseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LokalUdvidelseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Virkning" type="{urn:oio:sagdok:3.0.0}VirkningType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LokalUdvidelseType", propOrder = {
    "virkning"
})
@XmlSeeAlso({
    EgenskaberType.class
})
public class LokalUdvidelseType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;

    /**
     * Gets the value of the virkning property.
     * 
     * @return
     *     possible object is
     *     {@link VirkningType }
     *     
     */
    public VirkningType getVirkning() {
        return virkning;
    }

    /**
     * Sets the value of the virkning property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirkningType }
     *     
     */
    public void setVirkning(VirkningType value) {
        this.virkning = value;
    }

    public LokalUdvidelseType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

}
