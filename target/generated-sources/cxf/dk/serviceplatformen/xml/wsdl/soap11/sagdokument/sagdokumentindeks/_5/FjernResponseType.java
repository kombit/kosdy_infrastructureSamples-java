
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.MultipleOutputType;


/**
 * <p>Java class for FjernResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FjernResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}FjernSagDokumentIndeksOutput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FjernResponseType", propOrder = {
    "fjernSagDokumentIndeksOutput"
})
public class FjernResponseType {

    @XmlElement(name = "FjernSagDokumentIndeksOutput", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", required = true)
    protected MultipleOutputType fjernSagDokumentIndeksOutput;

    /**
     * Gets the value of the fjernSagDokumentIndeksOutput property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOutputType }
     *     
     */
    public MultipleOutputType getFjernSagDokumentIndeksOutput() {
        return fjernSagDokumentIndeksOutput;
    }

    /**
     * Sets the value of the fjernSagDokumentIndeksOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOutputType }
     *     
     */
    public void setFjernSagDokumentIndeksOutput(MultipleOutputType value) {
        this.fjernSagDokumentIndeksOutput = value;
    }

    public FjernResponseType withFjernSagDokumentIndeksOutput(MultipleOutputType value) {
        setFjernSagDokumentIndeksOutput(value);
        return this;
    }

}
