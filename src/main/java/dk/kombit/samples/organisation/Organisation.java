package dk.kombit.samples.organisation;


import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.stoettesystemerne.organisation._6.OrganisationPortType;
import dk.stoettesystemerne.organisation._6.OrganisationService;
import dk.stoettesystemerne.organisation.organisation._6.LaesOutputType;
import dk.stoettesystemerne.organisation.organisation._6.RelationListeType;
import dk.stoettesystemerne.organisation.organisation._6.SoegInputType;
import dk.stoettesystemerne.organisation.organisation._6.AttributListeType;
import dk.stoettesystemerne.organisation.organisation._6.TilstandListeType;
import net.shibboleth.utilities.java.support.collection.Pair;
import oio.sagdok._3_0.LaesInputType;
import oio.sagdok._3_0.SoegOutputType;
import oio.sagdok._3_0.UnikIdType;
import oio.sagdok._3_0.VirksomhedRelationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;

public class Organisation {

    private static final Logger LOGGER = LoggerFactory.getLogger(Organisation.class);

    private final OrganisationPortType organisationPort;

    public Organisation() {
        organisationPort = new OrganisationService().getOrganisation();
        BindingProvider bindingProvider = (BindingProvider) organisationPort;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ClientProperties.getInstance().getOrganisationEndpointUrl());
    }

    private static Organisation organisation;

    /**
     * Methods that allow other classes to get an instance of Organisation
     * to avoid creating multiple instances of the same class
     * If an instance of Organisation does not exist, one is created
     *
     * @return Instance of Organisation
     */
    public static Organisation getOrganisation()
    {
        if (organisation == null)
            organisation = new Organisation();
        return organisation;
    }

    /**
     * Demonstrates how to find the Organisation object related to a Virksomhed object with a given CVR-number.
     * First the SEARCH operation in VirksomhedService is used to find the Virksomhed object which holds the CVR-number.
     * Next the SEARCH operation in OrganisationService is used to find the Organisation object related to the Virksomhed object.
     * Finally the LAES operation in OrganisationService is used to read the full Organisation object
     *
     * @param myndighedCvr CVR for the authority
     * @return Prints the output to the console
     */
    public void getOrganisationByCvr (String myndighedCvr){

        System.out.println("Searching for organization with CVR " + myndighedCvr + " with the following result: ");

        //CVR is an attribute on Virksomhed
        //In order to find the Organisation by CVR we first need to find the UUID for the Virksomhed which has the CVR
        Virksomhed virksomhed = Virksomhed.getVirksomhed();
        String virksomhedUuid = virksomhed.getVirksomhedUuid(myndighedCvr);

        //Next we use the SOEG operation to find the UIID for the Organisation related to the Virksomhed
        var organisation = getOrganisationUuidName(virksomhedUuid);

        System.out.println(" *Virksomhed UUID: " + virksomhedUuid + "\n *Organisation UUID: " + organisation.getFirst() +
                "\n *Organisation Name: " + organisation.getSecond() + "\n");

    }

    /**
     * Demonstrates how to find the Organisation object related to a Virksomhed object with a given CVR-number.
     * First the SEARCH operation in VirksomhedService is used to find the Virksomhed object which holds the CVR-number.
     * Next the SEARCH operation in OrganisationService is used to find the Organisation object related to the Virksomhed object.
     * Finally the LAES operation in OrganisationService is used to read the full Organisation object
     *
     * @param virksomhedUuid UUID for the Virksomhed object to search for
     * @return A KeyValuePair with the Organisation UUID (key) and Organisation name (name)
     */
    public Pair<String, String> getOrganisationUuidName(String virksomhedUuid){

        var soegOutput = soeg(virksomhedUuid);

        if(soegOutput.getIdListe() == null || soegOutput.getIdListe().getUUIDIdentifikator().isEmpty())
            return new Pair<>("", "");

        //Check if status == 20 (OK)
        if (!soegOutput.getStandardRetur().getStatusKode().toString().equals("20"))
            return new Pair<>("", "");

        //Check if any UUID was found
        var uuids = soegOutput.getIdListe();
        if (uuids == null || uuids.getUUIDIdentifikator().isEmpty())
            return new Pair<>("", "");

        //Call List with the founds UUID(s)
        var laesOutput = laes(uuids.getUUIDIdentifikator().get(0));

        var organisationUuid = laesOutput.getFiltreretOejebliksbillede().getObjektType().getUUIDIdentifikator();
        var organisationNavn = laesOutput.getFiltreretOejebliksbillede().getRegistrering().get(0).getAttributListe().getEgenskab().get(0).getOrganisationNavn();

        return new Pair<>(organisationUuid, organisationNavn);
    }

    /**
     * Searches for an Organisation object related to a given Virksomhed object.
     * Uses the SEARCH operation in OrganisationService
     *
     * @param virksomhedUuid UUID for the Virksomhed object to search for
     * @return Search output including UUID for the Organisation object
     */
    public SoegOutputType soeg(String virksomhedUuid){
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();
        SoegInputType soegInputType = new SoegInputType().withAttributListe(
                new AttributListeType()
        ).withTilstandListe(
                new TilstandListeType()
        ).withRelationListe(
                new RelationListeType().withVirksomhed(
                        new VirksomhedRelationType().withReferenceID(
                                new UnikIdType().withUUIDIdentifikator(virksomhedUuid)
                        )
                )
        );

        SoegOutputType soegResponse;
        soegResponse = organisationPort.soeg(requestHeader, soegInputType);

        return soegResponse;
    }

    /**
     * Retreieves all information about an Organisation object.
     * Uses the LAES operation in OrganisationService
     *
     * @param organisationUuid UUID for the Organisation object to retreive
     * @return Laes output containing all information about the requested object
     */
    public LaesOutputType laes(String organisationUuid){
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();
        LaesInputType laesInputType = new LaesInputType().withUUIDIdentifikator(organisationUuid);

        LaesOutputType laesResponse;
        laesResponse = organisationPort.laes(requestHeader, laesInputType);

        return laesResponse;
    }

}
