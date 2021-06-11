
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.MultipleOutputType;


/**
 * <p>Java class for ImporterResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImporterResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}ImporterSagDokumentIndeksOutput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImporterResponseType", propOrder = {
    "importerSagDokumentIndeksOutput"
})
public class ImporterResponseType {

    @XmlElement(name = "ImporterSagDokumentIndeksOutput", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", required = true)
    protected MultipleOutputType importerSagDokumentIndeksOutput;

    /**
     * Gets the value of the importerSagDokumentIndeksOutput property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOutputType }
     *     
     */
    public MultipleOutputType getImporterSagDokumentIndeksOutput() {
        return importerSagDokumentIndeksOutput;
    }

    /**
     * Sets the value of the importerSagDokumentIndeksOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOutputType }
     *     
     */
    public void setImporterSagDokumentIndeksOutput(MultipleOutputType value) {
        this.importerSagDokumentIndeksOutput = value;
    }

    public ImporterResponseType withImporterSagDokumentIndeksOutput(MultipleOutputType value) {
        setImporterSagDokumentIndeksOutput(value);
        return this;
    }

}
