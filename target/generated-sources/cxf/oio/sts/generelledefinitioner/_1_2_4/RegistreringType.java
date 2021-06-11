
package oio.sts.generelledefinitioner._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oio.sagdok._3_0.LivscyklusKodeType;
import oio.sagdok._3_0.UnikIdType;


/**
 * <p>Java class for RegistreringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistreringType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}RegistreringType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StsTidspunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistreringType", propOrder = {
    "stsTidspunkt"
})
@XmlSeeAlso({
    oio.sts.sagdok.sag._1_2_4.RegistreringType.class,
    oio.sts.sagdok.dokumentindeks._1_2_4.RegistreringType.class
})
public class RegistreringType
    extends oio.sagdok._3_0.RegistreringType
{

    @XmlElement(name = "StsTidspunkt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar stsTidspunkt;

    /**
     * Gets the value of the stsTidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStsTidspunkt() {
        return stsTidspunkt;
    }

    /**
     * Sets the value of the stsTidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStsTidspunkt(XMLGregorianCalendar value) {
        this.stsTidspunkt = value;
    }

    public RegistreringType withStsTidspunkt(XMLGregorianCalendar value) {
        setStsTidspunkt(value);
        return this;
    }

    @Override
    public RegistreringType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

    @Override
    public RegistreringType withTidspunkt(XMLGregorianCalendar value) {
        setTidspunkt(value);
        return this;
    }

    @Override
    public RegistreringType withLivscyklusKode(LivscyklusKodeType value) {
        setLivscyklusKode(value);
        return this;
    }

    @Override
    public RegistreringType withBrugerRef(UnikIdType value) {
        setBrugerRef(value);
        return this;
    }

}
