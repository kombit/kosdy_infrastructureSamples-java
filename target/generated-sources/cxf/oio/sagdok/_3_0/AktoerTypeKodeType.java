
package oio.sagdok._3_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AktoerTypeKodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AktoerTypeKodeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Organisation"/&gt;
 *     &lt;enumeration value="OrganisationEnhed"/&gt;
 *     &lt;enumeration value="OrganisationFunktion"/&gt;
 *     &lt;enumeration value="Bruger"/&gt;
 *     &lt;enumeration value="ItSystem"/&gt;
 *     &lt;enumeration value="Interessefaellesskab"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AktoerTypeKodeType")
@XmlEnum
public enum AktoerTypeKodeType {

    @XmlEnumValue("Organisation")
    ORGANISATION("Organisation"),
    @XmlEnumValue("OrganisationEnhed")
    ORGANISATION_ENHED("OrganisationEnhed"),
    @XmlEnumValue("OrganisationFunktion")
    ORGANISATION_FUNKTION("OrganisationFunktion"),
    @XmlEnumValue("Bruger")
    BRUGER("Bruger"),
    @XmlEnumValue("ItSystem")
    IT_SYSTEM("ItSystem"),
    @XmlEnumValue("Interessefaellesskab")
    INTERESSEFAELLESSKAB("Interessefaellesskab");
    private final String value;

    AktoerTypeKodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AktoerTypeKodeType fromValue(String v) {
        for (AktoerTypeKodeType c: AktoerTypeKodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
