
package com.travelport.schema.air_v42_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.travelport.schema.common_v42_0.BaseAsyncProviderSpecificResponse;
import com.travelport.schema.common_v42_0.TypeFeeInfo;
import com.travelport.schema.common_v42_0.TypeTaxInfo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.travelport.schema.air_v42_0 package. 
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

    private final static QName _TaxInfo_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "TaxInfo");
    private final static QName _FeeInfo_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "FeeInfo");
    private final static QName _Text_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "Text");
    private final static QName _Title_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "Title");
    private final static QName _AirSegment_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "AirSegment");
    private final static QName _DefaultBrandDetail_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "DefaultBrandDetail");
    private final static QName _FareCalc_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "FareCalc");
    private final static QName _EmbargoInfo_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "EmbargoInfo");
    private final static QName _Meals_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "Meals");
    private final static QName _InFlightServices_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "InFlightServices");
    private final static QName _FareRoutingInformation_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "FareRoutingInformation");
    private final static QName _FareMileageInformation_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "FareMileageInformation");
    private final static QName _OverrideCode_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "OverrideCode");
    private final static QName _OptionalServiceRef_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "OptionalServiceRef");
    private final static QName _SegmentIndex_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "SegmentIndex");
    private final static QName _AsyncProviderSpecificResponse_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "AsyncProviderSpecificResponse");
    private final static QName _EMDEndorsement_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "EMDEndorsement");
    private final static QName _ApplicableSegment_QNAME = new QName("http://www.travelport.com/schema/air_v42_0", "ApplicableSegment");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.travelport.schema.air_v42_0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OptionalServices }
     * 
     */
    public OptionalServices createOptionalServices() {
        return new OptionalServices();
    }

    /**
     * Create an instance of {@link ServiceAssociations }
     * 
     */
    public ServiceAssociations createServiceAssociations() {
        return new ServiceAssociations();
    }

    /**
     * Create an instance of {@link AirPricingModifiers }
     * 
     */
    public AirPricingModifiers createAirPricingModifiers() {
        return new AirPricingModifiers();
    }

    /**
     * Create an instance of {@link AirSegmentPricingModifiers }
     * 
     */
    public AirSegmentPricingModifiers createAirSegmentPricingModifiers() {
        return new AirSegmentPricingModifiers();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceInfo }
     * 
     */
    public CarryOnAllowanceInfo createCarryOnAllowanceInfo() {
        return new CarryOnAllowanceInfo();
    }

    /**
     * Create an instance of {@link FareRulesFilter }
     * 
     */
    public FareRulesFilter createFareRulesFilter() {
        return new FareRulesFilter();
    }

    /**
     * Create an instance of {@link TicketingModifiers }
     * 
     */
    public TicketingModifiers createTicketingModifiers() {
        return new TicketingModifiers();
    }

    /**
     * Create an instance of {@link SolutionGroup }
     * 
     */
    public SolutionGroup createSolutionGroup() {
        return new SolutionGroup();
    }

    /**
     * Create an instance of {@link AirExchangeModifiers }
     * 
     */
    public AirExchangeModifiers createAirExchangeModifiers() {
        return new AirExchangeModifiers();
    }

    /**
     * Create an instance of {@link AirSearchModifiers }
     * 
     */
    public AirSearchModifiers createAirSearchModifiers() {
        return new AirSearchModifiers();
    }

    /**
     * Create an instance of {@link AirLegModifiers }
     * 
     */
    public AirLegModifiers createAirLegModifiers() {
        return new AirLegModifiers();
    }

    /**
     * Create an instance of {@link SeatInformation }
     * 
     */
    public SeatInformation createSeatInformation() {
        return new SeatInformation();
    }

    /**
     * Create an instance of {@link AirSearchAsynchModifiers }
     * 
     */
    public AirSearchAsynchModifiers createAirSearchAsynchModifiers() {
        return new AirSearchAsynchModifiers();
    }

    /**
     * Create an instance of {@link AirAvailInfo }
     * 
     */
    public AirAvailInfo createAirAvailInfo() {
        return new AirAvailInfo();
    }

    /**
     * Create an instance of {@link SpecificTimeTable }
     * 
     */
    public SpecificTimeTable createSpecificTimeTable() {
        return new SpecificTimeTable();
    }

    /**
     * Create an instance of {@link RelatedTraveler }
     * 
     */
    public RelatedTraveler createRelatedTraveler() {
        return new RelatedTraveler();
    }

    /**
     * Create an instance of {@link BookingRules }
     * 
     */
    public BookingRules createBookingRules() {
        return new BookingRules();
    }

    /**
     * Create an instance of {@link Restriction }
     * 
     */
    public Restriction createRestriction() {
        return new Restriction();
    }

    /**
     * Create an instance of {@link RoutingRules }
     * 
     */
    public RoutingRules createRoutingRules() {
        return new RoutingRules();
    }

    /**
     * Create an instance of {@link ChargesRules }
     * 
     */
    public ChargesRules createChargesRules() {
        return new ChargesRules();
    }

    /**
     * Create an instance of {@link EMDTravelerInfo }
     * 
     */
    public EMDTravelerInfo createEMDTravelerInfo() {
        return new EMDTravelerInfo();
    }

    /**
     * Create an instance of {@link RepricingModifiers }
     * 
     */
    public RepricingModifiers createRepricingModifiers() {
        return new RepricingModifiers();
    }

    /**
     * Create an instance of {@link AirTicketingReq }
     * 
     */
    public AirTicketingReq createAirTicketingReq() {
        return new AirTicketingReq();
    }

    /**
     * Create an instance of {@link BaseAirExchangeQuoteReq }
     * 
     */
    public BaseAirExchangeQuoteReq createBaseAirExchangeQuoteReq() {
        return new BaseAirExchangeQuoteReq();
    }

    /**
     * Create an instance of {@link AirFareRulesReq }
     * 
     */
    public AirFareRulesReq createAirFareRulesReq() {
        return new AirFareRulesReq();
    }

    /**
     * Create an instance of {@link FlightTimeTableRsp }
     * 
     */
    public FlightTimeTableRsp createFlightTimeTableRsp() {
        return new FlightTimeTableRsp();
    }

    /**
     * Create an instance of {@link AirPrePayReq }
     * 
     */
    public AirPrePayReq createAirPrePayReq() {
        return new AirPrePayReq();
    }

    /**
     * Create an instance of {@link EMDRetrieveReq }
     * 
     */
    public EMDRetrieveReq createEMDRetrieveReq() {
        return new EMDRetrieveReq();
    }

    /**
     * Create an instance of {@link AirMerchandisingDetailsRsp }
     * 
     */
    public AirMerchandisingDetailsRsp createAirMerchandisingDetailsRsp() {
        return new AirMerchandisingDetailsRsp();
    }

    /**
     * Create an instance of {@link AirExchangeEligibilityReq }
     * 
     */
    public AirExchangeEligibilityReq createAirExchangeEligibilityReq() {
        return new AirExchangeEligibilityReq();
    }

    /**
     * Create an instance of {@link RoutingRules.Routing }
     * 
     */
    public RoutingRules.Routing createRoutingRulesRouting() {
        return new RoutingRules.Routing();
    }

    /**
     * Create an instance of {@link AirReservation }
     * 
     */
    public AirReservation createAirReservation() {
        return new AirReservation();
    }

    /**
     * Create an instance of {@link TypeBaseAirReservation }
     * 
     */
    public TypeBaseAirReservation createTypeBaseAirReservation() {
        return new TypeBaseAirReservation();
    }

    /**
     * Create an instance of {@link OptionalServices.OptionalServicesTotal }
     * 
     */
    public OptionalServices.OptionalServicesTotal createOptionalServicesOptionalServicesTotal() {
        return new OptionalServices.OptionalServicesTotal();
    }

    /**
     * Create an instance of {@link OptionalService }
     * 
     */
    public OptionalService createOptionalService() {
        return new OptionalService();
    }

    /**
     * Create an instance of {@link EMD }
     * 
     */
    public EMD createEMD() {
        return new EMD();
    }

    /**
     * Create an instance of {@link BundledServices }
     * 
     */
    public BundledServices createBundledServices() {
        return new BundledServices();
    }

    /**
     * Create an instance of {@link BundledService }
     * 
     */
    public BundledService createBundledService() {
        return new BundledService();
    }

    /**
     * Create an instance of {@link AdditionalInfo }
     * 
     */
    public AdditionalInfo createAdditionalInfo() {
        return new AdditionalInfo();
    }

    /**
     * Create an instance of {@link FeeApplication }
     * 
     */
    public FeeApplication createFeeApplication() {
        return new FeeApplication();
    }

    /**
     * Create an instance of {@link TypeTextElement }
     * 
     */
    public TypeTextElement createTypeTextElement() {
        return new TypeTextElement();
    }

    /**
     * Create an instance of {@link PriceRange }
     * 
     */
    public PriceRange createPriceRange() {
        return new PriceRange();
    }

    /**
     * Create an instance of {@link TourCode }
     * 
     */
    public TourCode createTourCode() {
        return new TourCode();
    }

    /**
     * Create an instance of {@link BrandingInfo }
     * 
     */
    public BrandingInfo createBrandingInfo() {
        return new BrandingInfo();
    }

    /**
     * Create an instance of {@link ImageLocation }
     * 
     */
    public ImageLocation createImageLocation() {
        return new ImageLocation();
    }

    /**
     * Create an instance of {@link ServiceGroup }
     * 
     */
    public ServiceGroup createServiceGroup() {
        return new ServiceGroup();
    }

    /**
     * Create an instance of {@link ServiceSubGroup }
     * 
     */
    public ServiceSubGroup createServiceSubGroup() {
        return new ServiceSubGroup();
    }

    /**
     * Create an instance of {@link GroupedOptionInfo }
     * 
     */
    public GroupedOptionInfo createGroupedOptionInfo() {
        return new GroupedOptionInfo();
    }

    /**
     * Create an instance of {@link GroupedOption }
     * 
     */
    public GroupedOption createGroupedOption() {
        return new GroupedOption();
    }

    /**
     * Create an instance of {@link DocumentInfo }
     * 
     */
    public DocumentInfo createDocumentInfo() {
        return new DocumentInfo();
    }

    /**
     * Create an instance of {@link TicketInfo }
     * 
     */
    public TicketInfo createTicketInfo() {
        return new TicketInfo();
    }

    /**
     * Create an instance of {@link ConjunctedTicketInfo }
     * 
     */
    public ConjunctedTicketInfo createConjunctedTicketInfo() {
        return new ConjunctedTicketInfo();
    }

    /**
     * Create an instance of {@link ExchangedTicketInfo }
     * 
     */
    public ExchangedTicketInfo createExchangedTicketInfo() {
        return new ExchangedTicketInfo();
    }

    /**
     * Create an instance of {@link TCRInfo }
     * 
     */
    public TCRInfo createTCRInfo() {
        return new TCRInfo();
    }

    /**
     * Create an instance of {@link TypeBaseAirSegment }
     * 
     */
    public TypeBaseAirSegment createTypeBaseAirSegment() {
        return new TypeBaseAirSegment();
    }

    /**
     * Create an instance of {@link AirPricingInfo }
     * 
     */
    public AirPricingInfo createAirPricingInfo() {
        return new AirPricingInfo();
    }

    /**
     * Create an instance of {@link FareInfo }
     * 
     */
    public FareInfo createFareInfo() {
        return new FareInfo();
    }

    /**
     * Create an instance of {@link FareTicketDesignator }
     * 
     */
    public FareTicketDesignator createFareTicketDesignator() {
        return new FareTicketDesignator();
    }

    /**
     * Create an instance of {@link FareSurcharge }
     * 
     */
    public FareSurcharge createFareSurcharge() {
        return new FareSurcharge();
    }

    /**
     * Create an instance of {@link ContractCode }
     * 
     */
    public ContractCode createContractCode() {
        return new ContractCode();
    }

    /**
     * Create an instance of {@link BaggageAllowance }
     * 
     */
    public BaggageAllowance createBaggageAllowance() {
        return new BaggageAllowance();
    }

    /**
     * Create an instance of {@link TypeWeight }
     * 
     */
    public TypeWeight createTypeWeight() {
        return new TypeWeight();
    }

    /**
     * Create an instance of {@link FareRuleKey }
     * 
     */
    public FareRuleKey createFareRuleKey() {
        return new FareRuleKey();
    }

    /**
     * Create an instance of {@link FareRuleFailureInfo }
     * 
     */
    public FareRuleFailureInfo createFareRuleFailureInfo() {
        return new FareRuleFailureInfo();
    }

    /**
     * Create an instance of {@link FareRemarkRef }
     * 
     */
    public FareRemarkRef createFareRemarkRef() {
        return new FareRemarkRef();
    }

    /**
     * Create an instance of {@link Brand }
     * 
     */
    public Brand createBrand() {
        return new Brand();
    }

    /**
     * Create an instance of {@link Rules }
     * 
     */
    public Rules createRules() {
        return new Rules();
    }

    /**
     * Create an instance of {@link ServiceAssociations.ApplicableSegment }
     * 
     */
    public ServiceAssociations.ApplicableSegment createServiceAssociationsApplicableSegment() {
        return new ServiceAssociations.ApplicableSegment();
    }

    /**
     * Create an instance of {@link UpsellBrand }
     * 
     */
    public UpsellBrand createUpsellBrand() {
        return new UpsellBrand();
    }

    /**
     * Create an instance of {@link TypeApplicableSegment }
     * 
     */
    public TypeApplicableSegment createTypeApplicableSegment() {
        return new TypeApplicableSegment();
    }

    /**
     * Create an instance of {@link TypeDefaultBrandDetail }
     * 
     */
    public TypeDefaultBrandDetail createTypeDefaultBrandDetail() {
        return new TypeDefaultBrandDetail();
    }

    /**
     * Create an instance of {@link FareStatus }
     * 
     */
    public FareStatus createFareStatus() {
        return new FareStatus();
    }

    /**
     * Create an instance of {@link FareStatusFailureInfo }
     * 
     */
    public FareStatusFailureInfo createFareStatusFailureInfo() {
        return new FareStatusFailureInfo();
    }

    /**
     * Create an instance of {@link FareInfoRef }
     * 
     */
    public FareInfoRef createFareInfoRef() {
        return new FareInfoRef();
    }

    /**
     * Create an instance of {@link BookingInfo }
     * 
     */
    public BookingInfo createBookingInfo() {
        return new BookingInfo();
    }

    /**
     * Create an instance of {@link PassengerType }
     * 
     */
    public PassengerType createPassengerType() {
        return new PassengerType();
    }

    /**
     * Create an instance of {@link FareGuaranteeInfo }
     * 
     */
    public FareGuaranteeInfo createFareGuaranteeInfo() {
        return new FareGuaranteeInfo();
    }

    /**
     * Create an instance of {@link WaiverCode }
     * 
     */
    public WaiverCode createWaiverCode() {
        return new WaiverCode();
    }

    /**
     * Create an instance of {@link PaymentRef }
     * 
     */
    public PaymentRef createPaymentRef() {
        return new PaymentRef();
    }

    /**
     * Create an instance of {@link TypeFarePenalty }
     * 
     */
    public TypeFarePenalty createTypeFarePenalty() {
        return new TypeFarePenalty();
    }

    /**
     * Create an instance of {@link Adjustment }
     * 
     */
    public Adjustment createAdjustment() {
        return new Adjustment();
    }

    /**
     * Create an instance of {@link Yield }
     * 
     */
    public Yield createYield() {
        return new Yield();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.ProhibitedRuleCategories }
     * 
     */
    public AirPricingModifiers.ProhibitedRuleCategories createAirPricingModifiersProhibitedRuleCategories() {
        return new AirPricingModifiers.ProhibitedRuleCategories();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.AccountCodes }
     * 
     */
    public AirPricingModifiers.AccountCodes createAirPricingModifiersAccountCodes() {
        return new AirPricingModifiers.AccountCodes();
    }

    /**
     * Create an instance of {@link PermittedCabins }
     * 
     */
    public PermittedCabins createPermittedCabins() {
        return new PermittedCabins();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.ContractCodes }
     * 
     */
    public AirPricingModifiers.ContractCodes createAirPricingModifiersContractCodes() {
        return new AirPricingModifiers.ContractCodes();
    }

    /**
     * Create an instance of {@link ExemptTaxes }
     * 
     */
    public ExemptTaxes createExemptTaxes() {
        return new ExemptTaxes();
    }

    /**
     * Create an instance of {@link PenaltyFareInformation }
     * 
     */
    public PenaltyFareInformation createPenaltyFareInformation() {
        return new PenaltyFareInformation();
    }

    /**
     * Create an instance of {@link AirPricingModifiers.PromoCodes }
     * 
     */
    public AirPricingModifiers.PromoCodes createAirPricingModifiersPromoCodes() {
        return new AirPricingModifiers.PromoCodes();
    }

    /**
     * Create an instance of {@link ManualFareAdjustment }
     * 
     */
    public ManualFareAdjustment createManualFareAdjustment() {
        return new ManualFareAdjustment();
    }

    /**
     * Create an instance of {@link BrandModifiers }
     * 
     */
    public BrandModifiers createBrandModifiers() {
        return new BrandModifiers();
    }

    /**
     * Create an instance of {@link MultiGDSSearchIndicator }
     * 
     */
    public MultiGDSSearchIndicator createMultiGDSSearchIndicator() {
        return new MultiGDSSearchIndicator();
    }

    /**
     * Create an instance of {@link TicketingModifiersRef }
     * 
     */
    public TicketingModifiersRef createTicketingModifiersRef() {
        return new TicketingModifiersRef();
    }

    /**
     * Create an instance of {@link AirSegmentPricingModifiers.PermittedBookingCodes }
     * 
     */
    public AirSegmentPricingModifiers.PermittedBookingCodes createAirSegmentPricingModifiersPermittedBookingCodes() {
        return new AirSegmentPricingModifiers.PermittedBookingCodes();
    }

    /**
     * Create an instance of {@link FlightOptionsList }
     * 
     */
    public FlightOptionsList createFlightOptionsList() {
        return new FlightOptionsList();
    }

    /**
     * Create an instance of {@link FlightOption }
     * 
     */
    public FlightOption createFlightOption() {
        return new FlightOption();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link Connection }
     * 
     */
    public Connection createConnection() {
        return new Connection();
    }

    /**
     * Create an instance of {@link FareNote }
     * 
     */
    public FareNote createFareNote() {
        return new FareNote();
    }

    /**
     * Create an instance of {@link BaggageAllowances }
     * 
     */
    public BaggageAllowances createBaggageAllowances() {
        return new BaggageAllowances();
    }

    /**
     * Create an instance of {@link BaggageAllowanceInfo }
     * 
     */
    public BaggageAllowanceInfo createBaggageAllowanceInfo() {
        return new BaggageAllowanceInfo();
    }

    /**
     * Create an instance of {@link BaseBaggageAllowanceInfo }
     * 
     */
    public BaseBaggageAllowanceInfo createBaseBaggageAllowanceInfo() {
        return new BaseBaggageAllowanceInfo();
    }

    /**
     * Create an instance of {@link URLInfo }
     * 
     */
    public URLInfo createURLInfo() {
        return new URLInfo();
    }

    /**
     * Create an instance of {@link TextInfo }
     * 
     */
    public TextInfo createTextInfo() {
        return new TextInfo();
    }

    /**
     * Create an instance of {@link BagDetails }
     * 
     */
    public BagDetails createBagDetails() {
        return new BagDetails();
    }

    /**
     * Create an instance of {@link BaggageRestriction }
     * 
     */
    public BaggageRestriction createBaggageRestriction() {
        return new BaggageRestriction();
    }

    /**
     * Create an instance of {@link Dimension }
     * 
     */
    public Dimension createDimension() {
        return new Dimension();
    }

    /**
     * Create an instance of {@link TypeUnitOfMeasure }
     * 
     */
    public TypeUnitOfMeasure createTypeUnitOfMeasure() {
        return new TypeUnitOfMeasure();
    }

    /**
     * Create an instance of {@link AvailableDiscount }
     * 
     */
    public AvailableDiscount createAvailableDiscount() {
        return new AvailableDiscount();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceInfo.CarryOnDetails }
     * 
     */
    public CarryOnAllowanceInfo.CarryOnDetails createCarryOnAllowanceInfoCarryOnDetails() {
        return new CarryOnAllowanceInfo.CarryOnDetails();
    }

    /**
     * Create an instance of {@link FareRulesFilter.Refundability }
     * 
     */
    public FareRulesFilter.Refundability createFareRulesFilterRefundability() {
        return new FareRulesFilter.Refundability();
    }

    /**
     * Create an instance of {@link PolicyCodesList }
     * 
     */
    public PolicyCodesList createPolicyCodesList() {
        return new PolicyCodesList();
    }

    /**
     * Create an instance of {@link PriceChangeType }
     * 
     */
    public PriceChangeType createPriceChangeType() {
        return new PriceChangeType();
    }

    /**
     * Create an instance of {@link ActionDetails }
     * 
     */
    public ActionDetails createActionDetails() {
        return new ActionDetails();
    }

    /**
     * Create an instance of {@link TypeTaxInfoWithPaymentRef }
     * 
     */
    public TypeTaxInfoWithPaymentRef createTypeTaxInfoWithPaymentRef() {
        return new TypeTaxInfoWithPaymentRef();
    }

    /**
     * Create an instance of {@link TypeTicketModifierAmountType }
     * 
     */
    public TypeTicketModifierAmountType createTypeTicketModifierAmountType() {
        return new TypeTicketModifierAmountType();
    }

    /**
     * Create an instance of {@link TypeTicketModifierAccountingType }
     * 
     */
    public TypeTicketModifierAccountingType createTypeTicketModifierAccountingType() {
        return new TypeTicketModifierAccountingType();
    }

    /**
     * Create an instance of {@link TicketingModifiers.BulkTicket }
     * 
     */
    public TicketingModifiers.BulkTicket createTicketingModifiersBulkTicket() {
        return new TicketingModifiers.BulkTicket();
    }

    /**
     * Create an instance of {@link TypeBulkTicketModifierType }
     * 
     */
    public TypeBulkTicketModifierType createTypeBulkTicketModifierType() {
        return new TypeBulkTicketModifierType();
    }

    /**
     * Create an instance of {@link TicketEndorsement }
     * 
     */
    public TicketEndorsement createTicketEndorsement() {
        return new TicketEndorsement();
    }

    /**
     * Create an instance of {@link TypeTicketModifierValueType }
     * 
     */
    public TypeTicketModifierValueType createTypeTicketModifierValueType() {
        return new TypeTicketModifierValueType();
    }

    /**
     * Create an instance of {@link DocumentSelect }
     * 
     */
    public DocumentSelect createDocumentSelect() {
        return new DocumentSelect();
    }

    /**
     * Create an instance of {@link BackOfficeHandOff }
     * 
     */
    public BackOfficeHandOff createBackOfficeHandOff() {
        return new BackOfficeHandOff();
    }

    /**
     * Create an instance of {@link Itinerary }
     * 
     */
    public Itinerary createItinerary() {
        return new Itinerary();
    }

    /**
     * Create an instance of {@link DocumentOptions }
     * 
     */
    public DocumentOptions createDocumentOptions() {
        return new DocumentOptions();
    }

    /**
     * Create an instance of {@link PassengerReceiptOverride }
     * 
     */
    public PassengerReceiptOverride createPassengerReceiptOverride() {
        return new PassengerReceiptOverride();
    }

    /**
     * Create an instance of {@link SegmentSelect }
     * 
     */
    public SegmentSelect createSegmentSelect() {
        return new SegmentSelect();
    }

    /**
     * Create an instance of {@link TypeSegmentRef }
     * 
     */
    public TypeSegmentRef createTypeSegmentRef() {
        return new TypeSegmentRef();
    }

    /**
     * Create an instance of {@link TypeNonAirReservationRef }
     * 
     */
    public TypeNonAirReservationRef createTypeNonAirReservationRef() {
        return new TypeNonAirReservationRef();
    }

    /**
     * Create an instance of {@link SegmentModifiers }
     * 
     */
    public SegmentModifiers createSegmentModifiers() {
        return new SegmentModifiers();
    }

    /**
     * Create an instance of {@link AirSegmentRef }
     * 
     */
    public AirSegmentRef createAirSegmentRef() {
        return new AirSegmentRef();
    }

    /**
     * Create an instance of {@link TicketValidity }
     * 
     */
    public TicketValidity createTicketValidity() {
        return new TicketValidity();
    }

    /**
     * Create an instance of {@link DestinationPurposeCode }
     * 
     */
    public DestinationPurposeCode createDestinationPurposeCode() {
        return new DestinationPurposeCode();
    }

    /**
     * Create an instance of {@link LanguageOption }
     * 
     */
    public LanguageOption createLanguageOption() {
        return new LanguageOption();
    }

    /**
     * Create an instance of {@link LandCharges }
     * 
     */
    public LandCharges createLandCharges() {
        return new LandCharges();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link PrintBlankFormItinerary }
     * 
     */
    public PrintBlankFormItinerary createPrintBlankFormItinerary() {
        return new PrintBlankFormItinerary();
    }

    /**
     * Create an instance of {@link ExcludeTicketing }
     * 
     */
    public ExcludeTicketing createExcludeTicketing() {
        return new ExcludeTicketing();
    }

    /**
     * Create an instance of {@link ExemptOBFee }
     * 
     */
    public ExemptOBFee createExemptOBFee() {
        return new ExemptOBFee();
    }

    /**
     * Create an instance of {@link AssociatedRemark }
     * 
     */
    public AssociatedRemark createAssociatedRemark() {
        return new AssociatedRemark();
    }

    /**
     * Create an instance of {@link PocketItineraryRemark }
     * 
     */
    public PocketItineraryRemark createPocketItineraryRemark() {
        return new PocketItineraryRemark();
    }

    /**
     * Create an instance of {@link AirExchangeBundleTotal }
     * 
     */
    public AirExchangeBundleTotal createAirExchangeBundleTotal() {
        return new AirExchangeBundleTotal();
    }

    /**
     * Create an instance of {@link AirExchangeBundle }
     * 
     */
    public AirExchangeBundle createAirExchangeBundle() {
        return new AirExchangeBundle();
    }

    /**
     * Create an instance of {@link AirPricingInfoRef }
     * 
     */
    public AirPricingInfoRef createAirPricingInfoRef() {
        return new com.travelport.schema.air_v42_0.AirPricingInfoRef();
    }

    /**
     * Create an instance of {@link AirPricingInfoList }
     * 
     */
    public AirPricingInfoList createAirPricingInfoList() {
        return new AirPricingInfoList();
    }

    /**
     * Create an instance of {@link AirPricingCommand }
     * 
     */
    public AirPricingCommand createAirPricingCommand() {
        return new AirPricingCommand();
    }

    /**
     * Create an instance of {@link ExchangeAirSegment }
     * 
     */
    public ExchangeAirSegment createExchangeAirSegment() {
        return new ExchangeAirSegment();
    }

    /**
     * Create an instance of {@link TCRExchangeBundle }
     * 
     */
    public TCRExchangeBundle createTCRExchangeBundle() {
        return new TCRExchangeBundle();
    }

    /**
     * Create an instance of {@link AirExchangeTicketBundle }
     * 
     */
    public AirExchangeTicketBundle createAirExchangeTicketBundle() {
        return new AirExchangeTicketBundle();
    }

    /**
     * Create an instance of {@link Enumeration }
     * 
     */
    public Enumeration createEnumeration() {
        return new Enumeration();
    }

    /**
     * Create an instance of {@link SolutionGroup.PermittedAccountCodes }
     * 
     */
    public SolutionGroup.PermittedAccountCodes createSolutionGroupPermittedAccountCodes() {
        return new SolutionGroup.PermittedAccountCodes();
    }

    /**
     * Create an instance of {@link SolutionGroup.PreferredAccountCodes }
     * 
     */
    public SolutionGroup.PreferredAccountCodes createSolutionGroupPreferredAccountCodes() {
        return new SolutionGroup.PreferredAccountCodes();
    }

    /**
     * Create an instance of {@link SolutionGroup.ProhibitedAccountCodes }
     * 
     */
    public SolutionGroup.ProhibitedAccountCodes createSolutionGroupProhibitedAccountCodes() {
        return new SolutionGroup.ProhibitedAccountCodes();
    }

    /**
     * Create an instance of {@link SolutionGroup.PermittedPointOfSales }
     * 
     */
    public SolutionGroup.PermittedPointOfSales createSolutionGroupPermittedPointOfSales() {
        return new SolutionGroup.PermittedPointOfSales();
    }

    /**
     * Create an instance of {@link SolutionGroup.ProhibitedPointOfSales }
     * 
     */
    public SolutionGroup.ProhibitedPointOfSales createSolutionGroupProhibitedPointOfSales() {
        return new SolutionGroup.ProhibitedPointOfSales();
    }

    /**
     * Create an instance of {@link AirSegmentList }
     * 
     */
    public AirSegmentList createAirSegmentList() {
        return new AirSegmentList();
    }

    /**
     * Create an instance of {@link AirScheduleChangedInfo }
     * 
     */
    public AirScheduleChangedInfo createAirScheduleChangedInfo() {
        return new AirScheduleChangedInfo();
    }

    /**
     * Create an instance of {@link AirPricingSolution }
     * 
     */
    public AirPricingSolution createAirPricingSolution() {
        return new AirPricingSolution();
    }

    /**
     * Create an instance of {@link Journey }
     * 
     */
    public Journey createJourney() {
        return new Journey();
    }

    /**
     * Create an instance of {@link LegRef }
     * 
     */
    public LegRef createLegRef() {
        return new LegRef();
    }

    /**
     * Create an instance of {@link FareNoteRef }
     * 
     */
    public FareNoteRef createFareNoteRef() {
        return new FareNoteRef();
    }

    /**
     * Create an instance of {@link AirItinerarySolutionRef }
     * 
     */
    public AirItinerarySolutionRef createAirItinerarySolutionRef() {
        return new AirItinerarySolutionRef();
    }

    /**
     * Create an instance of {@link AvailableSSR }
     * 
     */
    public AvailableSSR createAvailableSSR() {
        return new AvailableSSR();
    }

    /**
     * Create an instance of {@link PricingDetails }
     * 
     */
    public PricingDetails createPricingDetails() {
        return new PricingDetails();
    }

    /**
     * Create an instance of {@link AirSolutionChangedInfo }
     * 
     */
    public AirSolutionChangedInfo createAirSolutionChangedInfo() {
        return new AirSolutionChangedInfo();
    }

    /**
     * Create an instance of {@link AirPriceResult }
     * 
     */
    public AirPriceResult createAirPriceResult() {
        return new AirPriceResult();
    }

    /**
     * Create an instance of {@link FareRule }
     * 
     */
    public FareRule createFareRule() {
        return new FareRule();
    }

    /**
     * Create an instance of {@link FareRuleLong }
     * 
     */
    public FareRuleLong createFareRuleLong() {
        return new FareRuleLong();
    }

    /**
     * Create an instance of {@link FareRuleShort }
     * 
     */
    public FareRuleShort createFareRuleShort() {
        return new FareRuleShort();
    }

    /**
     * Create an instance of {@link FareRuleNameValue }
     * 
     */
    public FareRuleNameValue createFareRuleNameValue() {
        return new FareRuleNameValue();
    }

    /**
     * Create an instance of {@link RuleAdvancedPurchase }
     * 
     */
    public RuleAdvancedPurchase createRuleAdvancedPurchase() {
        return new RuleAdvancedPurchase();
    }

    /**
     * Create an instance of {@link RuleLengthOfStay }
     * 
     */
    public RuleLengthOfStay createRuleLengthOfStay() {
        return new RuleLengthOfStay();
    }

    /**
     * Create an instance of {@link TypeRestrictionLengthOfStay }
     * 
     */
    public TypeRestrictionLengthOfStay createTypeRestrictionLengthOfStay() {
        return new TypeRestrictionLengthOfStay();
    }

    /**
     * Create an instance of {@link RuleCharges }
     * 
     */
    public RuleCharges createRuleCharges() {
        return new RuleCharges();
    }

    /**
     * Create an instance of {@link FareInfoList }
     * 
     */
    public FareInfoList createFareInfoList() {
        return new FareInfoList();
    }

    /**
     * Create an instance of {@link FareRemarkList }
     * 
     */
    public FareRemarkList createFareRemarkList() {
        return new FareRemarkList();
    }

    /**
     * Create an instance of {@link FareRemark }
     * 
     */
    public FareRemark createFareRemark() {
        return new FareRemark();
    }

    /**
     * Create an instance of {@link URL }
     * 
     */
    public URL createURL() {
        return new URL();
    }

    /**
     * Create an instance of {@link FlightDetailsList }
     * 
     */
    public FlightDetailsList createFlightDetailsList() {
        return new FlightDetailsList();
    }

    /**
     * Create an instance of {@link FlightDetails }
     * 
     */
    public FlightDetails createFlightDetails() {
        return new FlightDetails();
    }

    /**
     * Create an instance of {@link FareNoteList }
     * 
     */
    public FareNoteList createFareNoteList() {
        return new FareNoteList();
    }

    /**
     * Create an instance of {@link HostTokenList }
     * 
     */
    public HostTokenList createHostTokenList() {
        return new HostTokenList();
    }

    /**
     * Create an instance of {@link Rows }
     * 
     */
    public Rows createRows() {
        return new Rows();
    }

    /**
     * Create an instance of {@link Row }
     * 
     */
    public Row createRow() {
        return new Row();
    }

    /**
     * Create an instance of {@link Facility }
     * 
     */
    public Facility createFacility() {
        return new Facility();
    }

    /**
     * Create an instance of {@link Characteristic }
     * 
     */
    public Characteristic createCharacteristic() {
        return new Characteristic();
    }

    /**
     * Create an instance of {@link PassengerSeatPrice }
     * 
     */
    public PassengerSeatPrice createPassengerSeatPrice() {
        return new PassengerSeatPrice();
    }

    /**
     * Create an instance of {@link FareDisplay }
     * 
     */
    public FareDisplay createFareDisplay() {
        return new FareDisplay();
    }

    /**
     * Create an instance of {@link FareDisplayRule }
     * 
     */
    public FareDisplayRule createFareDisplayRule() {
        return new FareDisplayRule();
    }

    /**
     * Create an instance of {@link FarePricing }
     * 
     */
    public FarePricing createFarePricing() {
        return new FarePricing();
    }

    /**
     * Create an instance of {@link FareRestriction }
     * 
     */
    public FareRestriction createFareRestriction() {
        return new FareRestriction();
    }

    /**
     * Create an instance of {@link FareRestrictionDaysOfWeek }
     * 
     */
    public FareRestrictionDaysOfWeek createFareRestrictionDaysOfWeek() {
        return new FareRestrictionDaysOfWeek();
    }

    /**
     * Create an instance of {@link FareRestrictionDate }
     * 
     */
    public FareRestrictionDate createFareRestrictionDate() {
        return new FareRestrictionDate();
    }

    /**
     * Create an instance of {@link FareRestrictionSaleDate }
     * 
     */
    public FareRestrictionSaleDate createFareRestrictionSaleDate() {
        return new FareRestrictionSaleDate();
    }

    /**
     * Create an instance of {@link AirFareDisplayRuleKey }
     * 
     */
    public AirFareDisplayRuleKey createAirFareDisplayRuleKey() {
        return new AirFareDisplayRuleKey();
    }

    /**
     * Create an instance of {@link BookingCode }
     * 
     */
    public BookingCode createBookingCode() {
        return new BookingCode();
    }

    /**
     * Create an instance of {@link AddlBookingCodeInformation }
     * 
     */
    public AddlBookingCodeInformation createAddlBookingCodeInformation() {
        return new AddlBookingCodeInformation();
    }

    /**
     * Create an instance of {@link FareRuleLookup }
     * 
     */
    public FareRuleLookup createFareRuleLookup() {
        return new FareRuleLookup();
    }

    /**
     * Create an instance of {@link AirExchangeModifiers.ContractCodes }
     * 
     */
    public AirExchangeModifiers.ContractCodes createAirExchangeModifiersContractCodes() {
        return new AirExchangeModifiers.ContractCodes();
    }

    /**
     * Create an instance of {@link FlexExploreModifiers }
     * 
     */
    public FlexExploreModifiers createFlexExploreModifiers() {
        return new FlexExploreModifiers();
    }

    /**
     * Create an instance of {@link AirFareDisplayModifiers }
     * 
     */
    public AirFareDisplayModifiers createAirFareDisplayModifiers() {
        return new AirFareDisplayModifiers();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.DisfavoredProviders }
     * 
     */
    public AirSearchModifiers.DisfavoredProviders createAirSearchModifiersDisfavoredProviders() {
        return new AirSearchModifiers.DisfavoredProviders();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.PreferredProviders }
     * 
     */
    public AirSearchModifiers.PreferredProviders createAirSearchModifiersPreferredProviders() {
        return new AirSearchModifiers.PreferredProviders();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.DisfavoredCarriers }
     * 
     */
    public AirSearchModifiers.DisfavoredCarriers createAirSearchModifiersDisfavoredCarriers() {
        return new AirSearchModifiers.DisfavoredCarriers();
    }

    /**
     * Create an instance of {@link PermittedCarriers }
     * 
     */
    public PermittedCarriers createPermittedCarriers() {
        return new PermittedCarriers();
    }

    /**
     * Create an instance of {@link ProhibitedCarriers }
     * 
     */
    public ProhibitedCarriers createProhibitedCarriers() {
        return new ProhibitedCarriers();
    }

    /**
     * Create an instance of {@link PreferredCarriers }
     * 
     */
    public PreferredCarriers createPreferredCarriers() {
        return new PreferredCarriers();
    }

    /**
     * Create an instance of {@link PreferredCabins }
     * 
     */
    public PreferredCabins createPreferredCabins() {
        return new PreferredCabins();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.PreferredAlliances }
     * 
     */
    public AirSearchModifiers.PreferredAlliances createAirSearchModifiersPreferredAlliances() {
        return new AirSearchModifiers.PreferredAlliances();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.DisfavoredAlliances }
     * 
     */
    public AirSearchModifiers.DisfavoredAlliances createAirSearchModifiersDisfavoredAlliances() {
        return new AirSearchModifiers.DisfavoredAlliances();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.PermittedBookingCodes }
     * 
     */
    public AirSearchModifiers.PermittedBookingCodes createAirSearchModifiersPermittedBookingCodes() {
        return new AirSearchModifiers.PermittedBookingCodes();
    }

    /**
     * Create an instance of {@link PreferredBookingCodes }
     * 
     */
    public PreferredBookingCodes createPreferredBookingCodes() {
        return new PreferredBookingCodes();
    }

    /**
     * Create an instance of {@link AirSearchModifiers.ProhibitedBookingCodes }
     * 
     */
    public AirSearchModifiers.ProhibitedBookingCodes createAirSearchModifiersProhibitedBookingCodes() {
        return new AirSearchModifiers.ProhibitedBookingCodes();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link MaxLayoverDurationType }
     * 
     */
    public MaxLayoverDurationType createMaxLayoverDurationType() {
        return new MaxLayoverDurationType();
    }

    /**
     * Create an instance of {@link TypeNativeSearchModifier }
     * 
     */
    public TypeNativeSearchModifier createTypeNativeSearchModifier() {
        return new TypeNativeSearchModifier();
    }

    /**
     * Create an instance of {@link OfferAvailabilityModifiers }
     * 
     */
    public OfferAvailabilityModifiers createOfferAvailabilityModifiers() {
        return new OfferAvailabilityModifiers();
    }

    /**
     * Create an instance of {@link Alliance }
     * 
     */
    public Alliance createAlliance() {
        return new Alliance();
    }

    /**
     * Create an instance of {@link AirSolution }
     * 
     */
    public AirSolution createAirSolution() {
        return new AirSolution();
    }

    /**
     * Create an instance of {@link SearchTraveler }
     * 
     */
    public SearchTraveler createSearchTraveler() {
        return new SearchTraveler();
    }

    /**
     * Create an instance of {@link FareBasis }
     * 
     */
    public FareBasis createFareBasis() {
        return new FareBasis();
    }

    /**
     * Create an instance of {@link HostReservation }
     * 
     */
    public HostReservation createHostReservation() {
        return new HostReservation();
    }

    /**
     * Create an instance of {@link AirPricePointList }
     * 
     */
    public AirPricePointList createAirPricePointList() {
        return new AirPricePointList();
    }

    /**
     * Create an instance of {@link AirPricePoint }
     * 
     */
    public AirPricePoint createAirPricePoint() {
        return new AirPricePoint();
    }

    /**
     * Create an instance of {@link AirItinerarySolution }
     * 
     */
    public AirItinerarySolution createAirItinerarySolution() {
        return new AirItinerarySolution();
    }

    /**
     * Create an instance of {@link AirItinerary }
     * 
     */
    public AirItinerary createAirItinerary() {
        return new AirItinerary();
    }

    /**
     * Create an instance of {@link APISRequirements }
     * 
     */
    public APISRequirements createAPISRequirements() {
        return new APISRequirements();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ETR }
     * 
     */
    public ETR createETR() {
        return new ETR();
    }

    /**
     * Create an instance of {@link AirReservationLocatorCode }
     * 
     */
    public AirReservationLocatorCode createAirReservationLocatorCode() {
        return new AirReservationLocatorCode();
    }

    /**
     * Create an instance of {@link Ticket }
     * 
     */
    public Ticket createTicket() {
        return new Ticket();
    }

    /**
     * Create an instance of {@link Coupon }
     * 
     */
    public Coupon createCoupon() {
        return new Coupon();
    }

    /**
     * Create an instance of {@link TicketDesignator }
     * 
     */
    public TicketDesignator createTicketDesignator() {
        return new TicketDesignator();
    }

    /**
     * Create an instance of {@link AuditData }
     * 
     */
    public AuditData createAuditData() {
        return new AuditData();
    }

    /**
     * Create an instance of {@link TicketFailureInfo }
     * 
     */
    public TicketFailureInfo createTicketFailureInfo() {
        return new TicketFailureInfo();
    }

    /**
     * Create an instance of {@link RefundFailureInfo }
     * 
     */
    public RefundFailureInfo createRefundFailureInfo() {
        return new RefundFailureInfo();
    }

    /**
     * Create an instance of {@link VoidFailureInfo }
     * 
     */
    public VoidFailureInfo createVoidFailureInfo() {
        return new VoidFailureInfo();
    }

    /**
     * Create an instance of {@link TCR }
     * 
     */
    public TCR createTCR() {
        return new TCR();
    }

    /**
     * Create an instance of {@link PassengerTicketNumber }
     * 
     */
    public PassengerTicketNumber createPassengerTicketNumber() {
        return new PassengerTicketNumber();
    }

    /**
     * Create an instance of {@link AirFareDiscount }
     * 
     */
    public AirFareDiscount createAirFareDiscount() {
        return new AirFareDiscount();
    }

    /**
     * Create an instance of {@link SearchAirLeg }
     * 
     */
    public SearchAirLeg createSearchAirLeg() {
        return new SearchAirLeg();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PermittedConnectionPoints }
     * 
     */
    public AirLegModifiers.PermittedConnectionPoints createAirLegModifiersPermittedConnectionPoints() {
        return new AirLegModifiers.PermittedConnectionPoints();
    }

    /**
     * Create an instance of {@link AirLegModifiers.ProhibitedConnectionPoints }
     * 
     */
    public AirLegModifiers.ProhibitedConnectionPoints createAirLegModifiersProhibitedConnectionPoints() {
        return new AirLegModifiers.ProhibitedConnectionPoints();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PreferredConnectionPoints }
     * 
     */
    public AirLegModifiers.PreferredConnectionPoints createAirLegModifiersPreferredConnectionPoints() {
        return new AirLegModifiers.PreferredConnectionPoints();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PermittedBookingCodes }
     * 
     */
    public AirLegModifiers.PermittedBookingCodes createAirLegModifiersPermittedBookingCodes() {
        return new AirLegModifiers.PermittedBookingCodes();
    }

    /**
     * Create an instance of {@link AirLegModifiers.PreferredAlliances }
     * 
     */
    public AirLegModifiers.PreferredAlliances createAirLegModifiersPreferredAlliances() {
        return new AirLegModifiers.PreferredAlliances();
    }

    /**
     * Create an instance of {@link AirLegModifiers.ProhibitedBookingCodes }
     * 
     */
    public AirLegModifiers.ProhibitedBookingCodes createAirLegModifiersProhibitedBookingCodes() {
        return new AirLegModifiers.ProhibitedBookingCodes();
    }

    /**
     * Create an instance of {@link AirLegModifiers.DisfavoredAlliances }
     * 
     */
    public AirLegModifiers.DisfavoredAlliances createAirLegModifiersDisfavoredAlliances() {
        return new AirLegModifiers.DisfavoredAlliances();
    }

    /**
     * Create an instance of {@link TypeAnchorFlightData }
     * 
     */
    public TypeAnchorFlightData createTypeAnchorFlightData() {
        return new TypeAnchorFlightData();
    }

    /**
     * Create an instance of {@link AirRefundBundle }
     * 
     */
    public AirRefundBundle createAirRefundBundle() {
        return new AirRefundBundle();
    }

    /**
     * Create an instance of {@link AirRefundInfo }
     * 
     */
    public AirRefundInfo createAirRefundInfo() {
        return new AirRefundInfo();
    }

    /**
     * Create an instance of {@link TCRRefundBundle }
     * 
     */
    public TCRRefundBundle createTCRRefundBundle() {
        return new TCRRefundBundle();
    }

    /**
     * Create an instance of {@link AirRefundModifiers }
     * 
     */
    public AirRefundModifiers createAirRefundModifiers() {
        return new AirRefundModifiers();
    }

    /**
     * Create an instance of {@link AutoSeatAssignment }
     * 
     */
    public AutoSeatAssignment createAutoSeatAssignment() {
        return new AutoSeatAssignment();
    }

    /**
     * Create an instance of {@link RouteList }
     * 
     */
    public RouteList createRouteList() {
        return new RouteList();
    }

    /**
     * Create an instance of {@link Route }
     * 
     */
    public Route createRoute() {
        return new Route();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link LegDetail }
     * 
     */
    public LegDetail createLegDetail() {
        return new LegDetail();
    }

    /**
     * Create an instance of {@link AlternateRouteList }
     * 
     */
    public AlternateRouteList createAlternateRouteList() {
        return new AlternateRouteList();
    }

    /**
     * Create an instance of {@link AlternateRoute }
     * 
     */
    public AlternateRoute createAlternateRoute() {
        return new AlternateRoute();
    }

    /**
     * Create an instance of {@link AlternateLocationDistanceList }
     * 
     */
    public AlternateLocationDistanceList createAlternateLocationDistanceList() {
        return new AlternateLocationDistanceList();
    }

    /**
     * Create an instance of {@link AlternateLocationDistance }
     * 
     */
    public AlternateLocationDistance createAlternateLocationDistance() {
        return new AlternateLocationDistance();
    }

    /**
     * Create an instance of {@link ExpertSolutionList }
     * 
     */
    public ExpertSolutionList createExpertSolutionList() {
        return new ExpertSolutionList();
    }

    /**
     * Create an instance of {@link ExpertSolution }
     * 
     */
    public ExpertSolution createExpertSolution() {
        return new ExpertSolution();
    }

    /**
     * Create an instance of {@link LegPrice }
     * 
     */
    public LegPrice createLegPrice() {
        return new LegPrice();
    }

    /**
     * Create an instance of {@link FareInfoMessage }
     * 
     */
    public FareInfoMessage createFareInfoMessage() {
        return new FareInfoMessage();
    }

    /**
     * Create an instance of {@link FareRuleShortRef }
     * 
     */
    public FareRuleShortRef createFareRuleShortRef() {
        return new FareRuleShortRef();
    }

    /**
     * Create an instance of {@link FareRuleLongRef }
     * 
     */
    public FareRuleLongRef createFareRuleLongRef() {
        return new FareRuleLongRef();
    }

    /**
     * Create an instance of {@link BrandInfo }
     * 
     */
    public BrandInfo createBrandInfo() {
        return new BrandInfo();
    }

    /**
     * Create an instance of {@link SeatInformation.Rating }
     * 
     */
    public SeatInformation.Rating createSeatInformationRating() {
        return new SeatInformation.Rating();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link FlightDetailsRef }
     * 
     */
    public FlightDetailsRef createFlightDetailsRef() {
        return new FlightDetailsRef();
    }

    /**
     * Create an instance of {@link AlternateLocationDistanceRef }
     * 
     */
    public AlternateLocationDistanceRef createAlternateLocationDistanceRef() {
        return new AlternateLocationDistanceRef();
    }

    /**
     * Create an instance of {@link SpecificSeatAssignment }
     * 
     */
    public SpecificSeatAssignment createSpecificSeatAssignment() {
        return new SpecificSeatAssignment();
    }

    /**
     * Create an instance of {@link AirSearchAsynchModifiers.InitialAsynchResult }
     * 
     */
    public AirSearchAsynchModifiers.InitialAsynchResult createAirSearchAsynchModifiersInitialAsynchResult() {
        return new AirSearchAsynchModifiers.InitialAsynchResult();
    }

    /**
     * Create an instance of {@link FareRuleCategory }
     * 
     */
    public FareRuleCategory createFareRuleCategory() {
        return new FareRuleCategory();
    }

    /**
     * Create an instance of {@link BookingCodeInfo }
     * 
     */
    public BookingCodeInfo createBookingCodeInfo() {
        return new BookingCodeInfo();
    }

    /**
     * Create an instance of {@link AirAvailInfo.FareTokenInfo }
     * 
     */
    public AirAvailInfo.FareTokenInfo createAirAvailInfoFareTokenInfo() {
        return new AirAvailInfo.FareTokenInfo();
    }

    /**
     * Create an instance of {@link SponsoredFltInfo }
     * 
     */
    public SponsoredFltInfo createSponsoredFltInfo() {
        return new SponsoredFltInfo();
    }

    /**
     * Create an instance of {@link CodeshareInfo }
     * 
     */
    public CodeshareInfo createCodeshareInfo() {
        return new CodeshareInfo();
    }

    /**
     * Create an instance of {@link PromoCode }
     * 
     */
    public PromoCode createPromoCode() {
        return new PromoCode();
    }

    /**
     * Create an instance of {@link ProhibitedCabins }
     * 
     */
    public ProhibitedCabins createProhibitedCabins() {
        return new ProhibitedCabins();
    }

    /**
     * Create an instance of {@link AirPricingPayment }
     * 
     */
    public AirPricingPayment createAirPricingPayment() {
        return new AirPricingPayment();
    }

    /**
     * Create an instance of {@link AirFareRulesModifier }
     * 
     */
    public AirFareRulesModifier createAirFareRulesModifier() {
        return new AirFareRulesModifier();
    }

    /**
     * Create an instance of {@link AirFareRuleCategory }
     * 
     */
    public AirFareRuleCategory createAirFareRuleCategory() {
        return new AirFareRuleCategory();
    }

    /**
     * Create an instance of {@link AirPricingTicketingModifiers }
     * 
     */
    public AirPricingTicketingModifiers createAirPricingTicketingModifiers() {
        return new AirPricingTicketingModifiers();
    }

    /**
     * Create an instance of {@link OptionalServicesInfo }
     * 
     */
    public OptionalServicesInfo createOptionalServicesInfo() {
        return new OptionalServicesInfo();
    }

    /**
     * Create an instance of {@link IncludeAddlBookingCodeInfo }
     * 
     */
    public IncludeAddlBookingCodeInfo createIncludeAddlBookingCodeInfo() {
        return new IncludeAddlBookingCodeInfo();
    }

    /**
     * Create an instance of {@link FaxDetailsInformation }
     * 
     */
    public FaxDetailsInformation createFaxDetailsInformation() {
        return new FaxDetailsInformation();
    }

    /**
     * Create an instance of {@link FaxDetails }
     * 
     */
    public FaxDetails createFaxDetails() {
        return new FaxDetails();
    }

    /**
     * Create an instance of {@link TermConditions }
     * 
     */
    public TermConditions createTermConditions() {
        return new TermConditions();
    }

    /**
     * Create an instance of {@link DetailedBillingInformation }
     * 
     */
    public DetailedBillingInformation createDetailedBillingInformation() {
        return new DetailedBillingInformation();
    }

    /**
     * Create an instance of {@link BillingDetailItem }
     * 
     */
    public BillingDetailItem createBillingDetailItem() {
        return new BillingDetailItem();
    }

    /**
     * Create an instance of {@link AirPricingAdjustment }
     * 
     */
    public AirPricingAdjustment createAirPricingAdjustment() {
        return new AirPricingAdjustment();
    }

    /**
     * Create an instance of {@link APISRequirementsList }
     * 
     */
    public APISRequirementsList createAPISRequirementsList() {
        return new APISRequirementsList();
    }

    /**
     * Create an instance of {@link Variance }
     * 
     */
    public Variance createVariance() {
        return new Variance();
    }

    /**
     * Create an instance of {@link FlightInfo }
     * 
     */
    public FlightInfo createFlightInfo() {
        return new FlightInfo();
    }

    /**
     * Create an instance of {@link FlightInfoDetail }
     * 
     */
    public FlightInfoDetail createFlightInfoDetail() {
        return new FlightInfoDetail();
    }

    /**
     * Create an instance of {@link FlightInfoCriteria }
     * 
     */
    public FlightInfoCriteria createFlightInfoCriteria() {
        return new FlightInfoCriteria();
    }

    /**
     * Create an instance of {@link FlightTimeTableCriteria }
     * 
     */
    public FlightTimeTableCriteria createFlightTimeTableCriteria() {
        return new FlightTimeTableCriteria();
    }

    /**
     * Create an instance of {@link GeneralTimeTable }
     * 
     */
    public GeneralTimeTable createGeneralTimeTable() {
        return new GeneralTimeTable();
    }

    /**
     * Create an instance of {@link TypeDaysOfOperation }
     * 
     */
    public TypeDaysOfOperation createTypeDaysOfOperation() {
        return new TypeDaysOfOperation();
    }

    /**
     * Create an instance of {@link CarrierList }
     * 
     */
    public CarrierList createCarrierList() {
        return new CarrierList();
    }

    /**
     * Create an instance of {@link CarrierCode }
     * 
     */
    public CarrierCode createCarrierCode() {
        return new CarrierCode();
    }

    /**
     * Create an instance of {@link SpecificTimeTable.FlightOrigin }
     * 
     */
    public SpecificTimeTable.FlightOrigin createSpecificTimeTableFlightOrigin() {
        return new SpecificTimeTable.FlightOrigin();
    }

    /**
     * Create an instance of {@link SpecificTimeTable.FlightDestination }
     * 
     */
    public SpecificTimeTable.FlightDestination createSpecificTimeTableFlightDestination() {
        return new SpecificTimeTable.FlightDestination();
    }

    /**
     * Create an instance of {@link FlightTimeDetail }
     * 
     */
    public FlightTimeDetail createFlightTimeDetail() {
        return new FlightTimeDetail();
    }

    /**
     * Create an instance of {@link AirSegmentError }
     * 
     */
    public AirSegmentError createAirSegmentError() {
        return new AirSegmentError();
    }

    /**
     * Create an instance of {@link AirSegmentSellFailureInfo }
     * 
     */
    public AirSegmentSellFailureInfo createAirSegmentSellFailureInfo() {
        return new AirSegmentSellFailureInfo();
    }

    /**
     * Create an instance of {@link PrePayProfileInfo }
     * 
     */
    public PrePayProfileInfo createPrePayProfileInfo() {
        return new PrePayProfileInfo();
    }

    /**
     * Create an instance of {@link PrePayId }
     * 
     */
    public PrePayId createPrePayId() {
        return new PrePayId();
    }

    /**
     * Create an instance of {@link CompanyName }
     * 
     */
    public CompanyName createCompanyName() {
        return new CompanyName();
    }

    /**
     * Create an instance of {@link PrePayCustomer }
     * 
     */
    public PrePayCustomer createPrePayCustomer() {
        return new PrePayCustomer();
    }

    /**
     * Create an instance of {@link PersonName }
     * 
     */
    public PersonName createPersonName() {
        return new PersonName();
    }

    /**
     * Create an instance of {@link RelatedTraveler.CreditsUsed }
     * 
     */
    public RelatedTraveler.CreditsUsed createRelatedTravelerCreditsUsed() {
        return new RelatedTraveler.CreditsUsed();
    }

    /**
     * Create an instance of {@link PrePayAccount }
     * 
     */
    public PrePayAccount createPrePayAccount() {
        return new PrePayAccount();
    }

    /**
     * Create an instance of {@link CreditSummary }
     * 
     */
    public CreditSummary createCreditSummary() {
        return new CreditSummary();
    }

    /**
     * Create an instance of {@link PrePayPriceInfo }
     * 
     */
    public PrePayPriceInfo createPrePayPriceInfo() {
        return new PrePayPriceInfo();
    }

    /**
     * Create an instance of {@link Affiliations }
     * 
     */
    public Affiliations createAffiliations() {
        return new Affiliations();
    }

    /**
     * Create an instance of {@link TravelArranger }
     * 
     */
    public TravelArranger createTravelArranger() {
        return new TravelArranger();
    }

    /**
     * Create an instance of {@link AccountRelatedRules }
     * 
     */
    public AccountRelatedRules createAccountRelatedRules() {
        return new AccountRelatedRules();
    }

    /**
     * Create an instance of {@link BookingRulesFareReference }
     * 
     */
    public BookingRulesFareReference createBookingRulesFareReference() {
        return new BookingRulesFareReference();
    }

    /**
     * Create an instance of {@link BookingRules.RuleInfo }
     * 
     */
    public BookingRules.RuleInfo createBookingRulesRuleInfo() {
        return new BookingRules.RuleInfo();
    }

    /**
     * Create an instance of {@link Restriction.DaysOfWeekRestriction }
     * 
     */
    public Restriction.DaysOfWeekRestriction createRestrictionDaysOfWeekRestriction() {
        return new Restriction.DaysOfWeekRestriction();
    }

    /**
     * Create an instance of {@link Restriction.RestrictionPassengerTypes }
     * 
     */
    public Restriction.RestrictionPassengerTypes createRestrictionRestrictionPassengerTypes() {
        return new Restriction.RestrictionPassengerTypes();
    }

    /**
     * Create an instance of {@link DocumentRequired }
     * 
     */
    public DocumentRequired createDocumentRequired() {
        return new DocumentRequired();
    }

    /**
     * Create an instance of {@link CustomerSearch }
     * 
     */
    public CustomerSearch createCustomerSearch() {
        return new CustomerSearch();
    }

    /**
     * Create an instance of {@link PersonNameSearch }
     * 
     */
    public PersonNameSearch createPersonNameSearch() {
        return new PersonNameSearch();
    }

    /**
     * Create an instance of {@link ChargesRules.VoluntaryChanges }
     * 
     */
    public ChargesRules.VoluntaryChanges createChargesRulesVoluntaryChanges() {
        return new ChargesRules.VoluntaryChanges();
    }

    /**
     * Create an instance of {@link ChargesRules.VoluntaryRefunds }
     * 
     */
    public ChargesRules.VoluntaryRefunds createChargesRulesVoluntaryRefunds() {
        return new ChargesRules.VoluntaryRefunds();
    }

    /**
     * Create an instance of {@link Penalty }
     * 
     */
    public Penalty createPenalty() {
        return new Penalty();
    }

    /**
     * Create an instance of {@link AvailabilityErrorInfo }
     * 
     */
    public AvailabilityErrorInfo createAvailabilityErrorInfo() {
        return new AvailabilityErrorInfo();
    }

    /**
     * Create an instance of {@link AirTicketingModifiers }
     * 
     */
    public AirTicketingModifiers createAirTicketingModifiers() {
        return new AirTicketingModifiers();
    }

    /**
     * Create an instance of {@link DocumentModifiers }
     * 
     */
    public DocumentModifiers createDocumentModifiers() {
        return new DocumentModifiers();
    }

    /**
     * Create an instance of {@link VoidResultInfo }
     * 
     */
    public VoidResultInfo createVoidResultInfo() {
        return new VoidResultInfo();
    }

    /**
     * Create an instance of {@link VoidDocumentInfo }
     * 
     */
    public VoidDocumentInfo createVoidDocumentInfo() {
        return new VoidDocumentInfo();
    }

    /**
     * Create an instance of {@link AutoPricingInfo }
     * 
     */
    public AutoPricingInfo createAutoPricingInfo() {
        return new AutoPricingInfo();
    }

    /**
     * Create an instance of {@link RailCoachDetails }
     * 
     */
    public RailCoachDetails createRailCoachDetails() {
        return new RailCoachDetails();
    }

    /**
     * Create an instance of {@link EMDInfo }
     * 
     */
    public EMDInfo createEMDInfo() {
        return new EMDInfo();
    }

    /**
     * Create an instance of {@link EMDTravelerInfo.NameInfo }
     * 
     */
    public EMDTravelerInfo.NameInfo createEMDTravelerInfoNameInfo() {
        return new EMDTravelerInfo.NameInfo();
    }

    /**
     * Create an instance of {@link ElectronicMiscDocument }
     * 
     */
    public ElectronicMiscDocument createElectronicMiscDocument() {
        return new ElectronicMiscDocument();
    }

    /**
     * Create an instance of {@link EMDCoupon }
     * 
     */
    public EMDCoupon createEMDCoupon() {
        return new EMDCoupon();
    }

    /**
     * Create an instance of {@link EMDPricingInfo }
     * 
     */
    public EMDPricingInfo createEMDPricingInfo() {
        return new EMDPricingInfo();
    }

    /**
     * Create an instance of {@link EMDCommission }
     * 
     */
    public EMDCommission createEMDCommission() {
        return new EMDCommission();
    }

    /**
     * Create an instance of {@link EMDSummaryInfo }
     * 
     */
    public EMDSummaryInfo createEMDSummaryInfo() {
        return new EMDSummaryInfo();
    }

    /**
     * Create an instance of {@link EMDSummary }
     * 
     */
    public EMDSummary createEMDSummary() {
        return new EMDSummary();
    }

    /**
     * Create an instance of {@link IssuanceModifiers }
     * 
     */
    public IssuanceModifiers createIssuanceModifiers() {
        return new IssuanceModifiers();
    }

    /**
     * Create an instance of {@link CustomerReceiptInfo }
     * 
     */
    public CustomerReceiptInfo createCustomerReceiptInfo() {
        return new CustomerReceiptInfo();
    }

    /**
     * Create an instance of {@link SelectionModifiers }
     * 
     */
    public SelectionModifiers createSelectionModifiers() {
        return new SelectionModifiers();
    }

    /**
     * Create an instance of {@link MerchandisingDetails }
     * 
     */
    public MerchandisingDetails createMerchandisingDetails() {
        return new MerchandisingDetails();
    }

    /**
     * Create an instance of {@link AirItineraryDetails }
     * 
     */
    public AirItineraryDetails createAirItineraryDetails() {
        return new AirItineraryDetails();
    }

    /**
     * Create an instance of {@link AirSegmentDetails }
     * 
     */
    public AirSegmentDetails createAirSegmentDetails() {
        return new AirSegmentDetails();
    }

    /**
     * Create an instance of {@link PassengerDetailsRef }
     * 
     */
    public PassengerDetailsRef createPassengerDetailsRef() {
        return new PassengerDetailsRef();
    }

    /**
     * Create an instance of {@link BrandID }
     * 
     */
    public BrandID createBrandID() {
        return new BrandID();
    }

    /**
     * Create an instance of {@link PassengerDetails }
     * 
     */
    public PassengerDetails createPassengerDetails() {
        return new PassengerDetails();
    }

    /**
     * Create an instance of {@link LoyaltyCardDetails }
     * 
     */
    public LoyaltyCardDetails createLoyaltyCardDetails() {
        return new LoyaltyCardDetails();
    }

    /**
     * Create an instance of {@link MerchandisingAvailabilityDetails }
     * 
     */
    public MerchandisingAvailabilityDetails createMerchandisingAvailabilityDetails() {
        return new MerchandisingAvailabilityDetails();
    }

    /**
     * Create an instance of {@link FareDetailsRef }
     * 
     */
    public FareDetailsRef createFareDetailsRef() {
        return new FareDetailsRef();
    }

    /**
     * Create an instance of {@link FareDetails }
     * 
     */
    public FareDetails createFareDetails() {
        return new FareDetails();
    }

    /**
     * Create an instance of {@link OptionalServiceModifiers }
     * 
     */
    public OptionalServiceModifiers createOptionalServiceModifiers() {
        return new OptionalServiceModifiers();
    }

    /**
     * Create an instance of {@link OptionalServiceModifier }
     * 
     */
    public OptionalServiceModifier createOptionalServiceModifier() {
        return new OptionalServiceModifier();
    }

    /**
     * Create an instance of {@link JourneyData }
     * 
     */
    public JourneyData createJourneyData() {
        return new JourneyData();
    }

    /**
     * Create an instance of {@link PCC }
     * 
     */
    public PCC createPCC() {
        return new PCC();
    }

    /**
     * Create an instance of {@link TicketAgency }
     * 
     */
    public TicketAgency createTicketAgency() {
        return new TicketAgency();
    }

    /**
     * Create an instance of {@link RepricingModifiers.OverrideCurrency }
     * 
     */
    public RepricingModifiers.OverrideCurrency createRepricingModifiersOverrideCurrency() {
        return new RepricingModifiers.OverrideCurrency();
    }

    /**
     * Create an instance of {@link OriginalItineraryDetails }
     * 
     */
    public OriginalItineraryDetails createOriginalItineraryDetails() {
        return new OriginalItineraryDetails();
    }

    /**
     * Create an instance of {@link FareRulesFilterCategory }
     * 
     */
    public FareRulesFilterCategory createFareRulesFilterCategory() {
        return new FareRulesFilterCategory();
    }

    /**
     * Create an instance of {@link MerchandisingPricingModifiers }
     * 
     */
    public MerchandisingPricingModifiers createMerchandisingPricingModifiers() {
        return new MerchandisingPricingModifiers();
    }

    /**
     * Create an instance of {@link Embargo }
     * 
     */
    public Embargo createEmbargo() {
        return new Embargo();
    }

    /**
     * Create an instance of {@link EmbargoList }
     * 
     */
    public EmbargoList createEmbargoList() {
        return new EmbargoList();
    }

    /**
     * Create an instance of {@link CO2Emissions }
     * 
     */
    public CO2Emissions createCO2Emissions() {
        return new CO2Emissions();
    }

    /**
     * Create an instance of {@link CO2Emission }
     * 
     */
    public CO2Emission createCO2Emission() {
        return new CO2Emission();
    }

    /**
     * Create an instance of {@link SplitTicketingSearch }
     * 
     */
    public SplitTicketingSearch createSplitTicketingSearch() {
        return new SplitTicketingSearch();
    }

    /**
     * Create an instance of {@link ExchangeEligibilityInfo }
     * 
     */
    public ExchangeEligibilityInfo createExchangeEligibilityInfo() {
        return new ExchangeEligibilityInfo();
    }

    /**
     * Create an instance of {@link ExchangePenaltyInfo }
     * 
     */
    public ExchangePenaltyInfo createExchangePenaltyInfo() {
        return new ExchangePenaltyInfo();
    }

    /**
     * Create an instance of {@link PenaltyInformation }
     * 
     */
    public PenaltyInformation createPenaltyInformation() {
        return new PenaltyInformation();
    }

    /**
     * Create an instance of {@link AirPriceReq }
     * 
     */
    public AirPriceReq createAirPriceReq() {
        return new AirPriceReq();
    }

    /**
     * Create an instance of {@link BaseAirPriceReq }
     * 
     */
    public BaseAirPriceReq createBaseAirPriceReq() {
        return new BaseAirPriceReq();
    }

    /**
     * Create an instance of {@link AirPriceRsp }
     * 
     */
    public AirPriceRsp createAirPriceRsp() {
        return new AirPriceRsp();
    }

    /**
     * Create an instance of {@link BaseAirPriceRsp }
     * 
     */
    public BaseAirPriceRsp createBaseAirPriceRsp() {
        return new BaseAirPriceRsp();
    }

    /**
     * Create an instance of {@link AirRepriceReq }
     * 
     */
    public AirRepriceReq createAirRepriceReq() {
        return new AirRepriceReq();
    }

    /**
     * Create an instance of {@link AirBaseReq }
     * 
     */
    public AirBaseReq createAirBaseReq() {
        return new AirBaseReq();
    }

    /**
     * Create an instance of {@link AirRepriceRsp }
     * 
     */
    public AirRepriceRsp createAirRepriceRsp() {
        return new AirRepriceRsp();
    }

    /**
     * Create an instance of {@link AirTicketingReq.AirPricingInfoRef }
     * 
     */
    public AirTicketingReq.AirPricingInfoRef createAirTicketingReqAirPricingInfoRef() {
        return new AirTicketingReq.AirPricingInfoRef();
    }

    /**
     * Create an instance of {@link TypeTicketingModifiersRef }
     * 
     */
    public TypeTicketingModifiersRef createTypeTicketingModifiersRef() {
        return new TypeTicketingModifiersRef();
    }

    /**
     * Create an instance of {@link AirTicketingRsp }
     * 
     */
    public AirTicketingRsp createAirTicketingRsp() {
        return new AirTicketingRsp();
    }

    /**
     * Create an instance of {@link AirExchangeQuoteReq }
     * 
     */
    public AirExchangeQuoteReq createAirExchangeQuoteReq() {
        return new AirExchangeQuoteReq();
    }

    /**
     * Create an instance of {@link BaseAirExchangeQuoteReq.ProviderReservationInfo }
     * 
     */
    public BaseAirExchangeQuoteReq.ProviderReservationInfo createBaseAirExchangeQuoteReqProviderReservationInfo() {
        return new BaseAirExchangeQuoteReq.ProviderReservationInfo();
    }

    /**
     * Create an instance of {@link AirExchangeQuoteRsp }
     * 
     */
    public AirExchangeQuoteRsp createAirExchangeQuoteRsp() {
        return new AirExchangeQuoteRsp();
    }

    /**
     * Create an instance of {@link AirExchangeReq }
     * 
     */
    public AirExchangeReq createAirExchangeReq() {
        return new AirExchangeReq();
    }

    /**
     * Create an instance of {@link AirExchangeRsp }
     * 
     */
    public AirExchangeRsp createAirExchangeRsp() {
        return new AirExchangeRsp();
    }

    /**
     * Create an instance of {@link TypeAirReservationWithFOP }
     * 
     */
    public TypeAirReservationWithFOP createTypeAirReservationWithFOP() {
        return new TypeAirReservationWithFOP();
    }

    /**
     * Create an instance of {@link TypeTicketFailureInfo }
     * 
     */
    public TypeTicketFailureInfo createTypeTicketFailureInfo() {
        return new TypeTicketFailureInfo();
    }

    /**
     * Create an instance of {@link AirExchangeTicketingReq }
     * 
     */
    public AirExchangeTicketingReq createAirExchangeTicketingReq() {
        return new AirExchangeTicketingReq();
    }

    /**
     * Create an instance of {@link AirExchangeTicketingRsp }
     * 
     */
    public AirExchangeTicketingRsp createAirExchangeTicketingRsp() {
        return new AirExchangeTicketingRsp();
    }

    /**
     * Create an instance of {@link AirRefundQuoteReq }
     * 
     */
    public AirRefundQuoteReq createAirRefundQuoteReq() {
        return new AirRefundQuoteReq();
    }

    /**
     * Create an instance of {@link AirRefundQuoteRsp }
     * 
     */
    public AirRefundQuoteRsp createAirRefundQuoteRsp() {
        return new AirRefundQuoteRsp();
    }

    /**
     * Create an instance of {@link AirRefundReq }
     * 
     */
    public AirRefundReq createAirRefundReq() {
        return new AirRefundReq();
    }

    /**
     * Create an instance of {@link AirRefundRsp }
     * 
     */
    public AirRefundRsp createAirRefundRsp() {
        return new AirRefundRsp();
    }

    /**
     * Create an instance of {@link AirFareDisplayReq }
     * 
     */
    public AirFareDisplayReq createAirFareDisplayReq() {
        return new AirFareDisplayReq();
    }

    /**
     * Create an instance of {@link AirFareDisplayRsp }
     * 
     */
    public AirFareDisplayRsp createAirFareDisplayRsp() {
        return new AirFareDisplayRsp();
    }

    /**
     * Create an instance of {@link AirFareRulesReq.AirReservationSelector }
     * 
     */
    public AirFareRulesReq.AirReservationSelector createAirFareRulesReqAirReservationSelector() {
        return new AirFareRulesReq.AirReservationSelector();
    }

    /**
     * Create an instance of {@link AirFareRulesRsp }
     * 
     */
    public AirFareRulesRsp createAirFareRulesRsp() {
        return new AirFareRulesRsp();
    }

    /**
     * Create an instance of {@link FlightDetailsReq }
     * 
     */
    public FlightDetailsReq createFlightDetailsReq() {
        return new FlightDetailsReq();
    }

    /**
     * Create an instance of {@link FlightDetailsRsp }
     * 
     */
    public FlightDetailsRsp createFlightDetailsRsp() {
        return new FlightDetailsRsp();
    }

    /**
     * Create an instance of {@link SeatMapReq }
     * 
     */
    public SeatMapReq createSeatMapReq() {
        return new SeatMapReq();
    }

    /**
     * Create an instance of {@link SeatMapRsp }
     * 
     */
    public SeatMapRsp createSeatMapRsp() {
        return new SeatMapRsp();
    }

    /**
     * Create an instance of {@link SearchSpecificAirSegment }
     * 
     */
    public SearchSpecificAirSegment createSearchSpecificAirSegment() {
        return new SearchSpecificAirSegment();
    }

    /**
     * Create an instance of {@link ScheduleSearchReq }
     * 
     */
    public ScheduleSearchReq createScheduleSearchReq() {
        return new ScheduleSearchReq();
    }

    /**
     * Create an instance of {@link AirSearchReq }
     * 
     */
    public AirSearchReq createAirSearchReq() {
        return new AirSearchReq();
    }

    /**
     * Create an instance of {@link ScheduleSearchRsp }
     * 
     */
    public ScheduleSearchRsp createScheduleSearchRsp() {
        return new ScheduleSearchRsp();
    }

    /**
     * Create an instance of {@link AirSearchRsp }
     * 
     */
    public AirSearchRsp createAirSearchRsp() {
        return new AirSearchRsp();
    }

    /**
     * Create an instance of {@link BaseAvailabilitySearchRsp }
     * 
     */
    public BaseAvailabilitySearchRsp createBaseAvailabilitySearchRsp() {
        return new BaseAvailabilitySearchRsp();
    }

    /**
     * Create an instance of {@link AvailabilitySearchReq }
     * 
     */
    public AvailabilitySearchReq createAvailabilitySearchReq() {
        return new AvailabilitySearchReq();
    }

    /**
     * Create an instance of {@link AvailabilitySearchRsp }
     * 
     */
    public AvailabilitySearchRsp createAvailabilitySearchRsp() {
        return new AvailabilitySearchRsp();
    }

    /**
     * Create an instance of {@link RetrieveLowFareSearchReq }
     * 
     */
    public RetrieveLowFareSearchReq createRetrieveLowFareSearchReq() {
        return new RetrieveLowFareSearchReq();
    }

    /**
     * Create an instance of {@link RetrieveLowFareSearchRsp }
     * 
     */
    public RetrieveLowFareSearchRsp createRetrieveLowFareSearchRsp() {
        return new RetrieveLowFareSearchRsp();
    }

    /**
     * Create an instance of {@link BrandList }
     * 
     */
    public BrandList createBrandList() {
        return new BrandList();
    }

    /**
     * Create an instance of {@link LowFareSearchReq }
     * 
     */
    public LowFareSearchReq createLowFareSearchReq() {
        return new LowFareSearchReq();
    }

    /**
     * Create an instance of {@link BaseLowFareSearchReq }
     * 
     */
    public BaseLowFareSearchReq createBaseLowFareSearchReq() {
        return new BaseLowFareSearchReq();
    }

    /**
     * Create an instance of {@link BaseAirSearchReq }
     * 
     */
    public BaseAirSearchReq createBaseAirSearchReq() {
        return new BaseAirSearchReq();
    }

    /**
     * Create an instance of {@link LowFareSearchRsp }
     * 
     */
    public LowFareSearchRsp createLowFareSearchRsp() {
        return new LowFareSearchRsp();
    }

    /**
     * Create an instance of {@link LowFareSearchAsynchReq }
     * 
     */
    public LowFareSearchAsynchReq createLowFareSearchAsynchReq() {
        return new LowFareSearchAsynchReq();
    }

    /**
     * Create an instance of {@link LowFareSearchAsynchRsp }
     * 
     */
    public LowFareSearchAsynchRsp createLowFareSearchAsynchRsp() {
        return new LowFareSearchAsynchRsp();
    }

    /**
     * Create an instance of {@link AirVoidDocumentReq }
     * 
     */
    public AirVoidDocumentReq createAirVoidDocumentReq() {
        return new AirVoidDocumentReq();
    }

    /**
     * Create an instance of {@link AirVoidDocumentRsp }
     * 
     */
    public AirVoidDocumentRsp createAirVoidDocumentRsp() {
        return new AirVoidDocumentRsp();
    }

    /**
     * Create an instance of {@link AirRetrieveDocumentReq }
     * 
     */
    public AirRetrieveDocumentReq createAirRetrieveDocumentReq() {
        return new AirRetrieveDocumentReq();
    }

    /**
     * Create an instance of {@link AirRetrieveDocumentRsp }
     * 
     */
    public AirRetrieveDocumentRsp createAirRetrieveDocumentRsp() {
        return new AirRetrieveDocumentRsp();
    }

    /**
     * Create an instance of {@link TypeFailureInfo }
     * 
     */
    public TypeFailureInfo createTypeFailureInfo() {
        return new TypeFailureInfo();
    }

    /**
     * Create an instance of {@link AirMerchandisingOfferAvailabilityReq }
     * 
     */
    public AirMerchandisingOfferAvailabilityReq createAirMerchandisingOfferAvailabilityReq() {
        return new AirMerchandisingOfferAvailabilityReq();
    }

    /**
     * Create an instance of {@link AirMerchandisingOfferAvailabilityRsp }
     * 
     */
    public AirMerchandisingOfferAvailabilityRsp createAirMerchandisingOfferAvailabilityRsp() {
        return new AirMerchandisingOfferAvailabilityRsp();
    }

    /**
     * Create an instance of {@link AirUpsellSearchReq }
     * 
     */
    public AirUpsellSearchReq createAirUpsellSearchReq() {
        return new AirUpsellSearchReq();
    }

    /**
     * Create an instance of {@link AirUpsellSearchRsp }
     * 
     */
    public AirUpsellSearchRsp createAirUpsellSearchRsp() {
        return new AirUpsellSearchRsp();
    }

    /**
     * Create an instance of {@link FlightInformationReq }
     * 
     */
    public FlightInformationReq createFlightInformationReq() {
        return new FlightInformationReq();
    }

    /**
     * Create an instance of {@link FlightInformationRsp }
     * 
     */
    public FlightInformationRsp createFlightInformationRsp() {
        return new FlightInformationRsp();
    }

    /**
     * Create an instance of {@link FlightTimeTableReq }
     * 
     */
    public FlightTimeTableReq createFlightTimeTableReq() {
        return new FlightTimeTableReq();
    }

    /**
     * Create an instance of {@link FlightTimeTableRsp.FlightTimeTableList }
     * 
     */
    public FlightTimeTableRsp.FlightTimeTableList createFlightTimeTableRspFlightTimeTableList() {
        return new FlightTimeTableRsp.FlightTimeTableList();
    }

    /**
     * Create an instance of {@link AirPrePayReq.ListSearch }
     * 
     */
    public AirPrePayReq.ListSearch createAirPrePayReqListSearch() {
        return new AirPrePayReq.ListSearch();
    }

    /**
     * Create an instance of {@link AirPrePayReq.PrePayRetrieve }
     * 
     */
    public AirPrePayReq.PrePayRetrieve createAirPrePayReqPrePayRetrieve() {
        return new AirPrePayReq.PrePayRetrieve();
    }

    /**
     * Create an instance of {@link AirPrePayRsp }
     * 
     */
    public AirPrePayRsp createAirPrePayRsp() {
        return new AirPrePayRsp();
    }

    /**
     * Create an instance of {@link EMDRetrieveReq.ListRetrieve }
     * 
     */
    public EMDRetrieveReq.ListRetrieve createEMDRetrieveReqListRetrieve() {
        return new EMDRetrieveReq.ListRetrieve();
    }

    /**
     * Create an instance of {@link EMDRetrieveReq.DetailRetrieve }
     * 
     */
    public EMDRetrieveReq.DetailRetrieve createEMDRetrieveReqDetailRetrieve() {
        return new EMDRetrieveReq.DetailRetrieve();
    }

    /**
     * Create an instance of {@link EMDRetrieveRsp }
     * 
     */
    public EMDRetrieveRsp createEMDRetrieveRsp() {
        return new EMDRetrieveRsp();
    }

    /**
     * Create an instance of {@link EMDIssuanceReq }
     * 
     */
    public EMDIssuanceReq createEMDIssuanceReq() {
        return new EMDIssuanceReq();
    }

    /**
     * Create an instance of {@link EMDIssuanceRsp }
     * 
     */
    public EMDIssuanceRsp createEMDIssuanceRsp() {
        return new EMDIssuanceRsp();
    }

    /**
     * Create an instance of {@link AirMerchandisingDetailsReq }
     * 
     */
    public AirMerchandisingDetailsReq createAirMerchandisingDetailsReq() {
        return new AirMerchandisingDetailsReq();
    }

    /**
     * Create an instance of {@link AirMerchandisingDetailsRsp.UnassociatedBookingCodeList }
     * 
     */
    public AirMerchandisingDetailsRsp.UnassociatedBookingCodeList createAirMerchandisingDetailsRspUnassociatedBookingCodeList() {
        return new AirMerchandisingDetailsRsp.UnassociatedBookingCodeList();
    }

    /**
     * Create an instance of {@link AirExchangeEligibilityReq.ProviderReservationInfo }
     * 
     */
    public AirExchangeEligibilityReq.ProviderReservationInfo createAirExchangeEligibilityReqProviderReservationInfo() {
        return new AirExchangeEligibilityReq.ProviderReservationInfo();
    }

    /**
     * Create an instance of {@link AirExchangeEligibilityRsp }
     * 
     */
    public AirExchangeEligibilityRsp createAirExchangeEligibilityRsp() {
        return new AirExchangeEligibilityRsp();
    }

    /**
     * Create an instance of {@link TypeTicketModifierPercentType }
     * 
     */
    public TypeTicketModifierPercentType createTypeTicketModifierPercentType() {
        return new TypeTicketModifierPercentType();
    }

    /**
     * Create an instance of {@link RoutingRules.Routing.DirectionInfo }
     * 
     */
    public RoutingRules.Routing.DirectionInfo createRoutingRulesRoutingDirectionInfo() {
        return new RoutingRules.Routing.DirectionInfo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeTaxInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "TaxInfo")
    public JAXBElement<TypeTaxInfo> createTaxInfo(TypeTaxInfo value) {
        return new JAXBElement<TypeTaxInfo>(_TaxInfo_QNAME, TypeTaxInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeFeeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "FeeInfo")
    public JAXBElement<TypeFeeInfo> createFeeInfo(TypeFeeInfo value) {
        return new JAXBElement<TypeFeeInfo>(_FeeInfo_QNAME, TypeFeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeTextElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "Text")
    public JAXBElement<TypeTextElement> createText(TypeTextElement value) {
        return new JAXBElement<TypeTextElement>(_Text_QNAME, TypeTextElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeTextElement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "Title")
    public JAXBElement<TypeTextElement> createTitle(TypeTextElement value) {
        return new JAXBElement<TypeTextElement>(_Title_QNAME, TypeTextElement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeBaseAirSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "AirSegment")
    public JAXBElement<TypeBaseAirSegment> createAirSegment(TypeBaseAirSegment value) {
        return new JAXBElement<TypeBaseAirSegment>(_AirSegment_QNAME, TypeBaseAirSegment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeDefaultBrandDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "DefaultBrandDetail")
    public JAXBElement<TypeDefaultBrandDetail> createDefaultBrandDetail(TypeDefaultBrandDetail value) {
        return new JAXBElement<TypeDefaultBrandDetail>(_DefaultBrandDetail_QNAME, TypeDefaultBrandDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "FareCalc")
    public JAXBElement<String> createFareCalc(String value) {
        return new JAXBElement<String>(_FareCalc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseBaggageAllowanceInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "EmbargoInfo")
    public JAXBElement<BaseBaggageAllowanceInfo> createEmbargoInfo(BaseBaggageAllowanceInfo value) {
        return new JAXBElement<BaseBaggageAllowanceInfo>(_EmbargoInfo_QNAME, BaseBaggageAllowanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeMealService }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "Meals")
    public JAXBElement<TypeMealService> createMeals(TypeMealService value) {
        return new JAXBElement<TypeMealService>(_Meals_QNAME, TypeMealService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "InFlightServices")
    public JAXBElement<String> createInFlightServices(String value) {
        return new JAXBElement<String>(_InFlightServices_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "FareRoutingInformation")
    public JAXBElement<String> createFareRoutingInformation(String value) {
        return new JAXBElement<String>(_FareRoutingInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "FareMileageInformation")
    public JAXBElement<String> createFareMileageInformation(String value) {
        return new JAXBElement<String>(_FareMileageInformation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "OverrideCode")
    public JAXBElement<String> createOverrideCode(String value) {
        return new JAXBElement<String>(_OverrideCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "OptionalServiceRef")
    public JAXBElement<String> createOptionalServiceRef(String value) {
        return new JAXBElement<String>(_OptionalServiceRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "SegmentIndex")
    public JAXBElement<Integer> createSegmentIndex(Integer value) {
        return new JAXBElement<Integer>(_SegmentIndex_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseAsyncProviderSpecificResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "AsyncProviderSpecificResponse")
    public JAXBElement<BaseAsyncProviderSpecificResponse> createAsyncProviderSpecificResponse(BaseAsyncProviderSpecificResponse value) {
        return new JAXBElement<BaseAsyncProviderSpecificResponse>(_AsyncProviderSpecificResponse_QNAME, BaseAsyncProviderSpecificResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "EMDEndorsement")
    public JAXBElement<String> createEMDEndorsement(String value) {
        return new JAXBElement<String>(_EMDEndorsement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TypeApplicableSegment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.travelport.com/schema/air_v42_0", name = "ApplicableSegment")
    public JAXBElement<TypeApplicableSegment> createApplicableSegment(TypeApplicableSegment value) {
        return new JAXBElement<TypeApplicableSegment>(_ApplicableSegment_QNAME, TypeApplicableSegment.class, null, value);
    }

}
