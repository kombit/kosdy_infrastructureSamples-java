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
    private static final String YDELSE_INDEKS_ENDPOINT_URL = "ydelsesIndeksEndpointUrl";
    private static final String BEVILLING_INDEKS_ENDPOINT_URL = "bevillingIndeksEndpointUrl";
    private static final String OEKONOMISKEFFEKTUERING_INDEKS_ENDPOINT_URL = "oekonomiskEffektueringIndeksEndpointUrl";

    //Variables used for the code examples - CAN be modified

    private static final String SAGS_NUMMER = "sagsNummer";
    private static final String SAGS_TITEL = "sagsTitel";

    private static final String SAG_TIDSPUNKT = "sagsTidspunkt";
    private static final String SAG_OPRETTET = "sagOprettet";
    private static final String SAG_LUKKET = "sagLukket";

    private static final String PRIMAER_BEHANDLER_UUID = "primaerBehandlerUuid";
    private static final String PRIMAER_BEHANDLER_NAVN = "primaerBehandlerNavn";

    private static final String ORGANISATIONS_ENHED_UUID  = "organisationEnhedUuid";
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

    private static final String BEVILLING_UUID_IDENTIFIKATOR = "bevillingUUIDIdentifikator";

    private static final String BEVILLINGS_EGENSKABER_AKTOER_REF = "bevillingsegenskaberAktoerRef";

    private static final String BEVILLINGS_EGENSKABER_AKTOER_TYPE_KODE = "bevillingsegenskaberAktoerTypeKode";

    private static final String BEVILLINGS_EGENSKABER_BRUGERVENDT_NOEGLE = "bevillingsegenskaberBrugervendtnoegle";

    private static final String BEVILLINGS_EGENSKABER_FOELSOMHED = "bevillingsegenskaberFoelsomhed";

    private static final String BEVILLINGS_EGENSKABER_VIRKNING_FRA = "bevillingsegenskaberVirkningFra";

    private static final String BEVILGET_YDELSE_VIRKNING_FRA = "bevilgetYdelseVirkningFra";

    private static final String BEVILGET_YDELSE_AKTOER_REF = "bevilgetYdelseAktoerRef";

    private static final String BEVILGET_YDELSE_AKTOER_TYPE_KODE = "bevilgetYdelseAktoerTypeKode";

    private static final String BEVILGET_YDELSE_ID = "bevigetYdelseID";

    private static final String BEVILGET_YDELSE_NAVN = "bevilgetYdelseNavn";

    private static final String BEVILGET_YDELSE_STARTDATO = "bevilgetYdelseStardato";

    private static final String BEVILGET_YDELSE_SLUTDATO = "bevilgetYdelseSlutdato";

    private static final String YDELSE_YDELSES_NAVN = "ydelseYdelsesnavn";

    private static final String BEVILLING_PRIMAER_KLASSE_BRUGERVENDT_NOEGLE = "bevillingPrimaerKlasseBrugervendtNoegle";

    private static final String BEVILLING_PRIMAER_KLASSE_KlASSETITEL = "bevillingPrimaerKlasseKlassetitel";

    private static final String BEVILLING_PRIMAER_KLASSE_ROlLE_UUID = "bevillingPrimaerKlasseRolleUuid";

    private static final String BEVILLING_KLASSE_TYPE_UUID = "bevillingKlasseTypeUuid";

    private static final String BEVILLING_PRIMAER_KLASSE_INDEKS = "bevillingPrimaerKlasseIndeks";

    private static final String BEVILLING_PRIMAER_KLASSE_REFERENCE_ID = "bevillingPrimaerKlasseReferenceId";

    private static final String BEVILLINGS_SAG_BRUGERVENDT_NOEGLE = "bevillingssagBrugervendtNoegle";

    private static final String BEVILLINGS_SAG_FULDT_NAVN = "bevillingssagFuldtNavn";

    private static final String BEVILLINGS_SAG_STARTDATO = "bevillingssagStartdato";

    private static final String BEVILLING_AKTOER_REF = "bevillingAktoerRef";

    private static final String BEVILLINGS_SAG_ROLLE_UUID = "bevillingssagRolleUuid";

    private static final String BEVILLINGS_SAG_TYPE_UUID = "bevillingssagTypeUuid";

    private static final String BEVILLINGS_PART_BRUGERVENDT_NOEGLE = "bevillingspartBrugervendtNoegle";

    private static final String YDELSESMODTAGER_FULDT_NAVN = "ydelsesmodtagerFuldtNavn";

    private static final String BEVILLINGS_PART_STARTDATO = "bevillingspartStartdato";

    private static final String BEVILLING_YDELSESMODTAGER_ROLLE_UUID = "bevillingYdelsesmodtagerRolleUuid";

    private static final String BEVILLING_YDELSESMODTAGER_TYPE_UUID = "bevillingYdelsesmodtagerTypeUuid";

    private static final String YDELSESMODTAGER_INDEKS = "ydelsesmodtagerIndeks";

    private static final String YDELSESMODTAGER_REFERENCE_ID = "ydelsesmodtagerReferenceId";

    private static final String BEVILLING_EJER_FULDT_NAVN = "bevillingEjerFuldtNavn";

    private static final String YDELSESMODTAGER_VIRKNING_FRA = "ydelsesmodtagerVirkningFra";

    private static final String YDELSESMODTAGER_AKTOER_REF = "ydelsesmodtagerAktoerRef";

    private static final String EFFEKTUERINGS_PLAN_ID = "effektueringsplanID";

    private static final String BEVILLING_EJER_CVR_NR = "bevillingEjerCvrNr";

    private static final String BEVILLING_EJER_STARTDATO = "bevillingEjerStartdato";

    private static final String BEVILLING_EJER_SLUTDATO = "bevillingEjerSlutdato";

    private static final String BEVILLING_EJER_ROLLE_ID = "bevillingEjerRolleUuid";

    private static final String BEVILLING_EJER_TYPE_UUID = "bevillingEjerTypeUuid";

    private static final String BEVILLING_EJER_REFERENCE_ID = "bevillingEjerReferenceId";

    private static final String BEVILLING_ANSVARLIG_FULDT_NAVN = "bevillingAnsvarligFuldtNavn";

    private static final String BEVILLING_ANSVARLIG_CVR_NR = "bevillingAnsvarligCvrNr";

    private static final String BEVILLING_ANSVARLIG_STARTDATO= "bevillingAnsvarligStartdato";

    private static final String BEVILLING_ANSVARLIG_ROLLE_UUID = "bevillingAnsvarligRolleUuid";

    private static final String BEVILLING_ANSVARLIG_TYPE_UUID = "bevillingAnsvarligTypeUuid";

    private static final String BEVILLING_ANSVARLIG_INDEKS = "bevillingAnsvarligIndeks";

    private static final String BEVILLING_ANSVARLIG_REFERENCE_ID = "bevillingAnsvarligReferenceId";

    private static final String BEVILLING_LIVSCYKLUS_KODE = "bevillingLivscykluskode";

    private static final String EFFEKTUERING_UUID_IDENTIFIKATOR = "effektueringUUIDIdentifikator";

    private static final String EFFEKTUERING_EGENSKABER_VIRKNING_FRA = "effektueringEgenskaberVirkningFra";

    private static final String EFFEKTUERING_EGENSKABER_AKTOER_REF = "effektueringEgenskaberAktoerRef";

    private static final String EFFEKTUERING_EGENSKABER_BRUGERVENDT_NOEGLE = "effektueringEgenskaberBrugervendtNoegle";

    private static final String EFFEKTUERING_EGENSKABER_STARTDATO = "effektueringEgenskaberStartdato";

    private static final String EFFEKTUERING_EGENSKABER_SLUTDATO = "effektueringEgenskaberSlutdato";

    private static final String EFFEKTUERING_EGENSKABER_SAMLET_BRUTTOBELOEB = "effektueringEgenskaberSamletBruttobeloeb";

    private static final String EFFEKTUERING_EGENSKABER_DISPOSITIONSDATO = "effektueringEgenskaberDispositionsdato";

    private static final String EFFEKTUERING_EGENSKABER_BELOEB_EFTER_SKAT_ATP = "effektueringEgenskaberBeloebEfterSkatATP";

    private static final String EFFEKTUERING_EGENSKABER_BELOEB_SENDT_TIL_UDBETALING = "effektueringEgenskaberBeloebSendtTilUdbetaling";

    private static final String EFFEKTUERING_EGENSKABER_UDBETALINGSAFDELING = "effektueringEgenskaberUdbetalingsafdeling";

    private static final String YDELSEEFFEKTUERING_VIRKNING_FRA = "ydelseseffektueringVirkningFra";

    private static final String YDELSEEFFEKTUERING_AKTOER_REF = "ydelseseffektueringAktoerRef";

    private static final String YDELSEEFFEKTUERING_ROLLE_UUID = "ydelseseffektueringRolleUuid";

    private static final String YDELSEEFFEKTUERING_TYPE_UUID = "ydelseseffektueringTypeUuid";

    private static final String YDELSEEFFEKTUERING_INDEKS = "ydelseseffektueringIndeks";

    private static final String YDELSEEFFEKTUERING_REFERENCE_ID = "ydelseseffektueringReferenceId";

    private static final String YDELSEEFFEKTUERING_YDELSESPERIODE_STARTDATO = "ydelseseffektueringYdelsesperiodeStartdato";

    private static final String YDELSEEFFEKTUERING_YDELSESPERIODE_SLUTDATO = "ydelseseffektueringYdelsesperiodeSlutdato";

    private static final String YDELSEEFFEKTUERING_YDELSESBELOEB = "ydelseseffektueringYdelsesbeloeb";

    private static final String YDELSEEFFEKTUERING_KLASSIFIKATIONSBESKRIVELSE = "ydelseseffektueringKlassifikationsbeskrivelse";

    private static final String YDELSEEFFEKTUERING_BEVILGET_YDELSE_REF_UUID_IDENTIFIKATOR = "ydelseseffektueringBevilgetYdelseRefUUIDIdentifikator";

    private static final String YDELSEEFFEKTUERING_BEVILGET_YDELSE_REF_BEVILGET_YDELSE_ID = "ydelseseffektueringBevilgetYdelseRefBevilgetYdelseId";

    private static final String EFFEKTUERING_EJER_FULDT_NAVN = "effektueringEjerFuldtNavn";

    private static final String EFFEKTUERING_EJER_CVR_NR = "effektueringEjerCVRNr";

    private static final String EFFEKTUERING_EJER_VIRKNING_FRA = "effektueringEjerVirkningFra";

    private static final String EFFEKTUERING_EJER_AKTOER_REF = "effektueringEjerAktoerRef";

    private static final String EFFEKTUERING_EJER_ROLLE_UUID = "effektueringEjerRolleUuid";

    private static final String EFFEKTUERING_EJER_TYPE_UUID = "effektueringEjerTypeUuid";

    private static final String EFFEKTUERING_EJER_REFERENCE_ID = "effektueringEjerReferenceID";

    private static final String EFFEKTUERINGS_MODTAGER_FULDT_NAVN = "effektueringsmodtagerFuldtNavn";

    private static final String EFFEKTUERINGS_MODTAGER_VIRKNING_FRA = "effektueringsmodtagerVirkningfra";

    private static final String EFFEKTUERINGS_MODTAGER_AKTOER_REF = "effektueringsmodtagerAktoerRef";

    private static final String EFFEKTUERINGS_MODTAGER_ROLLE_UUID = "effektueringModtagerRolleUuid";

    private static final String EFFEKTUERINGS_MODTAGER_TYPE_UUID = "effektueringModtagerTypeUuid";

    private static final String EFFEKTUERINGS_MODTAGER_REFERENCE_ID = "effektueringsmodtagerReferenceId";

    private static final String YDELSE_LIVSCYKLUS_KODE = "ydelseLivscyklusKode";

    private static final String YDELSE_AKTOER_REF = "ydelseAktoerRef";

    private static final String YDELSE_ROLLE_UUID = "YdelseRolleUuid";

    private static final String YDELSE_TYPE_UUID = "YdelseTypeUuid";

    private static final String YDELSE_INDEKS = "ydelseIndeks";

    private static final String YDELSE_REFERENCE_ID = "YdelseReferenceId";



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
    public String getYdelsesIndeksEndpointUrl (){
        return properties.getProperty(YDELSE_INDEKS_ENDPOINT_URL);
    }
    public String getBevillingIndeksEndpointUrl (){
        return properties.getProperty(BEVILLING_INDEKS_ENDPOINT_URL);
    }
    public String getOekonomiskEffektueringIndeksEndpointUrl (){
        return properties.getProperty(OEKONOMISKEFFEKTUERING_INDEKS_ENDPOINT_URL);
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

    public String getOrganisationsEnhedUuid() {
        return properties.getProperty(ORGANISATIONS_ENHED_UUID);
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

    public String getBehandlingsarkivRolleUuid() {
        return properties.getProperty(BEHANDLINGSARKIV_ROLLE_UUID);
    }
    public String getArkivTypeUuid() {
        return properties.getProperty(ARKIV_TYPE_UUID);
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

    public String getBevillingUUIDIdentifikator() { return properties.getProperty(BEVILLING_UUID_IDENTIFIKATOR); }

    public String getBevillingsEgenskaberAktoerRef() { return properties.getProperty(BEVILLINGS_EGENSKABER_AKTOER_REF); }

    public String getBevillingsegenskaberAktoerTypeKode() { return properties.getProperty(BEVILLINGS_EGENSKABER_AKTOER_TYPE_KODE); }

    public String getBevillingsegenskaberBrugervendtnoegle() { return properties.getProperty(BEVILLINGS_EGENSKABER_BRUGERVENDT_NOEGLE); }

    public String getBevillingsegenskaberFoelsomhed() { return properties.getProperty(BEVILLINGS_EGENSKABER_FOELSOMHED); }

    public String getBevillingsegenskaberVirkningFra() { return properties.getProperty(BEVILLINGS_EGENSKABER_VIRKNING_FRA); }

    public String getBevilgetYdelseVirkningFra() { return properties.getProperty(BEVILGET_YDELSE_VIRKNING_FRA); }

    public String getBevilgetYdelseAktoerRef() { return properties.getProperty(BEVILGET_YDELSE_AKTOER_REF); }

    public String getBevilgetYdelseAktoerTypeKode() { return properties.getProperty(BEVILGET_YDELSE_AKTOER_TYPE_KODE); }

    public String getBevilgetYdelseID() { return properties.getProperty(BEVILGET_YDELSE_ID); }

    public String getBevilgetYdelseNavn() { return properties.getProperty(BEVILGET_YDELSE_NAVN); }

    public String getBevilgetYdelseStardato() { return properties.getProperty(BEVILGET_YDELSE_STARTDATO); }

    public String getBevilgetYdelseSlutdato() { return properties.getProperty(BEVILGET_YDELSE_SLUTDATO); }

    public String getYdelseYdelsesnavn() { return properties.getProperty(YDELSE_YDELSES_NAVN); }

    public String getBevillingPrimaerKlasseBrugervendtNoegle() { return properties.getProperty(BEVILLING_PRIMAER_KLASSE_BRUGERVENDT_NOEGLE); }

    public String getBevillingPrimaerKlasseKlassetitel() { return properties.getProperty(BEVILLING_PRIMAER_KLASSE_KlASSETITEL); }

    public String getBevillingPrimaerKlasseRolleUuid() { return properties.getProperty(BEVILLING_PRIMAER_KLASSE_ROlLE_UUID); }

    public String getBevillingKlasseTypeUuid() { return properties.getProperty(BEVILLING_KLASSE_TYPE_UUID); }

    public String getBevillingPrimaerKlasseIndeks() { return properties.getProperty(BEVILLING_PRIMAER_KLASSE_INDEKS); }

    public String getBevillingPrimaerKlasseReferenceId() { return properties.getProperty(BEVILLING_PRIMAER_KLASSE_REFERENCE_ID); }

    public String getEffektueringsplanID() { return properties.getProperty(EFFEKTUERINGS_PLAN_ID); }

    public String getBevillingssagBrugervendtNoegle() { return properties.getProperty(BEVILLINGS_SAG_BRUGERVENDT_NOEGLE); }

    public String getBevillingssagFuldtNavn() { return properties.getProperty(BEVILLINGS_SAG_FULDT_NAVN); }

    public String getBevillingssagStartdato() { return properties.getProperty(BEVILLINGS_SAG_STARTDATO); }

    public String getBevillingAktoerRef() { return properties.getProperty(BEVILLING_AKTOER_REF); }

    public String getBevillingssagRolleUuid() { return properties.getProperty(BEVILLINGS_SAG_ROLLE_UUID); }

    public String getBevillingssagTypeUuid() { return properties.getProperty(BEVILLINGS_SAG_TYPE_UUID); }

    public String getBevillingspartBrugervendtNoegle() { return properties.getProperty(BEVILLINGS_PART_BRUGERVENDT_NOEGLE); }

    public String getYdelsesmodtagerFuldtNavn() { return properties.getProperty(YDELSESMODTAGER_FULDT_NAVN); }

    public String getBevillingspartStartdato() { return properties.getProperty(BEVILLINGS_PART_STARTDATO); }

    public String getBevillingYdelsesmodtagerRolleUuid() { return properties.getProperty(BEVILLING_YDELSESMODTAGER_ROLLE_UUID); }

    public String getBevillingYdelsesmodtagerTypeUuid() { return properties.getProperty(BEVILLING_YDELSESMODTAGER_TYPE_UUID); }

    public String getYdelsesmodtagerIndeks() { return properties.getProperty(YDELSESMODTAGER_INDEKS); }

    public String getYdelsesmodtagerReferenceId() { return properties.getProperty(YDELSESMODTAGER_REFERENCE_ID); }

    public String getBevillingEjerFuldtNavn() { return properties.getProperty(BEVILLING_EJER_FULDT_NAVN); }

    public String getYdelsesmodtagerVirkningFra() { return properties.getProperty(YDELSESMODTAGER_VIRKNING_FRA); }

    public String getYdelsesmodtagerAktoerRef() { return properties.getProperty(YDELSESMODTAGER_AKTOER_REF); }

    public String getBevillingEjerCvrNr() { return properties.getProperty(BEVILLING_EJER_CVR_NR); }

    public String getBevillingEjerStartdato() { return properties.getProperty(BEVILLING_EJER_STARTDATO); }

    public String getBevillingEjerSlutdato() { return properties.getProperty(BEVILLING_EJER_SLUTDATO); }

    public String getBevillingEjerRolleUuid() { return properties.getProperty(BEVILLING_EJER_ROLLE_ID); }

    public String getBevillingEjerTypeUuid() { return properties.getProperty(BEVILLING_EJER_TYPE_UUID); }

    public String getBevillingEjerReferenceId() { return properties.getProperty(BEVILLING_EJER_REFERENCE_ID); }

    public String getBevillingAnsvarligFuldtNavn() { return properties.getProperty(BEVILLING_ANSVARLIG_FULDT_NAVN); }

    public String getBevillingAnsvarligCvrNr() { return properties.getProperty(BEVILLING_ANSVARLIG_CVR_NR); }

    public String getBevillingAnsvarligStartdato() { return properties.getProperty(BEVILLING_ANSVARLIG_STARTDATO); }

    public String getBevillingAnsvarligRolleUuid() { return properties.getProperty(BEVILLING_ANSVARLIG_ROLLE_UUID); }

    public String getBevillingAnsvarligTypeUuid() { return properties.getProperty(BEVILLING_ANSVARLIG_TYPE_UUID); }

    public String getBevillingAnsvarligIndeks() { return properties.getProperty(BEVILLING_ANSVARLIG_INDEKS); }

    public String getBevillingAnsvarligReferenceId() { return properties.getProperty(BEVILLING_ANSVARLIG_REFERENCE_ID); }

    public String getBevillingLivscykluskode() { return properties.getProperty(BEVILLING_LIVSCYKLUS_KODE); }

    public String getEffektueringUUIDIdentifikator() { return properties.getProperty(EFFEKTUERING_UUID_IDENTIFIKATOR); }

    public String getEffektueringEgenskaberVirkningFra() { return properties.getProperty(EFFEKTUERING_EGENSKABER_VIRKNING_FRA); }

    public String getEffektueringEgenskaberAktoerRef() { return properties.getProperty(EFFEKTUERING_EGENSKABER_AKTOER_REF); }

    public String getEffektueringEgenskaberBrugervendtNoegle() { return properties.getProperty(EFFEKTUERING_EGENSKABER_BRUGERVENDT_NOEGLE); }

    public String getEffektueringEgenskaberStartdato() { return properties.getProperty(EFFEKTUERING_EGENSKABER_STARTDATO); }

    public String getEffektueringEgenskaberSlutdato() { return properties.getProperty(EFFEKTUERING_EGENSKABER_SLUTDATO); }

    public String getEffektueringEgenskaberSamletBruttobeloeb() { return properties.getProperty(EFFEKTUERING_EGENSKABER_SAMLET_BRUTTOBELOEB); }

    public String getEffektueringEgenskaberDispositionsdato() { return properties.getProperty(EFFEKTUERING_EGENSKABER_DISPOSITIONSDATO); }

    public String getEffektueringEgenskaberBeloebEfterSkatATP() { return properties.getProperty(EFFEKTUERING_EGENSKABER_BELOEB_EFTER_SKAT_ATP); }

    public String getEffektueringEgenskaberBeloebSendtTilUdbetaling() { return properties.getProperty(EFFEKTUERING_EGENSKABER_BELOEB_SENDT_TIL_UDBETALING); }

    public String getEffektueringEgenskaberUdbetalingsafdeling() { return properties.getProperty(EFFEKTUERING_EGENSKABER_UDBETALINGSAFDELING); }

    public String getYdelseseffektueringVirkningFra() { return properties.getProperty(YDELSEEFFEKTUERING_VIRKNING_FRA); }

    public String getYdelseseffektueringAktoerRef() { return properties.getProperty(YDELSEEFFEKTUERING_AKTOER_REF); }

    public String getYdelseseffektueringRolleUuid() { return properties.getProperty(YDELSEEFFEKTUERING_ROLLE_UUID); }

    public String getYdelseseffektueringTypeUuid() { return properties.getProperty(YDELSEEFFEKTUERING_TYPE_UUID); }

    public String getYdelseseffektueringIndeks() { return properties.getProperty(YDELSEEFFEKTUERING_INDEKS); }

    public String getYdelseseffektueringReferenceId() { return properties.getProperty(YDELSEEFFEKTUERING_REFERENCE_ID); }

    public String getYdelseseffektueringYdelsesperiodeStartdato() { return properties.getProperty(YDELSEEFFEKTUERING_YDELSESPERIODE_STARTDATO); }

    public String getYdelseseffektueringYdelsesperiodeSlutdato() { return properties.getProperty(YDELSEEFFEKTUERING_YDELSESPERIODE_SLUTDATO); }

    public String getYdelseseffektueringYdelsesbeloeb() { return properties.getProperty(YDELSEEFFEKTUERING_YDELSESBELOEB); }

    public String getYdelseseffektueringKlassifikationsbeskrivelse() { return properties.getProperty(YDELSEEFFEKTUERING_KLASSIFIKATIONSBESKRIVELSE); }

    public String getYdelseseffektueringBevilgetYdelseRefUUIDIdentifikator() { return properties.getProperty(YDELSEEFFEKTUERING_BEVILGET_YDELSE_REF_UUID_IDENTIFIKATOR); }

    public String getYdelseseffektueringBevilgetYdelseRefBevilgetYdelseId() { return properties.getProperty(YDELSEEFFEKTUERING_BEVILGET_YDELSE_REF_BEVILGET_YDELSE_ID); }

    public String getEffektueringEjerFuldtNavn() { return properties.getProperty(EFFEKTUERING_EJER_FULDT_NAVN); }

    public String getEffektueringEjerCVRNr() { return properties.getProperty(EFFEKTUERING_EJER_CVR_NR); }

    public String getEffektueringEjerVirkningFra() { return properties.getProperty(EFFEKTUERING_EJER_VIRKNING_FRA); }

    public String getEffektueringEjerAktoerRef() { return properties.getProperty(EFFEKTUERING_EJER_AKTOER_REF); }

    public String getEffektueringEjerRolleUuid() { return properties.getProperty(EFFEKTUERING_EJER_ROLLE_UUID); }

    public String getEffektueringEjerTypeUuid() { return properties.getProperty(EFFEKTUERING_EJER_TYPE_UUID); }

    public String getEffektueringEjerReferenceID() { return properties.getProperty(EFFEKTUERING_EJER_REFERENCE_ID); }

    public String getEffektueringsmodtagerFuldtNavn() { return properties.getProperty(EFFEKTUERINGS_MODTAGER_FULDT_NAVN); }

    public String getEffektueringsmodtagerVirkningfra() { return properties.getProperty(EFFEKTUERINGS_MODTAGER_VIRKNING_FRA); }

    public String getEffektueringsmodtagerAktoerRef() { return properties.getProperty(EFFEKTUERINGS_MODTAGER_AKTOER_REF); }

    public String getEffektueringModtagerRolleUuid() { return properties.getProperty(EFFEKTUERINGS_MODTAGER_ROLLE_UUID); }

    public String getEffektueringModtagerTypeUuid() { return properties.getProperty(EFFEKTUERINGS_MODTAGER_TYPE_UUID); }

    public String getEffektueringsmodtagerReferenceId() { return properties.getProperty(EFFEKTUERINGS_MODTAGER_REFERENCE_ID); }

    public String getYdelseLivscyklusKode() { return properties.getProperty(YDELSE_LIVSCYKLUS_KODE); }

    public String getYdelseAktoerRef() { return properties.getProperty(YDELSE_AKTOER_REF); }

    public String getYdelseRolleUuid() { return properties.getProperty(YDELSE_ROLLE_UUID); }

    public String getYdelseTypeUuid() { return properties.getProperty(YDELSE_TYPE_UUID); }

    public String getYdelseIndeks() { return properties.getProperty(YDELSE_INDEKS); }

    public String getYdelseReferenceId() { return properties.getProperty(YDELSE_REFERENCE_ID); }
}
