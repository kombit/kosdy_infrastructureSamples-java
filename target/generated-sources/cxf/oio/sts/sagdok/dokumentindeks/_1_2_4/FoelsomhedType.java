
package oio.sts.sagdok.dokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoelsomhedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FoelsomhedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="IKKE_FORTROLIGE_DATA"/&gt;
 *     &lt;enumeration value="FORTROLIGE_PERSONOPLYSNINGER"/&gt;
 *     &lt;enumeration value="FOELSOMME_PERSONOPLYSNINGER"/&gt;
 *     &lt;enumeration value="VIP_SAGER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FoelsomhedType")
@XmlEnum
public enum FoelsomhedType {

    IKKE_FORTROLIGE_DATA,
    FORTROLIGE_PERSONOPLYSNINGER,
    FOELSOMME_PERSONOPLYSNINGER,
    VIP_SAGER;

    public String value() {
        return name();
    }

    public static FoelsomhedType fromValue(String v) {
        return valueOf(v);
    }

}
