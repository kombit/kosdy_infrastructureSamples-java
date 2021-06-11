
package dk.stoettesystemerne.organisation.virksomhed._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;


/**
 * <p>Java class for EgenskabType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EgenskabType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virkning" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}BrugervendtNoegleTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:6}CVR-NummerTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:6}SE-NummerTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:6}P-NummerTekst" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:6}NavnTekst" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EgenskabType", propOrder = {
    "virkning",
    "brugervendtNoegleTekst",
    "cvrNummerTekst",
    "seNummerTekst",
    "pNummerTekst",
    "navnTekst"
})
public class EgenskabType {

    @XmlElement(name = "Virkning", namespace = "urn:oio:sagdok:3.0.0")
    protected VirkningType virkning;
    @XmlElement(name = "BrugervendtNoegleTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String brugervendtNoegleTekst;
    @XmlElement(name = "CVR-NummerTekst", namespace = "urn:oio:sts:6")
    protected String cvrNummerTekst;
    @XmlElement(name = "SE-NummerTekst", namespace = "urn:oio:sts:6")
    protected String seNummerTekst;
    @XmlElement(name = "P-NummerTekst", namespace = "urn:oio:sts:6")
    protected String pNummerTekst;
    @XmlElement(name = "NavnTekst", namespace = "urn:oio:sts:6")
    protected String navnTekst;

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

    /**
     * Gets the value of the brugervendtNoegleTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrugervendtNoegleTekst() {
        return brugervendtNoegleTekst;
    }

    /**
     * Sets the value of the brugervendtNoegleTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrugervendtNoegleTekst(String value) {
        this.brugervendtNoegleTekst = value;
    }

    /**
     * Gets the value of the cvrNummerTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCVRNummerTekst() {
        return cvrNummerTekst;
    }

    /**
     * Sets the value of the cvrNummerTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCVRNummerTekst(String value) {
        this.cvrNummerTekst = value;
    }

    /**
     * Gets the value of the seNummerTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENummerTekst() {
        return seNummerTekst;
    }

    /**
     * Sets the value of the seNummerTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENummerTekst(String value) {
        this.seNummerTekst = value;
    }

    /**
     * Gets the value of the pNummerTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPNummerTekst() {
        return pNummerTekst;
    }

    /**
     * Sets the value of the pNummerTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPNummerTekst(String value) {
        this.pNummerTekst = value;
    }

    /**
     * Gets the value of the navnTekst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNavnTekst() {
        return navnTekst;
    }

    /**
     * Sets the value of the navnTekst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNavnTekst(String value) {
        this.navnTekst = value;
    }

    public EgenskabType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public EgenskabType withBrugervendtNoegleTekst(String value) {
        setBrugervendtNoegleTekst(value);
        return this;
    }

    public EgenskabType withCVRNummerTekst(String value) {
        setCVRNummerTekst(value);
        return this;
    }

    public EgenskabType withSENummerTekst(String value) {
        setSENummerTekst(value);
        return this;
    }

    public EgenskabType withPNummerTekst(String value) {
        setPNummerTekst(value);
        return this;
    }

    public EgenskabType withNavnTekst(String value) {
        setNavnTekst(value);
        return this;
    }

}
