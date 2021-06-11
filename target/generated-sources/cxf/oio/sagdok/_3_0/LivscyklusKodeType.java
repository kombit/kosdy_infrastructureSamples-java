
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LivscyklusKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LivscyklusKodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Opstaaet"/&gt;
 *     &lt;enumeration value="Importeret"/&gt;
 *     &lt;enumeration value="Passiveret"/&gt;
 *     &lt;enumeration value="Slettet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LivscyklusKodeType")
@XmlEnum
public enum LivscyklusKodeType {

    @XmlEnumValue("Opstaaet")
    OPSTAAET("Opstaaet"),
    @XmlEnumValue("Importeret")
    IMPORTERET("Importeret"),
    @XmlEnumValue("Passiveret")
    PASSIVERET("Passiveret"),
    @XmlEnumValue("Slettet")
    SLETTET("Slettet");
    private final String value;

    LivscyklusKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LivscyklusKodeType fromValue(String v) {
        for (LivscyklusKodeType c: LivscyklusKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
