
package oio.sts.sagdok.sag._1_2_4;

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
 *     &lt;enumeration value="Opstaaet"/&gt;
 *     &lt;enumeration value="Oplyst"/&gt;
 *     &lt;enumeration value="Afgjort"/&gt;
 *     &lt;enumeration value="Bestilt"/&gt;
 *     &lt;enumeration value="Udfoert"/&gt;
 *     &lt;enumeration value="Afsluttet"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FremdriftStatusKodeType")
@XmlEnum
public enum FremdriftStatusKodeType {

    @XmlEnumValue("Opstaaet")
    OPSTAAET("Opstaaet"),
    @XmlEnumValue("Oplyst")
    OPLYST("Oplyst"),
    @XmlEnumValue("Afgjort")
    AFGJORT("Afgjort"),
    @XmlEnumValue("Bestilt")
    BESTILT("Bestilt"),
    @XmlEnumValue("Udfoert")
    UDFOERT("Udfoert"),
    @XmlEnumValue("Afsluttet")
    AFSLUTTET("Afsluttet");
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
