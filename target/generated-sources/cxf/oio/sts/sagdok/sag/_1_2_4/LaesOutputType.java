
package oio.sts.sagdok.sag._1_2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.StandardReturType;


/**
 * <p>Java class for LaesOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LaesOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}BasicOutputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FiltreretOejebliksbillede" type="{urn:oio:sts:sagdok:sag:1.2.4.0}FiltreretOejebliksbilledeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LaesOutputType", propOrder = {
    "filtreretOejebliksbillede"
})
public class LaesOutputType
    extends BasicOutputType
{

    @XmlElement(name = "FiltreretOejebliksbillede")
    protected FiltreretOejebliksbilledeType filtreretOejebliksbillede;

    /**
     * Gets the value of the filtreretOejebliksbillede property.
     * 
     * @return
     *     possible object is
     *     {@link FiltreretOejebliksbilledeType }
     *     
     */
    public FiltreretOejebliksbilledeType getFiltreretOejebliksbillede() {
        return filtreretOejebliksbillede;
    }

    /**
     * Sets the value of the filtreretOejebliksbillede property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiltreretOejebliksbilledeType }
     *     
     */
    public void setFiltreretOejebliksbillede(FiltreretOejebliksbilledeType value) {
        this.filtreretOejebliksbillede = value;
    }

    public LaesOutputType withFiltreretOejebliksbillede(FiltreretOejebliksbilledeType value) {
        setFiltreretOejebliksbillede(value);
        return this;
    }

    @Override
    public LaesOutputType withStandardRetur(StandardReturType value) {
        setStandardRetur(value);
        return this;
    }

}
