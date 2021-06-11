
package dk.stoettesystemerne.organisation.organisation._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.AdresseFlerRelationType;
import oio.sagdok._3_0.BrugerFlerRelationType;
import oio.sagdok._3_0.InteressefaellesskabFlerRelationType;
import oio.sagdok._3_0.ItSystemFlerRelationType;
import oio.sagdok._3_0.KlasseFlerRelationType;
import oio.sagdok._3_0.KlasseRelationType;
import oio.sagdok._3_0.LokalUdvidelseType;
import oio.sagdok._3_0.MyndighedRelationType;
import oio.sagdok._3_0.OrganisationEnhedFlerRelationType;
import oio.sagdok._3_0.OrganisationEnhedRelationType;
import oio.sagdok._3_0.OrganisationFlerRelationType;
import oio.sagdok._3_0.OrganisationFunktionFlerRelationType;
import oio.sagdok._3_0.PersonFlerRelationType;
import oio.sagdok._3_0.VirksomhedRelationType;


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
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Adresser" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Ansatte" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Branche" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Organisationstype" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Myndighed" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Myndighedstype" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeOpgaver" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Overordnet" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Produktionsenhed" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Skatteenhed" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Tilhoerer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeBrugere" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeEnheder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeFunktioner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeInteressefaellesskaber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeOrganisationer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedePersoner" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TilknyttedeItSystemer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virksomhed" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}Virksomhedstype" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}LokalUdvidelse" minOccurs="0"/&gt;
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
    "adresser",
    "ansatte",
    "branche",
    "organisationstype",
    "myndighed",
    "myndighedstype",
    "tilknyttedeOpgaver",
    "overordnet",
    "produktionsenhed",
    "skatteenhed",
    "tilhoerer",
    "tilknyttedeBrugere",
    "tilknyttedeEnheder",
    "tilknyttedeFunktioner",
    "tilknyttedeInteressefaellesskaber",
    "tilknyttedeOrganisationer",
    "tilknyttedePersoner",
    "tilknyttedeItSystemer",
    "virksomhed",
    "virksomhedstype",
    "lokalUdvidelse"
})
public class RelationListeType {

