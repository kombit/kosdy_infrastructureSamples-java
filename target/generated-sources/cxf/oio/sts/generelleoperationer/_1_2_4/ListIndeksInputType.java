
package oio.sts.generelleoperationer._1_2_4;

import java.util.Collection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.ListInputType;
import oio.sagdok._3_0.TidspunktType;


/**
 * <p>Java class for ListIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}ListInputType"&gt;
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
@XmlType(name = "ListIndeksInputType", propOrder = {
    "stsRegistreringFraFilter",
    "stsRegistreringTilFilter"
})
public class ListIndeksInputType
    extends ListInputType
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

    public ListIndeksInputType withStsRegistreringFraFilter(TidspunktType value) {
        setStsRegistreringFraFilter(value);
        return this;
    }

    public ListIndeksInputType withStsRegistreringTilFilter(TidspunktType value) {
        setStsRegistreringTilFilter(value);
        return this;
    }

    @Override
    public ListIndeksInputType withUUIDIdentifikator(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUUIDIdentifikator().add(value);
            }
        }
        return this;
    }

    @Override
    public ListIndeksInputType withUUIDIdentifikator(Collection<String> values) {
        if (values!= null) {
            getUUIDIdentifikator().addAll(values);
        }
        return this;
    }

    @Override
    public ListIndeksInputType withVirkningFraFilter(TidspunktType value) {
        setVirkningFraFilter(value);
        return this;
    }

    @Override
    public ListIndeksInputType withVirkningTilFilter(TidspunktType value) {
        setVirkningTilFilter(value);
        return this;
    }

    @Override
    public ListIndeksInputType withRegistreringFraFilter(TidspunktType value) {
        setRegistreringFraFilter(value);
        return this;
    }

    @Override
    public ListIndeksInputType withRegistreringTilFilter(TidspunktType value) {
        setRegistreringTilFilter(value);
        return this;
    }

}
