
package dk.stoettesystemerne.organisation.organisation._6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.StandardReturType;


/**
 * <p>Java class for ListOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}ListOutputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FiltreretOejebliksbillede" type="{http://stoettesystemerne.dk/organisation/organisation/6/}FiltreretOejebliksbilledeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOutputType", propOrder = {
    "filtreretOejebliksbillede"
})
public class ListOutputType
    extends oio.sagdok._3_0.ListOutputType
{

    @XmlElement(name = "FiltreretOejebliksbillede")
    protected List<FiltreretOejebliksbilledeType> filtreretOejebliksbillede;

    /**
     * Gets the value of the filtreretOejebliksbillede property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filtreretOejebliksbillede property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiltreretOejebliksbillede().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FiltreretOejebliksbilledeType }
     * 
     * 
     */
    public List<FiltreretOejebliksbilledeType> getFiltreretOejebliksbillede() {
        if (filtreretOejebliksbillede == null) {
            filtreretOejebliksbillede = new ArrayList<FiltreretOejebliksbilledeType>();
        }
        return this.filtreretOejebliksbillede;
    }

    public ListOutputType withFiltreretOejebliksbillede(FiltreretOejebliksbilledeType... values) {
        if (values!= null) {
            for (FiltreretOejebliksbilledeType value: values) {
                getFiltreretOejebliksbillede().add(value);
            }
        }
        return this;
    }

    public ListOutputType withFiltreretOejebliksbillede(Collection<FiltreretOejebliksbilledeType> values) {
        if (values!= null) {
            getFiltreretOejebliksbillede().addAll(values);
        }
        return this;
    }

    @Override
    public ListOutputType withStandardRetur(StandardReturType value) {
        setStandardRetur(value);
        return this;
    }

}
