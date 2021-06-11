
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AndOrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AndOrType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AND"/&gt;
 *     &lt;enumeration value="OR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AndOrType")
@XmlEnum
public enum AndOrType {

    AND,
    OR;

    public String value() {
        return name();
    }

    public static AndOrType fromValue(String v) {
        return valueOf(v);
    }

}
