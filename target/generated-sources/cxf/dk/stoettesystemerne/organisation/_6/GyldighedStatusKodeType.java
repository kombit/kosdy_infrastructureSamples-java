
package dk.stoettesystemerne.organisation._6;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GyldighedStatusKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GyldighedStatusKodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Aktiv"/&gt;
 *     &lt;enumeration value="Inaktiv"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GyldighedStatusKodeType")
@XmlEnum
public enum GyldighedStatusKodeType {

    @XmlEnumValue("Aktiv")
    AKTIV("Aktiv"),
    @XmlEnumValue("Inaktiv")
    INAKTIV("Inaktiv");
    private final String value;

    GyldighedStatusKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GyldighedStatusKodeType fromValue(String v) {
        for (GyldighedStatusKodeType c: GyldighedStatusKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
