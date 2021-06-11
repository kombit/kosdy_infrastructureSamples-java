
package dk.stoettesystemerne.organisation.organisation._6;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.SoegRegistreringType;
import oio.sagdok._3_0.SoegVirkningType;


/**
 * <p>Java class for SoegInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}SoegInputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}AttributListe"/&gt;
 *           &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}TilstandListe"/&gt;
 *           &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}RelationListe"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegInputType", propOrder = {
    "attributListe",
    "tilstandListe",
    "relationListe"
})
public class SoegInputType
    extends oio.sagdok._3_0.SoegInputType
{

    @XmlElement(name = "AttributListe", required = true)
    protected AttributListeType attributListe;
    @XmlElement(name = "TilstandListe", required = true)
    protected TilstandListeType tilstandListe;
    @XmlElement(name = "RelationListe", required = true)
    protected RelationListeType relationListe;

    /**
     * Gets the value of the attributListe property.
     * 
     * @return
     *     possible object is
     *     {@link AttributListeType }
     *     
     */
    public AttributListeType getAttributListe() {
        return attributListe;
    }

    /**
     * Sets the value of the attributListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributListeType }
     *     
     */
    public void setAttributListe(AttributListeType value) {
        this.attributListe = value;
    }

    /**
     * Gets the value of the tilstandListe property.
     * 
     * @return
     *     possible object is
     *     {@link TilstandListeType }
     *     
     */
    public TilstandListeType getTilstandListe() {
        return tilstandListe;
    }

    /**
     * Sets the value of the tilstandListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link TilstandListeType }
     *     
     */
    public void setTilstandListe(TilstandListeType value) {
        this.tilstandListe = value;
    }

    /**
     * Gets the value of the relationListe property.
     * 
     * @return
     *     possible object is
     *     {@link RelationListeType }
     *     
     */
    public RelationListeType getRelationListe() {
        return relationListe;
    }

    /**
     * Sets the value of the relationListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationListeType }
     *     
     */
    public void setRelationListe(RelationListeType value) {
        this.relationListe = value;
    }

    public SoegInputType withAttributListe(AttributListeType value) {
        setAttributListe(value);
        return this;
    }

    public SoegInputType withTilstandListe(TilstandListeType value) {
        setTilstandListe(value);
        return this;
    }

    public SoegInputType withRelationListe(RelationListeType value) {
        setRelationListe(value);
        return this;
    }

    @Override
    public SoegInputType withFoersteResultatReference(BigInteger value) {
        setFoersteResultatReference(value);
        return this;
    }

    @Override
    public SoegInputType withMaksimalAntalKvantitet(BigInteger value) {
        setMaksimalAntalKvantitet(value);
        return this;
    }

    @Override
    public SoegInputType withSoegRegistrering(SoegRegistreringType value) {
        setSoegRegistrering(value);
        return this;
    }

    @Override
    public SoegInputType withSoegVirkning(SoegVirkningType value) {
        setSoegVirkning(value);
        return this;
    }

}
