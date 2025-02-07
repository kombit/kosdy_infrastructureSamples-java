package dk.kombit.samples.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClientProperties {

    private static final String PROPERTIES_NAME = "/client.properties";
    private static ClientProperties clientProperties;
    private final Properties properties;

    //Variables which MUST BE MODIFIED before running the code examples

    private static final String KEYSTORE_FILENAME = "org.apache.ws.security.crypto.merlin.keystore.file";
    private static final String KEYSTORE_PASSWORD = "org.apache.ws.security.crypto.merlin.keystore.password";
    private static final String TRUSTSTORE_FILENAME = "org.apache.ws.security.crypto.merlin.truststore.file";
    private static final String TRUSTSTORE_PASSWORD = "org.apache.ws.security.crypto.merlin.truststore.password";

    public static final String ANVENDER_SYSTEM_UUID = "anvenderSystemUuid";
    public static final String ANVENDER_SYSTEM_NAVN = "anvenderSystemNavn";

    private static final String MYNDIGHED_CVR = "myndighedCvr";
    private static final String MYNDIGHED_NAVN = "myndighednavn";

    private static final  String UUID = "uuid";

    //Variables for endpoints - CAN be modified

    private static final String SAGDOKUMENT_INDEKS_ENDPOINT_URL = "sagdokumentIndeksEndpointUrl";
    private static final String KLASSIFIKATION_ENDPOINT_URL = "klassifikationEndpointUrl";
    private static final String ORGANISATION_ENDPOINT_URL = "organisationEndpointUrl";
    private static final String VIRKSOMHED_ENDPOINT_URL = "virksomhedEndpointUrl";

    //Variables used for the code examples - CAN be modified

    private static final String SAGS_NUMMER = "sagsNummer";
    private static final String SAGS_TITEL = "sagsTitel";

    private static final String SAG_TIDSPUNKT = "sagsTidspunkt";
    private static final String SAG_OPRETTET = "sagOprettet";
    private static final String SAG_LUKKET = "sagLukket";

    private static final String PRIMAER_BEHANDLER_UUID = "primaerBehandlerUuid";
    private static final String PRIMAER_BEHANDLER_NAVN = "primaerBehandlerNavn";

    private static final String ORGANISATIONS_ENHED_NAVN = "organisationEnhedNavn";

    private static final String PRIMAER_PART_CPR = "primaerPartCpr";
    private static final String PRIMAER_PART_NAVN = "primaerPartNavn";

    private static final String KLE_KLASSE = "kleKlasse";
    private static final String KLE_HANDLINGSFACET = "kleHandlingsfacet";
    private static final String HANDLINGS_KLASSE_FACET_TITEL = "handlingsKlasseFacetTitel";
    private static final String KLASSE_FACET_TITEL = "klasseFacetTitel";

    private static final String AKTOER_REF = "aktoerRef";

    // Variables used for the code examples - NOT to be modified

    private static final String EJER_ROLLE_UUID = "ejerRolleUuid";
    private static final String EJER_ORGANISATION_TYPE_UUID = "ejerOrganisationTypeUuid";

    private static final String ANSVARLIG_ROLLE_UUID = "ansvarligRolleUuid";
    private static final String ANSVARLIG_ORGANISATIONSENHED_TYPE_UUID = "ansvarligOrganisationsEnhedTypeUuid";

    private static final String PRIMAER_BEHANDLER_ROLLE_UUID = "primaerBehandlerRolleUuid";
    private static final String BRUGER_TYPE_UUID = "brugerTypeUuid";

    private static final String PRIMAER_PART_ROLLE_UUID = "primaerPartRolleUuid";
    private static final String PERSON_TYPE_UUID = "personTypeUuid";

    private static final String PRIMAER_KLASSE_ROLLE_UUID = "primaerKlasseRolleUuid";
    private static final String KLASSE_TYPE_UUID = "klasseTypeUuid";

    private static final String HANDLINGSKLASSE_ROLLE_UUID = "handlingsklasseRolleUuid";

    private static final String BEHANDLINGSARKIV_ROLLE_UUID = "behandlingsarkivRolleUuid";
    private static final String ARKIV_TYPE_UUID = "arkivTypeUuid";

    private static final String MASTER_UUID = "masterUuid";
    private static final String IT_SYSTEM_TYPE_UUID = "itSystemTypeUuid";

    private static final String AFSENDER_TYPE_UUID = "afsenderTypeUuid";



    /**
     * Method creates a new instance of ClientProperties
     * @return clientProperties
     */
    public static ClientProperties getInstance() {
        if (clientProperties == null) {
            clientProperties = new ClientProperties();
        }

        return clientProperties;
    }

    /**
     * Method is responsible for reading the properties from the client.properties file
     */
    private ClientProperties() {
        properties = new Properties();

        try (InputStream inputStream = getClass().getResourceAsStream(PROPERTIES_NAME)) {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("Unable to read " + PROPERTIES_NAME);
        }
    }

    /**
     * Get methods for variables and constansts
     * @return varibles and constants
     */

    public String getKeystoreFilename() {
        return properties.getProperty(KEYSTORE_FILENAME);
    }
    public String getKeystorePassword() {
        return properties.getProperty(KEYSTORE_PASSWORD);
    }
    public String getTruststoreFilename() {
        return properties.getProperty(TRUSTSTORE_FILENAME);
    }
    public String getTruststorePassword() {
        return properties.getProperty(TRUSTSTORE_PASSWORD);
    }

    public String getAnvenderSystemUuid() {
        return properties.getProperty(ANVENDER_SYSTEM_UUID);
    }
    public String getAnvenderSystemNavn() {
        return properties.getProperty(ANVENDER_SYSTEM_NAVN);
    }
    public String getMyndighedCvr() {
        return properties.getProperty(MYNDIGHED_CVR);
    }
    public String getMyndighedNavn() {
        return properties.getProperty(MYNDIGHED_NAVN);
    }
    public String getUuid() {
        return properties.getProperty(UUID);
    }

    public String getSagdokumentIndeksEndpointUrl (){
        return properties.getProperty(SAGDOKUMENT_INDEKS_ENDPOINT_URL);
    }
    public String getKlassifikationEndpointUrl (){
        return properties.getProperty(KLASSIFIKATION_ENDPOINT_URL);
    }
    public String getOrganisationEndpointUrl (){
        return properties.getProperty(ORGANISATION_ENDPOINT_URL);
    }
    public String getVirksomhedEndpointUrl (){
        return properties.getProperty(VIRKSOMHED_ENDPOINT_URL);
    }

    public String getSagsNummer() {
        return properties.getProperty(SAGS_NUMMER);
    }
    public String getSagsTitel() {
        return properties.getProperty(SAGS_TITEL);
    }

    public String getSagTidspunkt() {
        return properties.getProperty(SAG_TIDSPUNKT);
    }
    public String getSagOprettet()  {
        return properties.getProperty(SAG_OPRETTET);
    }
    public String getSagLukket() {
        return properties.getProperty(SAG_LUKKET);
    }

    public String getPrimaerBehandlerUuid() {
        return properties.getProperty(PRIMAER_BEHANDLER_UUID);
    }
    public String getPrimaerBehandlerNavn() {
        return properties.getProperty(PRIMAER_BEHANDLER_NAVN);
    }

    public String getOrganisationsEnhedNavn() {
        return properties.getProperty(ORGANISATIONS_ENHED_NAVN);
    }

    public String getPrimaerPartCpr()  {
        return properties.getProperty(PRIMAER_PART_CPR);
    }
    public String getPrimaerPartNavn(){
        return properties.getProperty(PRIMAER_PART_NAVN);
    }

    public String getKleKlasse() {
        return properties.getProperty(KLE_KLASSE);
    }
    public String getKleHandlingsfacet(){
        return properties.getProperty(KLE_HANDLINGSFACET);
    }
    public String getHandlingsKlasseFacetTitel() {
        return properties.getProperty(HANDLINGS_KLASSE_FACET_TITEL);
    }
    public String getKlasseFacetTitel() {
        return properties.getProperty(KLASSE_FACET_TITEL);
    }

    public String getAktoerRef(){
        return properties.getProperty(AKTOER_REF);
    }

    public String getEjerRolleUuid() {
        return properties.getProperty(EJER_ROLLE_UUID);
    }
    public String getEjerOrganisationTypeUuid() {
        return properties.getProperty(EJER_ORGANISATION_TYPE_UUID);
    }

    public String getAnsvarligRolleUuid() {
        return properties.getProperty(ANSVARLIG_ROLLE_UUID);
    }
    public String getAnsvarligOrganisationsenhedTypeUuid() {
        return properties.getProperty(ANSVARLIG_ORGANISATIONSENHED_TYPE_UUID);
    }

    public String getPrimaerBehandlerRolleUuid() {
        return properties.getProperty(PRIMAER_BEHANDLER_ROLLE_UUID);
    }
    public String getBrugerTypeUuid() {
        return properties.getProperty(BRUGER_TYPE_UUID);
    }

    public String getPrimaerPartRolleUuid() {
        return properties.getProperty(PRIMAER_PART_ROLLE_UUID);
    }
    public String getPersonTypeUuid() {
        return properties.getProperty(PERSON_TYPE_UUID);
    }

    public String getPrimaerKlasseRolleUuid() {
        return properties.getProperty(PRIMAER_KLASSE_ROLLE_UUID);
    }
    public String getKlasseTypeUuid() {
        return properties.getProperty(KLASSE_TYPE_UUID);
    }

    public String getHandlingsklasseRolleUuid() {
        return properties.getProperty(HANDLINGSKLASSE_ROLLE_UUID);
    }

    public String getMasterUuid() {
        return properties.getProperty(MASTER_UUID);
    }
    public String getItSystemTypeUuid() {
        return properties.getProperty(IT_SYSTEM_TYPE_UUID);
    }

    public String getAfsenderTypeUuid() {
        return properties.getProperty(AFSENDER_TYPE_UUID);
    }


}
