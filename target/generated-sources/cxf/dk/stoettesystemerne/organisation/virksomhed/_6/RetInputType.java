
package dk.stoettesystemerne.organisation.virksomhed._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RetInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}RetInputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/virksomhed/6/}AttributListe" minOccurs="0"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/virksomhed/6/}TilstandListe" minOccurs="0"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/virksomhed/6/}RelationListe" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetInputType", propOrder = {
    "attributListe",
    "tilstandListe",
    "relationListe"
})
public class RetInputType
    extends oio.sagdok._3_0.RetInputType
{

    @XmlElement(name = "AttributListe")
    protected AttributListeType attributListe;
    @XmlElement(name = "TilstandListe")
    protected TilstandListeType tilstandListe;
    @XmlElement(name = "RelationListe")
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

    public RetInputType withAttributListe(AttributListeType value) {
        setAttributListe(value);
        return this;
    }

    public RetInputType withTilstandListe(TilstandListeType value) {
        setTilstandListe(value);
        return this;
    }

    public RetInputType withRelationListe(RelationListeType value) {
        setRelationListe(value);
        return this;
    }

    @Override
    public RetInputType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    @Override
    public RetInputType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

}
