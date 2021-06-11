package dk.kombit.samples.klassifikation;

import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;

import dk.stoettesystemerne.klassifikation.KlassePortType;
import dk.stoettesystemerne.klassifikation.KlasseService6;
import dk.stoettesystemerne.klassifikation.klasse._6.AttributListeType;
import dk.stoettesystemerne.klassifikation.klasse._6.EgenskabType;
import dk.stoettesystemerne.klassifikation.klasse._6.ListOutputType;
import dk.stoettesystemerne.klassifikation.klasse._6.RelationListeType;
import dk.stoettesystemerne.klassifikation.klasse._6.SoegInputType;
import dk.stoettesystemerne.klassifikation.klasse._6.TilstandListeType;
import net.shibboleth.utilities.java.support.collection.Pair;
import oio.sagdok._3_0.ListInputType;
import oio.sagdok._3_0.SoegOutputType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.util.List;

public class Klasse {

    private static final Logger LOGGER = LoggerFactory.getLogger(Klasse.class);

    private final KlassePortType klassePort;

    public Klasse() {
        klassePort = new KlasseService6().getKlasse();
        BindingProvider bindingProvider = (BindingProvider) klassePort;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ClientProperties.getInstance().getKlassifikationEndpointUrl());
    }

    private static Klasse klassifikation;

    /**
     * Methods that allow other classes to get an instance of Klassifikation
     * to avoid creating multiple instances of the same class
     * If an instance of Klassifikation does not exist, one is created
     *
     * @return Instance of Klassifikation
     */
    public static Klasse getKlassifikation()
    {
        if (klassifikation == null)
            klassifikation = new Klasse();
        return klassifikation;
    }

    /**
     * Demonstrates the use of the SEARCH and LIST operations in KlassifikationService.
     * First SEARCH is used to find the Klasse UUID based on a brugervendt nøgle (key).
     * Next LIST is used to get the full Klasse object based on the Klasse UUID found by searching.
     *
     * @param brugervendtNoegle Key (brugervendt nøgle) to search for
     * @return Prints the result to the console
     */
    public void soegKlasse(String brugervendtNoegle){

        System.out.println("\nSearch for class with key: " + brugervendtNoegle + " with the following result:");

        var soegOutput = soeg(brugervendtNoegle);

        System.out.println("* Status: " + soegOutput.getStandardRetur().getStatusKode() +
                "\n* Statustext: " + soegOutput.getStandardRetur().getFejlbeskedTekst());

        // Check if status == 20 (OK)
        if (!soegOutput.getStandardRetur().getStatusKode().toString().equals("20"))
            return;

        // Check if any UUID was found
        var uuids = soegOutput.getIdListe().getUUIDIdentifikator();
        if (uuids == null || uuids.isEmpty())
        {
            System.out.println("No result for " + brugervendtNoegle);
            return;
        }

        // Call List with the found UUID(s)
        var listOutput = list(uuids);

        // Print output (klassetitel) in the console
        // This examples assumes that only one object is returned
        var klasseUUID = listOutput.getFiltreretOejebliksbillede().get(0).getObjektType().getUUIDIdentifikator();
        var klasseTitel = listOutput.getFiltreretOejebliksbillede().get(0).getRegistrering().get(0).getAttributListe().getEgenskab().get(0).getTitelTekst();
        var klasseBrugervendtNoegle = listOutput.getFiltreretOejebliksbillede().get(0).getRegistrering().get(0).getAttributListe().getEgenskab().get(0).getBrugervendtNoegleTekst();

        // If there is more than one PubliceretStatus object, where ErPubliceretIndikator is true, dates are shown for the first element in the list
        var gyldigFra = listOutput.getFiltreretOejebliksbillede().get(0).getRegistrering().get(0).getTilstandListe().getPubliceretStatus().get(0).getVirkning().getFraTidspunkt().getTidsstempelDatoTid();
        var gyldigTil = listOutput.getFiltreretOejebliksbillede().get(0).getRegistrering().get(0).getTilstandListe().getPubliceretStatus().get(0).getVirkning().getTilTidspunkt().getTidsstempelDatoTid();

        System.out.println("* UUID for the class: " + klasseUUID + "\n* Titel for the class: "+ klasseTitel + "\n* Brugervendt nøgle: " + klasseBrugervendtNoegle);

        // This boolean is used to check if a PubliceretStatus object exists, where ErPubliceretIndikator is true
        boolean publiceretStatusIndikator = listOutput.getFiltreretOejebliksbillede().get(0).getRegistrering().get(0).getTilstandListe().getPubliceretStatus().get(0).isErPubliceretIndikator();

        // If a PubliceretStatus object exists where ErPubliceretIndikator is true does not exist, N/A is shown as output
        // If gyldigTil returns null, it means gyldighed is infinite
        if (publiceretStatusIndikator){
            System.out.println("\n* Gyldig fra: " + gyldigFra + "\n* Gyldig til: " + gyldigTil);
        } else {
            System.out.println("\n* Gyldig fra: N/A" + "\n* Gyldig til: N/A");
        }

    }

    /**
     * Demonstrates the use of the SEARCH and LIST operations in KlassifikationService.
     * First SEARCH is used to find the Klasse UUID based on a brugervendt nøgle (key).
     * Next LIST is used to get the full Klasse object based on the Klasse UUID found by searching.
     *
     * @param brugervendtNoegle Key (brugervendt nøgle) to search for</param>
     * @return A KeyValuePair with the UUID (key) and name of the Klasse (name)
     */
    public Pair<String, String> getKlasseUuidName(String brugervendtNoegle){

        var soegOutput = soeg(brugervendtNoegle);

        // Check if status == 20 (OK)
        if (!soegOutput.getStandardRetur().getStatusKode().toString().equals("20"))
            return new Pair<>("", "");

        // Check if any UUID was found
        var uuids = soegOutput.getIdListe().getUUIDIdentifikator();
        if (uuids == null || uuids.isEmpty())
            return new Pair<>("", "");

        // Call List with the found UUID(s)
        var listOutput = list(uuids);

        // This examples assumes that only one object is returned
        var klasseUUID = listOutput.getFiltreretOejebliksbillede().get(0).getObjektType().getUUIDIdentifikator();
        var klasseTitel = listOutput.getFiltreretOejebliksbillede().get(0).getRegistrering().get(0).getAttributListe().getEgenskab().get(0).getTitelTekst();

        return new Pair<>(klasseUUID, klasseTitel);
    }


    /**
     * Searches for a Klasse (class) object with a specific key (brugervendt nøgle).
     * Uses the SOEG operation in KlasseService
     *
     * @param brugervendtNoegle The key to search for
     * @return Search output including UUID for the class
     */
    public SoegOutputType soeg(String brugervendtNoegle) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();
        SoegInputType soegInputType = new SoegInputType().withAttributListe(
                new AttributListeType().withEgenskab(
                        new EgenskabType().withBrugervendtNoegleTekst(brugervendtNoegle)
                )
        ).withTilstandListe(
                new TilstandListeType()
        ).withRelationListe(
                new RelationListeType()
        );

        SoegOutputType soegResponse;
        soegResponse = klassePort.soeg(requestHeader,soegInputType);

        return soegResponse;
    }

    /*
        SoegRequestType soegRequest = new SoegRequestType().withSoegInput(
                new SoegInputType().withAttributListe(
                        new AttributListeType().withEgenskab(
                                new EgenskabType().withBrugervendtNoegleTekst(brugervendtNoegle)
                        )
                ).withTilstandListe(
                        new TilstandListeType()
                ).withRelationListe(
                        new RelationListeType()
                )
        );

        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        SoegResponseType soegResponse;
        try {
            soegResponse = klassePort.soeg(requestHeader, soegRequest);
        } catch (ServiceplatformFault serviceplatformFault) {
            SoapUtils.logError(serviceplatformFault, LOGGER);
            return null;
        }
        return soegResponse.getSoegOutput();
    }
*/

    /**
     * Retreieves all information about one or more Klasse object.
     * Uses the LIST operation in KlasseService
     *
     * @param uuids UUIDs for the Klasse objects to list
     * @return List output containing all information about the requested objects
     */
    public ListOutputType list(List<String> uuids) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();
        ListInputType listInputType = new ListInputType().withUUIDIdentifikator(uuids);

        ListOutputType listResponse;
        listResponse = klassePort.list(requestHeader, listInputType);

        return listResponse;
    }

    /*
        ListRequestType listRequest = new ListRequestType().withListInput(
                new ListInputType().withUUIDIdentifikator(uuids)
        );

        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        ListResponseType listResponse;
        try {
            listResponse = klassePort.list(requestHeader, listRequest);
        } catch (ServiceplatformFault serviceplatformFault) {
            SoapUtils.logError(serviceplatformFault, LOGGER);
            return null;
        }
        return listResponse.getListOutput();
    }

     */
}
