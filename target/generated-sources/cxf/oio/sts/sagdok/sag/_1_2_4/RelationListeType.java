
package oio.sts.sagdok.sag._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseListeType;
import oio.sts.generelledefinitioner._1_2_4.RelationType;


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
 *         &lt;element name="Sagsaktoer" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sagsarkiv" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sagsklasse" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sagspart" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sagsrelation" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Sagsgenstande" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Journalpost" type="{urn:oio:sts:sagdok:sag:1.2.4.0}JournalpostRelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sts:generelledefinitioner:1.2.4.0}LokalUdvidelseListe" minOccurs="0"/&gt;
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
    "sagsaktoer",
    "sagsarkiv",
    "sagsklasse",
    "sagspart",
    "sagsrelation",
    "sagsgenstande",
    "journalpost",
    "lokalUdvidelseListe"
})
public class RelationListeType {

    @XmlElement(name = "Sagsaktoer")
    protected List<RelationType> sagsaktoer;
    @XmlElement(name = "Sagsarkiv")
    protected List<RelationType> sagsarkiv;
    @XmlElement(name = "Sagsklasse")
    protected List<RelationType> sagsklasse;
    @XmlElement(name = "Sagspart")
    protected List<RelationType> sagspart;
    @XmlElement(name = "Sagsrelation")
    protected List<RelationType> sagsrelation;
    @XmlElement(name = "Sagsgenstande")
    protected List<RelationType> sagsgenstande;
    @XmlElement(name = "Journalpost")
    protected List<JournalpostRelationType> journalpost;
    @XmlElement(name = "LokalUdvidelseListe", namespace = "urn:oio:sts:generelledefinitioner:1.2.4.0")
    protected LokalUdvidelseListeType lokalUdvidelseListe;

    /**
     * Gets the value of the sagsaktoer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagsaktoer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagsaktoer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSagsaktoer() {
        if (sagsaktoer == null) {
            sagsaktoer = new ArrayList<RelationType>();
        }
        return this.sagsaktoer;
    }

    /**
     * Gets the value of the sagsarkiv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagsarkiv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagsarkiv().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSagsarkiv() {
        if (sagsarkiv == null) {
            sagsarkiv = new ArrayList<RelationType>();
        }
        return this.sagsarkiv;
    }

    /**
     * Gets the value of the sagsklasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagsklasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagsklasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSagsklasse() {
        if (sagsklasse == null) {
            sagsklasse = new ArrayList<RelationType>();
        }
        return this.sagsklasse;
    }

    /**
     * Gets the value of the sagspart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagspart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagspart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSagspart() {
        if (sagspart == null) {
            sagspart = new ArrayList<RelationType>();
        }
        return this.sagspart;
    }

    /**
     * Gets the value of the sagsrelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagsrelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagsrelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSagsrelation() {
        if (sagsrelation == null) {
            sagsrelation = new ArrayList<RelationType>();
        }
        return this.sagsrelation;
    }

    /**
     * Gets the value of the sagsgenstande property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagsgenstande property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagsgenstande().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getSagsgenstande() {
        if (sagsgenstande == null) {
            sagsgenstande = new ArrayList<RelationType>();
        }
        return this.sagsgenstande;
    }

    /**
     * Gets the value of the journalpost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journalpost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJournalpost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JournalpostRelationType }
     * 
     * 
     */
    public List<JournalpostRelationType> getJournalpost() {
        if (journalpost == null) {
            journalpost = new ArrayList<JournalpostRelationType>();
        }
        return this.journalpost;
    }

    /**
     * Gets the value of the lokalUdvidelseListe property.
     * 
     * @return
     *     possible object is
     *     {@link LokalUdvidelseListeType }
     *     
     */
    public LokalUdvidelseListeType getLokalUdvidelseListe() {
        return lokalUdvidelseListe;
    }

    /**
     * Sets the value of the lokalUdvidelseListe property.
     * 
     * @param value
     *     allowed object is
     *     {@link LokalUdvidelseListeType }
     *     
     */
    public void setLokalUdvidelseListe(LokalUdvidelseListeType value) {
        this.lokalUdvidelseListe = value;
    }

    public RelationListeType withSagsaktoer(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getSagsaktoer().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSagsaktoer(Collection<RelationType> values) {
        if (values!= null) {
            getSagsaktoer().addAll(values);
        }
        return this;
    }

    public RelationListeType withSagsarkiv(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getSagsarkiv().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSagsarkiv(Collection<RelationType> values) {
        if (values!= null) {
            getSagsarkiv().addAll(values);
        }
        return this;
    }

    public RelationListeType withSagsklasse(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getSagsklasse().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSagsklasse(Collection<RelationType> values) {
        if (values!= null) {
            getSagsklasse().addAll(values);
        }
        return this;
    }

    public RelationListeType withSagspart(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getSagspart().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSagspart(Collection<RelationType> values) {
        if (values!= null) {
            getSagspart().addAll(values);
        }
        return this;
    }

    public RelationListeType withSagsrelation(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getSagsrelation().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSagsrelation(Collection<RelationType> values) {
        if (values!= null) {
            getSagsrelation().addAll(values);
        }
        return this;
    }

    public RelationListeType withSagsgenstande(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getSagsgenstande().add(value);
            }
        }
        return this;
    }

    public RelationListeType withSagsgenstande(Collection<RelationType> values) {
        if (values!= null) {
            getSagsgenstande().addAll(values);
        }
        return this;
    }

    public RelationListeType withJournalpost(JournalpostRelationType... values) {
        if (values!= null) {
            for (JournalpostRelationType value: values) {
                getJournalpost().add(value);
            }
        }
        return this;
    }

    public RelationListeType withJournalpost(Collection<JournalpostRelationType> values) {
        if (values!= null) {
            getJournalpost().addAll(values);
        }
        return this;
    }

    public RelationListeType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
