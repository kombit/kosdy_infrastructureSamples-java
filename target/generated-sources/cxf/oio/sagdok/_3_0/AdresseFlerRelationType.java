
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdresseFlerRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdresseFlerRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}DynamicFlerRelationType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdresseFlerRelationType")
public class AdresseFlerRelationType
    extends DynamicFlerRelationType
{


    @Override
    public AdresseFlerRelationType withRolle(UuidLabelInputType value) {
        setRolle(value);
        return this;
    }

    @Override
    public AdresseFlerRelationType withType(UuidLabelInputType value) {
        setType(value);
        return this;
    }

    @Override
    public AdresseFlerRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public AdresseFlerRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public AdresseFlerRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
