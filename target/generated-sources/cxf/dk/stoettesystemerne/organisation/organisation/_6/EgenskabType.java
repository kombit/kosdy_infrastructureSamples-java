
package dk.stoettesystemerne.organisation.organisation._6;

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
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}OrganisationNavn" minOccurs="0"/&gt;
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
    "organisationNavn"
})
public class EgenskabType {

    @XmlElement(name = "Virkning", namespace = "urn:oio:sagdok:3.0.0")
    protected VirkningType virkning;
    @XmlElement(name = "BrugervendtNoegleTekst", namespace = "urn:oio:sagdok:3.0.0")
    protected String brugervendtNoegleTekst;
    @XmlElement(name = "OrganisationNavn", namespace = "urn:oio:sagdok:3.0.0")
    protected String organisationNavn;

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
     * Gets the value of the organisationNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationNavn() {
        return organisationNavn;
    }

    /**
     * Sets the value of the organisationNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationNavn(String value) {
        this.organisationNavn = value;
    }

    public EgenskabType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public EgenskabType withBrugervendtNoegleTekst(String value) {
        setBrugervendtNoegleTekst(value);
        return this;
    }

    public EgenskabType withOrganisationNavn(String value) {
        setOrganisationNavn(value);
        return this;
    }

}
