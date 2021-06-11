
package oio.sts.generelleoperationer._1_2_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PagineringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PagineringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}FoersteResultatReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}MaksimalAntalKvantitet" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagineringType", propOrder = {
    "foersteResultatReference",
    "maksimalAntalKvantitet"
})
public class PagineringType {

    @XmlElement(name = "FoersteResultatReference", namespace = "urn:oio:sagdok:3.0.0")
    protected BigInteger foersteResultatReference;
    @XmlElement(name = "MaksimalAntalKvantitet", namespace = "urn:oio:sagdok:3.0.0")
    protected BigInteger maksimalAntalKvantitet;

    /**
     * Gets the value of the foersteResultatReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFoersteResultatReference() {
        return foersteResultatReference;
    }

    /**
     * Sets the value of the foersteResultatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFoersteResultatReference(BigInteger value) {
        this.foersteResultatReference = value;
    }

    /**
     * Gets the value of the maksimalAntalKvantitet property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaksimalAntalKvantitet() {
        return maksimalAntalKvantitet;
    }

    /**
     * Sets the value of the maksimalAntalKvantitet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaksimalAntalKvantitet(BigInteger value) {
        this.maksimalAntalKvantitet = value;
    }

    public PagineringType withFoersteResultatReference(BigInteger value) {
        setFoersteResultatReference(value);
        return this;
    }

    public PagineringType withMaksimalAntalKvantitet(BigInteger value) {
        setMaksimalAntalKvantitet(value);
        return this;
    }

}
