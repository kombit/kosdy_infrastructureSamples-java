
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagInkluderFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SagInkluderFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="sagsrelation"/&gt;
 *     &lt;enumeration value="journalpost"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SagInkluderFilterType")
@XmlEnum
public enum SagInkluderFilterType {

    @XmlEnumValue("sagsrelation")
    SAGSRELATION("sagsrelation"),
    @XmlEnumValue("journalpost")
    JOURNALPOST("journalpost");
    private final String value;

    SagInkluderFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SagInkluderFilterType fromValue(String v) {
        for (SagInkluderFilterType c: SagInkluderFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
