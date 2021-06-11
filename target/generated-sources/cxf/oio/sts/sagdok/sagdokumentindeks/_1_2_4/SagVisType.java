
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagVisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagVisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Vis" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}SagVisFilterType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SagVisType", propOrder = {
    "vis"
})
public class SagVisType {

    @XmlElement(name = "Vis", required = true)
    @XmlSchemaType(name = "string")
    protected SagVisFilterType vis;

    /**
     * Gets the value of the vis property.
     * 
     * @return
     *     possible object is
     *     {@link SagVisFilterType }
     *     
     */
    public SagVisFilterType getVis() {
        return vis;
    }

    /**
     * Sets the value of the vis property.
     * 
     * @param value
     *     allowed object is
     *     {@link SagVisFilterType }
     *     
     */
    public void setVis(SagVisFilterType value) {
        this.vis = value;
    }

    public SagVisType withVis(SagVisFilterType value) {
        setVis(value);
        return this;
    }

}
