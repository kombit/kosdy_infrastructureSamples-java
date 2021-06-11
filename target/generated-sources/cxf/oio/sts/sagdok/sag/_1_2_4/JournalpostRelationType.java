
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.UnikIdType;
import oio.sagdok._3_0.VirkningType;
import oio.sts.generelledefinitioner._1_2_4.LokalUdvidelseListeType;
import oio.sts.generelledefinitioner._1_2_4.RelationType;


/**
 * <p>Java class for JournalpostRelationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalpostRelationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sts:generelledefinitioner:1.2.4.0}RelationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="JournalpostEgenskaber" type="{urn:oio:sts:sagdok:sag:1.2.4.0}JournalpostEgenskaberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalpostRelationType", propOrder = {
    "journalpostEgenskaber"
})
public class JournalpostRelationType
    extends RelationType
{

    @XmlElement(name = "JournalpostEgenskaber")
    protected JournalpostEgenskaberType journalpostEgenskaber;

    /**
     * Gets the value of the journalpostEgenskaber property.
     * 
     * @return
     *     possible object is
     *     {@link JournalpostEgenskaberType }
     *     
     */
    public JournalpostEgenskaberType getJournalpostEgenskaber() {
        return journalpostEgenskaber;
    }

    /**
     * Sets the value of the journalpostEgenskaber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JournalpostEgenskaberType }
     *     
     */
    public void setJournalpostEgenskaber(JournalpostEgenskaberType value) {
        this.journalpostEgenskaber = value;
    }

    public JournalpostRelationType withJournalpostEgenskaber(JournalpostEgenskaberType value) {
        setJournalpostEgenskaber(value);
        return this;
    }

    @Override
    public JournalpostRelationType withVirkning(VirkningType value) {
        setVirkning(value);
        return this;
    }

    @Override
    public JournalpostRelationType withRolle(UnikIdType value) {
        setRolle(value);
        return this;
    }

    @Override
    public JournalpostRelationType withType(UnikIdType value) {
        setType(value);
        return this;
    }

    @Override
    public JournalpostRelationType withIndeks(String value) {
        setIndeks(value);
        return this;
    }

    @Override
    public JournalpostRelationType withReferenceID(UnikIdType value) {
        setReferenceID(value);
        return this;
    }

    @Override
    public JournalpostRelationType withLokalUdvidelseListe(LokalUdvidelseListeType value) {
        setLokalUdvidelseListe(value);
        return this;
    }

}
