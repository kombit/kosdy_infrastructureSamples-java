
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseType;


/**
 * <p>Java class for EgenskaberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EgenskaberType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:generelledefinitioner:1.2.4.0}LokalUdvidelseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Sagsstatus" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sagskategori" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Foelsomhed" type="{urn:oio:sts:sagdok:sagindeks:1.2.4.0}FoelsomhedType" minOccurs="0"/&gt;
 *         &lt;element name="Lokation" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EgenskaberType", propOrder = {
    "sagsstatus",
    "sagskategori",
    "foelsomhed",
    "lokation"
})
@XmlRootElement(name = "SagIndeksEgenskaber")
public class EgenskaberType
    extends LokalUdvidelseType
{

    @XmlElement(name = "Sagsstatus")
    protected String sagsstatus;
    @XmlElement(name = "Sagskategori")
    protected String sagskategori;
    @XmlElement(name = "Foelsomhed")
    @XmlSchemaType(name = "string")
    protected FoelsomhedType foelsomhed;
    @XmlElement(name = "Lokation")
    protected String lokation;

    /**
     * Gets the value of the sagsstatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSagsstatus() {
        return sagsstatus;
    }

    /**
     * Sets the value of the sagsstatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSagsstatus(String value) {
        this.sagsstatus = value;
    }

    /**
     * Gets the value of the sagskategori property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSagskategori() {
        return sagskategori;
    }

    /**
     * Sets the value of the sagskategori property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSagskategori(String value) {
        this.sagskategori = value;
    }

    /**
     * Gets the value of the foelsomhed property.
     * 
     * @return
     *     possible object is
     *     {@link FoelsomhedType }
     *     
     */
    public FoelsomhedType getFoelsomhed() {
        return foelsomhed;
    }

    /**
     * Sets the value of the foelsomhed property.
     * 
     * @param value
     *     allowed object is
     *     {@link FoelsomhedType }
     *     
     */
    public void setFoelsomhed(FoelsomhedType value) {
        this.foelsomhed = value;
    }

    /**
     * Gets the value of the lokation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLokation() {
        return lokation;
    }

    /**
     * Sets the value of the lokation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLokation(String value) {
        this.lokation = value;
    }

    public EgenskaberType withSagsstatus(String value) {
        setSagsstatus(value);
        return this;
    }

    public EgenskaberType withSagskategori(String value) {
        setSagskategori(value);
        return this;
    }

    public EgenskaberType withFoelsomhed(FoelsomhedType value) {
        setFoelsomhed(value);
        return this;
    }

    public EgenskaberType withLokation(String value) {
        setLokation(value);
        return this;
    }

    @Override
    public EgenskaberType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

}