    @XmlElement(name = "Adresser", namespace = "urn:oio:sagdok:3.0.0")
    protected List<AdresseFlerRelationType> adresser;
    @XmlElement(name = "Ansatte", namespace = "urn:oio:sagdok:3.0.0")
    protected List<PersonFlerRelationType> ansatte;
    @XmlElement(name = "Branche", namespace = "urn:oio:sagdok:3.0.0")
    protected KlasseRelationType branche;
    @XmlElement(name = "Organisationstype", namespace = "urn:oio:sagdok:3.0.0")
    protected KlasseRelationType organisationstype;
    @XmlElement(name = "Myndighed", namespace = "urn:oio:sagdok:3.0.0")
    protected MyndighedRelationType myndighed;
    @XmlElement(name = "Myndighedstype", namespace = "urn:oio:sagdok:3.0.0")
    protected KlasseRelationType myndighedstype;
    @XmlElement(name = "TilknyttedeOpgaver", namespace = "urn:oio:sagdok:3.0.0")
    protected List<KlasseFlerRelationType> tilknyttedeOpgaver;
    @XmlElement(name = "Overordnet", namespace = "urn:oio:sagdok:3.0.0")
    protected OrganisationEnhedRelationType overordnet;
    @XmlElement(name = "Produktionsenhed", namespace = "urn:oio:sagdok:3.0.0")
    protected VirksomhedRelationType produktionsenhed;
    @XmlElement(name = "Skatteenhed", namespace = "urn:oio:sagdok:3.0.0")
    protected VirksomhedRelationType skatteenhed;
    @XmlElement(name = "Tilhoerer", namespace = "urn:oio:sagdok:3.0.0")
    protected OrganisationFlerRelationType tilhoerer;
    @XmlElement(name = "TilknyttedeBrugere", namespace = "urn:oio:sagdok:3.0.0")
    protected List<BrugerFlerRelationType> tilknyttedeBrugere;
    @XmlElement(name = "TilknyttedeEnheder", namespace = "urn:oio:sagdok:3.0.0")
    protected List<OrganisationEnhedFlerRelationType> tilknyttedeEnheder;
    @XmlElement(name = "TilknyttedeFunktioner", namespace = "urn:oio:sagdok:3.0.0")
    protected List<OrganisationFunktionFlerRelationType> tilknyttedeFunktioner;
    @XmlElement(name = "TilknyttedeInteressefaellesskaber", namespace = "urn:oio:sagdok:3.0.0")
    protected List<InteressefaellesskabFlerRelationType> tilknyttedeInteressefaellesskaber;
    @XmlElement(name = "TilknyttedeOrganisationer", namespace = "urn:oio:sagdok:3.0.0")
    protected List<OrganisationFlerRelationType> tilknyttedeOrganisationer;
    @XmlElement(name = "TilknyttedePersoner", namespace = "urn:oio:sagdok:3.0.0")
    protected List<PersonFlerRelationType> tilknyttedePersoner;
    @XmlElement(name = "TilknyttedeItSystemer", namespace = "urn:oio:sagdok:3.0.0")
    protected List<ItSystemFlerRelationType> tilknyttedeItSystemer;
    @XmlElement(name = "Virksomhed", namespace = "urn:oio:sagdok:3.0.0")
    protected VirksomhedRelationType virksomhed;
    @XmlElement(name = "Virksomhedstype", namespace = "urn:oio:sagdok:3.0.0")
    protected KlasseRelationType virksomhedstype;
    @XmlElement(name = "LokalUdvidelse", namespace = "urn:oio:sagdok:3.0.0")
    protected LokalUdvidelseType lokalUdvidelse;

    /**
     * Gets the value of the adresser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adresser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdresser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdresseFlerRelationType }
     * 
     * 
     */
    public List<AdresseFlerRelationType> getAdresser() {
        if (adresser == null) {
            adresser = new ArrayList<AdresseFlerRelationType>();
        }
        return this.adresser;
    }

    /**
     * Gets the value of the ansatte property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ansatte property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnsatte().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonFlerRelationType }
     * 
     * 
     */
    public List<PersonFlerRelationType> getAnsatte() {
        if (ansatte == null) {
            ansatte = new ArrayList<PersonFlerRelationType>();
        }
        return this.ansatte;
    }

    /**
     * Gets the value of the branche property.
     * 
     * @return
     *     possible object is
     *     {@link KlasseRelationType }
     *     
     */
    public KlasseRelationType getBranche() {
        return branche;
    }

    /**
     * Sets the value of the branche property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasseRelationType }
     *     
     */
    public void setBranche(KlasseRelationType value) {
        this.branche = value;
    }

    /**
     * Gets the value of the organisationstype property.
     * 
     * @return
     *     possible object is
     *     {@link KlasseRelationType }
     *     
     */
    public KlasseRelationType getOrganisationstype() {
        return organisationstype;
    }

    /**
     * Sets the value of the organisationstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasseRelationType }
     *     
     */
    public void setOrganisationstype(KlasseRelationType value) {
        this.organisationstype = value;
    }

    /**
     * Gets the value of the myndighed property.
     * 
     * @return
     *     possible object is
     *     {@link MyndighedRelationType }
     *     
     */
    public MyndighedRelationType getMyndighed() {
        return myndighed;
    }

    /**
     * Sets the value of the myndighed property.
     * 
     * @param value
     *     allowed object is
     *     {@link MyndighedRelationType }
     *     
     */
    public void setMyndighed(MyndighedRelationType value) {
        this.myndighed = value;
    }

    /**
     * Gets the value of the myndighedstype property.
     * 
     * @return
     *     possible object is
     *     {@link KlasseRelationType }
     *     
     */
    public KlasseRelationType getMyndighedstype() {
        return myndighedstype;
    }

