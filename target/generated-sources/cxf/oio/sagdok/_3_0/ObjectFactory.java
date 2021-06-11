
package oio.sagdok._3_0;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oio.sagdok._3_0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImportInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "ImportInput");
    private final static QName _UuidNoteInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "UuidNoteInput");
    private final static QName _OpretInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "OpretInput");
    private final static QName _OpretOutput_QNAME = new QName("urn:oio:sagdok:3.0.0", "OpretOutput");
    private final static QName _BasicOutput_QNAME = new QName("urn:oio:sagdok:3.0.0", "BasicOutput");
    private final static QName _RetInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "RetInput");
    private final static QName _LaesInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "LaesInput");
    private final static QName _ListInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "ListInput");
    private final static QName _ListOutput_QNAME = new QName("urn:oio:sagdok:3.0.0", "ListOutput");
    private final static QName _SoegInput_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegInput");
    private final static QName _FoersteResultatReference_QNAME = new QName("urn:oio:sagdok:3.0.0", "FoersteResultatReference");
    private final static QName _MaksimalAntalKvantitet_QNAME = new QName("urn:oio:sagdok:3.0.0", "MaksimalAntalKvantitet");
    private final static QName _SoegOutput_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegOutput");
    private final static QName _NoteTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "NoteTekst");
    private final static QName _UUIDIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "UUIDIdentifikator");
    private final static QName _VirkningFraFilter_QNAME = new QName("urn:oio:sagdok:3.0.0", "VirkningFraFilter");
    private final static QName _VirkningTilFilter_QNAME = new QName("urn:oio:sagdok:3.0.0", "VirkningTilFilter");
    private final static QName _RegistreringFraFilter_QNAME = new QName("urn:oio:sagdok:3.0.0", "RegistreringFraFilter");
    private final static QName _RegistreringTilFilter_QNAME = new QName("urn:oio:sagdok:3.0.0", "RegistreringTilFilter");
    private final static QName _SoegSagDokObjekt_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegSagDokObjekt");
    private final static QName _IdListe_QNAME = new QName("urn:oio:sagdok:3.0.0", "IdListe");
    private final static QName _Adresser_QNAME = new QName("urn:oio:sagdok:3.0.0", "Adresser");
    private final static QName _Ansatte_QNAME = new QName("urn:oio:sagdok:3.0.0", "Ansatte");
    private final static QName _Branche_QNAME = new QName("urn:oio:sagdok:3.0.0", "Branche");
    private final static QName _Interessefaellesskabstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "Interessefaellesskabstype");
    private final static QName _Myndighed_QNAME = new QName("urn:oio:sagdok:3.0.0", "Myndighed");
    private final static QName _Myndighedstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "Myndighedstype");
    private final static QName _TilknyttedeOpgaver_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeOpgaver");
    private final static QName _Opgaver_QNAME = new QName("urn:oio:sagdok:3.0.0", "Opgaver");
    private final static QName _Overordnet_QNAME = new QName("urn:oio:sagdok:3.0.0", "Overordnet");
    private final static QName _Produktionsenhed_QNAME = new QName("urn:oio:sagdok:3.0.0", "Produktionsenhed");
    private final static QName _Skatteenhed_QNAME = new QName("urn:oio:sagdok:3.0.0", "Skatteenhed");
    private final static QName _Tilhoerer_QNAME = new QName("urn:oio:sagdok:3.0.0", "Tilhoerer");
    private final static QName _TilknyttedeBrugere_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeBrugere");
    private final static QName _TilknyttedeEnheder_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeEnheder");
    private final static QName _TilknyttedeFunktioner_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeFunktioner");
    private final static QName _TilknyttedeInteressefaellesskaber_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeInteressefaellesskaber");
    private final static QName _TilknyttedeOrganisationer_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeOrganisationer");
    private final static QName _TilknyttedePersoner_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedePersoner");
    private final static QName _TilknyttedeItSystemer_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeItSystemer");
    private final static QName _Virksomhed_QNAME = new QName("urn:oio:sagdok:3.0.0", "Virksomhed");
    private final static QName _Virksomhedstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "Virksomhedstype");
    private final static QName _StandardRetur_QNAME = new QName("urn:oio:sagdok:3.0.0", "StandardRetur");
    private final static QName _StatusKode_QNAME = new QName("urn:oio:sagdok:3.0.0", "StatusKode");
    private final static QName _FejlbeskedTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "FejlbeskedTekst");
    private final static QName _Tidspunkt_QNAME = new QName("urn:oio:sagdok:3.0.0", "Tidspunkt");
    private final static QName _GraenseIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "GraenseIndikator");
    private final static QName _LaesFiltreretOutput_QNAME = new QName("urn:oio:sagdok:3.0.0", "LaesFiltreretOutput");
    private final static QName _SoegRegistrering_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegRegistrering");
    private final static QName _SoegAdresser_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAdresser");
    private final static QName _SoegAnsatte_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAnsatte");
    private final static QName _SoegBranche_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegBranche");
    private final static QName _SoegMyndighed_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegMyndighed");
    private final static QName _SoegMyndighedstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegMyndighedstype");
    private final static QName _SoegOpgaver_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegOpgaver");
    private final static QName _SoegOverordnet_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegOverordnet");
    private final static QName _SoegProduktionsenhed_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegProduktionsenhed");
    private final static QName _SoegSkatteenhed_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegSkatteenhed");
    private final static QName _SoegTilhoerer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilhoerer");
    private final static QName _SoegTilknyttedeBrugere_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeBrugere");
    private final static QName _SoegTilknyttedeEnheder_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeEnheder");
    private final static QName _SoegTilknyttedeFunktioner_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeFunktioner");
    private final static QName _SoegTilknyttedeInteressefaellesskaber_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeInteressefaellesskaber");
    private final static QName _SoegTilknyttedeOrganisationer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeOrganisationer");
    private final static QName _SoegTilknyttedePersoner_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedePersoner");
    private final static QName _SoegTilknyttedeItSystemer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeItSystemer");
    private final static QName _SoegVirksomhed_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegVirksomhed");
    private final static QName _SoegVirksomhedstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegVirksomhedstype");
    private final static QName _Enhedstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "Enhedstype");
    private final static QName _Organisationstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "Organisationstype");
    private final static QName _SoegEnhedstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegEnhedstype");
    private final static QName _BrugerTyper_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrugerTyper");
    private final static QName _SoegBrugerTyper_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegBrugerTyper");
    private final static QName _SystemTyper_QNAME = new QName("urn:oio:sagdok:3.0.0", "SystemTyper");
    private final static QName _SoegSystemTyper_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegSystemTyper");
    private final static QName _Funktionstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "Funktionstype");
    private final static QName _SoegFunktionstype_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegFunktionstype");
    private final static QName _SagDokObjekt_QNAME = new QName("urn:oio:sagdok:3.0.0", "SagDokObjekt");
    private final static QName _AndreBehandlere_QNAME = new QName("urn:oio:sagdok:3.0.0", "AndreBehandlere");
    private final static QName _AndreKlasser_QNAME = new QName("urn:oio:sagdok:3.0.0", "AndreKlasser");
    private final static QName _AndreSager_QNAME = new QName("urn:oio:sagdok:3.0.0", "AndreSager");
    private final static QName _Ansvarlig_QNAME = new QName("urn:oio:sagdok:3.0.0", "Ansvarlig");
    private final static QName _Arkiv_QNAME = new QName("urn:oio:sagdok:3.0.0", "Arkiv");
    private final static QName _Ejer_QNAME = new QName("urn:oio:sagdok:3.0.0", "Ejer");
    private final static QName _JournalPoster_QNAME = new QName("urn:oio:sagdok:3.0.0", "JournalPoster");
    private final static QName _Parter_QNAME = new QName("urn:oio:sagdok:3.0.0", "Parter");
    private final static QName _PrimaerBehandler_QNAME = new QName("urn:oio:sagdok:3.0.0", "PrimaerBehandler");
    private final static QName _PrimaerKlasse_QNAME = new QName("urn:oio:sagdok:3.0.0", "PrimaerKlasse");
    private final static QName _Praecedens_QNAME = new QName("urn:oio:sagdok:3.0.0", "Praecedens");
    private final static QName _UdlaantTil_QNAME = new QName("urn:oio:sagdok:3.0.0", "UdlaantTil");
    private final static QName _UnderSager_QNAME = new QName("urn:oio:sagdok:3.0.0", "UnderSager");
    private final static QName _SoegAndreBehandlere_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAndreBehandlere");
    private final static QName _SoegAndreKlasser_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAndreKlasser");
    private final static QName _SoegAndreSager_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAndreSager");
    private final static QName _SoegAnsvarlig_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAnsvarlig");
    private final static QName _SoegArkiv_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegArkiv");
    private final static QName _SoegEjer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegEjer");
    private final static QName _SoegJournalPoster_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegJournalPoster");
    private final static QName _SoegParter_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegParter");
    private final static QName _SoegPrimaerBehandler_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegPrimaerBehandler");
    private final static QName _SoegPrimaerKlasse_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegPrimaerKlasse");
    private final static QName _SoegPraecedens_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegPraecedens");
    private final static QName _SoegUdlaantTil_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegUdlaantTil");
    private final static QName _SoegUnderSager_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegUnderSager");
    private final static QName _AndreDokumenter_QNAME = new QName("urn:oio:sagdok:3.0.0", "AndreDokumenter");
    private final static QName _Arkiver_QNAME = new QName("urn:oio:sagdok:3.0.0", "Arkiver");
    private final static QName _Besvarelser_QNAME = new QName("urn:oio:sagdok:3.0.0", "Besvarelser");
    private final static QName _Bilag_QNAME = new QName("urn:oio:sagdok:3.0.0", "Bilag");
    private final static QName _FordeltTil_QNAME = new QName("urn:oio:sagdok:3.0.0", "FordeltTil");
    private final static QName _Kommentarer_QNAME = new QName("urn:oio:sagdok:3.0.0", "Kommentarer");
    private final static QName _KopiParter_QNAME = new QName("urn:oio:sagdok:3.0.0", "KopiParter");
    private final static QName _NyRevision_QNAME = new QName("urn:oio:sagdok:3.0.0", "NyRevision");
    private final static QName _TilknyttedeSager_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilknyttedeSager");
    private final static QName _Udgangspunkter_QNAME = new QName("urn:oio:sagdok:3.0.0", "Udgangspunkter");
    private final static QName _SoegAndreDokumenter_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAndreDokumenter");
    private final static QName _SoegArkiver_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegArkiver");
    private final static QName _SoegBesvarelser_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegBesvarelser");
    private final static QName _SoegBilag_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegBilag");
    private final static QName _SoegFordeltTil_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegFordeltTil");
    private final static QName _SoegKommentarer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegKommentarer");
    private final static QName _SoegKopiParter_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegKopiParter");
    private final static QName _SoegNyRevision_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegNyRevision");
    private final static QName _SoegTilknyttedeSager_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilknyttedeSager");
    private final static QName _SoegUdgangspunkter_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegUdgangspunkter");
    private final static QName _Erstatter_QNAME = new QName("urn:oio:sagdok:3.0.0", "Erstatter");
    private final static QName _Facet_QNAME = new QName("urn:oio:sagdok:3.0.0", "Facet");
    private final static QName _LovligeKombinationer_QNAME = new QName("urn:oio:sagdok:3.0.0", "LovligeKombinationer");
    private final static QName _Mapninger_QNAME = new QName("urn:oio:sagdok:3.0.0", "Mapninger");
    private final static QName _OverordnetKlasse_QNAME = new QName("urn:oio:sagdok:3.0.0", "OverordnetKlasse");
    private final static QName _Redaktoerer_QNAME = new QName("urn:oio:sagdok:3.0.0", "Redaktoerer");
    private final static QName _Sideordnede_QNAME = new QName("urn:oio:sagdok:3.0.0", "Sideordnede");
    private final static QName _Tilfoejelser_QNAME = new QName("urn:oio:sagdok:3.0.0", "Tilfoejelser");
    private final static QName _SoegErstatter_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegErstatter");
    private final static QName _SoegFacet_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegFacet");
    private final static QName _SoegLovligeKombinationer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegLovligeKombinationer");
    private final static QName _SoegMapninger_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegMapninger");
    private final static QName _SoegRedaktoerer_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegRedaktoerer");
    private final static QName _SoegSideordnede_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegSideordnede");
    private final static QName _SoegTilfoejelser_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegTilfoejelser");
    private final static QName _FacetTilhoerer_QNAME = new QName("urn:oio:sagdok:3.0.0", "FacetTilhoerer");
    private final static QName _AfleveresTil_QNAME = new QName("urn:oio:sagdok:3.0.0", "AfleveresTil");
    private final static QName _AndreArkiver_QNAME = new QName("urn:oio:sagdok:3.0.0", "AndreArkiver");
    private final static QName _IndgaarI_QNAME = new QName("urn:oio:sagdok:3.0.0", "IndgaarI");
    private final static QName _Klassifikation_QNAME = new QName("urn:oio:sagdok:3.0.0", "Klassifikation");
    private final static QName _Skabere_QNAME = new QName("urn:oio:sagdok:3.0.0", "Skabere");
    private final static QName _SoegAfleveresTil_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAfleveresTil");
    private final static QName _SoegAndreArkiver_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegAndreArkiver");
    private final static QName _SoegIndgaarI_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegIndgaarI");
    private final static QName _SoegKlassifikation_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegKlassifikation");
    private final static QName _SoegSkabere_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegSkabere");
    private final static QName _Registrering_QNAME = new QName("urn:oio:sagdok:3.0.0", "Registrering");
    private final static QName _BrugervendtNoegleTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrugervendtNoegleTekst");
    private final static QName _OrganisationNavn_QNAME = new QName("urn:oio:sagdok:3.0.0", "OrganisationNavn");
    private final static QName _LokalUdvidelse_QNAME = new QName("urn:oio:sagdok:3.0.0", "LokalUdvidelse");
    private final static QName _AdresseFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "AdresseFlerRelation");
    private final static QName _PersonFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "PersonFlerRelation");
    private final static QName _KlasseRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "KlasseRelation");
    private final static QName _MyndighedRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "MyndighedRelation");
    private final static QName _KlasseFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "KlasseFlerRelation");
    private final static QName _OrganisationEnhedRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "OrganisationEnhedRelation");
    private final static QName _VirksomhedRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "VirksomhedRelation");
    private final static QName _OrganisationRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "OrganisationRelation");
    private final static QName _BrugerFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrugerFlerRelation");
    private final static QName _OrganisationEnhedFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "OrganisationEnhedFlerRelation");
    private final static QName _OrganisationFunktionFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "OrganisationFunktionFlerRelation");
    private final static QName _InteressefaellesskabFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "InteressefaellesskabFlerRelation");
    private final static QName _OrganisationFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "OrganisationFlerRelation");
    private final static QName _ItSystemFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "ItSystemFlerRelation");
    private final static QName _TidsstempelDatoTid_QNAME = new QName("urn:oio:sagdok:3.0.0", "TidsstempelDatoTid");
    private final static QName _FraTidspunkt_QNAME = new QName("urn:oio:sagdok:3.0.0", "FraTidspunkt");
    private final static QName _LivscyklusKode_QNAME = new QName("urn:oio:sagdok:3.0.0", "LivscyklusKode");
    private final static QName _BrugerRef_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrugerRef");
    private final static QName _SoegVirkning_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegVirkning");
    private final static QName _SoegRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegRelation");
    private final static QName _EnhedNavn_QNAME = new QName("urn:oio:sagdok:3.0.0", "EnhedNavn");
    private final static QName _BrugerNavn_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrugerNavn");
    private final static QName _BrugerTypeTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrugerTypeTekst");
    private final static QName _InteressefaellesskabNavn_QNAME = new QName("urn:oio:sagdok:3.0.0", "InteressefaellesskabNavn");
    private final static QName _InteressefaellesskabTypeTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "InteressefaellesskabTypeTekst");
    private final static QName _ItSystemNavn_QNAME = new QName("urn:oio:sagdok:3.0.0", "ItSystemNavn");
    private final static QName _ItSystemTypeTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "ItSystemTypeTekst");
    private final static QName _KonfigurationReference_QNAME = new QName("urn:oio:sagdok:3.0.0", "KonfigurationReference");
    private final static QName _FunktionNavn_QNAME = new QName("urn:oio:sagdok:3.0.0", "FunktionNavn");
    private final static QName _AfleveretIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "AfleveretIndikator");
    private final static QName _BeskrivelseTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "BeskrivelseTekst");
    private final static QName _HjemmelSpecifikationTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "HjemmelSpecifikationTekst");
    private final static QName _KassationskodeTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "KassationskodeTekst");
    private final static QName _PrincipielIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "PrincipielIndikator");
    private final static QName _SagsnummerTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "SagsnummerTekst");
    private final static QName _TitelTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "TitelTekst");
    private final static QName _AktoerFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "AktoerFlerRelation");
    private final static QName _SagFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "SagFlerRelation");
    private final static QName _AktoerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "AktoerRelation");
    private final static QName _ArkivRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "ArkivRelation");
    private final static QName _JournalPostFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "JournalPostFlerRelation");
    private final static QName _PartFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "PartFlerRelation");
    private final static QName _SagRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "SagRelation");
    private final static QName _SoegJournalPostRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegJournalPostRelation");
    private final static QName _BrevDato_QNAME = new QName("urn:oio:sagdok:3.0.0", "BrevDato");
    private final static QName _VersionIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "VersionIdentifikator");
    private final static QName _UnderversionIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "UnderversionIdentifikator");
    private final static QName _DokumentFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "DokumentFlerRelation");
    private final static QName _ArkivFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "ArkivFlerRelation");
    private final static QName _DokumentRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "DokumentRelation");
    private final static QName _KaldenavnTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "KaldenavnTekst");
    private final static QName _OphavsretTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "OphavsretTekst");
    private final static QName _ErPubliceretIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "ErPubliceretIndikator");
    private final static QName _EksempelTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "EksempelTekst");
    private final static QName _OmfangTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "OmfangTekst");
    private final static QName _RetskildeTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "RetskildeTekst");
    private final static QName _AendringsnotatTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "AendringsnotatTekst");
    private final static QName _FacetRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "FacetRelation");
    private final static QName _OpbygningTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "OpbygningTekst");
    private final static QName _PlanIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "PlanIdentifikator");
    private final static QName _SupplementTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "SupplementTekst");
    private final static QName _KlassifikationRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "KlassifikationRelation");
    private final static QName _BestemmelserTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "BestemmelserTekst");
    private final static QName _Virkning_QNAME = new QName("urn:oio:sagdok:3.0.0", "Virkning");
    private final static QName _FlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "FlerRelation");
    private final static QName _Relation_QNAME = new QName("urn:oio:sagdok:3.0.0", "Relation");
    private final static QName _UnikId_QNAME = new QName("urn:oio:sagdok:3.0.0", "UnikId");
    private final static QName _TilTidspunkt_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilTidspunkt");
    private final static QName _AktoerRef_QNAME = new QName("urn:oio:sagdok:3.0.0", "AktoerRef");
    private final static QName _ReferenceID_QNAME = new QName("urn:oio:sagdok:3.0.0", "ReferenceID");
    private final static QName _OffentlighedUndtaget_QNAME = new QName("urn:oio:sagdok:3.0.0", "OffentlighedUndtaget");
    private final static QName _NulFlerRelation_QNAME = new QName("urn:oio:sagdok:3.0.0", "NulFlerRelation");
    private final static QName _JournalPostIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "JournalPostIdentifikator");
    private final static QName _IndeksIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "IndeksIdentifikator");
    private final static QName _TilhoersforholdKode_QNAME = new QName("urn:oio:sagdok:3.0.0", "TilhoersforholdKode");
    private final static QName _VariantTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "VariantTekst");
    private final static QName _ArkiveringIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "ArkiveringIndikator");
    private final static QName _DelvisSkannetIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "DelvisSkannetIndikator");
    private final static QName _OffentliggoerelseIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "OffentliggoerelseIndikator");
    private final static QName _ProduktionIndikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "ProduktionIndikator");
    private final static QName _SoegeordIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegeordIdentifikator");
    private final static QName _SoegeordKategoriTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegeordKategoriTekst");
    private final static QName _ArkivTypeKode_QNAME = new QName("urn:oio:sagdok:3.0.0", "ArkivTypeKode");
    private final static QName _URNIdentifikator_QNAME = new QName("urn:oio:sagdok:3.0.0", "URNIdentifikator");
    private final static QName _AktoerTypeKode_QNAME = new QName("urn:oio:sagdok:3.0.0", "AktoerTypeKode");
    private final static QName _TitelAlternativTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "TitelAlternativTekst");
    private final static QName _OffentlighedUndtagetHjemmelTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "OffentlighedUndtagetHjemmelTekst");
    private final static QName _DelTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "DelTekst");
    private final static QName _IndholdTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "IndholdTekst");
    private final static QName _LokationTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "LokationTekst");
    private final static QName _MimetypeTekst_QNAME = new QName("urn:oio:sagdok:3.0.0", "MimetypeTekst");
    private final static QName _SoegUnderRedigeringAf_QNAME = new QName("urn:oio:sagdok:3.0.0", "SoegUnderRedigeringAf");
    private final static QName _UnderRedigeringAf_QNAME = new QName("urn:oio:sagdok:3.0.0", "UnderRedigeringAf");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oio.sagdok._3_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BasicOutputType }
     * 
     */
    public BasicOutputType createBasicOutputType() {
        return new BasicOutputType();
    }

    /**
     * Create an instance of {@link OpretOutputType }
     * 
     */
    public OpretOutputType createOpretOutputType() {
        return new OpretOutputType();
    }

    /**
     * Create an instance of {@link UuidNoteInputType }
     * 
     */
    public UuidNoteInputType createUuidNoteInputType() {
        return new UuidNoteInputType();
    }

    /**
     * Create an instance of {@link LaesInputType }
     * 
     */
    public LaesInputType createLaesInputType() {
        return new LaesInputType();
    }

    /**
     * Create an instance of {@link ListInputType }
     * 
     */
    public ListInputType createListInputType() {
        return new ListInputType();
    }

    /**
     * Create an instance of {@link SoegOutputType }
     * 
     */
    public SoegOutputType createSoegOutputType() {
        return new SoegOutputType();
    }

    /**
     * Create an instance of {@link ImportInputType }
     * 
     */
    public ImportInputType createImportInputType() {
        return new ImportInputType();
    }

    /**
     * Create an instance of {@link OpretInputType }
     * 
     */
    public OpretInputType createOpretInputType() {
        return new OpretInputType();
    }

    /**
     * Create an instance of {@link RetInputType }
     * 
     */
    public RetInputType createRetInputType() {
        return new RetInputType();
    }

    /**
     * Create an instance of {@link ListOutputType }
     * 
     */
    public ListOutputType createListOutputType() {
        return new ListOutputType();
    }

    /**
     * Create an instance of {@link SoegInputType }
     * 
     */
    public SoegInputType createSoegInputType() {
        return new SoegInputType();
    }

    /**
     * Create an instance of {@link TidspunktType }
     * 
     */
    public TidspunktType createTidspunktType() {
        return new TidspunktType();
    }

    /**
     * Create an instance of {@link SoegSagDokObjektType }
     * 
     */
    public SoegSagDokObjektType createSoegSagDokObjektType() {
        return new SoegSagDokObjektType();
    }

    /**
     * Create an instance of {@link IdListeType }
     * 
     */
    public IdListeType createIdListeType() {
        return new IdListeType();
    }

    /**
     * Create an instance of {@link AdresseFlerRelationType }
     * 
     */
    public AdresseFlerRelationType createAdresseFlerRelationType() {
        return new AdresseFlerRelationType();
    }

    /**
     * Create an instance of {@link PersonFlerRelationType }
     * 
     */
    public PersonFlerRelationType createPersonFlerRelationType() {
        return new PersonFlerRelationType();
    }

    /**
     * Create an instance of {@link KlasseRelationType }
     * 
     */
    public KlasseRelationType createKlasseRelationType() {
        return new KlasseRelationType();
    }

    /**
     * Create an instance of {@link MyndighedRelationType }
     * 
     */
    public MyndighedRelationType createMyndighedRelationType() {
        return new MyndighedRelationType();
    }

    /**
     * Create an instance of {@link KlasseFlerRelationType }
     * 
     */
    public KlasseFlerRelationType createKlasseFlerRelationType() {
        return new KlasseFlerRelationType();
    }

    /**
     * Create an instance of {@link OpgaverFlerRelationType }
     * 
     */
    public OpgaverFlerRelationType createOpgaverFlerRelationType() {
        return new OpgaverFlerRelationType();
    }

    /**
     * Create an instance of {@link OrganisationEnhedRelationType }
     * 
     */
    public OrganisationEnhedRelationType createOrganisationEnhedRelationType() {
        return new OrganisationEnhedRelationType();
    }

    /**
     * Create an instance of {@link VirksomhedRelationType }
     * 
     */
    public VirksomhedRelationType createVirksomhedRelationType() {
        return new VirksomhedRelationType();
    }

    /**
     * Create an instance of {@link OrganisationFlerRelationType }
     * 
     */
    public OrganisationFlerRelationType createOrganisationFlerRelationType() {
        return new OrganisationFlerRelationType();
    }

    /**
     * Create an instance of {@link BrugerFlerRelationType }
     * 
     */
    public BrugerFlerRelationType createBrugerFlerRelationType() {
        return new BrugerFlerRelationType();
    }

    /**
     * Create an instance of {@link OrganisationEnhedFlerRelationType }
     * 
     */
    public OrganisationEnhedFlerRelationType createOrganisationEnhedFlerRelationType() {
        return new OrganisationEnhedFlerRelationType();
    }

    /**
     * Create an instance of {@link OrganisationFunktionFlerRelationType }
     * 
     */
    public OrganisationFunktionFlerRelationType createOrganisationFunktionFlerRelationType() {
        return new OrganisationFunktionFlerRelationType();
    }

    /**
     * Create an instance of {@link InteressefaellesskabFlerRelationType }
     * 
     */
    public InteressefaellesskabFlerRelationType createInteressefaellesskabFlerRelationType() {
        return new InteressefaellesskabFlerRelationType();
    }

    /**
     * Create an instance of {@link ItSystemFlerRelationType }
     * 
     */
    public ItSystemFlerRelationType createItSystemFlerRelationType() {
        return new ItSystemFlerRelationType();
    }

    /**
     * Create an instance of {@link StandardReturType }
     * 
     */
    public StandardReturType createStandardReturType() {
        return new StandardReturType();
    }

    /**
     * Create an instance of {@link LaesFiltreretOutputType }
     * 
     */
    public LaesFiltreretOutputType createLaesFiltreretOutputType() {
        return new LaesFiltreretOutputType();
    }

    /**
     * Create an instance of {@link SoegRegistreringType }
     * 
     */
    public SoegRegistreringType createSoegRegistreringType() {
        return new SoegRegistreringType();
    }

    /**
     * Create an instance of {@link SoegRelationType }
     * 
     */
    public SoegRelationType createSoegRelationType() {
        return new SoegRelationType();
    }

    /**
     * Create an instance of {@link SagDokObjektType }
     * 
     */
    public SagDokObjektType createSagDokObjektType() {
        return new SagDokObjektType();
    }

    /**
     * Create an instance of {@link AktoerFlerRelationType }
     * 
     */
    public AktoerFlerRelationType createAktoerFlerRelationType() {
        return new AktoerFlerRelationType();
    }

    /**
     * Create an instance of {@link SagFlerRelationType }
     * 
     */
    public SagFlerRelationType createSagFlerRelationType() {
        return new SagFlerRelationType();
    }

    /**
     * Create an instance of {@link AktoerRelationType }
     * 
     */
    public AktoerRelationType createAktoerRelationType() {
        return new AktoerRelationType();
    }

    /**
     * Create an instance of {@link ArkivRelationType }
     * 
     */
    public ArkivRelationType createArkivRelationType() {
        return new ArkivRelationType();
    }

    /**
     * Create an instance of {@link JournalPostFlerRelationType }
     * 
     */
    public JournalPostFlerRelationType createJournalPostFlerRelationType() {
        return new JournalPostFlerRelationType();
    }

    /**
     * Create an instance of {@link PartFlerRelationType }
     * 
     */
    public PartFlerRelationType createPartFlerRelationType() {
        return new PartFlerRelationType();
    }

    /**
     * Create an instance of {@link SagRelationType }
     * 
     */
    public SagRelationType createSagRelationType() {
        return new SagRelationType();
    }

    /**
     * Create an instance of {@link SoegJournalPostRelationType }
     * 
     */
    public SoegJournalPostRelationType createSoegJournalPostRelationType() {
        return new SoegJournalPostRelationType();
    }

    /**
     * Create an instance of {@link DokumentFlerRelationType }
     * 
     */
    public DokumentFlerRelationType createDokumentFlerRelationType() {
        return new DokumentFlerRelationType();
    }

    /**
     * Create an instance of {@link ArkivFlerRelationType }
     * 
     */
    public ArkivFlerRelationType createArkivFlerRelationType() {
        return new ArkivFlerRelationType();
    }

    /**
     * Create an instance of {@link DokumentRelationType }
     * 
     */
    public DokumentRelationType createDokumentRelationType() {
        return new DokumentRelationType();
    }

    /**
     * Create an instance of {@link FacetRelationType }
     * 
     */
    public FacetRelationType createFacetRelationType() {
        return new FacetRelationType();
    }

    /**
     * Create an instance of {@link KlassifikationRelationType }
     * 
     */
    public KlassifikationRelationType createKlassifikationRelationType() {
        return new KlassifikationRelationType();
    }

    /**
     * Create an instance of {@link RegistreringType }
     * 
     */
    public RegistreringType createRegistreringType() {
        return new RegistreringType();
    }

    /**
     * Create an instance of {@link LokalUdvidelseType }
     * 
     */
    public LokalUdvidelseType createLokalUdvidelseType() {
        return new LokalUdvidelseType();
    }

    /**
     * Create an instance of {@link OrganisationRelationType }
     * 
     */
    public OrganisationRelationType createOrganisationRelationType() {
        return new OrganisationRelationType();
    }

    /**
     * Create an instance of {@link UnikIdType }
     * 
     */
    public UnikIdType createUnikIdType() {
        return new UnikIdType();
    }

    /**
     * Create an instance of {@link SoegVirkningType }
     * 
     */
    public SoegVirkningType createSoegVirkningType() {
        return new SoegVirkningType();
    }

    /**
     * Create an instance of {@link VirkningType }
     * 
     */
    public VirkningType createVirkningType() {
        return new VirkningType();
    }

    /**
     * Create an instance of {@link FlerRelationType }
     * 
     */
    public FlerRelationType createFlerRelationType() {
        return new FlerRelationType();
    }

    /**
     * Create an instance of {@link RelationType }
     * 
     */
    public RelationType createRelationType() {
        return new RelationType();
    }

    /**
     * Create an instance of {@link OffentlighedUndtagetType }
     * 
     */
    public OffentlighedUndtagetType createOffentlighedUndtagetType() {
        return new OffentlighedUndtagetType();
    }

    /**
     * Create an instance of {@link NulFlerRelationType }
     * 
     */
    public NulFlerRelationType createNulFlerRelationType() {
        return new NulFlerRelationType();
    }

    /**
     * Create an instance of {@link MultipleOutputType }
     * 
     */
    public MultipleOutputType createMultipleOutputType() {
        return new MultipleOutputType();
    }

    /**
     * Create an instance of {@link UnikReturType }
     * 
     */
    public UnikReturType createUnikReturType() {
        return new UnikReturType();
    }

    /**
     * Create an instance of {@link DynamicFlerRelationType }
     * 
     */
    public DynamicFlerRelationType createDynamicFlerRelationType() {
        return new DynamicFlerRelationType();
    }

    /**
     * Create an instance of {@link UuidLabelInputType }
     * 
     */
    public UuidLabelInputType createUuidLabelInputType() {
        return new UuidLabelInputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ImportInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ImportInput")
    public JAXBElement<ImportInputType> createImportInput(ImportInputType value) {
        return new JAXBElement<ImportInputType>(_ImportInput_QNAME, ImportInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UuidNoteInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UuidNoteInput")
    public JAXBElement<UuidNoteInputType> createUuidNoteInput(UuidNoteInputType value) {
        return new JAXBElement<UuidNoteInputType>(_UuidNoteInput_QNAME, UuidNoteInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpretInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpretInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OpretInput")
    public JAXBElement<OpretInputType> createOpretInput(OpretInputType value) {
        return new JAXBElement<OpretInputType>(_OpretInput_QNAME, OpretInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpretOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpretOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OpretOutput")
    public JAXBElement<OpretOutputType> createOpretOutput(OpretOutputType value) {
        return new JAXBElement<OpretOutputType>(_OpretOutput_QNAME, OpretOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BasicOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BasicOutput")
    public JAXBElement<BasicOutputType> createBasicOutput(BasicOutputType value) {
        return new JAXBElement<BasicOutputType>(_BasicOutput_QNAME, BasicOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "RetInput")
    public JAXBElement<RetInputType> createRetInput(RetInputType value) {
        return new JAXBElement<RetInputType>(_RetInput_QNAME, RetInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaesInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LaesInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "LaesInput")
    public JAXBElement<LaesInputType> createLaesInput(LaesInputType value) {
        return new JAXBElement<LaesInputType>(_LaesInput_QNAME, LaesInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ListInput")
    public JAXBElement<ListInputType> createListInput(ListInputType value) {
        return new JAXBElement<ListInputType>(_ListInput_QNAME, ListInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ListOutput")
    public JAXBElement<ListOutputType> createListOutput(ListOutputType value) {
        return new JAXBElement<ListOutputType>(_ListOutput_QNAME, ListOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegInputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegInputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegInput")
    public JAXBElement<SoegInputType> createSoegInput(SoegInputType value) {
        return new JAXBElement<SoegInputType>(_SoegInput_QNAME, SoegInputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FoersteResultatReference")
    public JAXBElement<BigInteger> createFoersteResultatReference(BigInteger value) {
        return new JAXBElement<BigInteger>(_FoersteResultatReference_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "MaksimalAntalKvantitet")
    public JAXBElement<BigInteger> createMaksimalAntalKvantitet(BigInteger value) {
        return new JAXBElement<BigInteger>(_MaksimalAntalKvantitet_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegOutput")
    public JAXBElement<SoegOutputType> createSoegOutput(SoegOutputType value) {
        return new JAXBElement<SoegOutputType>(_SoegOutput_QNAME, SoegOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "NoteTekst")
    public JAXBElement<String> createNoteTekst(String value) {
        return new JAXBElement<String>(_NoteTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UUIDIdentifikator")
    public JAXBElement<String> createUUIDIdentifikator(String value) {
        return new JAXBElement<String>(_UUIDIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "VirkningFraFilter")
    public JAXBElement<TidspunktType> createVirkningFraFilter(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_VirkningFraFilter_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "VirkningTilFilter")
    public JAXBElement<TidspunktType> createVirkningTilFilter(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_VirkningTilFilter_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "RegistreringFraFilter")
    public JAXBElement<TidspunktType> createRegistreringFraFilter(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_RegistreringFraFilter_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "RegistreringTilFilter")
    public JAXBElement<TidspunktType> createRegistreringTilFilter(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_RegistreringTilFilter_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegSagDokObjektType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegSagDokObjektType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegSagDokObjekt")
    public JAXBElement<SoegSagDokObjektType> createSoegSagDokObjekt(SoegSagDokObjektType value) {
        return new JAXBElement<SoegSagDokObjektType>(_SoegSagDokObjekt_QNAME, SoegSagDokObjektType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdListeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdListeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "IdListe")
    public JAXBElement<IdListeType> createIdListe(IdListeType value) {
        return new JAXBElement<IdListeType>(_IdListe_QNAME, IdListeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdresseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Adresser")
    public JAXBElement<AdresseFlerRelationType> createAdresser(AdresseFlerRelationType value) {
        return new JAXBElement<AdresseFlerRelationType>(_Adresser_QNAME, AdresseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Ansatte")
    public JAXBElement<PersonFlerRelationType> createAnsatte(PersonFlerRelationType value) {
        return new JAXBElement<PersonFlerRelationType>(_Ansatte_QNAME, PersonFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Branche")
    public JAXBElement<KlasseRelationType> createBranche(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Branche_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Interessefaellesskabstype")
    public JAXBElement<KlasseRelationType> createInteressefaellesskabstype(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Interessefaellesskabstype_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyndighedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MyndighedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Myndighed")
    public JAXBElement<MyndighedRelationType> createMyndighed(MyndighedRelationType value) {
        return new JAXBElement<MyndighedRelationType>(_Myndighed_QNAME, MyndighedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Myndighedstype")
    public JAXBElement<KlasseRelationType> createMyndighedstype(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Myndighedstype_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeOpgaver")
    public JAXBElement<KlasseFlerRelationType> createTilknyttedeOpgaver(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_TilknyttedeOpgaver_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpgaverFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OpgaverFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Opgaver")
    public JAXBElement<OpgaverFlerRelationType> createOpgaver(OpgaverFlerRelationType value) {
        return new JAXBElement<OpgaverFlerRelationType>(_Opgaver_QNAME, OpgaverFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Overordnet")
    public JAXBElement<OrganisationEnhedRelationType> createOverordnet(OrganisationEnhedRelationType value) {
        return new JAXBElement<OrganisationEnhedRelationType>(_Overordnet_QNAME, OrganisationEnhedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Produktionsenhed")
    public JAXBElement<VirksomhedRelationType> createProduktionsenhed(VirksomhedRelationType value) {
        return new JAXBElement<VirksomhedRelationType>(_Produktionsenhed_QNAME, VirksomhedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Skatteenhed")
    public JAXBElement<VirksomhedRelationType> createSkatteenhed(VirksomhedRelationType value) {
        return new JAXBElement<VirksomhedRelationType>(_Skatteenhed_QNAME, VirksomhedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Tilhoerer")
    public JAXBElement<OrganisationFlerRelationType> createTilhoerer(OrganisationFlerRelationType value) {
        return new JAXBElement<OrganisationFlerRelationType>(_Tilhoerer_QNAME, OrganisationFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrugerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BrugerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeBrugere")
    public JAXBElement<BrugerFlerRelationType> createTilknyttedeBrugere(BrugerFlerRelationType value) {
        return new JAXBElement<BrugerFlerRelationType>(_TilknyttedeBrugere_QNAME, BrugerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeEnheder")
    public JAXBElement<OrganisationEnhedFlerRelationType> createTilknyttedeEnheder(OrganisationEnhedFlerRelationType value) {
        return new JAXBElement<OrganisationEnhedFlerRelationType>(_TilknyttedeEnheder_QNAME, OrganisationEnhedFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationFunktionFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationFunktionFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeFunktioner")
    public JAXBElement<OrganisationFunktionFlerRelationType> createTilknyttedeFunktioner(OrganisationFunktionFlerRelationType value) {
        return new JAXBElement<OrganisationFunktionFlerRelationType>(_TilknyttedeFunktioner_QNAME, OrganisationFunktionFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InteressefaellesskabFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InteressefaellesskabFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeInteressefaellesskaber")
    public JAXBElement<InteressefaellesskabFlerRelationType> createTilknyttedeInteressefaellesskaber(InteressefaellesskabFlerRelationType value) {
        return new JAXBElement<InteressefaellesskabFlerRelationType>(_TilknyttedeInteressefaellesskaber_QNAME, InteressefaellesskabFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeOrganisationer")
    public JAXBElement<OrganisationFlerRelationType> createTilknyttedeOrganisationer(OrganisationFlerRelationType value) {
        return new JAXBElement<OrganisationFlerRelationType>(_TilknyttedeOrganisationer_QNAME, OrganisationFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedePersoner")
    public JAXBElement<PersonFlerRelationType> createTilknyttedePersoner(PersonFlerRelationType value) {
        return new JAXBElement<PersonFlerRelationType>(_TilknyttedePersoner_QNAME, PersonFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItSystemFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItSystemFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeItSystemer")
    public JAXBElement<ItSystemFlerRelationType> createTilknyttedeItSystemer(ItSystemFlerRelationType value) {
        return new JAXBElement<ItSystemFlerRelationType>(_TilknyttedeItSystemer_QNAME, ItSystemFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Virksomhed")
    public JAXBElement<VirksomhedRelationType> createVirksomhed(VirksomhedRelationType value) {
        return new JAXBElement<VirksomhedRelationType>(_Virksomhed_QNAME, VirksomhedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Virksomhedstype")
    public JAXBElement<KlasseRelationType> createVirksomhedstype(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Virksomhedstype_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StandardReturType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StandardReturType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "StandardRetur")
    public JAXBElement<StandardReturType> createStandardRetur(StandardReturType value) {
        return new JAXBElement<StandardReturType>(_StandardRetur_QNAME, StandardReturType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "StatusKode")
    public JAXBElement<BigInteger> createStatusKode(BigInteger value) {
        return new JAXBElement<BigInteger>(_StatusKode_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FejlbeskedTekst")
    public JAXBElement<String> createFejlbeskedTekst(String value) {
        return new JAXBElement<String>(_FejlbeskedTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Tidspunkt")
    public JAXBElement<TidspunktType> createTidspunkt(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_Tidspunkt_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "GraenseIndikator")
    public JAXBElement<Boolean> createGraenseIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_GraenseIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaesFiltreretOutputType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LaesFiltreretOutputType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "LaesFiltreretOutput")
    public JAXBElement<LaesFiltreretOutputType> createLaesFiltreretOutput(LaesFiltreretOutputType value) {
        return new JAXBElement<LaesFiltreretOutputType>(_LaesFiltreretOutput_QNAME, LaesFiltreretOutputType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRegistreringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRegistreringType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegRegistrering")
    public JAXBElement<SoegRegistreringType> createSoegRegistrering(SoegRegistreringType value) {
        return new JAXBElement<SoegRegistreringType>(_SoegRegistrering_QNAME, SoegRegistreringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAdresser")
    public JAXBElement<SoegRelationType> createSoegAdresser(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAdresser_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAnsatte")
    public JAXBElement<SoegRelationType> createSoegAnsatte(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAnsatte_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegBranche")
    public JAXBElement<SoegRelationType> createSoegBranche(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegBranche_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegMyndighed")
    public JAXBElement<SoegRelationType> createSoegMyndighed(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegMyndighed_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegMyndighedstype")
    public JAXBElement<SoegRelationType> createSoegMyndighedstype(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegMyndighedstype_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegOpgaver")
    public JAXBElement<SoegRelationType> createSoegOpgaver(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegOpgaver_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegOverordnet")
    public JAXBElement<SoegRelationType> createSoegOverordnet(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegOverordnet_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegProduktionsenhed")
    public JAXBElement<SoegRelationType> createSoegProduktionsenhed(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegProduktionsenhed_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegSkatteenhed")
    public JAXBElement<SoegRelationType> createSoegSkatteenhed(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegSkatteenhed_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilhoerer")
    public JAXBElement<SoegRelationType> createSoegTilhoerer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilhoerer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeBrugere")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeBrugere(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeBrugere_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeEnheder")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeEnheder(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeEnheder_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeFunktioner")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeFunktioner(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeFunktioner_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeInteressefaellesskaber")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeInteressefaellesskaber(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeInteressefaellesskaber_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeOrganisationer")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeOrganisationer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeOrganisationer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedePersoner")
    public JAXBElement<SoegRelationType> createSoegTilknyttedePersoner(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedePersoner_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeItSystemer")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeItSystemer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeItSystemer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegVirksomhed")
    public JAXBElement<SoegRelationType> createSoegVirksomhed(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegVirksomhed_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegVirksomhedstype")
    public JAXBElement<SoegRelationType> createSoegVirksomhedstype(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegVirksomhedstype_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Enhedstype")
    public JAXBElement<KlasseRelationType> createEnhedstype(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Enhedstype_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Organisationstype")
    public JAXBElement<KlasseRelationType> createOrganisationstype(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Organisationstype_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegEnhedstype")
    public JAXBElement<SoegRelationType> createSoegEnhedstype(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegEnhedstype_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrugerTyper")
    public JAXBElement<KlasseFlerRelationType> createBrugerTyper(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_BrugerTyper_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegBrugerTyper")
    public JAXBElement<SoegRelationType> createSoegBrugerTyper(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegBrugerTyper_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SystemTyper")
    public JAXBElement<KlasseFlerRelationType> createSystemTyper(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_SystemTyper_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegSystemTyper")
    public JAXBElement<SoegRelationType> createSoegSystemTyper(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegSystemTyper_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Funktionstype")
    public JAXBElement<KlasseRelationType> createFunktionstype(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_Funktionstype_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegFunktionstype")
    public JAXBElement<SoegRelationType> createSoegFunktionstype(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegFunktionstype_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagDokObjektType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagDokObjektType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SagDokObjekt")
    public JAXBElement<SagDokObjektType> createSagDokObjekt(SagDokObjektType value) {
        return new JAXBElement<SagDokObjektType>(_SagDokObjekt_QNAME, SagDokObjektType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AndreBehandlere")
    public JAXBElement<AktoerFlerRelationType> createAndreBehandlere(AktoerFlerRelationType value) {
        return new JAXBElement<AktoerFlerRelationType>(_AndreBehandlere_QNAME, AktoerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AndreKlasser")
    public JAXBElement<KlasseFlerRelationType> createAndreKlasser(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_AndreKlasser_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AndreSager")
    public JAXBElement<SagFlerRelationType> createAndreSager(SagFlerRelationType value) {
        return new JAXBElement<SagFlerRelationType>(_AndreSager_QNAME, SagFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Ansvarlig")
    public JAXBElement<AktoerRelationType> createAnsvarlig(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_Ansvarlig_QNAME, AktoerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Arkiv")
    public JAXBElement<ArkivRelationType> createArkiv(ArkivRelationType value) {
        return new JAXBElement<ArkivRelationType>(_Arkiv_QNAME, ArkivRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Ejer")
    public JAXBElement<AktoerRelationType> createEjer(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_Ejer_QNAME, AktoerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalPostFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JournalPostFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "JournalPoster")
    public JAXBElement<JournalPostFlerRelationType> createJournalPoster(JournalPostFlerRelationType value) {
        return new JAXBElement<JournalPostFlerRelationType>(_JournalPoster_QNAME, JournalPostFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PartFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Parter")
    public JAXBElement<PartFlerRelationType> createParter(PartFlerRelationType value) {
        return new JAXBElement<PartFlerRelationType>(_Parter_QNAME, PartFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "PrimaerBehandler")
    public JAXBElement<AktoerRelationType> createPrimaerBehandler(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_PrimaerBehandler_QNAME, AktoerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "PrimaerKlasse")
    public JAXBElement<KlasseRelationType> createPrimaerKlasse(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_PrimaerKlasse_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Praecedens")
    public JAXBElement<SagRelationType> createPraecedens(SagRelationType value) {
        return new JAXBElement<SagRelationType>(_Praecedens_QNAME, SagRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UdlaantTil")
    public JAXBElement<AktoerRelationType> createUdlaantTil(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_UdlaantTil_QNAME, AktoerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UnderSager")
    public JAXBElement<SagFlerRelationType> createUnderSager(SagFlerRelationType value) {
        return new JAXBElement<SagFlerRelationType>(_UnderSager_QNAME, SagFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAndreBehandlere")
    public JAXBElement<SoegRelationType> createSoegAndreBehandlere(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAndreBehandlere_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAndreKlasser")
    public JAXBElement<SoegRelationType> createSoegAndreKlasser(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAndreKlasser_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAndreSager")
    public JAXBElement<SoegRelationType> createSoegAndreSager(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAndreSager_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAnsvarlig")
    public JAXBElement<SoegRelationType> createSoegAnsvarlig(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAnsvarlig_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegArkiv")
    public JAXBElement<SoegRelationType> createSoegArkiv(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegArkiv_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegEjer")
    public JAXBElement<SoegRelationType> createSoegEjer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegEjer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegJournalPostRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegJournalPostRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegJournalPoster")
    public JAXBElement<SoegJournalPostRelationType> createSoegJournalPoster(SoegJournalPostRelationType value) {
        return new JAXBElement<SoegJournalPostRelationType>(_SoegJournalPoster_QNAME, SoegJournalPostRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegParter")
    public JAXBElement<SoegRelationType> createSoegParter(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegParter_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegPrimaerBehandler")
    public JAXBElement<SoegRelationType> createSoegPrimaerBehandler(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegPrimaerBehandler_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegPrimaerKlasse")
    public JAXBElement<SoegRelationType> createSoegPrimaerKlasse(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegPrimaerKlasse_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegPraecedens")
    public JAXBElement<SoegRelationType> createSoegPraecedens(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegPraecedens_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegUdlaantTil")
    public JAXBElement<SoegRelationType> createSoegUdlaantTil(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegUdlaantTil_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegUnderSager")
    public JAXBElement<SoegRelationType> createSoegUnderSager(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegUnderSager_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AndreDokumenter")
    public JAXBElement<DokumentFlerRelationType> createAndreDokumenter(DokumentFlerRelationType value) {
        return new JAXBElement<DokumentFlerRelationType>(_AndreDokumenter_QNAME, DokumentFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Arkiver")
    public JAXBElement<ArkivFlerRelationType> createArkiver(ArkivFlerRelationType value) {
        return new JAXBElement<ArkivFlerRelationType>(_Arkiver_QNAME, ArkivFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Besvarelser")
    public JAXBElement<DokumentFlerRelationType> createBesvarelser(DokumentFlerRelationType value) {
        return new JAXBElement<DokumentFlerRelationType>(_Besvarelser_QNAME, DokumentFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Bilag")
    public JAXBElement<DokumentFlerRelationType> createBilag(DokumentFlerRelationType value) {
        return new JAXBElement<DokumentFlerRelationType>(_Bilag_QNAME, DokumentFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FordeltTil")
    public JAXBElement<AktoerRelationType> createFordeltTil(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_FordeltTil_QNAME, AktoerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Kommentarer")
    public JAXBElement<DokumentFlerRelationType> createKommentarer(DokumentFlerRelationType value) {
        return new JAXBElement<DokumentFlerRelationType>(_Kommentarer_QNAME, DokumentFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PartFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KopiParter")
    public JAXBElement<PartFlerRelationType> createKopiParter(PartFlerRelationType value) {
        return new JAXBElement<PartFlerRelationType>(_KopiParter_QNAME, PartFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "NyRevision")
    public JAXBElement<DokumentRelationType> createNyRevision(DokumentRelationType value) {
        return new JAXBElement<DokumentRelationType>(_NyRevision_QNAME, DokumentRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilknyttedeSager")
    public JAXBElement<SagFlerRelationType> createTilknyttedeSager(SagFlerRelationType value) {
        return new JAXBElement<SagFlerRelationType>(_TilknyttedeSager_QNAME, SagFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Udgangspunkter")
    public JAXBElement<DokumentFlerRelationType> createUdgangspunkter(DokumentFlerRelationType value) {
        return new JAXBElement<DokumentFlerRelationType>(_Udgangspunkter_QNAME, DokumentFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAndreDokumenter")
    public JAXBElement<SoegRelationType> createSoegAndreDokumenter(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAndreDokumenter_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegArkiver")
    public JAXBElement<SoegRelationType> createSoegArkiver(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegArkiver_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegBesvarelser")
    public JAXBElement<SoegRelationType> createSoegBesvarelser(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegBesvarelser_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegBilag")
    public JAXBElement<SoegRelationType> createSoegBilag(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegBilag_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegFordeltTil")
    public JAXBElement<SoegRelationType> createSoegFordeltTil(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegFordeltTil_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegKommentarer")
    public JAXBElement<SoegRelationType> createSoegKommentarer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegKommentarer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegKopiParter")
    public JAXBElement<SoegRelationType> createSoegKopiParter(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegKopiParter_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegNyRevision")
    public JAXBElement<SoegRelationType> createSoegNyRevision(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegNyRevision_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilknyttedeSager")
    public JAXBElement<SoegRelationType> createSoegTilknyttedeSager(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilknyttedeSager_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegUdgangspunkter")
    public JAXBElement<SoegRelationType> createSoegUdgangspunkter(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegUdgangspunkter_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Erstatter")
    public JAXBElement<KlasseFlerRelationType> createErstatter(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_Erstatter_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacetRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Facet")
    public JAXBElement<FacetRelationType> createFacet(FacetRelationType value) {
        return new JAXBElement<FacetRelationType>(_Facet_QNAME, FacetRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "LovligeKombinationer")
    public JAXBElement<KlasseFlerRelationType> createLovligeKombinationer(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_LovligeKombinationer_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Mapninger")
    public JAXBElement<KlasseFlerRelationType> createMapninger(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_Mapninger_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OverordnetKlasse")
    public JAXBElement<KlasseRelationType> createOverordnetKlasse(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_OverordnetKlasse_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Redaktoerer")
    public JAXBElement<AktoerFlerRelationType> createRedaktoerer(AktoerFlerRelationType value) {
        return new JAXBElement<AktoerFlerRelationType>(_Redaktoerer_QNAME, AktoerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Sideordnede")
    public JAXBElement<KlasseFlerRelationType> createSideordnede(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_Sideordnede_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Tilfoejelser")
    public JAXBElement<KlasseFlerRelationType> createTilfoejelser(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_Tilfoejelser_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegErstatter")
    public JAXBElement<SoegRelationType> createSoegErstatter(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegErstatter_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegFacet")
    public JAXBElement<SoegRelationType> createSoegFacet(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegFacet_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegLovligeKombinationer")
    public JAXBElement<SoegRelationType> createSoegLovligeKombinationer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegLovligeKombinationer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegMapninger")
    public JAXBElement<SoegRelationType> createSoegMapninger(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegMapninger_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegRedaktoerer")
    public JAXBElement<SoegRelationType> createSoegRedaktoerer(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegRedaktoerer_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegSideordnede")
    public JAXBElement<SoegRelationType> createSoegSideordnede(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegSideordnede_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegTilfoejelser")
    public JAXBElement<SoegRelationType> createSoegTilfoejelser(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegTilfoejelser_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlassifikationRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlassifikationRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FacetTilhoerer")
    public JAXBElement<KlassifikationRelationType> createFacetTilhoerer(KlassifikationRelationType value) {
        return new JAXBElement<KlassifikationRelationType>(_FacetTilhoerer_QNAME, KlassifikationRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AfleveresTil")
    public JAXBElement<AktoerFlerRelationType> createAfleveresTil(AktoerFlerRelationType value) {
        return new JAXBElement<AktoerFlerRelationType>(_AfleveresTil_QNAME, AktoerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AndreArkiver")
    public JAXBElement<ArkivFlerRelationType> createAndreArkiver(ArkivFlerRelationType value) {
        return new JAXBElement<ArkivFlerRelationType>(_AndreArkiver_QNAME, ArkivFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "IndgaarI")
    public JAXBElement<ArkivRelationType> createIndgaarI(ArkivRelationType value) {
        return new JAXBElement<ArkivRelationType>(_IndgaarI_QNAME, ArkivRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlassifikationRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlassifikationRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Klassifikation")
    public JAXBElement<KlassifikationRelationType> createKlassifikation(KlassifikationRelationType value) {
        return new JAXBElement<KlassifikationRelationType>(_Klassifikation_QNAME, KlassifikationRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Skabere")
    public JAXBElement<AktoerFlerRelationType> createSkabere(AktoerFlerRelationType value) {
        return new JAXBElement<AktoerFlerRelationType>(_Skabere_QNAME, AktoerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAfleveresTil")
    public JAXBElement<SoegRelationType> createSoegAfleveresTil(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAfleveresTil_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegAndreArkiver")
    public JAXBElement<SoegRelationType> createSoegAndreArkiver(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegAndreArkiver_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegIndgaarI")
    public JAXBElement<SoegRelationType> createSoegIndgaarI(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegIndgaarI_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegKlassifikation")
    public JAXBElement<SoegRelationType> createSoegKlassifikation(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegKlassifikation_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegSkabere")
    public JAXBElement<SoegRelationType> createSoegSkabere(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegSkabere_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistreringType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RegistreringType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Registrering")
    public JAXBElement<RegistreringType> createRegistrering(RegistreringType value) {
        return new JAXBElement<RegistreringType>(_Registrering_QNAME, RegistreringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrugervendtNoegleTekst")
    public JAXBElement<String> createBrugervendtNoegleTekst(String value) {
        return new JAXBElement<String>(_BrugervendtNoegleTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OrganisationNavn")
    public JAXBElement<String> createOrganisationNavn(String value) {
        return new JAXBElement<String>(_OrganisationNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LokalUdvidelseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LokalUdvidelseType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "LokalUdvidelse")
    public JAXBElement<LokalUdvidelseType> createLokalUdvidelse(LokalUdvidelseType value) {
        return new JAXBElement<LokalUdvidelseType>(_LokalUdvidelse_QNAME, LokalUdvidelseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdresseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdresseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AdresseFlerRelation")
    public JAXBElement<AdresseFlerRelationType> createAdresseFlerRelation(AdresseFlerRelationType value) {
        return new JAXBElement<AdresseFlerRelationType>(_AdresseFlerRelation_QNAME, AdresseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "PersonFlerRelation")
    public JAXBElement<PersonFlerRelationType> createPersonFlerRelation(PersonFlerRelationType value) {
        return new JAXBElement<PersonFlerRelationType>(_PersonFlerRelation_QNAME, PersonFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KlasseRelation")
    public JAXBElement<KlasseRelationType> createKlasseRelation(KlasseRelationType value) {
        return new JAXBElement<KlasseRelationType>(_KlasseRelation_QNAME, KlasseRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MyndighedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MyndighedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "MyndighedRelation")
    public JAXBElement<MyndighedRelationType> createMyndighedRelation(MyndighedRelationType value) {
        return new JAXBElement<MyndighedRelationType>(_MyndighedRelation_QNAME, MyndighedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlasseFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KlasseFlerRelation")
    public JAXBElement<KlasseFlerRelationType> createKlasseFlerRelation(KlasseFlerRelationType value) {
        return new JAXBElement<KlasseFlerRelationType>(_KlasseFlerRelation_QNAME, KlasseFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OrganisationEnhedRelation")
    public JAXBElement<OrganisationEnhedRelationType> createOrganisationEnhedRelation(OrganisationEnhedRelationType value) {
        return new JAXBElement<OrganisationEnhedRelationType>(_OrganisationEnhedRelation_QNAME, OrganisationEnhedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirksomhedRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "VirksomhedRelation")
    public JAXBElement<VirksomhedRelationType> createVirksomhedRelation(VirksomhedRelationType value) {
        return new JAXBElement<VirksomhedRelationType>(_VirksomhedRelation_QNAME, VirksomhedRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OrganisationRelation")
    public JAXBElement<OrganisationRelationType> createOrganisationRelation(OrganisationRelationType value) {
        return new JAXBElement<OrganisationRelationType>(_OrganisationRelation_QNAME, OrganisationRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrugerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BrugerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrugerFlerRelation")
    public JAXBElement<BrugerFlerRelationType> createBrugerFlerRelation(BrugerFlerRelationType value) {
        return new JAXBElement<BrugerFlerRelationType>(_BrugerFlerRelation_QNAME, BrugerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationEnhedFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OrganisationEnhedFlerRelation")
    public JAXBElement<OrganisationEnhedFlerRelationType> createOrganisationEnhedFlerRelation(OrganisationEnhedFlerRelationType value) {
        return new JAXBElement<OrganisationEnhedFlerRelationType>(_OrganisationEnhedFlerRelation_QNAME, OrganisationEnhedFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationFunktionFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationFunktionFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OrganisationFunktionFlerRelation")
    public JAXBElement<OrganisationFunktionFlerRelationType> createOrganisationFunktionFlerRelation(OrganisationFunktionFlerRelationType value) {
        return new JAXBElement<OrganisationFunktionFlerRelationType>(_OrganisationFunktionFlerRelation_QNAME, OrganisationFunktionFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InteressefaellesskabFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InteressefaellesskabFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "InteressefaellesskabFlerRelation")
    public JAXBElement<InteressefaellesskabFlerRelationType> createInteressefaellesskabFlerRelation(InteressefaellesskabFlerRelationType value) {
        return new JAXBElement<InteressefaellesskabFlerRelationType>(_InteressefaellesskabFlerRelation_QNAME, InteressefaellesskabFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrganisationFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrganisationFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OrganisationFlerRelation")
    public JAXBElement<OrganisationFlerRelationType> createOrganisationFlerRelation(OrganisationFlerRelationType value) {
        return new JAXBElement<OrganisationFlerRelationType>(_OrganisationFlerRelation_QNAME, OrganisationFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItSystemFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItSystemFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ItSystemFlerRelation")
    public JAXBElement<ItSystemFlerRelationType> createItSystemFlerRelation(ItSystemFlerRelationType value) {
        return new JAXBElement<ItSystemFlerRelationType>(_ItSystemFlerRelation_QNAME, ItSystemFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TidsstempelDatoTid")
    public JAXBElement<XMLGregorianCalendar> createTidsstempelDatoTid(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TidsstempelDatoTid_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FraTidspunkt")
    public JAXBElement<TidspunktType> createFraTidspunkt(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_FraTidspunkt_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LivscyklusKodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LivscyklusKodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "LivscyklusKode")
    public JAXBElement<LivscyklusKodeType> createLivscyklusKode(LivscyklusKodeType value) {
        return new JAXBElement<LivscyklusKodeType>(_LivscyklusKode_QNAME, LivscyklusKodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrugerRef")
    public JAXBElement<UnikIdType> createBrugerRef(UnikIdType value) {
        return new JAXBElement<UnikIdType>(_BrugerRef_QNAME, UnikIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegVirkningType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegVirkningType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegVirkning")
    public JAXBElement<SoegVirkningType> createSoegVirkning(SoegVirkningType value) {
        return new JAXBElement<SoegVirkningType>(_SoegVirkning_QNAME, SoegVirkningType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegRelation")
    public JAXBElement<SoegRelationType> createSoegRelation(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegRelation_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "EnhedNavn")
    public JAXBElement<String> createEnhedNavn(String value) {
        return new JAXBElement<String>(_EnhedNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrugerNavn")
    public JAXBElement<String> createBrugerNavn(String value) {
        return new JAXBElement<String>(_BrugerNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrugerTypeTekst")
    public JAXBElement<String> createBrugerTypeTekst(String value) {
        return new JAXBElement<String>(_BrugerTypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "InteressefaellesskabNavn")
    public JAXBElement<String> createInteressefaellesskabNavn(String value) {
        return new JAXBElement<String>(_InteressefaellesskabNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "InteressefaellesskabTypeTekst")
    public JAXBElement<String> createInteressefaellesskabTypeTekst(String value) {
        return new JAXBElement<String>(_InteressefaellesskabTypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ItSystemNavn")
    public JAXBElement<String> createItSystemNavn(String value) {
        return new JAXBElement<String>(_ItSystemNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ItSystemTypeTekst")
    public JAXBElement<String> createItSystemTypeTekst(String value) {
        return new JAXBElement<String>(_ItSystemTypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KonfigurationReference")
    public JAXBElement<String> createKonfigurationReference(String value) {
        return new JAXBElement<String>(_KonfigurationReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FunktionNavn")
    public JAXBElement<String> createFunktionNavn(String value) {
        return new JAXBElement<String>(_FunktionNavn_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AfleveretIndikator")
    public JAXBElement<Boolean> createAfleveretIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_AfleveretIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BeskrivelseTekst")
    public JAXBElement<String> createBeskrivelseTekst(String value) {
        return new JAXBElement<String>(_BeskrivelseTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "HjemmelSpecifikationTekst")
    public JAXBElement<String> createHjemmelSpecifikationTekst(String value) {
        return new JAXBElement<String>(_HjemmelSpecifikationTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KassationskodeTekst")
    public JAXBElement<String> createKassationskodeTekst(String value) {
        return new JAXBElement<String>(_KassationskodeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "PrincipielIndikator")
    public JAXBElement<Boolean> createPrincipielIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_PrincipielIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SagsnummerTekst")
    public JAXBElement<String> createSagsnummerTekst(String value) {
        return new JAXBElement<String>(_SagsnummerTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TitelTekst")
    public JAXBElement<String> createTitelTekst(String value) {
        return new JAXBElement<String>(_TitelTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AktoerFlerRelation")
    public JAXBElement<AktoerFlerRelationType> createAktoerFlerRelation(AktoerFlerRelationType value) {
        return new JAXBElement<AktoerFlerRelationType>(_AktoerFlerRelation_QNAME, AktoerFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SagFlerRelation")
    public JAXBElement<SagFlerRelationType> createSagFlerRelation(SagFlerRelationType value) {
        return new JAXBElement<SagFlerRelationType>(_SagFlerRelation_QNAME, SagFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AktoerRelation")
    public JAXBElement<AktoerRelationType> createAktoerRelation(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_AktoerRelation_QNAME, AktoerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ArkivRelation")
    public JAXBElement<ArkivRelationType> createArkivRelation(ArkivRelationType value) {
        return new JAXBElement<ArkivRelationType>(_ArkivRelation_QNAME, ArkivRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link JournalPostFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link JournalPostFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "JournalPostFlerRelation")
    public JAXBElement<JournalPostFlerRelationType> createJournalPostFlerRelation(JournalPostFlerRelationType value) {
        return new JAXBElement<JournalPostFlerRelationType>(_JournalPostFlerRelation_QNAME, JournalPostFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PartFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "PartFlerRelation")
    public JAXBElement<PartFlerRelationType> createPartFlerRelation(PartFlerRelationType value) {
        return new JAXBElement<PartFlerRelationType>(_PartFlerRelation_QNAME, PartFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SagRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SagRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SagRelation")
    public JAXBElement<SagRelationType> createSagRelation(SagRelationType value) {
        return new JAXBElement<SagRelationType>(_SagRelation_QNAME, SagRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegJournalPostRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegJournalPostRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegJournalPostRelation")
    public JAXBElement<SoegJournalPostRelationType> createSoegJournalPostRelation(SoegJournalPostRelationType value) {
        return new JAXBElement<SoegJournalPostRelationType>(_SoegJournalPostRelation_QNAME, SoegJournalPostRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BrevDato")
    public JAXBElement<XMLGregorianCalendar> createBrevDato(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BrevDato_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "VersionIdentifikator")
    public JAXBElement<BigInteger> createVersionIdentifikator(BigInteger value) {
        return new JAXBElement<BigInteger>(_VersionIdentifikator_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UnderversionIdentifikator")
    public JAXBElement<BigInteger> createUnderversionIdentifikator(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnderversionIdentifikator_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "DokumentFlerRelation")
    public JAXBElement<DokumentFlerRelationType> createDokumentFlerRelation(DokumentFlerRelationType value) {
        return new JAXBElement<DokumentFlerRelationType>(_DokumentFlerRelation_QNAME, DokumentFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ArkivFlerRelation")
    public JAXBElement<ArkivFlerRelationType> createArkivFlerRelation(ArkivFlerRelationType value) {
        return new JAXBElement<ArkivFlerRelationType>(_ArkivFlerRelation_QNAME, ArkivFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DokumentRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DokumentRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "DokumentRelation")
    public JAXBElement<DokumentRelationType> createDokumentRelation(DokumentRelationType value) {
        return new JAXBElement<DokumentRelationType>(_DokumentRelation_QNAME, DokumentRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KaldenavnTekst")
    public JAXBElement<String> createKaldenavnTekst(String value) {
        return new JAXBElement<String>(_KaldenavnTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OphavsretTekst")
    public JAXBElement<String> createOphavsretTekst(String value) {
        return new JAXBElement<String>(_OphavsretTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ErPubliceretIndikator")
    public JAXBElement<Boolean> createErPubliceretIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_ErPubliceretIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "EksempelTekst")
    public JAXBElement<String> createEksempelTekst(String value) {
        return new JAXBElement<String>(_EksempelTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OmfangTekst")
    public JAXBElement<String> createOmfangTekst(String value) {
        return new JAXBElement<String>(_OmfangTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "RetskildeTekst")
    public JAXBElement<String> createRetskildeTekst(String value) {
        return new JAXBElement<String>(_RetskildeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AendringsnotatTekst")
    public JAXBElement<String> createAendringsnotatTekst(String value) {
        return new JAXBElement<String>(_AendringsnotatTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FacetRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FacetRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FacetRelation")
    public JAXBElement<FacetRelationType> createFacetRelation(FacetRelationType value) {
        return new JAXBElement<FacetRelationType>(_FacetRelation_QNAME, FacetRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OpbygningTekst")
    public JAXBElement<String> createOpbygningTekst(String value) {
        return new JAXBElement<String>(_OpbygningTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "PlanIdentifikator")
    public JAXBElement<String> createPlanIdentifikator(String value) {
        return new JAXBElement<String>(_PlanIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SupplementTekst")
    public JAXBElement<String> createSupplementTekst(String value) {
        return new JAXBElement<String>(_SupplementTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KlassifikationRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link KlassifikationRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "KlassifikationRelation")
    public JAXBElement<KlassifikationRelationType> createKlassifikationRelation(KlassifikationRelationType value) {
        return new JAXBElement<KlassifikationRelationType>(_KlassifikationRelation_QNAME, KlassifikationRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "BestemmelserTekst")
    public JAXBElement<String> createBestemmelserTekst(String value) {
        return new JAXBElement<String>(_BestemmelserTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirkningType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirkningType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Virkning")
    public JAXBElement<VirkningType> createVirkning(VirkningType value) {
        return new JAXBElement<VirkningType>(_Virkning_QNAME, VirkningType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "FlerRelation")
    public JAXBElement<FlerRelationType> createFlerRelation(FlerRelationType value) {
        return new JAXBElement<FlerRelationType>(_FlerRelation_QNAME, FlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "Relation")
    public JAXBElement<RelationType> createRelation(RelationType value) {
        return new JAXBElement<RelationType>(_Relation_QNAME, RelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UnikId")
    public JAXBElement<UnikIdType> createUnikId(UnikIdType value) {
        return new JAXBElement<UnikIdType>(_UnikId_QNAME, UnikIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TidspunktType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilTidspunkt")
    public JAXBElement<TidspunktType> createTilTidspunkt(TidspunktType value) {
        return new JAXBElement<TidspunktType>(_TilTidspunkt_QNAME, TidspunktType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AktoerRef")
    public JAXBElement<UnikIdType> createAktoerRef(UnikIdType value) {
        return new JAXBElement<UnikIdType>(_AktoerRef_QNAME, UnikIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnikIdType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ReferenceID")
    public JAXBElement<UnikIdType> createReferenceID(UnikIdType value) {
        return new JAXBElement<UnikIdType>(_ReferenceID_QNAME, UnikIdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OffentlighedUndtagetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OffentlighedUndtagetType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OffentlighedUndtaget")
    public JAXBElement<OffentlighedUndtagetType> createOffentlighedUndtaget(OffentlighedUndtagetType value) {
        return new JAXBElement<OffentlighedUndtagetType>(_OffentlighedUndtaget_QNAME, OffentlighedUndtagetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NulFlerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NulFlerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "NulFlerRelation")
    public JAXBElement<NulFlerRelationType> createNulFlerRelation(NulFlerRelationType value) {
        return new JAXBElement<NulFlerRelationType>(_NulFlerRelation_QNAME, NulFlerRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "JournalPostIdentifikator")
    public JAXBElement<String> createJournalPostIdentifikator(String value) {
        return new JAXBElement<String>(_JournalPostIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "IndeksIdentifikator")
    public JAXBElement<BigInteger> createIndeksIdentifikator(BigInteger value) {
        return new JAXBElement<BigInteger>(_IndeksIdentifikator_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TilhoersforholdKodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TilhoersforholdKodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TilhoersforholdKode")
    public JAXBElement<TilhoersforholdKodeType> createTilhoersforholdKode(TilhoersforholdKodeType value) {
        return new JAXBElement<TilhoersforholdKodeType>(_TilhoersforholdKode_QNAME, TilhoersforholdKodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "VariantTekst")
    public JAXBElement<String> createVariantTekst(String value) {
        return new JAXBElement<String>(_VariantTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ArkiveringIndikator")
    public JAXBElement<Boolean> createArkiveringIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_ArkiveringIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "DelvisSkannetIndikator")
    public JAXBElement<Boolean> createDelvisSkannetIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_DelvisSkannetIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OffentliggoerelseIndikator")
    public JAXBElement<Boolean> createOffentliggoerelseIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_OffentliggoerelseIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ProduktionIndikator")
    public JAXBElement<Boolean> createProduktionIndikator(Boolean value) {
        return new JAXBElement<Boolean>(_ProduktionIndikator_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegeordIdentifikator")
    public JAXBElement<String> createSoegeordIdentifikator(String value) {
        return new JAXBElement<String>(_SoegeordIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegeordKategoriTekst")
    public JAXBElement<String> createSoegeordKategoriTekst(String value) {
        return new JAXBElement<String>(_SoegeordKategoriTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArkivTypeKodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArkivTypeKodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "ArkivTypeKode")
    public JAXBElement<ArkivTypeKodeType> createArkivTypeKode(ArkivTypeKodeType value) {
        return new JAXBElement<ArkivTypeKodeType>(_ArkivTypeKode_QNAME, ArkivTypeKodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "URNIdentifikator")
    public JAXBElement<String> createURNIdentifikator(String value) {
        return new JAXBElement<String>(_URNIdentifikator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerTypeKodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerTypeKodeType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "AktoerTypeKode")
    public JAXBElement<AktoerTypeKodeType> createAktoerTypeKode(AktoerTypeKodeType value) {
        return new JAXBElement<AktoerTypeKodeType>(_AktoerTypeKode_QNAME, AktoerTypeKodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "TitelAlternativTekst")
    public JAXBElement<String> createTitelAlternativTekst(String value) {
        return new JAXBElement<String>(_TitelAlternativTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "OffentlighedUndtagetHjemmelTekst")
    public JAXBElement<String> createOffentlighedUndtagetHjemmelTekst(String value) {
        return new JAXBElement<String>(_OffentlighedUndtagetHjemmelTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "DelTekst")
    public JAXBElement<String> createDelTekst(String value) {
        return new JAXBElement<String>(_DelTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "IndholdTekst")
    public JAXBElement<String> createIndholdTekst(String value) {
        return new JAXBElement<String>(_IndholdTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "LokationTekst")
    public JAXBElement<String> createLokationTekst(String value) {
        return new JAXBElement<String>(_LokationTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "MimetypeTekst")
    public JAXBElement<String> createMimetypeTekst(String value) {
        return new JAXBElement<String>(_MimetypeTekst_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SoegRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "SoegUnderRedigeringAf")
    public JAXBElement<SoegRelationType> createSoegUnderRedigeringAf(SoegRelationType value) {
        return new JAXBElement<SoegRelationType>(_SoegUnderRedigeringAf_QNAME, SoegRelationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AktoerRelationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oio:sagdok:3.0.0", name = "UnderRedigeringAf")
    public JAXBElement<AktoerRelationType> createUnderRedigeringAf(AktoerRelationType value) {
        return new JAXBElement<AktoerRelationType>(_UnderRedigeringAf_QNAME, AktoerRelationType.class, null, value);
    }

}
