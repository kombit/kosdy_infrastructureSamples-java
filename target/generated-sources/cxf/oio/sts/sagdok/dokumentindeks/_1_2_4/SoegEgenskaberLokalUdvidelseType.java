
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sts.generelleoperationer._1_2_4.SoegTidIntervalType;


/**
 * <p>Java class for SoegEgenskaberLokalUdvidelseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegEgenskaberLokalUdvidelseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrevDatoInterval" type="{urn:oio:sts:generelleoperationer:1.2.4.0}SoegTidIntervalType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegEgenskaberLokalUdvidelseType", propOrder = {
    "brevDatoInterval"
})
public class SoegEgenskaberLokalUdvidelseType {

    @XmlElement(name = "BrevDatoInterval")
    protected SoegTidIntervalType brevDatoInterval;

    /**
     * Gets the value of the brevDatoInterval property.
     * 
     * @return
     *     possible object is
     *     {@link SoegTidIntervalType }
     *     
     */
    public SoegTidIntervalType getBrevDatoInterval() {
        return brevDatoInterval;
    }

    /**
     * Sets the value of the brevDatoInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoegTidIntervalType }
     *     
     */
    public void setBrevDatoInterval(SoegTidIntervalType value) {
        this.brevDatoInterval = value;
    }

    public SoegEgenskaberLokalUdvidelseType withBrevDatoInterval(SoegTidIntervalType value) {
        setBrevDatoInterval(value);
        return this;
    }

}
