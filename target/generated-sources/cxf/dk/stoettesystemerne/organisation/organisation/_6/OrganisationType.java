
package dk.stoettesystemerne.organisation.organisation._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.stoettesystemerne.organisation._6.AktoerType;


/**
 * <p>Java class for OrganisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://stoettesystemerne.dk/organisation/6/}AktoerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://stoettesystemerne.dk/organisation/organisation/6/}Registrering" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationType", propOrder = {
    "registrering"
})
public class OrganisationType
    extends AktoerType
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

    public OrganisationType withRegistrering(RegistreringType... values) {
        if (values!= null) {
            for (RegistreringType value: values) {
                getRegistrering().add(value);
            }
        }
        return this;
    }

    public OrganisationType withRegistrering(Collection<RegistreringType> values) {
        if (values!= null) {
            getRegistrering().addAll(values);
        }
        return this;
    }

    @Override
    public OrganisationType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

}
