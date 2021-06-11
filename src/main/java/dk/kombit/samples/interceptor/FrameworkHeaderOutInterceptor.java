package dk.kombit.samples.interceptor;

import dk.kombit.samples.interceptor.model.SbfFrameworkHeader;
import org.apache.cxf.binding.soap.SoapFault;
import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.SoapVersionFactory;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.jaxb.JAXBDataBinding;
import org.apache.cxf.phase.Phase;

import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;
import java.util.List;

/**
 * Serviceplatformen uses Liberty SOAP which requires framework in the header. That is not standard, so we have to add it manually.
 */
public class FrameworkHeaderOutInterceptor extends AbstractSoapInterceptor {

    public FrameworkHeaderOutInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        Header framework;
        try {
            framework = new SoapHeader(
                    new QName("urn:liberty:sb:2006-08", "Framework", "sbf"),
                    new SbfFrameworkHeader(),
                    new JAXBDataBinding(SbfFrameworkHeader.class)
            );
        } catch (JAXBException e) {
            throw SoapFault.createFault(
                    new SoapFault(
                            "Error adding framework header",
                            e,
                            new QName("http://schemas.xmlsoap.org/soap/envelope", "Client")
                    ),
                    SoapVersionFactory.getInstance().getSoapVersion("http://schemas.xmlsoap.org/wsdl/soap/")
            );
        }

        List<Header> headers = soapMessage.getHeaders();
        headers.add(framework);
        soapMessage.put(Header.HEADER_LIST, headers);
    }
}
