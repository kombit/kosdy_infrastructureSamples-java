
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virkning" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}ReferenceID" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationType", propOrder = {
    "virkning",
    "referenceID"
})
@XmlSeeAlso({
    KlasseRelationType.class,
    MyndighedRelationType.class,
    OrganisationEnhedRelationType.class,
    VirksomhedRelationType.class,
    AktoerRelationType.class,
    ArkivRelationType.class,
    SagRelationType.class,
    DokumentRelationType.class,
    FacetRelationType.class,
    KlassifikationRelationType.class,
    OrganisationRelationType.class
})
public class RelationType {

    @XmlElement(name = "Virkning")
    protected VirkningType virkning;
    @XmlElement(name = "ReferenceID")
    protected UnikIdType referenceID;

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
     * Gets the value of the referenceID property.
     * 
     * @return
     *     possible object is
     *     {@link UnikIdType }
     *     
     */
    public UnikIdType getReferenceID() {
        return referenceID;
    }

    /**
     * Sets the value of the referenceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnikIdType }
     *     
     */
    public void setReferenceID(UnikIdType value) {
        this.referenceID = value;
    }

    public RelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    public RelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
