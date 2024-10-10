package dk.kombit.samples.oekonomiskEffektueringIndeks;

import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.stoettesystemerne.ydelsesindeks.OekonomiskEffektueringIndeksService6;
import dk.stoettesystemerne.ydelsesindeks.OekonomiskEffektueringPortType;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.UuidNoteInputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class OekonomiskEffektueringIndeks {
    private static final Logger LOGGER = LoggerFactory.getLogger(OekonomiskEffektueringIndeks.class);

    private final OekonomiskEffektueringPortType oekonomiskEffektueringPortType;

    public OekonomiskEffektueringIndeks() {
        oekonomiskEffektueringPortType = new OekonomiskEffektueringIndeksService6().getOekonomiskEffektueringIndeks();

        BindingProvider bindingProvider = (BindingProvider) oekonomiskEffektueringPortType;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ClientProperties.getInstance().getOekonomiskEffektueringIndeksEndpointUrl());
    }

    public static OekonomiskEffektueringIndeks oekonomiskEffektueringIndeks;

    /**
     * Methods that allow other classes to get an instance of OekonomiskEffektueringIndeks
     * to avoid creating multiple instances of the same class
     * If an instance of OekonomiskEffektueringIndeks does not exist, one is created
     *
     * @return Instance of OekonomiskEffektueringIndeks
     */
    public static OekonomiskEffektueringIndeks getOekonomiskEffektueringIndeks() {
        if (oekonomiskEffektueringIndeks == null) {
            oekonomiskEffektueringIndeks = new OekonomiskEffektueringIndeks();
        }
        return oekonomiskEffektueringIndeks;
    }

    public BasicOutputType fjern(UuidNoteInputType uuidNoteInputType) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        return oekonomiskEffektueringPortType.fjern(requestHeader, uuidNoteInputType);
    }

}