    /**
     * Sets the value of the myndighedstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasseRelationType }
     *     
     */
    public void setMyndighedstype(KlasseRelationType value) {
        this.myndighedstype = value;
    }

    /**
     * Gets the value of the tilknyttedeOpgaver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeOpgaver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeOpgaver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KlasseFlerRelationType }
     * 
     * 
     */
    public List<KlasseFlerRelationType> getTilknyttedeOpgaver() {
        if (tilknyttedeOpgaver == null) {
            tilknyttedeOpgaver = new ArrayList<KlasseFlerRelationType>();
        }
        return this.tilknyttedeOpgaver;
    }

    /**
     * Gets the value of the overordnet property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationEnhedRelationType }
     *     
     */
    public OrganisationEnhedRelationType getOverordnet() {
        return overordnet;
    }

    /**
     * Sets the value of the overordnet property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationEnhedRelationType }
     *     
     */
    public void setOverordnet(OrganisationEnhedRelationType value) {
        this.overordnet = value;
    }

    /**
     * Gets the value of the produktionsenhed property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedRelationType }
     *     
     */
    public VirksomhedRelationType getProduktionsenhed() {
        return produktionsenhed;
    }

    /**
     * Sets the value of the produktionsenhed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedRelationType }
     *     
     */
    public void setProduktionsenhed(VirksomhedRelationType value) {
        this.produktionsenhed = value;
    }

    /**
     * Gets the value of the skatteenhed property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedRelationType }
     *     
     */
    public VirksomhedRelationType getSkatteenhed() {
        return skatteenhed;
    }

    /**
     * Sets the value of the skatteenhed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedRelationType }
     *     
     */
    public void setSkatteenhed(VirksomhedRelationType value) {
        this.skatteenhed = value;
    }

    /**
     * Gets the value of the tilhoerer property.
     * 
     * @return
     *     possible object is
     *     {@link OrganisationFlerRelationType }
     *     
     */
    public OrganisationFlerRelationType getTilhoerer() {
        return tilhoerer;
    }

    /**
     * Sets the value of the tilhoerer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganisationFlerRelationType }
     *     
     */
    public void setTilhoerer(OrganisationFlerRelationType value) {
        this.tilhoerer = value;
    }

    /**
     * Gets the value of the tilknyttedeBrugere property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeBrugere property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeBrugere().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BrugerFlerRelationType }
     * 
     * 
     */
    public List<BrugerFlerRelationType> getTilknyttedeBrugere() {
        if (tilknyttedeBrugere == null) {
            tilknyttedeBrugere = new ArrayList<BrugerFlerRelationType>();
        }
        return this.tilknyttedeBrugere;
    }

    /**
     * Gets the value of the tilknyttedeEnheder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeEnheder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeEnheder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationEnhedFlerRelationType }
     * 
     * 
     */
    public List<OrganisationEnhedFlerRelationType> getTilknyttedeEnheder() {
        if (tilknyttedeEnheder == null) {
            tilknyttedeEnheder = new ArrayList<OrganisationEnhedFlerRelationType>();
        }
        return this.tilknyttedeEnheder;
    }

    /**
     * Gets the value of the tilknyttedeFunktioner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeFunktioner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeFunktioner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationFunktionFlerRelationType }
     * 
     * 
     */
    public List<OrganisationFunktionFlerRelationType> getTilknyttedeFunktioner() {
        if (tilknyttedeFunktioner == null) {
            tilknyttedeFunktioner = new ArrayList<OrganisationFunktionFlerRelationType>();
        }
        return this.tilknyttedeFunktioner;
    }

    /**
     * Gets the value of the tilknyttedeInteressefaellesskaber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeInteressefaellesskaber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeInteressefaellesskaber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteressefaellesskabFlerRelationType }
     * 
     * 
     */
    public List<InteressefaellesskabFlerRelationType> getTilknyttedeInteressefaellesskaber() {
        if (tilknyttedeInteressefaellesskaber == null) {
            tilknyttedeInteressefaellesskaber = new ArrayList<InteressefaellesskabFlerRelationType>();
        }
        return this.tilknyttedeInteressefaellesskaber;
    }

