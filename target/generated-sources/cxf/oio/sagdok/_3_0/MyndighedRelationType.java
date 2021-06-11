
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MyndighedRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MyndighedRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}RelationType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MyndighedRelationType")
public class MyndighedRelationType
    extends RelationType
{


    @Override
    public MyndighedRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public MyndighedRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

}
