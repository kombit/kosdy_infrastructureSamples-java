
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LaesInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaesInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}VirkningFraFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}VirkningTilFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}RegistreringFraFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}RegistreringTilFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaesInputType", propOrder = {
    "uuidIdentifikator",
    "virkningFraFilter",
    "virkningTilFilter",
    "registreringFraFilter",
    "registreringTilFilter"
})
public class LaesInputType {

    @XmlElement(name = "UUIDIdentifikator", required = true)
    protected String uuidIdentifikator;
    @XmlElement(name = "VirkningFraFilter")
    protected TidspunktType virkningFraFilter;
    @XmlElement(name = "VirkningTilFilter")
    protected TidspunktType virkningTilFilter;
    @XmlElement(name = "RegistreringFraFilter")
    protected TidspunktType registreringFraFilter;
    @XmlElement(name = "RegistreringTilFilter")
    protected TidspunktType registreringTilFilter;

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

    /**
     * Gets the value of the virkningFraFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getVirkningFraFilter() {
        return virkningFraFilter;
    }

    /**
     * Sets the value of the virkningFraFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setVirkningFraFilter(TidspunktType value) {
        this.virkningFraFilter = value;
    }

    /**
     * Gets the value of the virkningTilFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getVirkningTilFilter() {
        return virkningTilFilter;
    }

    /**
     * Sets the value of the virkningTilFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setVirkningTilFilter(TidspunktType value) {
        this.virkningTilFilter = value;
    }

    /**
     * Gets the value of the registreringFraFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getRegistreringFraFilter() {
        return registreringFraFilter;
    }

    /**
     * Sets the value of the registreringFraFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setRegistreringFraFilter(TidspunktType value) {
        this.registreringFraFilter = value;
    }

    /**
     * Gets the value of the registreringTilFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getRegistreringTilFilter() {
        return registreringTilFilter;
    }

    /**
     * Sets the value of the registreringTilFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setRegistreringTilFilter(TidspunktType value) {
        this.registreringTilFilter = value;
    }

    public LaesInputType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    public LaesInputType withVirkningFraFilter(TidspunktType value) {
        setVirkningFraFilter(value);
        return this;
    }

    public LaesInputType withVirkningTilFilter(TidspunktType value) {
        setVirkningTilFilter(value);
        return this;
    }

    public LaesInputType withRegistreringFraFilter(TidspunktType value) {
        setRegistreringFraFilter(value);
        return this;
    }

    public LaesInputType withRegistreringTilFilter(TidspunktType value) {
        setRegistreringTilFilter(value);
        return this;
    }

}
