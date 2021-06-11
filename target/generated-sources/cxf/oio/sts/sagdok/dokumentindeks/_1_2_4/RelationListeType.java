
package oio.sts.sagdok.dokumentindeks._1_2_4;

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
 *         &lt;element name="Dokumentrelation" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dokumentaktoer" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dokumentpart" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Dokumentklasse" type="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "dokumentrelation",
    "dokumentaktoer",
    "dokumentpart",
    "dokumentklasse",
    "lokalUdvidelseListe"
})
public class RelationListeType {

    @XmlElement(name = "Dokumentrelation")
    protected List<RelationType> dokumentrelation;
    @XmlElement(name = "Dokumentaktoer")
    protected List<RelationType> dokumentaktoer;
    @XmlElement(name = "Dokumentpart")
    protected List<RelationType> dokumentpart;
    @XmlElement(name = "Dokumentklasse")
    protected List<RelationType> dokumentklasse;
    @XmlElement(name = "LokalUdvidelseListe", namespace = "urn:oio:sts:generelledefinitioner:1.2.4.0")
    protected LokalUdvidelseListeType lokalUdvidelseListe;

    /**
     * Gets the value of the dokumentrelation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentrelation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentrelation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getDokumentrelation() {
        if (dokumentrelation == null) {
            dokumentrelation = new ArrayList<RelationType>();
        }
        return this.dokumentrelation;
    }

    /**
     * Gets the value of the dokumentaktoer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentaktoer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentaktoer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getDokumentaktoer() {
        if (dokumentaktoer == null) {
            dokumentaktoer = new ArrayList<RelationType>();
        }
        return this.dokumentaktoer;
    }

    /**
     * Gets the value of the dokumentpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getDokumentpart() {
        if (dokumentpart == null) {
            dokumentpart = new ArrayList<RelationType>();
        }
        return this.dokumentpart;
    }

    /**
     * Gets the value of the dokumentklasse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentklasse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentklasse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationType }
     * 
     * 
     */
    public List<RelationType> getDokumentklasse() {
        if (dokumentklasse == null) {
            dokumentklasse = new ArrayList<RelationType>();
        }
        return this.dokumentklasse;
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

    public RelationListeType withDokumentrelation(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getDokumentrelation().add(value);
            }
        }
        return this;
    }

    public RelationListeType withDokumentrelation(Collection<RelationType> values) {
        if (values!= null) {
            getDokumentrelation().addAll(values);
        }
        return this;
    }

    public RelationListeType withDokumentaktoer(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getDokumentaktoer().add(value);
            }
        }
        return this;
    }

    public RelationListeType withDokumentaktoer(Collection<RelationType> values) {
        if (values!= null) {
            getDokumentaktoer().addAll(values);
        }
        return this;
    }

    public RelationListeType withDokumentpart(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getDokumentpart().add(value);
            }
        }
        return this;
    }

    public RelationListeType withDokumentpart(Collection<RelationType> values) {
        if (values!= null) {
            getDokumentpart().addAll(values);
        }
        return this;
    }

    public RelationListeType withDokumentklasse(RelationType... values) {
        if (values!= null) {
            for (RelationType value: values) {
                getDokumentklasse().add(value);
            }
        }
        return this;
    }

    public RelationListeType withDokumentklasse(Collection<RelationType> values) {
        if (values!= null) {
            getDokumentklasse().addAll(values);
        }
        return this;
    }

    public RelationListeType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
