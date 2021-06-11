
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArkivTypeKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ArkivTypeKodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Forvaltning"/&gt;
 *     &lt;enumeration value="Reference"/&gt;
 *     &lt;enumeration value="Personlig"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ArkivTypeKodeType")
@XmlEnum
public enum ArkivTypeKodeType {

    @XmlEnumValue("Forvaltning")
    FORVALTNING("Forvaltning"),
    @XmlEnumValue("Reference")
    REFERENCE("Reference"),
    @XmlEnumValue("Personlig")
    PERSONLIG("Personlig");
    private final String value;

    ArkivTypeKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArkivTypeKodeType fromValue(String v) {
        for (ArkivTypeKodeType c: ArkivTypeKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
