package dk.kombit.samples.ydelsesIndeks;

import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.stoettesystemerne.ydelsesindeks.YdelseIndeksPortType;
import dk.stoettesystemerne.ydelsesindeks.YdelseIndeksService6;
import oio.sagdok._3_0.MultipleOutputType;
import oio.sts.ydelse.bevillingindeks._6.BevillingIndeksType;
import oio.sts.ydelse.bevillingindeks._6.RegistreringType;
import oio.sts.ydelse.oekonomiskeffektueringindeks._6.OekonomiskEffektueringIndeksType;
import oio.sts.ydelse.ydelseindeks._6.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.util.Collection;

public class YdelsesIndeks {
    private static final Logger LOGGER = LoggerFactory.getLogger(YdelsesIndeks.class);

    private final YdelseIndeksPortType ydelseIndeksPortType;

    public YdelsesIndeks() {
        ydelseIndeksPortType = new YdelseIndeksService6().getYdelseIndeks();
        BindingProvider bindingProvider = (BindingProvider) ydelseIndeksPortType;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, ClientProperties.getInstance().getYdelsesIndeksEndpointUrl());
    }

    private static YdelsesIndeks ydelsesIndeks;

    /**
     * Methods that allow other classes to get an instance of YdelsesIndeks
     * to avoid creating multiple instances of the same class
     * If an instance of YdelsesIndeks does not exist, one is created
     *
     * @return Instance of YdelsesIndeks
     */
    public static YdelsesIndeks getYdelsesIndeks() {
        if (ydelsesIndeks == null) {
            ydelsesIndeks = new YdelsesIndeks();
        }
        return ydelsesIndeks;
    }

    public MultipleOutputType importer(Boolean udenNotifikation,
                                       String uuidIdentifikatorBevilling,
                                       RegistreringType bevillingRegistrering,
                                       String uuidIdentifikatorOekonomiskEffektuering,
                                       oio.sts.ydelse.oekonomiskeffektueringindeks._6.RegistreringType oekonomiskEffektueringRegistrering) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        ImporterYdelseIndeksInputType importerYdelseIndeksInputType = new ImporterYdelseIndeksInputType()
                .withBevillingIndeksOrOekonomiskEffektueringIndeks(new oio.sts.ydelse.bevillingindeks._6.ImportInputType()
                        .withBevillingIndeks(new BevillingIndeksType()
                                .withUdenNotifikation(udenNotifikation)
                                .withUUIDIdentifikator(uuidIdentifikatorBevilling)
                                .withRegistrering(bevillingRegistrering)), new oio.sts.ydelse.oekonomiskeffektueringindeks._6.ImportInputType()
                        .withOekonomiskEffektueringIndeks(new OekonomiskEffektueringIndeksType()
                                .withUUIDIdentifikator(uuidIdentifikatorOekonomiskEffektuering)
                                .withRegistrering(oekonomiskEffektueringRegistrering)));

        return ydelseIndeksPortType.importer(requestHeader, importerYdelseIndeksInputType);
    }

    public MultipleOutputType importer(Collection<oio.sts.ydelse.bevillingindeks._6.ImportInputType> bevillingIndeksInputs,
                                       Collection<oio.sts.ydelse.oekonomiskeffektueringindeks._6.ImportInputType> oekonomiskEffektueringInputs) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        ImporterYdelseIndeksInputType importerYdelseIndeksInputType = new ImporterYdelseIndeksInputType()
                .withBevillingIndeksOrOekonomiskEffektueringIndeks(bevillingIndeksInputs)
                .withBevillingIndeksOrOekonomiskEffektueringIndeks(oekonomiskEffektueringInputs);

        return ydelseIndeksPortType.importer(requestHeader, importerYdelseIndeksInputType);
    }

    public MultipleOutputType opdater(OpdaterYdelseIndeksInputType opdaterYdelseIndeksInputType) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        return ydelseIndeksPortType.opdater(requestHeader, opdaterYdelseIndeksInputType);
    }

    public FremsoegYdelseIndeksOutputType fremsoeg(FremsoegYdelseIndeksInputType fremsoegYdelseIndeksInputType) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        return ydelseIndeksPortType.fremsoeg(requestHeader, fremsoegYdelseIndeksInputType);
    }

    public OpdaterYdelseIndeksInputType createOpdaterYdelseIndeksInputTypeOekonomiskEffektuering(
            oio.sts.ydelse.oekonomiskeffektueringindeks._6.AttributListeType attributListe,
            oio.sts.ydelse.oekonomiskeffektueringindeks._6.RelationListeType relationListe,
            oio.sts.ydelse.oekonomiskeffektueringindeks._6.TilstandListeType tilstandListe,
            String uuidIdentifikator,
            String noteTekst) {
        oio.sts.ydelse.oekonomiskeffektueringindeks._6.RetInputType oekonomiskEffektueringRetInputType =
                new oio.sts.ydelse.oekonomiskeffektueringindeks._6.RetInputType()
                        .withAttributListe(attributListe)
                        .withRelationListe(relationListe)
                        .withTilstandListe(tilstandListe)
                        .withUUIDIdentifikator(uuidIdentifikator)
                        .withNoteTekst(noteTekst);
        return new OpdaterYdelseIndeksInputType()
                .withOpdaterBevillingIndeksOrOpdaterOekonomiskEffektueringIndeks(oekonomiskEffektueringRetInputType);
    }

    public OpdaterYdelseIndeksInputType createOpdaterYdelseIndeksInputTypeBevilling(
            oio.sts.ydelse.bevillingindeks._6.AttributListeType attributListe,
            oio.sts.ydelse.bevillingindeks._6.RelationListeType relationListe,
            oio.sts.ydelse.bevillingindeks._6.TilstandListeType tilstandListe,
            String uuidIdentifikator,
            String noteTekst) {
        oio.sts.ydelse.bevillingindeks._6.RetInputType bebillingRetInputType =
                new oio.sts.ydelse.bevillingindeks._6.RetInputType()
                        .withAttributListe(attributListe)
                        .withRelationListe(relationListe)
                        .withTilstandListe(tilstandListe)
                        .withUUIDIdentifikator(uuidIdentifikator)
                        .withNoteTekst(noteTekst);
        return new OpdaterYdelseIndeksInputType()
                .withOpdaterBevillingIndeksOrOpdaterOekonomiskEffektueringIndeks(bebillingRetInputType);
    }

    public FremsoegYdelseIndeksInputType createFremsoegYdelseIndeksInputTypeOekonomiskEffektuering(
            Collection<String> oekonomiskEffektueringUuid,
            FremsoegFilterYdelseIndeksInputType fremsoegFilterYdelseIndeksInputType,
            SoegUdtrykType soegUdtrykType,
            FremsoegSorteringYdelseIndeksInputType fremsoegSorteringYdelseIndeksInputType) {

        return new FremsoegYdelseIndeksInputType()
                .withOekonomiskEffektueringUuid(oekonomiskEffektueringUuid)
                .withFilter(fremsoegFilterYdelseIndeksInputType)
                .withSoegUdtryk(soegUdtrykType)
                .withSortering(fremsoegSorteringYdelseIndeksInputType);
    }

    public FremsoegYdelseIndeksInputType createFremsoegYdelseIndeksInputTypeBevilling(
            Collection<String> bevillingUuid,
            FremsoegFilterYdelseIndeksInputType fremsoegFilterYdelseIndeksInputType,
            SoegUdtrykType soegUdtrykType,
            FremsoegSorteringYdelseIndeksInputType fremsoegSorteringYdelseIndeksInputType) {

        return new FremsoegYdelseIndeksInputType()
                .withBevillingUuid(bevillingUuid)
                .withFilter(fremsoegFilterYdelseIndeksInputType)
                .withSoegUdtryk(soegUdtrykType)
                .withSortering(fremsoegSorteringYdelseIndeksInputType);
    }
}
