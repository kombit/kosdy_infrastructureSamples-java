package dk.kombit.samples.organisation;

import dk.kombit.samples.utils.ClientProperties;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test class for Organisation
 * The Test uses the variables in client.properties to run the scenarios. This is done to ensure the test is
 * useable for all users despite different properties
 */
class OrganisationTest {

    /**
     * Initializes properties before testing
     */
    @BeforeAll
    private static void initProperties() {
        try{
            ClientProperties clientProperties = ClientProperties.getInstance();

            // getResource only works with / in front of the String
            String keyStoreFile = OrganisationTest.class.getResource('/' + clientProperties.getKeystoreFilename()).getFile();

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
     *  Test method for Organisation
     *  The test ensures that scenarios 5 returns does not returns null values when searching for the Organisation.
     */
    @Test
    @DisplayName("Organisation")
    public void getOrganisationByCVR_ShouldPassWithoutReturningNull() {
        //Arrange
        Organisation organisation = Organisation.getOrganisation();
        //Act
        String[] organisationByCvr = organisation.getOrganisationByCvr(ClientProperties.getInstance().getMyndighedCvr());
        //Assert
        Assertions.assertNotNull(organisationByCvr[0]);
        Assertions.assertNotNull(organisationByCvr[1]);
        Assertions.assertNotNull(organisationByCvr[2]);
    }
}