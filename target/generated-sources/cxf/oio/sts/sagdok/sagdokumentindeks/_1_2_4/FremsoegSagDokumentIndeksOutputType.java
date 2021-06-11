
package oio.sts.sagdok.sagdokumentindeks._1_2_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.StandardReturType;


/**
 * <p>Java class for FremsoegSagDokumentIndeksOutputType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FremsoegSagDokumentIndeksOutputType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:oio:sagdok:3.0.0}BasicOutputType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Antal" type="{urn:oio:sts:sagdok:sagdokumentindeks:1.2.4.0}AntalType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SagFiltreretOejebliksbillede" type="{urn:oio:sts:sagdok:sag:1.2.4.0}FiltreretOejebliksbilledeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DokumentFiltreretOejebliksbillede" type="{urn:oio:sts:sagdok:dokumentindeks:1.2.4.0}FiltreretOejebliksbilledeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FremsoegSagDokumentIndeksOutputType", propOrder = {
    "antal",
    "sagFiltreretOejebliksbillede",
    "dokumentFiltreretOejebliksbillede"
})
public class FremsoegSagDokumentIndeksOutputType
    extends BasicOutputType
{

    @XmlElement(name = "Antal")
    protected List<AntalType> antal;
    @XmlElement(name = "SagFiltreretOejebliksbillede")
    protected List<oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType> sagFiltreretOejebliksbillede;
    @XmlElement(name = "DokumentFiltreretOejebliksbillede")
    protected List<oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType> dokumentFiltreretOejebliksbillede;

    /**
     * Gets the value of the antal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the antal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAntal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AntalType }
     * 
     * 
     */
    public List<AntalType> getAntal() {
        if (antal == null) {
            antal = new ArrayList<AntalType>();
        }
        return this.antal;
    }

    /**
     * Gets the value of the sagFiltreretOejebliksbillede property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sagFiltreretOejebliksbillede property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSagFiltreretOejebliksbillede().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType }
     * 
     * 
     */
    public List<oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType> getSagFiltreretOejebliksbillede() {
        if (sagFiltreretOejebliksbillede == null) {
            sagFiltreretOejebliksbillede = new ArrayList<oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType>();
        }
        return this.sagFiltreretOejebliksbillede;
    }

    /**
     * Gets the value of the dokumentFiltreretOejebliksbillede property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dokumentFiltreretOejebliksbillede property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDokumentFiltreretOejebliksbillede().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType }
     * 
     * 
     */
    public List<oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType> getDokumentFiltreretOejebliksbillede() {
        if (dokumentFiltreretOejebliksbillede == null) {
            dokumentFiltreretOejebliksbillede = new ArrayList<oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType>();
        }
        return this.dokumentFiltreretOejebliksbillede;
    }

    public FremsoegSagDokumentIndeksOutputType withAntal(AntalType... values) {
        if (values!= null) {
            for (AntalType value: values) {
                getAntal().add(value);
            }
        }
        return this;
    }

    public FremsoegSagDokumentIndeksOutputType withAntal(Collection<AntalType> values) {
        if (values!= null) {
            getAntal().addAll(values);
        }
        return this;
    }

    public FremsoegSagDokumentIndeksOutputType withSagFiltreretOejebliksbillede(oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType... values) {
        if (values!= null) {
            for (oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType value: values) {
                getSagFiltreretOejebliksbillede().add(value);
            }
        }
        return this;
    }

    public FremsoegSagDokumentIndeksOutputType withSagFiltreretOejebliksbillede(Collection<oio.sts.sagdok.sag._1_2_4.FiltreretOejebliksbilledeType> values) {
        if (values!= null) {
            getSagFiltreretOejebliksbillede().addAll(values);
        }
        return this;
    }

    public FremsoegSagDokumentIndeksOutputType withDokumentFiltreretOejebliksbillede(oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType... values) {
        if (values!= null) {
            for (oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType value: values) {
                getDokumentFiltreretOejebliksbillede().add(value);
            }
        }
        return this;
    }

    public FremsoegSagDokumentIndeksOutputType withDokumentFiltreretOejebliksbillede(Collection<oio.sts.sagdok.dokumentindeks._1_2_4.FiltreretOejebliksbilledeType> values) {
        if (values!= null) {
            getDokumentFiltreretOejebliksbillede().addAll(values);
        }
        return this;
    }

    @Override
    public FremsoegSagDokumentIndeksOutputType withStandardRetur(StandardReturType value) {
        setStandardRetur(value);
        return this;
    }

}
