
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TidspunktType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TidspunktType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}TidsstempelDatoTid"/&gt;
 *         &lt;element ref="{urn:oio:sagdok:3.0.0}GraenseIndikator"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TidspunktType", propOrder = {
    "tidsstempelDatoTid",
    "graenseIndikator"
})
public class TidspunktType {

    @XmlElement(name = "TidsstempelDatoTid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tidsstempelDatoTid;
    @XmlElement(name = "GraenseIndikator")
    protected Boolean graenseIndikator;

    /**
     * Gets the value of the tidsstempelDatoTid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTidsstempelDatoTid() {
        return tidsstempelDatoTid;
    }

    /**
     * Sets the value of the tidsstempelDatoTid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTidsstempelDatoTid(XMLGregorianCalendar value) {
        this.tidsstempelDatoTid = value;
    }

    /**
     * Gets the value of the graenseIndikator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGraenseIndikator() {
        return graenseIndikator;
    }

    /**
     * Sets the value of the graenseIndikator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGraenseIndikator(Boolean value) {
        this.graenseIndikator = value;
    }

    public TidspunktType withTidsstempelDatoTid(XMLGregorianCalendar value) {
        setTidsstempelDatoTid(value);
        return this;
    }

    public TidspunktType withGraenseIndikator(Boolean value) {
        setGraenseIndikator(value);
        return this;
    }

}
