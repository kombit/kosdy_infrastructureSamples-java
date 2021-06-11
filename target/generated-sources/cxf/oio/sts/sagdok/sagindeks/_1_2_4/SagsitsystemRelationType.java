
package oio.sts.sagdok.sagindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseListeType;
import oio.sts.generelledefinitioner._1_2_4.RelationType;


/**
 * <p>Java class for SagsitsystemRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagsitsystemRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemNavn" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SystemURI" minOccurs="0"&gt;
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
@XmlType(name = "SagsitsystemRelationType", propOrder = {
    "systemNavn",
    "systemURI"
})
@XmlRootElement(name = "SagsitsystemRelation")
public class SagsitsystemRelationType
    extends RelationType
{

    @XmlElement(name = "SystemNavn")
    protected String systemNavn;
    @XmlElement(name = "SystemURI")
    protected String systemURI;

    /**
     * Gets the value of the systemNavn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemNavn() {
        return systemNavn;
    }

    /**
     * Sets the value of the systemNavn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemNavn(String value) {
        this.systemNavn = value;
    }

    /**
     * Gets the value of the systemURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemURI() {
        return systemURI;
    }

    /**
     * Sets the value of the systemURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemURI(String value) {
        this.systemURI = value;
    }

    public SagsitsystemRelationType withSystemNavn(String value) {
        setSystemNavn(value);
        return this;
    }

    public SagsitsystemRelationType withSystemURI(String value) {
        setSystemURI(value);
        return this;
    }

    @Override
    public SagsitsystemRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public SagsitsystemRelationType withRolle(UnikIdType value) {
        setRolle(value);
        return this;
    }

    @Override
    public SagsitsystemRelationType withType(UnikIdType value) {
        setType(value);
        return this;
    }

    @Override
    public SagsitsystemRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public SagsitsystemRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

    @Override
    public SagsitsystemRelationType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
