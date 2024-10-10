package dk.kombit.samples.bevillingIndeks;

import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.stoettesystemerne.ydelsesindeks.BevillingIndeksService6;
import dk.stoettesystemerne.ydelsesindeks.BevillingPortType;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.UuidNoteInputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class BevillingIndeks {
    private static final Logger LOGGER = LoggerFactory.getLogger(BevillingIndeks.class);

    private final BevillingPortType bevillingPortType;

    public BevillingIndeks() {
        bevillingPortType = new BevillingIndeksService6().getBevillingIndeks();

        BindingProvider bindingProvider = (BindingProvider) bevillingPortType;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ClientProperties.getInstance().getBevillingIndeksEndpointUrl());
    }

    private static BevillingIndeks bevillingIndeks;

    /**
     * Methods that allow other classes to get an instance of BevillingIndeks
     * to avoid creating multiple instances of the same class
     * If an instance of BevillingIndeks does not exist, one is created
     *
     * @return Instance of BevillingIndeks
     */
    public static BevillingIndeks getBevillingIndeks() {
        if (bevillingIndeks == null) {
            bevillingIndeks = new BevillingIndeks();
        }
        return bevillingIndeks;
    }

    public BasicOutputType fjern(UuidNoteInputType uuidNoteInputType) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        return bevillingPortType.fjern(requestHeader, uuidNoteInputType);
    }
}
