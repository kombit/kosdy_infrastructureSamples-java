
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentVisFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DokumentVisFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="egenskaber"/&gt;
 *     &lt;enumeration value="varianter"/&gt;
 *     &lt;enumeration value="fremdrift"/&gt;
 *     &lt;enumeration value="dokument"/&gt;
 *     &lt;enumeration value="klasse"/&gt;
 *     &lt;enumeration value="aktoer"/&gt;
 *     &lt;enumeration value="part"/&gt;
 *     &lt;enumeration value="itsystem"/&gt;
 *     &lt;enumeration value="sikkerhedsprofil"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DokumentVisFilterType")
@XmlEnum
public enum DokumentVisFilterType {

    @XmlEnumValue("egenskaber")
    EGENSKABER("egenskaber"),
    @XmlEnumValue("varianter")
    VARIANTER("varianter"),
    @XmlEnumValue("fremdrift")
    FREMDRIFT("fremdrift"),
    @XmlEnumValue("dokument")
    DOKUMENT("dokument"),
    @XmlEnumValue("klasse")
    KLASSE("klasse"),
    @XmlEnumValue("aktoer")
    AKTOER("aktoer"),
    @XmlEnumValue("part")
    PART("part"),
    @XmlEnumValue("itsystem")
    ITSYSTEM("itsystem"),
    @XmlEnumValue("sikkerhedsprofil")
    SIKKERHEDSPROFIL("sikkerhedsprofil");
    private final String value;

    DokumentVisFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DokumentVisFilterType fromValue(String v) {
        for (DokumentVisFilterType c: DokumentVisFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
