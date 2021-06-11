
package oio.sts.generelleoperationer._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SoegBeloebIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegBeloebIntervalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FraBeloeb" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}BeloebType"/&gt;
 *         &lt;element name="TilBeloeb" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}BeloebType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegBeloebIntervalType", propOrder = {
    "fraBeloeb",
    "tilBeloeb"
})
public class SoegBeloebIntervalType {

    @XmlElement(name = "FraBeloeb", required = true)
    protected String fraBeloeb;
    @XmlElement(name = "TilBeloeb", required = true)
    protected String tilBeloeb;

    /**
     * Gets the value of the fraBeloeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraBeloeb() {
        return fraBeloeb;
    }

    /**
     * Sets the value of the fraBeloeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraBeloeb(String value) {
        this.fraBeloeb = value;
    }

    /**
     * Gets the value of the tilBeloeb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTilBeloeb() {
        return tilBeloeb;
    }

    /**
     * Sets the value of the tilBeloeb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTilBeloeb(String value) {
        this.tilBeloeb = value;
    }

    public SoegBeloebIntervalType withFraBeloeb(String value) {
        setFraBeloeb(value);
        return this;
    }

    public SoegBeloebIntervalType withTilBeloeb(String value) {
        setTilBeloeb(value);
        return this;
    }

}
