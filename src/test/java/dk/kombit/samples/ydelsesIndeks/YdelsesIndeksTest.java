package dk.kombit.samples.ydelsesIndeks;

import dk.kombit.samples.utils.ClientProperties;
import org.junit.jupiter.api.BeforeAll;

/**
 * Test class for YdelsesIndeks
 * The Test uses the variables in client.properties to run the scenarios. This is done to ensure the test is
 * useable for all users despite different properties
 */
public class YdelsesIndeksTest {
    /**
     * Initializes properties before testing
     */
    @BeforeAll
    public static void initProperties() {
        try{
            ClientProperties clientProperties = ClientProperties.getInstance();

            // getResource only works with / in front of the String
            String keyStoreFile = YdelsesIndeksTest.class.getResource('/' + clientProperties.getKeystoreFilename()).getFile();

            // Uncomment the line below to get more debugging info
            // System.setProperty("javax.net.debug", "ssl");

            // CXF uses Java built-in methods to sign requests to the token service, so we have to give Java our certificate
            System.setProperty("javax.net.ssl.keyStore", keyStoreFile);
            System.setProperty("javax.net.ssl.keyStorePassword", clientProperties.getKeystorePassword());

            // Set to avoid warnings
            System.setProperty("javax.xml.soap.SAAJMetaFactory", "com.sun.xml.messaging.saaj.soap.SAAJMetaFactoryImpl");
        } catch (NullPointerException e) {
            System.exit(0);
        }
    }
}
