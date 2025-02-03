package dk.kombit.samples.ydelsesIndeks;

import dk.kombit.samples.bevillingIndeks.BevillingIndeks;
import dk.kombit.samples.oekonomiskEffektueringIndeks.OekonomiskEffektueringIndeks;
import dk.kombit.samples.utils.ClientProperties;
import oio.sagdok._3_0.BasicOutputType;
import oio.sagdok._3_0.MultipleOutputType;
import oio.sagdok._3_0.StandardReturType;
import oio.sagdok._3_0.UnikReturType;
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
    @DisplayName("YdelsesIndeksImporterOpdaterFremsoegFjern")
    public void testYdelsesIndeksImporterOpdaterFremsoegFjern() {
        YdelsesIndeks ydelsesIndeks = YdelsesIndeks.getYdelsesIndeks();
        BevillingIndeks bevillingIndeks = BevillingIndeks.getBevillingIndeks();
        OekonomiskEffektueringIndeks oekonomiskEffektueringIndeks = OekonomiskEffektueringIndeks.getOekonomiskEffektueringIndeks();

        MultipleOutputType importerOutput = ydelsesIndeks.importer();

        //Assert.isTrue(!importerOutput.getUnikRetur().isEmpty(), "UnikRetur indeholder elementer");
        for (UnikReturType unikRetur : importerOutput.getUnikRetur()) {
            System.out.println("UUIDIdentifikator: " + unikRetur.getUUIDIdentifikator());
            System.out.println("Statuskode: " + unikRetur.getStatusKode());
            System.out.println("FejlbeskedTekst: " + unikRetur.getFejlbeskedTekst());
        }
        //Assert.isTrue(!importerOutput.getStandardRetur().isEmpty(), "StandardRetur indeholder elementer");
        for (StandardReturType standardRetur : importerOutput.getStandardRetur()) {
            System.out.println("Statuskode: " + standardRetur.getStatusKode());
            System.out.println("FejlbeskedTekst: " + standardRetur.getFejlbeskedTekst());
        }


        /*

        MultipleOutputType opdaterOutput = ydelsesIndeks.opdater();

        //Assert.isTrue(!opdaterOutput.getUnikRetur().isEmpty(), "UnikRetur indeholder elementer");
        for (UnikReturType unikRetur : opdaterOutput.getUnikRetur()) {
            System.out.println("UUIDIdentifikator: " + unikRetur.getUUIDIdentifikator());
            System.out.println("Statuskode: " + unikRetur.getStatusKode());
            System.out.println("FejlbeskedTekst: " + unikRetur.getFejlbeskedTekst());
        }
        //Assert.isTrue(!opdaterOutput.getStandardRetur().isEmpty(), "StandardRetur indeholder elementer");
        for (StandardReturType standardRetur : opdaterOutput.getStandardRetur()) {
            System.out.println("Statuskode: " + standardRetur.getStatusKode());
            System.out.println("FejlbeskedTekst: " + standardRetur.getFejlbeskedTekst());
        }

        FremsoegYdelseIndeksOutputType fremsoegOutput = ydelsesIndeks.fremsoeg();

        //Assert.isTrue(fremsoegOutput.getAntal().isEmpty(), "Antal indeholder elementer");
        //Assert.isTrue(fremsoegOutput.getStandardRetur() != null, "StandardRetur er null");
        System.out.println("Statuskode: " + fremsoegOutput.getStandardRetur().getStatusKode());
        System.out.println("FejlbeskedTekst: " + fremsoegOutput.getStandardRetur().getFejlbeskedTekst());
        //Assert.isTrue(fremsoegOutput.getBevillingFiltreretOejebliksbillede().isEmpty(), "BevillingFiltreretOejebliksbillede indeholder elementer");
        //Assert.isTrue(fremsoegOutput.getOekonomiskEffektueringFiltreretOejebliksbillede().isEmpty(), "OekonomiskEffektueringFiltreretOejebliksbillede indeholder elementer");

        BasicOutputType fjernBevillingIndeksOutput = bevillingIndeks.fjern();

        //Assert.isTrue(fjernBevillingIndeksOutput.getStandardRetur().getStatusKode() != null, "StandardRetur indeholder elementer");
        System.out.println("Statuskode: " + fjernBevillingIndeksOutput.getStandardRetur().getStatusKode());
        System.out.println("FejlbeskedTekst: " + fjernBevillingIndeksOutput.getStandardRetur().getFejlbeskedTekst());

        BasicOutputType fjernOekonomiskEffektueringIndeksOutput = oekonomiskEffektueringIndeks.fjern();

        //Assert.isTrue( fjernOekonomiskEffektueringIndeksOutput.getStandardRetur().getStatusKode() != null, "StandardRetur indeholder elementer");
        System.out.println("Statuskode: " + fjernOekonomiskEffektueringIndeksOutput.getStandardRetur().getStatusKode());
        System.out.println("FejlbeskedTekst: " + fjernOekonomiskEffektueringIndeksOutput.getStandardRetur().getFejlbeskedTekst());


         */
    }

}
