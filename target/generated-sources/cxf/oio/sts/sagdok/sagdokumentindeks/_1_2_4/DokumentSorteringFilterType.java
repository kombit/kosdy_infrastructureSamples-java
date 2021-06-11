
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentSorteringFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DokumentSorteringFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bruger"/&gt;
 *     &lt;enumeration value="StsRegistreringstidspunkt"/&gt;
 *     &lt;enumeration value="Registreringstidspunkt"/&gt;
 *     &lt;enumeration value="BrugervendtNoegle"/&gt;
 *     &lt;enumeration value="ItSystem-Systemnavn"/&gt;
 *     &lt;enumeration value="Fremdrift"/&gt;
 *     &lt;enumeration value="Titel"/&gt;
 *     &lt;enumeration value="Foelsomhed"/&gt;
 *     &lt;enumeration value="Major"/&gt;
 *     &lt;enumeration value="Minor"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DokumentSorteringFilterType")
@XmlEnum
public enum DokumentSorteringFilterType {

    @XmlEnumValue("Bruger")
    BRUGER("Bruger"),
    @XmlEnumValue("StsRegistreringstidspunkt")
    STS_REGISTRERINGSTIDSPUNKT("StsRegistreringstidspunkt"),
    @XmlEnumValue("Registreringstidspunkt")
    REGISTRERINGSTIDSPUNKT("Registreringstidspunkt"),
    @XmlEnumValue("BrugervendtNoegle")
    BRUGERVENDT_NOEGLE("BrugervendtNoegle"),
    @XmlEnumValue("ItSystem-Systemnavn")
    IT_SYSTEM_SYSTEMNAVN("ItSystem-Systemnavn"),
    @XmlEnumValue("Fremdrift")
    FREMDRIFT("Fremdrift"),
    @XmlEnumValue("Titel")
    TITEL("Titel"),
    @XmlEnumValue("Foelsomhed")
    FOELSOMHED("Foelsomhed"),
    @XmlEnumValue("Major")
    MAJOR("Major"),
    @XmlEnumValue("Minor")
    MINOR("Minor");
    private final String value;

    DokumentSorteringFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DokumentSorteringFilterType fromValue(String v) {
        for (DokumentSorteringFilterType c: DokumentSorteringFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
