
package dk.stoettesystemerne.organisation._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oio.sts.part._6.PartType;


/**
 * <p>Java class for AktoerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AktoerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:part:6}PartType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AktoerType")
public class AktoerType
    extends PartType
{


    @Override
    public AktoerType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

}
