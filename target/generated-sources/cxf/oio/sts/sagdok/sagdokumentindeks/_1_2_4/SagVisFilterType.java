
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SagVisFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SagVisFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="egenskaber"/&gt;
 *     &lt;enumeration value="fremdrift"/&gt;
 *     &lt;enumeration value="sagsarkiv"/&gt;
 *     &lt;enumeration value="sagsklasse"/&gt;
 *     &lt;enumeration value="sagsaktoer"/&gt;
 *     &lt;enumeration value="sagspart"/&gt;
 *     &lt;enumeration value="sagsrelation"/&gt;
 *     &lt;enumeration value="sagsgenstand"/&gt;
 *     &lt;enumeration value="journalpost"/&gt;
 *     &lt;enumeration value="journalpost-journalnote"/&gt;
 *     &lt;enumeration value="itsystem"/&gt;
 *     &lt;enumeration value="sikkerhedsprofil"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SagVisFilterType")
@XmlEnum
public enum SagVisFilterType {

    @XmlEnumValue("egenskaber")
    EGENSKABER("egenskaber"),
    @XmlEnumValue("fremdrift")
    FREMDRIFT("fremdrift"),
    @XmlEnumValue("sagsarkiv")
    SAGSARKIV("sagsarkiv"),
    @XmlEnumValue("sagsklasse")
    SAGSKLASSE("sagsklasse"),
    @XmlEnumValue("sagsaktoer")
    SAGSAKTOER("sagsaktoer"),
    @XmlEnumValue("sagspart")
    SAGSPART("sagspart"),
    @XmlEnumValue("sagsrelation")
    SAGSRELATION("sagsrelation"),
    @XmlEnumValue("sagsgenstand")
    SAGSGENSTAND("sagsgenstand"),
    @XmlEnumValue("journalpost")
    JOURNALPOST("journalpost"),
    @XmlEnumValue("journalpost-journalnote")
    JOURNALPOST_JOURNALNOTE("journalpost-journalnote"),
    @XmlEnumValue("itsystem")
    ITSYSTEM("itsystem"),
    @XmlEnumValue("sikkerhedsprofil")
    SIKKERHEDSPROFIL("sikkerhedsprofil");
    private final String value;

    SagVisFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SagVisFilterType fromValue(String v) {
        for (SagVisFilterType c: SagVisFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
