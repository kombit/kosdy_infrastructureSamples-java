
package dk.serviceplatformen.xml.wsdl.soap11.sagdokument.sagdokumentindeks._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.MultipleOutputType;


/**
 * <p>Java class for OpdaterResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpdaterResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}OpdaterSagDokumentIndeksOutput"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpdaterResponseType", propOrder = {
    "opdaterSagDokumentIndeksOutput"
})
public class OpdaterResponseType {

    @XmlElement(name = "OpdaterSagDokumentIndeksOutput", namespace = "urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0", required = true)
    protected MultipleOutputType opdaterSagDokumentIndeksOutput;

    /**
     * Gets the value of the opdaterSagDokumentIndeksOutput property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleOutputType }
     *     
     */
    public MultipleOutputType getOpdaterSagDokumentIndeksOutput() {
        return opdaterSagDokumentIndeksOutput;
    }

    /**
     * Sets the value of the opdaterSagDokumentIndeksOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleOutputType }
     *     
     */
    public void setOpdaterSagDokumentIndeksOutput(MultipleOutputType value) {
        this.opdaterSagDokumentIndeksOutput = value;
    }

    public OpdaterResponseType withOpdaterSagDokumentIndeksOutput(MultipleOutputType value) {
        setOpdaterSagDokumentIndeksOutput(value);
        return this;
    }

}
