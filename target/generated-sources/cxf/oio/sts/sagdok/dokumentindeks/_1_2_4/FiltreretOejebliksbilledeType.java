
package oio.sts.sagdok.dokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.SagDokObjektType;


/**
 * <p>Java class for FiltreretOejebliksbilledeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiltreretOejebliksbilledeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjektType" type="{urn:oio:sagdok:3.0.0}SagDokObjektType"/&gt;
 *         &lt;element name="Registrering" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}RegistreringType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FiltreretOejebliksbilledeType", propOrder = {
    "objektType",
    "registrering"
})
public class FiltreretOejebliksbilledeType {

    @XmlElement(name = "ObjektType", required = true)
    protected SagDokObjektType objektType;
    @XmlElement(name = "Registrering")
    protected List<RegistreringType> registrering;

    /**
     * Gets the value of the objektType property.
     * 
     * @return
     *     possible object is
     *     {@link SagDokObjektType }
     *     
     */
    public SagDokObjektType getObjektType() {
        return objektType;
    }

    /**
     * Sets the value of the objektType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SagDokObjektType }
     *     
     */
    public void setObjektType(SagDokObjektType value) {
        this.objektType = value;
    }

    /**
     * Gets the value of the registrering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistreringType }
     * 
     * 
     */
    public List<RegistreringType> getRegistrering() {
        if (registrering == null) {
            registrering = new ArrayList<RegistreringType>();
        }
        return this.registrering;
    }

    public FiltreretOejebliksbilledeType withObjektType(SagDokObjektType value) {
        setObjektType(value);
        return this;
    }

    public FiltreretOejebliksbilledeType withRegistrering(RegistreringType... values) {
        if (values!= null) {
            for (RegistreringType value: values) {
                getRegistrering().add(value);
            }
        }
        return this;
    }

    public FiltreretOejebliksbilledeType withRegistrering(Collection<RegistreringType> values) {
        if (values!= null) {
            getRegistrering().addAll(values);
        }
        return this;
    }

}
