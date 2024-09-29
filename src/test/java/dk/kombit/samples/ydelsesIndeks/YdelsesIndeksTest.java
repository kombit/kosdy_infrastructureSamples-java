package dk.kombit.samples.ydelsesIndeks;

import dk.kombit.samples.utils.ClientProperties;
import oio.sagdok._3_0.MultipleOutputType;
import oio.sts.ydelse.ydelseindeks._6.FremsoegYdelseIndeksInputType;
import oio.sts.ydelse.ydelseindeks._6.FremsoegYdelseIndeksOutputType;
import oio.sts.ydelse.ydelseindeks._6.OpdaterYdelseIndeksInputType;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    @DisplayName("YdelsesIndeksImporter")
    public void testYdelsesIndeksImporter() {
        YdelsesIndeks ydelsesIndeks = YdelsesIndeks.getYdelsesIndeks();

        List<oio.sts.ydelse.bevillingindeks._6.ImportInputType> importInputTypesBevilling = new ArrayList<>();
        List<oio.sts.ydelse.oekonomiskeffektueringindeks._6.ImportInputType> importInputTypesOekonomiskeffektuering = new ArrayList<>();

        MultipleOutputType importerOutput = ydelsesIndeks.importer(importInputTypesBevilling, importInputTypesOekonomiskeffektuering);

        Assert.isTrue(!importerOutput.getUnikRetur().isEmpty(), "UnikRetur indeholder elementer");
        Assert.isTrue(!importerOutput.getStandardRetur().isEmpty(), "StandardRetur indeholder elementer");
    }

    @Test
    @DisplayName("YdelsesIndeksOpdater")
    public void testYdelsesIndeksOpdater() {
        YdelsesIndeks ydelsesIndeks = YdelsesIndeks.getYdelsesIndeks();

        OpdaterYdelseIndeksInputType opdaterYdelseIndeksInputType = new OpdaterYdelseIndeksInputType();

        MultipleOutputType opdaterOutput = ydelsesIndeks.opdater(opdaterYdelseIndeksInputType);

        Assert.isTrue(!opdaterOutput.getUnikRetur().isEmpty(), "UnikRetur indeholder elementer");
        Assert.isTrue(!opdaterOutput.getStandardRetur().isEmpty(), "StandardRetur indeholder elementer");
    }

    @Test
    @DisplayName("YdelsesIndeksOpdaterInkremental")
    public void testYdelsesIndeksOpdaterInkremental() {
        YdelsesIndeks ydelsesIndeks = YdelsesIndeks.getYdelsesIndeks();

        OpdaterYdelseIndeksInputType opdaterYdelseIndeksInputType = new OpdaterYdelseIndeksInputType();

        MultipleOutputType opdaterOutput = ydelsesIndeks.opdater(opdaterYdelseIndeksInputType);

        Assert.isTrue(!opdaterOutput.getUnikRetur().isEmpty(), "UnikRetur indeholder elementer");
        Assert.isTrue(!opdaterOutput.getStandardRetur().isEmpty(), "StandardRetur indeholder elementer");
    }

    @Test
    @DisplayName("YdelsesIndeksFremsoeg")
    public void testYdelsesIndeksFremsoeg() {
        YdelsesIndeks ydelsesIndeks = YdelsesIndeks.getYdelsesIndeks();

        FremsoegYdelseIndeksInputType fremsoegYdelseIndeksInputType = new FremsoegYdelseIndeksInputType();

        FremsoegYdelseIndeksOutputType fremsoegOutput = ydelsesIndeks.fremsoeg(fremsoegYdelseIndeksInputType);

        Assert.isTrue(!fremsoegOutput.getAntal().isEmpty(), "Antal indeholder elementer");
        Assert.isTrue(fremsoegOutput.getStandardRetur() != null, "StandardRetur er ikke null");
        Assert.isTrue(!fremsoegOutput.getBevillingFiltreretOejebliksbillede().isEmpty(), "BevillingFiltreretOejebliksbillede indeholder elementer");
        Assert.isTrue(!fremsoegOutput.getOekonomiskEffektueringFiltreretOejebliksbillede().isEmpty(), "OekonomiskEffektueringFiltreretOejebliksbillede indeholder elementer");
    }
}
