
package oio.sts.part._6;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import dk.stoettesystemerne.organisation._6.AktoerType;
import dk.stoettesystemerne.organisation.virksomhed._6.VirksomhedType;
import oio.sagdok._3_0.SagDokObjektType;


/**
 * <p>Java class for PartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}SagDokObjektType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartType")
@XmlSeeAlso({
    AktoerType.class,
    VirksomhedType.class
})
public class PartType
    extends SagDokObjektType
{


    @Override
    public PartType withUUIDIdentifikator(String value) {
        setUUIDIdentifikator(value);
        return this;
    }

}
