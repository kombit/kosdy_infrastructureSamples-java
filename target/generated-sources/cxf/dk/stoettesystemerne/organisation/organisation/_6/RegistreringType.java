
package dk.stoettesystemerne.organisation.organisation._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oio.sagdok._3_0.LivscyklusKodeType;
import oio.sagdok._3_0.UnikIdType;


/**
 * <p>Java class for RegistreringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}RegistreringType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}AttributListe"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}TilstandListe"/&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}RelationListe"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringType", propOrder = {
    "attributListe",
    "tilstandListe",
    "relationListe"
})
public class RegistreringType
    extends oio.sagdok._3_0.RegistreringType
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

    public RegistreringType withAttributListe(AttributListeType value) {
        setAttributListe(value);
        return this;
    }

    public RegistreringType withTilstandListe(TilstandListeType value) {
        setTilstandListe(value);
        return this;
    }

    public RegistreringType withRelationListe(RelationListeType value) {
        setRelationListe(value);
        return this;
    }

    @Override
    public RegistreringType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

    @Override
    public RegistreringType withTidspunkt(XMLGregorianCalendar value) {
        setTidspunkt(value);
        return this;
    }

    @Override
    public RegistreringType withLivscyklusKode(LivscyklusKodeType value) {
        setLivscyklusKode(value);
        return this;
    }

    @Override
    public RegistreringType withBrugerRef(UnikIdType value) {
        setBrugerRef(value);
        return this;
    }

}