    /**
     * Gets the value of the tilknyttedeOrganisationer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeOrganisationer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeOrganisationer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrganisationFlerRelationType }
     * 
     * 
     */
    public List<OrganisationFlerRelationType> getTilknyttedeOrganisationer() {
        if (tilknyttedeOrganisationer == null) {
            tilknyttedeOrganisationer = new ArrayList<OrganisationFlerRelationType>();
        }
        return this.tilknyttedeOrganisationer;
    }

    /**
     * Gets the value of the tilknyttedePersoner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedePersoner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedePersoner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonFlerRelationType }
     * 
     * 
     */
    public List<PersonFlerRelationType> getTilknyttedePersoner() {
        if (tilknyttedePersoner == null) {
            tilknyttedePersoner = new ArrayList<PersonFlerRelationType>();
        }
        return this.tilknyttedePersoner;
    }

    /**
     * Gets the value of the tilknyttedeItSystemer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tilknyttedeItSystemer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTilknyttedeItSystemer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItSystemFlerRelationType }
     * 
     * 
     */
    public List<ItSystemFlerRelationType> getTilknyttedeItSystemer() {
        if (tilknyttedeItSystemer == null) {
            tilknyttedeItSystemer = new ArrayList<ItSystemFlerRelationType>();
        }
        return this.tilknyttedeItSystemer;
    }

    /**
     * Gets the value of the virksomhed property.
     * 
     * @return
     *     possible object is
     *     {@link VirksomhedRelationType }
     *     
     */
    public VirksomhedRelationType getVirksomhed() {
        return virksomhed;
    }

    /**
     * Sets the value of the virksomhed property.
     * 
     * @param value
     *     allowed object is
     *     {@link VirksomhedRelationType }
     *     
     */
    public void setVirksomhed(VirksomhedRelationType value) {
        this.virksomhed = value;
    }

    /**
     * Gets the value of the virksomhedstype property.
     * 
     * @return
     *     possible object is
     *     {@link KlasseRelationType }
     *     
     */
    public KlasseRelationType getVirksomhedstype() {
        return virksomhedstype;
    }

    /**
     * Sets the value of the virksomhedstype property.
     * 
     * @param value
     *     allowed object is
     *     {@link KlasseRelationType }
     *     
     */
    public void setVirksomhedstype(KlasseRelationType value) {
        this.virksomhedstype = value;
    }

    /**
     * Gets the value of the lokalUdvidelse property.
     * 
     * @return
     *     possible object is
     *     {@link LokalUdvidelseType }
     *     
     */
    public LokalUdvidelseType getLokalUdvidelse() {
        return lokalUdvidelse;
    }

    /**
     * Sets the value of the lokalUdvidelse property.
     * 
     * @param value
     *     allowed object is
     *     {@link LokalUdvidelseType }
     *     
     */
    public void setLokalUdvidelse(LokalUdvidelseType value) {
        this.lokalUdvidelse = value;
    }

    public RelationListeType withAdresser(AdresseFlerRelationType... values) {
        if (values!= null) {
            for (AdresseFlerRelationType value: values) {
                getAdresser().add(value);
            }
        }
        return this;
    }

    public RelationListeType withAdresser(Collection<AdresseFlerRelationType> values) {
        if (values!= null) {
            getAdresser().addAll(values);
        }
        return this;
    }

    public RelationListeType withAnsatte(PersonFlerRelationType... values) {
        if (values!= null) {
            for (PersonFlerRelationType value: values) {
                getAnsatte().add(value);
            }
        }
        return this;
    }

    public RelationListeType withAnsatte(Collection<PersonFlerRelationType> values) {
        if (values!= null) {
            getAnsatte().addAll(values);
        }
        return this;
    }

