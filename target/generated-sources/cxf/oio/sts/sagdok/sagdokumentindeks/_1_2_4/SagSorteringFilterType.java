
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagSorteringFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SagSorteringFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Bruger"/&gt;
 *     &lt;enumeration value="StsRegistreringstidspunkt"/&gt;
 *     &lt;enumeration value="Registreringstidspunkt"/&gt;
 *     &lt;enumeration value="BrugervendtNoegle"/&gt;
 *     &lt;enumeration value="ItSystem-Systemnavn"/&gt;
 *     &lt;enumeration value="Fremdrift"/&gt;
 *     &lt;enumeration value="Titel"/&gt;
 *     &lt;enumeration value="Foelsomhed"/&gt;
 *     &lt;enumeration value="Sagklasse-BrugervendtNoegle"/&gt;
 *     &lt;enumeration value="Livscyklus"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SagSorteringFilterType")
@XmlEnum
public enum SagSorteringFilterType {

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
    @XmlEnumValue("Sagklasse-BrugervendtNoegle")
    SAGKLASSE_BRUGERVENDT_NOEGLE("Sagklasse-BrugervendtNoegle"),
    @XmlEnumValue("Livscyklus")
    LIVSCYKLUS("Livscyklus");
    private final String value;

    SagSorteringFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SagSorteringFilterType fromValue(String v) {
        for (SagSorteringFilterType c: SagSorteringFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
