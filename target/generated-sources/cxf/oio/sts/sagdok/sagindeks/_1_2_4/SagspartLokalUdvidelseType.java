
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagspartLokalUdvidelseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagspartLokalUdvidelseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BrugervendtNoegle" type="{urn:oio:sagdok:3.0.0}BrugervendtNoegleTekst" minOccurs="0"/&gt;
 *         &lt;element name="FuldtNavn" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CPR-nr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{10}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CVR-nr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SE-nr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{8}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="P-nr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{10}"/&gt;
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
@XmlType(name = "SagspartLokalUdvidelseType", propOrder = {
    "brugervendtNoegle",
    "fuldtNavn",
    "cprNr",
    "cvrNr",
    "seNr",
    "pNr"
})
@XmlRootElement(name = "SagspartLokalUdvidelse")
public class SagspartLokalUdvidelseType {

    @XmlElement(name = "BrugervendtNoegle")
    protected String brugervendtNoegle;
    @XmlElement(name = "FuldtNavn")
    protected String fuldtNavn;
    @XmlElement(name = "CPR-nr")
    protected String cprNr;
    @XmlElement(name = "CVR-nr")
    protected String cvrNr;
    @XmlElement(name = "SE-nr")
    protected String seNr;
    @XmlElement(name = "P-nr")
    protected String pNr;

    /**
     * Gets the value of the brugervendtNoegle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugervendtNoegle() {
        return brugervendtNoegle;
    }

    /**
     * Sets the value of the brugervendtNoegle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugervendtNoegle(String value) {
        this.brugervendtNoegle = value;
    }

    /**
     * Gets the value of the fuldtNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuldtNavn() {
        return fuldtNavn;
    }

    /**
     * Sets the value of the fuldtNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuldtNavn(String value) {
        this.fuldtNavn = value;
    }

    /**
     * Gets the value of the cprNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPRNr() {
        return cprNr;
    }

    /**
     * Sets the value of the cprNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPRNr(String value) {
        this.cprNr = value;
    }

    /**
     * Gets the value of the cvrNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVRNr() {
        return cvrNr;
    }

    /**
     * Sets the value of the cvrNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVRNr(String value) {
        this.cvrNr = value;
    }

    /**
     * Gets the value of the seNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENr() {
        return seNr;
    }

    /**
     * Sets the value of the seNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENr(String value) {
        this.seNr = value;
    }

    /**
     * Gets the value of the pNr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNr() {
        return pNr;
    }

    /**
     * Sets the value of the pNr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNr(String value) {
        this.pNr = value;
    }

    public SagspartLokalUdvidelseType withBrugervendtNoegle(String value) {
        setBrugervendtNoegle(value);
        return this;
    }

    public SagspartLokalUdvidelseType withFuldtNavn(String value) {
        setFuldtNavn(value);
        return this;
    }

    public SagspartLokalUdvidelseType withCPRNr(String value) {
        setCPRNr(value);
        return this;
    }

    public SagspartLokalUdvidelseType withCVRNr(String value) {
        setCVRNr(value);
        return this;
    }

    public SagspartLokalUdvidelseType withSENr(String value) {
        setSENr(value);
        return this;
    }

    public SagspartLokalUdvidelseType withPNr(String value) {
        setPNr(value);
        return this;
    }

}
