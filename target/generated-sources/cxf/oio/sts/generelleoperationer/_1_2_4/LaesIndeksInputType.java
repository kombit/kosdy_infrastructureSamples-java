
package oio.sts.generelleoperationer._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.LaesInputType;
import oio.sagdok._3_0.TidspunktType;


/**
 * <p>Java class for LaesIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaesIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}LaesInputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StsRegistreringFraFilter" type="{urn:oio:sagdok:3.0.0}TidspunktType" minOccurs="0"/&gt;
 *         &lt;element name="StsRegistreringTilFilter" type="{urn:oio:sagdok:3.0.0}TidspunktType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaesIndeksInputType", propOrder = {
    "stsRegistreringFraFilter",
    "stsRegistreringTilFilter"
})
public class LaesIndeksInputType
    extends LaesInputType
{

    @XmlElement(name = "StsRegistreringFraFilter")
    protected TidspunktType stsRegistreringFraFilter;
    @XmlElement(name = "StsRegistreringTilFilter")
    protected TidspunktType stsRegistreringTilFilter;

    /**
     * Gets the value of the stsRegistreringFraFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getStsRegistreringFraFilter() {
        return stsRegistreringFraFilter;
    }

    /**
     * Sets the value of the stsRegistreringFraFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setStsRegistreringFraFilter(TidspunktType value) {
        this.stsRegistreringFraFilter = value;
    }

    /**
     * Gets the value of the stsRegistreringTilFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getStsRegistreringTilFilter() {
        return stsRegistreringTilFilter;
    }

    /**
     * Sets the value of the stsRegistreringTilFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setStsRegistreringTilFilter(TidspunktType value) {
        this.stsRegistreringTilFilter = value;
    }

    public LaesIndeksInputType withStsRegistreringFraFilter(TidspunktType value) {
        setStsRegistreringFraFilter(value);
        return this;
    }

    public LaesIndeksInputType withStsRegistreringTilFilter(TidspunktType value) {
        setStsRegistreringTilFilter(value);
        return this;
    }

    @Override
    public LaesIndeksInputType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    @Override
    public LaesIndeksInputType withVirkningFraFilter(TidspunktType value) {
        setVirkningFraFilter(value);
        return this;
    }

    @Override
    public LaesIndeksInputType withVirkningTilFilter(TidspunktType value) {
        setVirkningTilFilter(value);
        return this;
    }

    @Override
    public LaesIndeksInputType withRegistreringFraFilter(TidspunktType value) {
        setRegistreringFraFilter(value);
        return this;
    }

    @Override
    public LaesIndeksInputType withRegistreringTilFilter(TidspunktType value) {
        setRegistreringTilFilter(value);
        return this;
    }

}
