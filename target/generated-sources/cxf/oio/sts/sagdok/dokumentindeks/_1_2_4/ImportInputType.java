
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImportInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImportInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DokumentIndeks" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}DokumentIndeksType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportInputType", propOrder = {
    "dokumentIndeks"
})
public class ImportInputType {

    @XmlElement(name = "DokumentIndeks", required = true)
    protected DokumentIndeksType dokumentIndeks;

    /**
     * Gets the value of the dokumentIndeks property.
     * 
     * @return
     *     possible object is
     *     {@link DokumentIndeksType }
     *     
     */
    public DokumentIndeksType getDokumentIndeks() {
        return dokumentIndeks;
    }

    /**
     * Sets the value of the dokumentIndeks property.
     * 
     * @param value
     *     allowed object is
     *     {@link DokumentIndeksType }
     *     
     */
    public void setDokumentIndeks(DokumentIndeksType value) {
        this.dokumentIndeks = value;
    }

    public ImportInputType withDokumentIndeks(DokumentIndeksType value) {
        setDokumentIndeks(value);
        return this;
    }

}
