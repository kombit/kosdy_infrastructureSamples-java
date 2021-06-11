
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SorteringFilterRetningType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SorteringFilterRetningType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Stigende"/&gt;
 *     &lt;enumeration value="Faldende"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SorteringFilterRetningType")
@XmlEnum
public enum SorteringFilterRetningType {

    @XmlEnumValue("Stigende")
    STIGENDE("Stigende"),
    @XmlEnumValue("Faldende")
    FALDENDE("Faldende");
    private final String value;

    SorteringFilterRetningType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SorteringFilterRetningType fromValue(String v) {
        for (SorteringFilterRetningType c: SorteringFilterRetningType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
