
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseListeType;
import oio.sts.generelledefinitioner._1_2_4.RelationType;


/**
 * <p>Java class for SikkerhedsprofilRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SikkerhedsprofilRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SikkerhedsprofilRelationType")
public class SikkerhedsprofilRelationType
    extends RelationType
{


    @Override
    public SikkerhedsprofilRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public SikkerhedsprofilRelationType withRolle(UnikIdType value) {
        setRolle(value);
        return this;
    }

    @Override
    public SikkerhedsprofilRelationType withType(UnikIdType value) {
        setType(value);
        return this;
    }

    @Override
    public SikkerhedsprofilRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public SikkerhedsprofilRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

    @Override
    public SikkerhedsprofilRelationType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
