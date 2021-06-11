
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sts.generelleoperationer._1_2_4.PagineringType;


/**
 * <p>Java class for AntalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AntalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Element"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="sager"/&gt;
 *               &lt;enumeration value="dokumenter"/&gt;
 *               &lt;enumeration value="journalnotater"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Antal" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Paginering" type="{urn:oio:sts:generelleoperationer:1.2.4.0}PagineringType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AntalType", propOrder = {
    "element",
    "antal",
    "paginering"
})
public class AntalType {

    @XmlElement(name = "Element", required = true)
    protected String element;
    @XmlElement(name = "Antal", required = true)
    protected BigInteger antal;
    @XmlElement(name = "Paginering")
    protected PagineringType paginering;

    /**
     * Gets the value of the element property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElement() {
        return element;
    }

    /**
     * Sets the value of the element property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElement(String value) {
        this.element = value;
    }

    /**
     * Gets the value of the antal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAntal() {
        return antal;
    }

    /**
     * Sets the value of the antal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAntal(BigInteger value) {
        this.antal = value;
    }

    /**
     * Gets the value of the paginering property.
     * 
     * @return
     *     possible object is
     *     {@link PagineringType }
     *     
     */
    public PagineringType getPaginering() {
        return paginering;
    }

    /**
     * Sets the value of the paginering property.
     * 
     * @param value
     *     allowed object is
     *     {@link PagineringType }
     *     
     */
    public void setPaginering(PagineringType value) {
        this.paginering = value;
    }

    public AntalType withElement(String value) {
        setElement(value);
        return this;
    }

    public AntalType withAntal(BigInteger value) {
        setAntal(value);
        return this;
    }

    public AntalType withPaginering(PagineringType value) {
        setPaginering(value);
        return this;
    }

}
