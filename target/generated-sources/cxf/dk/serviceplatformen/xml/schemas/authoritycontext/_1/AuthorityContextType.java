
package dk.serviceplatformen.xml.schemas.authoritycontext._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthorityContextType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorityContextType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="MunicipalityCVR" type="{http://serviceplatformen.dk/xml/schemas/AuthorityContext/1/}CVRNumber"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorityContextType", propOrder = {

})
public class AuthorityContextType {

    @XmlElement(name = "MunicipalityCVR", required = true)
    protected String municipalityCVR;

    /**
     * Gets the value of the municipalityCVR property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMunicipalityCVR() {
        return municipalityCVR;
    }

    /**
     * Sets the value of the municipalityCVR property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMunicipalityCVR(String value) {
        this.municipalityCVR = value;
    }

    public AuthorityContextType withMunicipalityCVR(String value) {
        setMunicipalityCVR(value);
        return this;
    }

}
