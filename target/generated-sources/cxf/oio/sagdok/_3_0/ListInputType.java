
package oio.sagdok._3_0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}UUIDIdentifikator" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}VirkningFraFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}VirkningTilFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}RegistreringFraFilter" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}RegistreringTilFilter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListInputType", propOrder = {
    "uuidIdentifikator",
    "virkningFraFilter",
    "virkningTilFilter",
    "registreringFraFilter",
    "registreringTilFilter"
})
public class ListInputType {

    @XmlElement(name = "UUIDIdentifikator", required = true)
    protected List<String> uuidIdentifikator;
    @XmlElement(name = "VirkningFraFilter")
    protected TidspunktType virkningFraFilter;
    @XmlElement(name = "VirkningTilFilter")
    protected TidspunktType virkningTilFilter;
    @XmlElement(name = "RegistreringFraFilter")
    protected TidspunktType registreringFraFilter;
    @XmlElement(name = "RegistreringTilFilter")
    protected TidspunktType registreringTilFilter;

    /**
     * Gets the value of the uuidIdentifikator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uuidIdentifikator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUUIDIdentifikator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUUIDIdentifikator() {
        if (uuidIdentifikator == null) {
            uuidIdentifikator = new ArrayList<String>();
        }
        return this.uuidIdentifikator;
    }

    /**
     * Gets the value of the virkningFraFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getVirkningFraFilter() {
        return virkningFraFilter;
    }

    /**
     * Sets the value of the virkningFraFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setVirkningFraFilter(TidspunktType value) {
        this.virkningFraFilter = value;
    }

    /**
     * Gets the value of the virkningTilFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getVirkningTilFilter() {
        return virkningTilFilter;
    }

    /**
     * Sets the value of the virkningTilFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setVirkningTilFilter(TidspunktType value) {
        this.virkningTilFilter = value;
    }

    /**
     * Gets the value of the registreringFraFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getRegistreringFraFilter() {
        return registreringFraFilter;
    }

    /**
     * Sets the value of the registreringFraFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setRegistreringFraFilter(TidspunktType value) {
        this.registreringFraFilter = value;
    }

    /**
     * Gets the value of the registreringTilFilter property.
     * 
     * @return
     *     possible object is
     *     {@link TidspunktType }
     *     
     */
    public TidspunktType getRegistreringTilFilter() {
        return registreringTilFilter;
    }

    /**
     * Sets the value of the registreringTilFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link TidspunktType }
     *     
     */
    public void setRegistreringTilFilter(TidspunktType value) {
        this.registreringTilFilter = value;
    }

    public ListInputType withUUIDIdentifikator(String... values) {
        if (values!= null) {
            for (String value: values) {
                getUUIDIdentifikator().add(value);
            }
        }
        return this;
    }

    public ListInputType withUUIDIdentifikator(Collection<String> values) {
        if (values!= null) {
            getUUIDIdentifikator().addAll(values);
        }
        return this;
    }

    public ListInputType withVirkningFraFilter(TidspunktType value) {
        setVirkningFraFilter(value);
        return this;
    }

    public ListInputType withVirkningTilFilter(TidspunktType value) {
        setVirkningTilFilter(value);
        return this;
    }

    public ListInputType withRegistreringFraFilter(TidspunktType value) {
        setRegistreringFraFilter(value);
        return this;
    }

    public ListInputType withRegistreringTilFilter(TidspunktType value) {
        setRegistreringTilFilter(value);
        return this;
    }

}
