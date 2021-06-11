
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KasserInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KasserInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Kasser" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}FiltreretOejebliksbilledeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KasserInputType", propOrder = {
    "kasser"
})
public class KasserInputType {

    @XmlElement(name = "Kasser", required = true)
    protected FiltreretOejebliksbilledeType kasser;

    /**
     * Gets the value of the kasser property.
     * 
     * @return
     *     possible object is
     *     {@link FiltreretOejebliksbilledeType }
     *     
     */
    public FiltreretOejebliksbilledeType getKasser() {
        return kasser;
    }

    /**
     * Sets the value of the kasser property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltreretOejebliksbilledeType }
     *     
     */
    public void setKasser(FiltreretOejebliksbilledeType value) {
        this.kasser = value;
    }

    public KasserInputType withKasser(FiltreretOejebliksbilledeType value) {
        setKasser(value);
        return this;
    }

}
