
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DokumentInkluderFilterType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DokumentInkluderFilterType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="dokument"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DokumentInkluderFilterType")
@XmlEnum
public enum DokumentInkluderFilterType {

    @XmlEnumValue("dokument")
    DOKUMENT("dokument");
    private final String value;

    DokumentInkluderFilterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DokumentInkluderFilterType fromValue(String v) {
        for (DokumentInkluderFilterType c: DokumentInkluderFilterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
