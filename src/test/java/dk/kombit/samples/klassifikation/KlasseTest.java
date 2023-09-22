package dk.kombit.samples.klassifikation;

import dk.kombit.samples.Example;
import dk.kombit.samples.utils.ClientProperties;
import oio.sagdok._3_0.SoegOutputType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test class for Klassifikation
 * The Test uses the variables in client.properties to run the scenarios. This is done to ensure the test is
 * useable for all users despite different properties
 */
class KlasseTest {

    /**
     * Initializes properties before testing
     */
    @BeforeAll
    private static void initProperties() {
        try{
            ClientProperties clientProperties = ClientProperties.getInstance();

            // getResource only works with / in front of the String
            String keyStoreFile = KlasseTest.class.getResource('/' + clientProperties.getKeystoreFilename()).getFile();

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

    /**
     * Test method for Klassifikation
     * The test ensures that scenarios 6 returns Statuskode 20 which equals OK
     */
    @Test
    @DisplayName("Klassifikation")
    public void soegKlasse_ShouldPassWithCode20() {
        //Arrange
        Klasse klassifikation = Klasse.getKlassifikation();
        //Act
        SoegOutputType soegOutputKle_Klasse = klassifikation.soegKlasse(ClientProperties.getInstance().getKleKlasse());
        SoegOutputType soegOutput_KleHandlingsfacet = klassifikation.soegKlasse(ClientProperties.getInstance().getKleHandlingsfacet());
        //Assert
        assertThat(soegOutputKle_Klasse.getStandardRetur().getStatusKode()).isEqualTo(BigInteger.valueOf(20));
        assertThat(soegOutput_KleHandlingsfacet.getStandardRetur().getStatusKode()).isEqualTo(BigInteger.valueOf(20));
    }
}