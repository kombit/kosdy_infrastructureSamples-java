package dk.kombit.samples;

import dk.kombit.samples.klassifikation.Klasse;
import dk.kombit.samples.organisation.Organisation;
import dk.kombit.samples.sagdokumentIndeks.SagDokumentIndeks;
import dk.kombit.samples.userinterface.UserInterface;
import dk.kombit.samples.utils.ClientProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class Example {

    private static final Logger LOGGER = LoggerFactory.getLogger(Example.class);

    static {

        try{
            ClientProperties clientProperties = ClientProperties.getInstance();

            // getResource only works with / in front of the String
            String keyStoreFile = Example.class.getResource('/' + clientProperties.getKeystoreFilename()).getFile();

            // Uncomment the line below to get more debugging info
            // System.setProperty("javax.net.debug", "ssl");

            // CXF uses Java built-in methods to sign requests to the token service, so we have to give Java our certificate
            System.setProperty("javax.net.ssl.keyStore", keyStoreFile);
            System.setProperty("javax.net.ssl.keyStorePassword", clientProperties.getKeystorePassword());

            // Set to avoid warnings
            System.setProperty("javax.xml.soap.SAAJMetaFactory", "com.sun.xml.messaging.saaj.soap.SAAJMetaFactoryImpl");
        } catch (NullPointerException e) {
            LOGGER.error("KeyStore not found");
            System.exit(0);
        }

    }

    /**
     * These code examples are developed using Java Development Kit 11.0.5.
     *
     * @throws IOException
     */
    private void run() throws IOException {
        Klasse klassifikation = Klasse.getKlassifikation();
        SagDokumentIndeks sagDokumentIndeks = SagDokumentIndeks.getSagDokumentIndeks();
        Organisation organisation = Organisation.getOrganisation();
        UserInterface userInterface = new UserInterface();
        boolean run = true;
        while (run) {
            run = userInterface.showUserInterface(sagDokumentIndeks, klassifikation, organisation);
        }
    }

    /**
     * Main method of the examples
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        new Example().run();
    }
}
