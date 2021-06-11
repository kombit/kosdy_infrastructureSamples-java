package dk.kombit.samples.interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.Phase;

/**
 * Serviceplatformen requires a specific CONTENT_TYPE, so we have to add it manually.
 */
public class ContentTypeOutInterceptor extends AbstractSoapInterceptor {

    public ContentTypeOutInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    @Override
    public void handleMessage(final SoapMessage soapMessage) throws Fault {
        soapMessage.put(Message.CONTENT_TYPE, "application/soap+xml; charset=utf-8");
    }
}
