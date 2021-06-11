
package oio.sts.generelleoperationer._1_2_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.SoegRegistreringType;
import oio.sagdok._3_0.SoegVirkningType;
import oio.sagdok._3_0.TidspunktType;


/**
 * <p>Java class for SoegIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoegIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}SoegInputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SoegStsFraTidspunkt" type="{urn:oio:sagdok:3.0.0}TidspunktType" minOccurs="0"/&gt;
 *         &lt;element name="SoegStsTilTidspunkt" type="{urn:oio:sagdok:3.0.0}TidspunktType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoegIndeksInputType", propOrder = {
    "soegStsFraTidspunkt",
    "soegStsTilTidspunkt"
})
@XmlSeeAlso({
    oio.sts.sagdok.sag._1_2_4.SoegInputType.class,
    oio.sts.sagdok.dokumentindeks._1_2_4.SoegInputType.class
})
public class SoegIndeksInputType
    extends oio.sagdok._3_0.SoegInputType
{

    @XmlElement(name = "SoegStsFraTidspunkt")
    protected TidspunktType soegStsFraTidspunkt;
    @XmlElement(name = "SoegStsTilTidspunkt")
    protected TidspunktType soegStsTilTidspunkt;

    /**
     * Gets the value of the soegStsFraTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getSoegStsFraTidspunkt() {
        return soegStsFraTidspunkt;
    }

    /**
     * Sets the value of the soegStsFraTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setSoegStsFraTidspunkt(TidspunktType value) {
        this.soegStsFraTidspunkt = value;
    }

    /**
     * Gets the value of the soegStsTilTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getSoegStsTilTidspunkt() {
        return soegStsTilTidspunkt;
    }

    /**
     * Sets the value of the soegStsTilTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setSoegStsTilTidspunkt(TidspunktType value) {
        this.soegStsTilTidspunkt = value;
    }

    public SoegIndeksInputType withSoegStsFraTidspunkt(TidspunktType value) {
        setSoegStsFraTidspunkt(value);
        return this;
    }

    public SoegIndeksInputType withSoegStsTilTidspunkt(TidspunktType value) {
        setSoegStsTilTidspunkt(value);
        return this;
    }

    @Override
    public SoegIndeksInputType withFoersteResultatReference(BigInteger value) {
        setFoersteResultatReference(value);
        return this;
    }

    @Override
    public SoegIndeksInputType withMaksimalAntalKvantitet(BigInteger value) {
        setMaksimalAntalKvantitet(value);
        return this;
    }

    @Override
    public SoegIndeksInputType withSoegRegistrering(SoegRegistreringType value) {
        setSoegRegistrering(value);
        return this;
    }

    @Override
    public SoegIndeksInputType withSoegVirkning(SoegVirkningType value) {
        setSoegVirkning(value);
        return this;
    }

}
