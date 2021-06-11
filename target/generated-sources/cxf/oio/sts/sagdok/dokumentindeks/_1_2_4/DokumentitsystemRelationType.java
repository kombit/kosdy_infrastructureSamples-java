
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseListeType;
import oio.sts.generelledefinitioner._1_2_4.RelationType;


/**
 * <p>Java class for DokumentitsystemRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DokumentitsystemRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SystemNavn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SystemURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DokumentitsystemRelationType", propOrder = {
    "systemNavn",
    "systemURI"
})
public class DokumentitsystemRelationType
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

    public DokumentitsystemRelationType withSystemNavn(String value) {
        setSystemNavn(value);
        return this;
    }

    public DokumentitsystemRelationType withSystemURI(String value) {
        setSystemURI(value);
        return this;
    }

    @Override
    public DokumentitsystemRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public DokumentitsystemRelationType withRolle(UnikIdType value) {
        setRolle(value);
        return this;
    }

    @Override
    public DokumentitsystemRelationType withType(UnikIdType value) {
        setType(value);
        return this;
    }

    @Override
    public DokumentitsystemRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public DokumentitsystemRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

    @Override
    public DokumentitsystemRelationType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
