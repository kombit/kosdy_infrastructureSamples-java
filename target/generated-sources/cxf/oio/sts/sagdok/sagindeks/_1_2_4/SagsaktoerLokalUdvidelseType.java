
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagsaktoerLokalUdvidelseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagsaktoerLokalUdvidelseType"&gt;
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
 *         &lt;element name="CVR-Nummer" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9]{8}"/&gt;
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
@XmlType(name = "SagsaktoerLokalUdvidelseType", propOrder = {
    "brugervendtNoegle",
    "fuldtNavn",
    "cvrNummer"
})
@XmlRootElement(name = "SagsaktoerLokalUdvidelse")
public class SagsaktoerLokalUdvidelseType {

    @XmlElement(name = "BrugervendtNoegle")
    protected String brugervendtNoegle;
    @XmlElement(name = "FuldtNavn")
    protected String fuldtNavn;
    @XmlElement(name = "CVR-Nummer")
    protected String cvrNummer;

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
     * Gets the value of the cvrNummer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVRNummer() {
        return cvrNummer;
    }

    /**
     * Sets the value of the cvrNummer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVRNummer(String value) {
        this.cvrNummer = value;
    }

    public SagsaktoerLokalUdvidelseType withBrugervendtNoegle(String value) {
        setBrugervendtNoegle(value);
        return this;
    }

    public SagsaktoerLokalUdvidelseType withFuldtNavn(String value) {
        setFuldtNavn(value);
        return this;
    }

    public SagsaktoerLokalUdvidelseType withCVRNummer(String value) {
        setCVRNummer(value);
        return this;
    }

}
