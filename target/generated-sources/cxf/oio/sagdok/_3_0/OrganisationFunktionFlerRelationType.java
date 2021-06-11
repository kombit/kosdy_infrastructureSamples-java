
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrganisationFunktionFlerRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganisationFunktionFlerRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}FlerRelationType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganisationFunktionFlerRelationType")
public class OrganisationFunktionFlerRelationType
    extends FlerRelationType
{


    @Override
    public OrganisationFunktionFlerRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public OrganisationFunktionFlerRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
