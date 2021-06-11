
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sts.sagdok.sagdokumentindeks._1_2_4.FremsoegSagDokumentIndeksOutputType;


/**
 * <p>Java class for FremsoegResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FremsoegResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}FremsoegSagDokumentIndeksOutput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FremsoegResponseType", propOrder = {
    "fremsoegSagDokumentIndeksOutput"
})
public class FremsoegResponseType {

    @XmlElement(name = "FremsoegSagDokumentIndeksOutput", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", required = true)
    protected FremsoegSagDokumentIndeksOutputType fremsoegSagDokumentIndeksOutput;

    /**
     * Gets the value of the fremsoegSagDokumentIndeksOutput property.
     * 
     * @return
     *     possible object is
     *     {@link FremsoegSagDokumentIndeksOutputType }
     *     
     */
    public FremsoegSagDokumentIndeksOutputType getFremsoegSagDokumentIndeksOutput() {
        return fremsoegSagDokumentIndeksOutput;
    }

    /**
     * Sets the value of the fremsoegSagDokumentIndeksOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link FremsoegSagDokumentIndeksOutputType }
     *     
     */
    public void setFremsoegSagDokumentIndeksOutput(FremsoegSagDokumentIndeksOutputType value) {
        this.fremsoegSagDokumentIndeksOutput = value;
    }

    public FremsoegResponseType withFremsoegSagDokumentIndeksOutput(FremsoegSagDokumentIndeksOutputType value) {
        setFremsoegSagDokumentIndeksOutput(value);
        return this;
    }

}
