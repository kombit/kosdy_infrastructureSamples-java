
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FremdriftStatusKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FremdriftStatusKodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Modtaget"/&gt;
 *     &lt;enumeration value="Fordelt"/&gt;
 *     &lt;enumeration value="Underudarbejdelse"/&gt;
 *     &lt;enumeration value="Underreview"/&gt;
 *     &lt;enumeration value="Publiceret"/&gt;
 *     &lt;enumeration value="Endeligt"/&gt;
 *     &lt;enumeration value="Afleveret"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FremdriftStatusKodeType")
@XmlEnum
public enum FremdriftStatusKodeType {

    @XmlEnumValue("Modtaget")
    MODTAGET("Modtaget"),
    @XmlEnumValue("Fordelt")
    FORDELT("Fordelt"),
    @XmlEnumValue("Underudarbejdelse")
    UNDERUDARBEJDELSE("Underudarbejdelse"),
    @XmlEnumValue("Underreview")
    UNDERREVIEW("Underreview"),
    @XmlEnumValue("Publiceret")
    PUBLICERET("Publiceret"),
    @XmlEnumValue("Endeligt")
    ENDELIGT("Endeligt"),
    @XmlEnumValue("Afleveret")
    AFLEVERET("Afleveret");
    private final String value;

    FremdriftStatusKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FremdriftStatusKodeType fromValue(String v) {
        for (FremdriftStatusKodeType c: FremdriftStatusKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
