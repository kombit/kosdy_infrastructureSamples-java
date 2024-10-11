package dk.kombit.samples.ydelsesIndeks;

import dk.kombit.samples.utils.ClientProperties;
import dk.kombit.samples.utils.SoapUtils;
import dk.kombit.xml.schemas.requestheader._1.RequestHeaderType;
import dk.stoettesystemerne.ydelsesindeks.YdelseIndeksPortType;
import dk.stoettesystemerne.ydelsesindeks.YdelseIndeksService6;
import oio.sagdok._3_0.*;
import oio.sts.generelledefinitioner._6.LokalUdvidelseListeType;
import oio.sts.ydelse.ydelseindeks._6.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.Holder;
import java.util.*;

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

    public MultipleOutputType importer(String uuidIdentifikatorBevilling,
                                       String uuidIdentifikatorOekonomiskEffektuering) {
        Holder<RequestHeaderType> requestHeader = SoapUtils.getRequestHeader();

        ImporterYdelseIndeksInputType importerYdelseIndeksInputType = new ImporterYdelseIndeksInputType()
                .withBevillingIndeksOrOekonomiskEffektueringIndeks(new oio.sts.ydelse.bevillingindeks._6.ImportInputType()
                        .withBevillingIndeks(new oio.sts.ydelse.bevillingindeks._6.BevillingIndeksType()
                                .withUdenNotifikation(true)
                                .withUUIDIdentifikator(uuidIdentifikatorBevilling)
                                .withRegistrering(new oio.sts.ydelse.bevillingindeks._6.RegistreringType()
                                        .withAttributListe(new oio.sts.ydelse.bevillingindeks._6.AttributListeType()
                                                .withEgenskaber(List.of(new oio.sts.ydelse.bevillingindeks._6.EgenskaberType()
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withAktoerTypeKode(AktoerTypeKodeType.fromValue("ÆØÅ"))
                                                                .withNoteTekst("ÆØÅ")
                                                        )
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withBevillingstartdato("ÆØÅ")
                                                        .withBevillingslutdato("ÆØÅ")
                                                        .withBegrundelse("ÆØÅ")
                                                        .withFoelsomhed(oio.sts.ydelse.bevillingindeks._6.FoelsomhedType.fromValue("ÆØÅ"))))
                                                .withBevilgetYdelse(List.of(new oio.sts.ydelse.bevillingindeks._6.BevilgetYdelseType()
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withAktoerTypeKode(AktoerTypeKodeType.fromValue("ÆØÅ"))
                                                                .withNoteTekst("ÆØÅ")
                                                        )
                                                        .withId("ÆØÅ")
                                                        .withNavn("ÆØÅ")
                                                        .withBevilgetYdelseStartdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withBevilgetYdelseSlutdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withBegrundelse("ÆØÅ")
                                                        .withTilbagebetalingspligtig(true)
                                                        .withMeddelelse("ÆØÅ")
                                                        .withItSystem(new oio.sts.ydelse.bevillingindeks._6.ItSystemRelationType()
                                                                .withSystemNavn("ÆØÅ")
                                                                .withSystemURI("ÆØÅ")
                                                                .withRolle(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withType(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withIndeks("ÆØÅ")
                                                                .withReferenceID(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                        .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withAny("ÆØÅ")
                                                                )
                                                        )
                                                        .withYdelse(new oio.sts.ydelse.bevillingindeks._6.YdelseRelationType()
                                                                .withYdelsesnavn("ÆØÅ")
                                                                .withKlassifikation(new oio.sts.ydelse.bevillingindeks._6.BevillingsklasseRelationType()
                                                                        .withBrugervendtNoegle("ÆØÅ")
                                                                        .withKlassetitel("ÆØÅ")
                                                                )
                                                                .withRolle(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withType(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withIndeks("ÆØÅ")
                                                                .withReferenceID(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                                .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                        .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withAny("ÆØÅ")
                                                                )
                                                        )
                                                        .withOekonomiskEffektueringsplan(List.of(new oio.sts.ydelse.bevillingindeks._6.OekonomiskEffektueringsplanType()
                                                                .withId("ÆØÅ")
                                                                .withEffektueringsplanStartdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withEffektueringsplanSlutdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withBeregningsfrekvens("ÆØÅ")
                                                                .withForudBagud("ÆØÅ")
                                                                .withDispositionsdag("ÆØÅ")
                                                                .withYdelsesbeloeb("ÆØÅ")
                                                                .withManueltGodkendes(true)
                                                        )))
                                                )
                                        )
                                        .withTilstandListe(new oio.sts.ydelse.bevillingindeks._6.TilstandListeType()
                                                .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                        .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withAny("ÆØÅ")
                                                )
                                        )
                                        .withRelationListe(new oio.sts.ydelse.bevillingindeks._6.RelationListeType()
                                                .withBevillingssag(List.of(new oio.sts.ydelse.bevillingindeks._6.BevillingIndeksSagRelationType()
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withFuldtNavn("ÆØÅ")
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        ))
                                                )
                                                .withBevillingspart(List.of(new oio.sts.ydelse.bevillingindeks._6.BevillingIndeksPartRelationType()
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withFuldtNavn("ÆØÅ")
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        ))

                                                )
                                                .withBevillingsaktoer(List.of(new oio.sts.ydelse.bevillingindeks._6.BevillingIndeksAktoerRelationType()
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withFuldtNavn("ÆØÅ")
                                                        .withCVRNr("ÆØÅ")
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        ))
                                                )
                                                .withSikkerhedsprofil(List.of(new oio.sts.ydelse.bevillingindeks._6.SikkerhedsprofilRelationType()
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        ))

                                                )
                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                .withAny("ÆØÅ")
                                        ))
                                        .withStsTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                        .withNoteTekst("ÆØÅ")
                                        .withTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                        .withLivscyklusKode(LivscyklusKodeType.fromValue("ÆØÅ"))
                                        .withBrugerRef(new UnikIdType()
                                                .withUUIDIdentifikator("ÆØÅ")
                                                .withURNIdentifikator("ÆØÅ"))
                                )
                        )
                )
                .withBevillingIndeksOrOekonomiskEffektueringIndeks(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.ImportInputType()
                        .withOekonomiskEffektueringIndeks(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.OekonomiskEffektueringIndeksType()
                                .withUUIDIdentifikator(uuidIdentifikatorOekonomiskEffektuering)
                                .withRegistrering(List.of(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.RegistreringType()
                                        .withAttributListe(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.AttributListeType()
                                                .withEgenskaber(List.of(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.EgenskaberType()
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withStartdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withSlutdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withSamletBruttobeloeb("ÆØÅ")
                                                        .withDispositionsdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withBeloebEfterSkatATP("ÆØÅ")
                                                        .withBeloebSendtTilUdbetaling("ÆØÅ")
                                                        .withBeloebUdbetalt("ÆØÅ")
                                                        .withUdbetalingsafdeling("ÆØÅ")
                                                        .withSendtTilUdbetalingTekst("ÆØÅ")
                                                        .withUdbetaltTekst("ÆØÅ")
                                                ))
                                                .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                        .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withAny("ÆØÅ")
                                                )
                                        )
                                        .withTilstandListe(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.TilstandListeType()
                                                .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                        .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withAny("ÆØÅ")
                                                )
                                        )
                                        .withRelationListe(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.RelationListeType()
                                                .withOekonomiskYdelseEffektueringRelation(List.of(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.OekonomiskYdelseEffektueringRelationType()
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        )
                                                        .withYdelsesperiodeStartdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withYdelsesperiodeSlutdato(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withYdelsesbeloeb("ÆØÅ")
                                                        .withKlassifikationsbeskrivelse("ÆØÅ")
                                                        .withBevilgetYdelseRef(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.BevilgetYdelseRefType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withBevilgetYdelseId("ÆØÅ")
                                                        )
                                                ))
                                                .withAktoer(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.OekonomiskEffektueringIndeksAktoerRelationType()
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withFuldtNavn("ÆØÅ")
                                                        .withCVRNr("ÆØÅ")
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        )
                                                )
                                                .withItSystem(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.ItSystemRelationType()
                                                        .withSystemNavn("ÆØÅ")
                                                        .withSystemURI("ÆØÅ")
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        )

                                                )
                                                .withOekonomiskEffektueringPart(new oio.sts.ydelse.oekonomiskeffektueringindeks._6.OekonomiskEffektueringIndeksPartRelationType()
                                                        .withBrugervendtNoegle("ÆØÅ")
                                                        .withFuldtNavn("ÆØÅ")
                                                        .withVirkning(new VirkningType()
                                                                .withFraTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true))
                                                                .withTilTidspunkt(new TidspunktType()
                                                                        .withTidsstempelDatoTid(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                        .withGraenseIndikator(true)
                                                                )
                                                                .withAktoerRef(new UnikIdType()
                                                                        .withUUIDIdentifikator("ÆØÅ")
                                                                        .withURNIdentifikator("ÆØÅ")
                                                                )
                                                        )
                                                        .withRolle(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withType(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withIndeks("ÆØÅ")
                                                        .withReferenceID(new UnikIdType()
                                                                .withUUIDIdentifikator("ÆØÅ")
                                                                .withURNIdentifikator("ÆØÅ")
                                                        )
                                                        .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                                .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                                .withAny("ÆØÅ")
                                                        )

                                                )
                                                .withLokalUdvidelseListe(new LokalUdvidelseListeType()
                                                        .withSenestAendretTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                                        .withAny("ÆØÅ")
                                                )

                                        )
                                        .withStsTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                        .withNoteTekst("ÆØÅ")
                                        .withTidspunkt(SoapUtils.getXmlCalender("ÆØÅ"))
                                        .withLivscyklusKode(LivscyklusKodeType.fromValue("ÆØÅ"))
                                        .withBrugerRef(new UnikIdType()
                                                .withUUIDIdentifikator("ÆØÅ")
                                                .withURNIdentifikator("ÆØÅ")
                                        )
                                ))
                        )
                );

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
