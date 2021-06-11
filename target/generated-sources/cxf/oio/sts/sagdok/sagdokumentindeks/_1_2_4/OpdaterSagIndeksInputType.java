
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import oio.sts.sagdok.sag._1_2_4.AttributListeType;
import oio.sts.sagdok.sag._1_2_4.RelationListeType;
import oio.sts.sagdok.sag._1_2_4.RetInputType;
import oio.sts.sagdok.sag._1_2_4.TilstandListeType;


/**
 * <p>Java class for OpdaterSagIndeksInputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpdaterSagIndeksInputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:sagdok:sag:1.2.4.0}RetInputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Tidspunkt" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpdaterSagIndeksInputType", propOrder = {
    "tidspunkt"
})
public class OpdaterSagIndeksInputType
    extends RetInputType
{

    @XmlElement(name = "Tidspunkt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tidspunkt;

    /**
     * Gets the value of the tidspunkt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTidspunkt() {
        return tidspunkt;
    }

    /**
     * Sets the value of the tidspunkt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTidspunkt(XMLGregorianCalendar value) {
        this.tidspunkt = value;
    }

    public OpdaterSagIndeksInputType withTidspunkt(XMLGregorianCalendar value) {
        setTidspunkt(value);
        return this;
    }

    @Override
    public OpdaterSagIndeksInputType withAttributListe(AttributListeType value) {
        setAttributListe(value);
        return this;
    }

    @Override
    public OpdaterSagIndeksInputType withTilstandListe(TilstandListeType value) {
        setTilstandListe(value);
        return this;
    }

    @Override
    public OpdaterSagIndeksInputType withRelationListe(RelationListeType value) {
        setRelationListe(value);
        return this;
    }

    @Override
    public OpdaterSagIndeksInputType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

    @Override
    public OpdaterSagIndeksInputType withNoteTekst(String value) {
        setNoteTekst(value);
        return this;
    }

}
