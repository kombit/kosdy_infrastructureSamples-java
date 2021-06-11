package dk.kombit.samples.organisation;

import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.stoettesystemerne.organisation._6.VirksomhedPortType;
import dk.stoettesystemerne.organisation._6.VirksomhedService;
import dk.stoettesystemerne.organisation.virksomhed._6.EgenskabType;
import dk.stoettesystemerne.organisation.virksomhed._6.RelationListeType;
import dk.stoettesystemerne.organisation.virksomhed._6.SoegInputType;
import dk.stoettesystemerne.organisation.virksomhed._6.AttributListeType;
import dk.stoettesystemerne.organisation.virksomhed._6.TilstandListeType;
import oio.sagdok._3_0.SoegOutputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

/**
 * Class for handling requests to VirksomhedService
 */
public class Virksomhed {

    private static final Logger LOGGER = LoggerFactory.getLogger(Virksomhed.class);

    private final VirksomhedPortType virksomhedPort;

    public Virksomhed() {
        virksomhedPort = new VirksomhedService().getVirksomhed();
        BindingProvider bindingProvider = (BindingProvider) virksomhedPort;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ClientProperties.getInstance().getVirksomhedEndpointUrl());
    }

    private static Virksomhed virksomhed;

    /**
     * Methods that allow other classes to get an instance of Virksomhed
     * to avoid creating multiple instances of the same class
     * If an instance of Virksomhed does not exist, one is created
     *
     * @return Instance of Virksomhed
     */
    public static Virksomhed getVirksomhed()
    {
        if (virksomhed == null)
            virksomhed = new Virksomhed();
        return virksomhed;
    }

    /**
     * Searches for a Virksomhed object based on CVR number and returns UUID
     *
     * @param myndighedcvr CVR number to search for
     * @return UUID for the Virksomhed object
     */
    public String getVirksomhedUuid(String myndighedcvr){

        var soegOutput = soeg(myndighedcvr);

        var virksomhedUuidList = soegOutput.getIdListe();

        if (virksomhedUuidList == null || virksomhedUuidList.getUUIDIdentifikator().isEmpty())
            return "";

        return virksomhedUuidList.getUUIDIdentifikator().get(0);
    }

    /**
     * Searches for a Virksomhed object based on CVR number and returns SoegOutput.
     * Uses the SOEG operation in VirksomhedService
     *
     * @param myndighedcvr CVR number to search for
     * @return Search output for Virksomhed object
     */
    public SoegOutputType soeg(String myndighedcvr){
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();
        SoegInputType soegInputType = new SoegInputType().withAttributListe(
                new AttributListeType().withEgenskab(
                        new EgenskabType().withCVRNummerTekst(myndighedcvr)
                )
        ).withTilstandListe(
                new TilstandListeType()
        ).withRelationListe(
                new RelationListeType()
        );

        SoegOutputType soegResponse;
        soegResponse = virksomhedPort.soeg(requestHeader, soegInputType);

        return soegResponse;

    }
}

