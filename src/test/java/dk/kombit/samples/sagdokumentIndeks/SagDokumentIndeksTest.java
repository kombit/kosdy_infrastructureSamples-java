package dk.kombit.samples.sagdokumentIndeks;

import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigInteger;

import oio.sagdok._3_0.MultipleOutputType;
import oio.sts.sagdok.sagdokumentindeks._6.FremsoegSagDokumentIndeksOutputType;

import dk.kombit.samples.utils.ClientProperties;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test class for SagdokumentIndeks
 * The Test uses the variables in client.properties to run the scenarios. This is done to ensure the test is
 * useable for all users despite different properties
 */
class SagDokumentIndeksTest {

    /**
     * Removes any existing case before testing to ensure test of Importer does not fail
     */
    @BeforeEach
    public void cleanUp() {
        SagDokumentIndeks sagDokumentIndeks = SagDokumentIndeks.getSagDokumentIndeks();
        sagDokumentIndeks.fjern(ClientProperties.getInstance().getUuid());
    }

    /**
     * Initializes properties before testing
     */
    @BeforeAll
    public static void initProperties() {
        try{
            ClientProperties clientProperties = ClientProperties.getInstance();

            // getResource only works with / in front of the String
            String keyStoreFile = SagDokumentIndeksTest.class.getResource('/' + clientProperties.getKeystoreFilename()).getFile();

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
     * Test method for SagdokumentIndeks
     * The test ensures that scenarios 1-4 returns Statuskode 20 which equals OK.
     */
    @Test
    @DisplayName("SagdokumentIndeks")
    public void importFremsoegFjern_shouldPassWhithCode20() {
        //Arrange
        SagDokumentIndeks sagDokumentIndeks = SagDokumentIndeks.getSagDokumentIndeks();
        //Act
        MultipleOutputType importerResponseType = sagDokumentIndeks.importer(ClientProperties.getInstance()
                .getUuid());
        FremsoegSagDokumentIndeksOutputType fremsoegResponseType = sagDokumentIndeks.fremsoeg(ClientProperties.getInstance()
                .getUuid());
        MultipleOutputType fjernResponseType = sagDokumentIndeks.fjern(ClientProperties.getInstance()
                .getUuid());
        //Assert
        assertThat(importerResponseType.getUnikRetur().get(0).getStatusKode()).isEqualTo(BigInteger.valueOf(20));
        assertThat(fremsoegResponseType.getStandardRetur().getStatusKode()).isEqualTo(BigInteger.valueOf(20));
        assertThat(fjernResponseType.getUnikRetur().get(0).getStatusKode()).isEqualTo(BigInteger.valueOf(20));
    }
}
