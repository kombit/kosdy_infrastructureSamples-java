
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Faktura"/&gt;
 *     &lt;enumeration value="Brev, indgaaende"/&gt;
 *     &lt;enumeration value="Brev, udgaaende"/&gt;
 *     &lt;enumeration value="Brev"/&gt;
 *     &lt;enumeration value="Internt Notat"/&gt;
 *     &lt;enumeration value="Eksternt Notat"/&gt;
 *     &lt;enumeration value="Rapport"/&gt;
 *     &lt;enumeration value="Dagsorden"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Type")
@XmlEnum
public enum Type {

    @XmlEnumValue("Faktura")
    FAKTURA("Faktura"),
    @XmlEnumValue("Brev, indgaaende")
    BREV_INDGAAENDE("Brev, indgaaende"),
    @XmlEnumValue("Brev, udgaaende")
    BREV_UDGAAENDE("Brev, udgaaende"),
    @XmlEnumValue("Brev")
    BREV("Brev"),
    @XmlEnumValue("Internt Notat")
    INTERNT_NOTAT("Internt Notat"),
    @XmlEnumValue("Eksternt Notat")
    EKSTERNT_NOTAT("Eksternt Notat"),
    @XmlEnumValue("Rapport")
    RAPPORT("Rapport"),
    @XmlEnumValue("Dagsorden")
    DAGSORDEN("Dagsorden");
    private final String value;

    Type(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Type fromValue(String v) {
        for (Type c: Type.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
