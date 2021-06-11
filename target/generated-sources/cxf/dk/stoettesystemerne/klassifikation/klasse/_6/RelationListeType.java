
package dk.stoettesystemerne.klassifikation.klasse._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.AktoerFlerRelationType;
import oio.sagdok._3_0.AktoerRelationType;
import oio.sagdok._3_0.FacetRelationType;
import oio.sagdok._3_0.KlasseFlerRelationType;
import oio.sagdok._3_0.KlasseRelationType;


/**
 * <p>Java class for RelationListeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationListeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Ansvarlig" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Ejer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Erstatter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Facet" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}LovligeKombinationer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Mapninger" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}OverordnetKlasse" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Redaktoerer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Sideordnede" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Tilfoejelser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationListeType", propOrder = {
    "ansvarlig",
    "ejer",
    "erstatter",
    "facet",
    "lovligeKombinationer",
    "mapninger",
    "overordnetKlasse",
    "redaktoerer",
    "sideordnede",
    "tilfoejelser"
})
public class RelationListeType {

    @XmlElement(name = "Ansvarlig", namespace = "urn:oio:sagdok:3.0.0")
    protected AktoerRelationType ansvarlig;
    @XmlElement(name = "Ejer", namespace = "urn:oio:sagdok:3.0.0")
    protected AktoerRelationType ejer;
    @XmlElement(name = "Erstatter", namespace = "urn:oio:sagdok:3.0.0")
    protected List<KlasseFlerRelationType> erstatter;
    @XmlElement(name = "Facet", namespace = "urn:oio:sagdok:3.0.0")
    protected FacetRelationType facet;
    @XmlElement(name = "LovligeKombinationer", namespace = "urn:oio:sagdok:3.0.0")
    protected List<KlasseFlerRelationType> lovligeKombinationer;
    @XmlElement(name = "Mapninger", namespace = "urn:oio:sagdok:3.0.0")
    protected List<KlasseFlerRelationType> mapninger;
    @XmlElement(name = "OverordnetKlasse", namespace = "urn:oio:sagdok:3.0.0")
    protected KlasseRelationType overordnetKlasse;
    @XmlElement(name = "Redaktoerer", namespace = "urn:oio:sagdok:3.0.0")
    protected List<AktoerFlerRelationType> redaktoerer;
    @XmlElement(name = "Sideordnede", namespace = "urn:oio:sagdok:3.0.0")
    protected List<KlasseFlerRelationType> sideordnede;
    @XmlElement(name = "Tilfoejelser", namespace = "urn:oio:sagdok:3.0.0")
    protected List<KlasseFlerRelationType> tilfoejelser;

    /**
     * Gets the value of the ansvarlig property.
     * 
     * @return
     *     possible object is
     *     {@link AktoerRelationType }
     *     
     */
    public AktoerRelationType getAnsvarlig() {
        return ansvarlig;
    }

    /**
     * Sets the value of the ansvarlig property.
     * 
     * @param value
     *     allowed object is
     *     {@link AktoerRelationType }
     *     
     */
    public void setAnsvarlig(AktoerRelationType value) {
        this.ansvarlig = value;
    }

    /**
     * Gets the value of the ejer property.
     * 
     * @return
     *     possible object is
     *     {@link AktoerRelationType }
     *     
     */
    public AktoerRelationType getEjer() {
        return ejer;
    }

    /**
     * Sets the value of the ejer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AktoerRelationType }
     *     
     */
    public void setEjer(AktoerRelationType value) {
        this.ejer = value;
    }

    /**
     * Gets the value of the erstatter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the erstatter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErstatter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlasseFlerRelationType }
     * 
     * 
     */
    public List<KlasseFlerRelationType> getErstatter() {
        if (erstatter == null) {
            erstatter = new ArrayList<KlasseFlerRelationType>();
        }
        return this.erstatter;
    }

    /**
     * Gets the value of the facet property.
     * 
     * @return
     *     possible object is
     *     {@link FacetRelationType }
     *     
     */
    public FacetRelationType getFacet() {
        return facet;
    }

    /**
     * Sets the value of the facet property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacetRelationType }
     *     
     */
    public void setFacet(FacetRelationType value) {
        this.facet = value;
    }

    /**
     * Gets the value of the lovligeKombinationer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lovligeKombinationer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLovligeKombinationer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlasseFlerRelationType }
     * 
     * 
     */
    public List<KlasseFlerRelationType> getLovligeKombinationer() {
        if (lovligeKombinationer == null) {
            lovligeKombinationer = new ArrayList<KlasseFlerRelationType>();
        }
        return this.lovligeKombinationer;
    }

    /**
     * Gets the value of the mapninger property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapninger property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapninger().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlasseFlerRelationType }
     * 
     * 
     */
    public List<KlasseFlerRelationType> getMapninger() {
        if (mapninger == null) {
            mapninger = new ArrayList<KlasseFlerRelationType>();
        }
        return this.mapninger;
    }

    /**
     * Gets the value of the overordnetKlasse property.
     * 
     * @return
     *     possible object is
     *     {@link KlasseRelationType }
     *     
     */
    public KlasseRelationType getOverordnetKlasse() {
        return overordnetKlasse;
    }

    /**
     * Sets the value of the overordnetKlasse property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasseRelationType }
     *     
     */
    public void setOverordnetKlasse(KlasseRelationType value) {
        this.overordnetKlasse = value;
    }

    /**
     * Gets the value of the redaktoerer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redaktoerer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedaktoerer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AktoerFlerRelationType }
     * 
     * 
     */
    public List<AktoerFlerRelationType> getRedaktoerer() {
        if (redaktoerer == null) {
            redaktoerer = new ArrayList<AktoerFlerRelationType>();
        }
        return this.redaktoerer;
    }

    /**
     * Gets the value of the sideordnede property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sideordnede property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSideordnede().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlasseFlerRelationType }
     * 
     * 
     */
    public List<KlasseFlerRelationType> getSideordnede() {
        if (sideordnede == null) {
            sideordnede = new ArrayList<KlasseFlerRelationType>();
        }
        return this.sideordnede;
    }

    /**
     * Gets the value of the tilfoejelser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilfoejelser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilfoejelser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlasseFlerRelationType }
     * 
     * 
     */
    public List<KlasseFlerRelationType> getTilfoejelser() {
        if (tilfoejelser == null) {
            tilfoejelser = new ArrayList<KlasseFlerRelationType>();
        }
        return this.tilfoejelser;
    }

    public RelationListeType withAnsvarlig(AktoerRelationType value) {
        setAnsvarlig(value);
        return this;
    }

    public RelationListeType withEjer(AktoerRelationType value) {
        setEjer(value);
        return this;
    }

    public RelationListeType withErstatter(KlasseFlerRelationType... values) {
        if (values!= null) {
            for (KlasseFlerRelationType value: values) {
                getErstatter().add(value);
            }
        }
        return this;
    }

    public RelationListeType withErstatter(Collection<KlasseFlerRelationType> values) {
        if (values!= null) {
            getErstatter().addAll(values);
        }
        return this;
    }

    public RelationListeType withFacet(FacetRelationType value) {
        setFacet(value);
        return this;
    }

    public RelationListeType withLovligeKombinationer(KlasseFlerRelationType... values) {
        if (values!= null) {
            for (KlasseFlerRelationType value: values) {
                getLovligeKombinationer().add(value);
            }
        }
        return this;
    }

    public RelationListeType withLovligeKombinationer(Collection<KlasseFlerRelationType> values) {
        if (values!= null) {
            getLovligeKombinationer().addAll(values);
        }
        return this;
    }

    public RelationListeType withMapninger(KlasseFlerRelationType... values) {
        if (values!= null) {
            for (KlasseFlerRelationType value: values) {
                getMapninger().add(value);
            }
        }
        return this;
    }

    public RelationListeType withMapninger(Collection<KlasseFlerRelationType> values) {
        if (values!= null) {
            getMapninger().addAll(values);
        }
        return this;
    }

    public RelationListeType withOverordnetKlasse(KlasseRelationType value) {
        setOverordnetKlasse(value);
        return this;
    }

    public RelationListeType withRedaktoerer(AktoerFlerRelationType... values) {
        if (values!= null) {
            for (AktoerFlerRelationType value: values) {
                getRedaktoerer().add(value);
            }
        }
        return this;
    }

    public RelationListeType withRedaktoerer(Collection<AktoerFlerRelationType> values) {
        if (values!= null) {
            getRedaktoerer().addAll(values);
        }
        return this;
    }

    public RelationListeType withSideordnede(KlasseFlerRelationType... values) {
        if (values!= null) {
            for (KlasseFlerRelationType value: values) {
                getSideordnede().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSideordnede(Collection<KlasseFlerRelationType> values) {
        if (values!= null) {
            getSideordnede().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilfoejelser(KlasseFlerRelationType... values) {
        if (values!= null) {
            for (KlasseFlerRelationType value: values) {
                getTilfoejelser().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilfoejelser(Collection<KlasseFlerRelationType> values) {
        if (values!= null) {
            getTilfoejelser().addAll(values);
        }
        return this;
    }

}
