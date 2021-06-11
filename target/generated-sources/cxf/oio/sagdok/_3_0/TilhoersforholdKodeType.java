
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TilhoersforholdKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TilhoersforholdKodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Vedlagt"/&gt;
 *     &lt;enumeration value="Tilakteret"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TilhoersforholdKodeType")
@XmlEnum
public enum TilhoersforholdKodeType {

    @XmlEnumValue("Vedlagt")
    VEDLAGT("Vedlagt"),
    @XmlEnumValue("Tilakteret")
    TILAKTERET("Tilakteret");
    private final String value;

    TilhoersforholdKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TilhoersforholdKodeType fromValue(String v) {
        for (TilhoersforholdKodeType c: TilhoersforholdKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
