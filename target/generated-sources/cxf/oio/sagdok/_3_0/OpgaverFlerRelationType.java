
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpgaverFlerRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpgaverFlerRelationType"&gt;
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
@XmlType(name = "OpgaverFlerRelationType")
public class OpgaverFlerRelationType
    extends DynamicFlerRelationType
{


    @Override
    public OpgaverFlerRelationType withRolle(UuidLabelInputType value) {
        setRolle(value);
        return this;
    }

    @Override
    public OpgaverFlerRelationType withType(UuidLabelInputType value) {
        setType(value);
        return this;
    }

    @Override
    public OpgaverFlerRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public OpgaverFlerRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public OpgaverFlerRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
