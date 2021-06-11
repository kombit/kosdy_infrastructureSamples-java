
package oio.sts.generelleoperationer._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.TidspunktType;


/**
 * <p>Java class for SoegTidIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegTidIntervalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FraTidspunkt" type="{urn:oio:sagdok:3.0.0}TidspunktType"/&gt;
 *         &lt;element name="TilTidspunkt" type="{urn:oio:sagdok:3.0.0}TidspunktType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegTidIntervalType", propOrder = {
    "fraTidspunkt",
    "tilTidspunkt"
})
public class SoegTidIntervalType {

    @XmlElement(name = "FraTidspunkt", required = true)
    protected TidspunktType fraTidspunkt;
    @XmlElement(name = "TilTidspunkt", required = true)
    protected TidspunktType tilTidspunkt;

    /**
     * Gets the value of the fraTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getFraTidspunkt() {
        return fraTidspunkt;
    }

    /**
     * Sets the value of the fraTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setFraTidspunkt(TidspunktType value) {
        this.fraTidspunkt = value;
    }

    /**
     * Gets the value of the tilTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getTilTidspunkt() {
        return tilTidspunkt;
    }

    /**
     * Sets the value of the tilTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setTilTidspunkt(TidspunktType value) {
        this.tilTidspunkt = value;
    }

    public SoegTidIntervalType withFraTidspunkt(TidspunktType value) {
        setFraTidspunkt(value);
        return this;
    }

    public SoegTidIntervalType withTilTidspunkt(TidspunktType value) {
        setTilTidspunkt(value);
        return this;
    }

}