    public RelationListeType withBranche(KlasseRelationType value) {
        setBranche(value);
        return this;
    }

    public RelationListeType withOrganisationstype(KlasseRelationType value) {
        setOrganisationstype(value);
        return this;
    }

    public RelationListeType withMyndighed(MyndighedRelationType value) {
        setMyndighed(value);
        return this;
    }

    public RelationListeType withMyndighedstype(KlasseRelationType value) {
        setMyndighedstype(value);
        return this;
    }

    public RelationListeType withTilknyttedeOpgaver(KlasseFlerRelationType... values) {
        if (values!= null) {
            for (KlasseFlerRelationType value: values) {
                getTilknyttedeOpgaver().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeOpgaver(Collection<KlasseFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeOpgaver().addAll(values);
        }
        return this;
    }

    public RelationListeType withOverordnet(OrganisationEnhedRelationType value) {
        setOverordnet(value);
        return this;
    }

    public RelationListeType withProduktionsenhed(VirksomhedRelationType value) {
        setProduktionsenhed(value);
        return this;
    }

    public RelationListeType withSkatteenhed(VirksomhedRelationType value) {
        setSkatteenhed(value);
        return this;
    }

    public RelationListeType withTilhoerer(OrganisationFlerRelationType value) {
        setTilhoerer(value);
        return this;
    }

    public RelationListeType withTilknyttedeBrugere(BrugerFlerRelationType... values) {
        if (values!= null) {
            for (BrugerFlerRelationType value: values) {
                getTilknyttedeBrugere().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeBrugere(Collection<BrugerFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeBrugere().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilknyttedeEnheder(OrganisationEnhedFlerRelationType... values) {
        if (values!= null) {
            for (OrganisationEnhedFlerRelationType value: values) {
                getTilknyttedeEnheder().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeEnheder(Collection<OrganisationEnhedFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeEnheder().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilknyttedeFunktioner(OrganisationFunktionFlerRelationType... values) {
        if (values!= null) {
            for (OrganisationFunktionFlerRelationType value: values) {
                getTilknyttedeFunktioner().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeFunktioner(Collection<OrganisationFunktionFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeFunktioner().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilknyttedeInteressefaellesskaber(InteressefaellesskabFlerRelationType... values) {
        if (values!= null) {
            for (InteressefaellesskabFlerRelationType value: values) {
                getTilknyttedeInteressefaellesskaber().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeInteressefaellesskaber(Collection<InteressefaellesskabFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeInteressefaellesskaber().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilknyttedeOrganisationer(OrganisationFlerRelationType... values) {
        if (values!= null) {
            for (OrganisationFlerRelationType value: values) {
                getTilknyttedeOrganisationer().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeOrganisationer(Collection<OrganisationFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeOrganisationer().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilknyttedePersoner(PersonFlerRelationType... values) {
        if (values!= null) {
            for (PersonFlerRelationType value: values) {
                getTilknyttedePersoner().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedePersoner(Collection<PersonFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedePersoner().addAll(values);
        }
        return this;
    }

    public RelationListeType withTilknyttedeItSystemer(ItSystemFlerRelationType... values) {
        if (values!= null) {
            for (ItSystemFlerRelationType value: values) {
                getTilknyttedeItSystemer().add(value);
            }
        }
        return this;
    }

    public RelationListeType withTilknyttedeItSystemer(Collection<ItSystemFlerRelationType> values) {
        if (values!= null) {
            getTilknyttedeItSystemer().addAll(values);
        }
        return this;
    }

    public RelationListeType withVirksomhed(VirksomhedRelationType value) {
        setVirksomhed(value);
        return this;
    }

    public RelationListeType withVirksomhedstype(KlasseRelationType value) {
        setVirksomhedstype(value);
        return this;
    }

    public RelationListeType withLokalUdvidelse(LokalUdvidelseType value) {
        setLokalUdvidelse(value);
        return this;
    }

}
