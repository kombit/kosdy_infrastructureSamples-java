
package oio.sts.sagdok.sag._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.SagDokObjektType;


/**
 * <p>Java class for SagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}SagDokObjektType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Registrering" type="{urn:oio:sts:sagdok:sag:1.2.4.0}RegistreringType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SagType", propOrder = {
    "registrering"
})
public class SagType
    extends SagDokObjektType
{

    @XmlElement(name = "Registrering", required = true)
    protected List<RegistreringType> registrering;

    /**
     * Gets the value of the registrering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistrering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistreringType }
     * 
     * 
     */
    public List<RegistreringType> getRegistrering() {
        if (registrering == null) {
            registrering = new ArrayList<RegistreringType>();
        }
        return this.registrering;
    }

    public SagType withRegistrering(RegistreringType... values) {
        if (values!= null) {
            for (RegistreringType value: values) {
                getRegistrering().add(value);
            }
        }
        return this;
    }

    public SagType withRegistrering(Collection<RegistreringType> values) {
        if (values!= null) {
            getRegistrering().addAll(values);
        }
        return this;
    }

    @Override
    public SagType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

}
