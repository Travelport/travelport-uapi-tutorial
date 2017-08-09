
package com.travelport.schema.vehicle_v42_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v42_0.TypeDistance;
import com.travelport.schema.common_v42_0.TypeRateCategory;
import com.travelport.schema.common_v42_0.TypeRateGuarantee;
import com.travelport.schema.common_v42_0.TypeRateTimePeriod;
import com.travelport.schema.common_v42_0.TypeTrinary;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v42_0}SupplierRate" minOccurs="0"/&gt;
 *         &lt;element name="RateVariance" type="{http://www.travelport.com/schema/vehicle_v42_0}typeRateVariance" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateRate" type="{http://www.travelport.com/schema/vehicle_v42_0}typeVehicleRates" minOccurs="0"/&gt;
 *         &lt;element name="VehicleRateDescription" type="{http://www.travelport.com/schema/vehicle_v42_0}typeVehicleRateDescription" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v42_0}typeRateHostIndicator" minOccurs="0"/&gt;
 *         &lt;element name="HourlyLateCharge" type="{http://www.travelport.com/schema/vehicle_v42_0}typeRateInfo" minOccurs="0"/&gt;
 *         &lt;element name="DailyLateCharge" type="{http://www.travelport.com/schema/vehicle_v42_0}typeRateInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v42_0}PricedEquip" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v42_0}RateInclusions" minOccurs="0"/&gt;
 *         &lt;element name="WeeklyLateCharge" type="{http://www.travelport.com/schema/vehicle_v42_0}typeRateInfo" minOccurs="0"/&gt;
 *         &lt;element name="PrintText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RatePeriod" type="{http://www.travelport.com/schema/common_v42_0}typeRateTimePeriod" /&gt;
 *       &lt;attribute name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="Units" type="{http://www.travelport.com/schema/common_v42_0}typeDistance" /&gt;
 *       &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RateAvailability" type="{http://www.travelport.com/schema/vehicle_v42_0}typeRateAvailability" /&gt;
 *       &lt;attribute name="RequiredCharges" type="{http://www.travelport.com/schema/common_v42_0}typeMoney" /&gt;
 *       &lt;attribute name="RateCode" type="{http://www.travelport.com/schema/common_v42_0}typeRateCode" /&gt;
 *       &lt;attribute name="RequestedRateCodeApplied" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v42_0}typeRateCategory" /&gt;
 *       &lt;attribute name="DiscountNumber" type="{http://www.travelport.com/schema/common_v42_0}typeDiscountNumber" /&gt;
 *       &lt;attribute name="DiscountNumberApplied" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *       &lt;attribute name="VendorCode" type="{http://www.travelport.com/schema/common_v42_0}typeSupplierCode" /&gt;
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="RateCodePeriod" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PromotionalCodeApplied" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TourCodeApplied" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *       &lt;attribute name="RateGuaranteeType" type="{http://www.travelport.com/schema/common_v42_0}typeRateGuarantee" /&gt;
 *       &lt;attribute name="RequiredPayment"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Guarantee"/&gt;
 *             &lt;enumeration value="Deposit"/&gt;
 *             &lt;enumeration value="PrePayment"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="DropOffChargesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CorporateRate" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AdvancedBooking" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="RentalRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="FlightRestriction" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="CardNumber" type="{http://www.travelport.com/schema/common_v42_0}typeCardNumber" /&gt;
 *       &lt;attribute name="CardNumberApplied" type="{http://www.travelport.com/schema/common_v42_0}typeTrinary" /&gt;
 *       &lt;attribute name="RateQualifierInd" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierRate",
    "rateVariance",
    "approximateRate",
    "vehicleRateDescription",
    "rateHostIndicator",
    "hourlyLateCharge",
    "dailyLateCharge",
    "pricedEquip",
    "rateInclusions",
    "weeklyLateCharge",
    "printText"
})
@XmlRootElement(name = "VehicleRate")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
public class VehicleRate
    implements Locatable
{

    @XmlElement(name = "SupplierRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected SupplierRate supplierRate;
    @XmlElement(name = "RateVariance")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateVariance rateVariance;
    @XmlElement(name = "ApproximateRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeVehicleRates approximateRate;
    @XmlElement(name = "VehicleRateDescription")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeVehicleRateDescription> vehicleRateDescription;
    @XmlElement(name = "RateHostIndicator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "HourlyLateCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateInfo hourlyLateCharge;
    @XmlElement(name = "DailyLateCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateInfo dailyLateCharge;
    @XmlElement(name = "PricedEquip")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected List<PricedEquip> pricedEquip;
    @XmlElement(name = "RateInclusions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected RateInclusions rateInclusions;
    @XmlElement(name = "WeeklyLateCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateInfo weeklyLateCharge;
    @XmlElement(name = "PrintText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String printText;
    @XmlAttribute(name = "RatePeriod")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateTimePeriod ratePeriod;
    @XmlAttribute(name = "NumberOfPeriods")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Integer numberOfPeriods;
    @XmlAttribute(name = "UnlimitedMileage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "MileageAllowance")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Integer mileageAllowance;
    @XmlAttribute(name = "Units")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeDistance units;
    @XmlAttribute(name = "RateSource")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String rateSource;
    @XmlAttribute(name = "RateAvailability")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateAvailability rateAvailability;
    @XmlAttribute(name = "RequiredCharges")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String requiredCharges;
    @XmlAttribute(name = "RateCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String rateCode;
    @XmlAttribute(name = "RequestedRateCodeApplied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary requestedRateCodeApplied;
    @XmlAttribute(name = "RateCategory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateCategory rateCategory;
    @XmlAttribute(name = "DiscountNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String discountNumber;
    @XmlAttribute(name = "DiscountNumberApplied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary discountNumberApplied;
    @XmlAttribute(name = "VendorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String vendorCode;
    @XmlAttribute(name = "RateGuaranteed")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RateCodePeriod")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String rateCodePeriod;
    @XmlAttribute(name = "PromotionalCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String promotionalCode;
    @XmlAttribute(name = "PromotionalCodeApplied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary promotionalCodeApplied;
    @XmlAttribute(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String tourCode;
    @XmlAttribute(name = "TourCodeApplied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary tourCodeApplied;
    @XmlAttribute(name = "RateGuaranteeType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeRateGuarantee rateGuaranteeType;
    @XmlAttribute(name = "RequiredPayment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String requiredPayment;
    @XmlAttribute(name = "DropOffChargesIncluded")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean dropOffChargesIncluded;
    @XmlAttribute(name = "CorporateRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean corporateRate;
    @XmlAttribute(name = "AdvancedBooking")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String advancedBooking;
    @XmlAttribute(name = "RentalRestriction")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean rentalRestriction;
    @XmlAttribute(name = "FlightRestriction")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean flightRestriction;
    @XmlAttribute(name = "CardNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String cardNumber;
    @XmlAttribute(name = "CardNumberApplied")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected TypeTrinary cardNumberApplied;
    @XmlAttribute(name = "RateQualifierInd")
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger rateQualifierInd;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the supplierRate property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierRate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public SupplierRate getSupplierRate() {
        return supplierRate;
    }

    /**
     * Sets the value of the supplierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setSupplierRate(SupplierRate value) {
        this.supplierRate = value;
    }

    /**
     * Gets the value of the rateVariance property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateVariance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateVariance getRateVariance() {
        return rateVariance;
    }

    /**
     * Sets the value of the rateVariance property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateVariance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateVariance(TypeRateVariance value) {
        this.rateVariance = value;
    }

    /**
     * Gets the value of the approximateRate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleRates }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeVehicleRates getApproximateRate() {
        return approximateRate;
    }

    /**
     * Sets the value of the approximateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleRates }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setApproximateRate(TypeVehicleRates value) {
        this.approximateRate = value;
    }

    /**
     * Gets the value of the vehicleRateDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleRateDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleRateDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeVehicleRateDescription }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public List<TypeVehicleRateDescription> getVehicleRateDescription() {
        if (vehicleRateDescription == null) {
            vehicleRateDescription = new ArrayList<TypeVehicleRateDescription>();
        }
        return this.vehicleRateDescription;
    }

    /**
     * Gets the value of the rateHostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateHostIndicator getRateHostIndicator() {
        return rateHostIndicator;
    }

    /**
     * Sets the value of the rateHostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateHostIndicator(TypeRateHostIndicator value) {
        this.rateHostIndicator = value;
    }

    /**
     * Gets the value of the hourlyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateInfo getHourlyLateCharge() {
        return hourlyLateCharge;
    }

    /**
     * Sets the value of the hourlyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setHourlyLateCharge(TypeRateInfo value) {
        this.hourlyLateCharge = value;
    }

    /**
     * Gets the value of the dailyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateInfo getDailyLateCharge() {
        return dailyLateCharge;
    }

    /**
     * Sets the value of the dailyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setDailyLateCharge(TypeRateInfo value) {
        this.dailyLateCharge = value;
    }

    /**
     * Gets the value of the pricedEquip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedEquip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedEquip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedEquip }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public List<PricedEquip> getPricedEquip() {
        if (pricedEquip == null) {
            pricedEquip = new ArrayList<PricedEquip>();
        }
        return this.pricedEquip;
    }

    /**
     * Gets the value of the rateInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RateInclusions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public RateInclusions getRateInclusions() {
        return rateInclusions;
    }

    /**
     * Sets the value of the rateInclusions property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateInclusions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateInclusions(RateInclusions value) {
        this.rateInclusions = value;
    }

    /**
     * Gets the value of the weeklyLateCharge property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateInfo getWeeklyLateCharge() {
        return weeklyLateCharge;
    }

    /**
     * Sets the value of the weeklyLateCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setWeeklyLateCharge(TypeRateInfo value) {
        this.weeklyLateCharge = value;
    }

    /**
     * Gets the value of the printText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getPrintText() {
        return printText;
    }

    /**
     * Sets the value of the printText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setPrintText(String value) {
        this.printText = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateTimePeriod getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRatePeriod(TypeRateTimePeriod value) {
        this.ratePeriod = value;
    }

    /**
     * Gets the value of the numberOfPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Integer getNumberOfPeriods() {
        return numberOfPeriods;
    }

    /**
     * Sets the value of the numberOfPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setNumberOfPeriods(Integer value) {
        this.numberOfPeriods = value;
    }

    /**
     * Gets the value of the unlimitedMileage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isUnlimitedMileage() {
        return unlimitedMileage;
    }

    /**
     * Sets the value of the unlimitedMileage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setUnlimitedMileage(Boolean value) {
        this.unlimitedMileage = value;
    }

    /**
     * Gets the value of the mileageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Integer getMileageAllowance() {
        return mileageAllowance;
    }

    /**
     * Sets the value of the mileageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setMileageAllowance(Integer value) {
        this.mileageAllowance = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link TypeDistance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeDistance getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeDistance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setUnits(TypeDistance value) {
        this.units = value;
    }

    /**
     * Gets the value of the rateSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getRateSource() {
        return rateSource;
    }

    /**
     * Sets the value of the rateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateSource(String value) {
        this.rateSource = value;
    }

    /**
     * Gets the value of the rateAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateAvailability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateAvailability getRateAvailability() {
        return rateAvailability;
    }

    /**
     * Sets the value of the rateAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateAvailability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateAvailability(TypeRateAvailability value) {
        this.rateAvailability = value;
    }

    /**
     * Gets the value of the requiredCharges property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getRequiredCharges() {
        return requiredCharges;
    }

    /**
     * Sets the value of the requiredCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRequiredCharges(String value) {
        this.requiredCharges = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the requestedRateCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getRequestedRateCodeApplied() {
        return requestedRateCodeApplied;
    }

    /**
     * Sets the value of the requestedRateCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRequestedRateCodeApplied(TypeTrinary value) {
        this.requestedRateCodeApplied = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateCategory getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateCategory(TypeRateCategory value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the discountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getDiscountNumber() {
        return discountNumber;
    }

    /**
     * Sets the value of the discountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setDiscountNumber(String value) {
        this.discountNumber = value;
    }

    /**
     * Gets the value of the discountNumberApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getDiscountNumberApplied() {
        return discountNumberApplied;
    }

    /**
     * Sets the value of the discountNumberApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setDiscountNumberApplied(TypeTrinary value) {
        this.discountNumberApplied = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the rateGuaranteed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public boolean isRateGuaranteed() {
        if (rateGuaranteed == null) {
            return false;
        } else {
            return rateGuaranteed;
        }
    }

    /**
     * Sets the value of the rateGuaranteed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateGuaranteed(Boolean value) {
        this.rateGuaranteed = value;
    }

    /**
     * Gets the value of the rateCodePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getRateCodePeriod() {
        return rateCodePeriod;
    }

    /**
     * Sets the value of the rateCodePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateCodePeriod(String value) {
        this.rateCodePeriod = value;
    }

    /**
     * Gets the value of the promotionalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getPromotionalCode() {
        return promotionalCode;
    }

    /**
     * Sets the value of the promotionalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Gets the value of the promotionalCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getPromotionalCodeApplied() {
        return promotionalCodeApplied;
    }

    /**
     * Sets the value of the promotionalCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setPromotionalCodeApplied(TypeTrinary value) {
        this.promotionalCodeApplied = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getTourCode() {
        return tourCode;
    }

    /**
     * Sets the value of the tourCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the tourCodeApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getTourCodeApplied() {
        return tourCodeApplied;
    }

    /**
     * Sets the value of the tourCodeApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setTourCodeApplied(TypeTrinary value) {
        this.tourCodeApplied = value;
    }

    /**
     * Gets the value of the rateGuaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateGuarantee }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeRateGuarantee getRateGuaranteeType() {
        return rateGuaranteeType;
    }

    /**
     * Sets the value of the rateGuaranteeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRateGuarantee }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateGuaranteeType(TypeRateGuarantee value) {
        this.rateGuaranteeType = value;
    }

    /**
     * Gets the value of the requiredPayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getRequiredPayment() {
        return requiredPayment;
    }

    /**
     * Sets the value of the requiredPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRequiredPayment(String value) {
        this.requiredPayment = value;
    }

    /**
     * Gets the value of the dropOffChargesIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isDropOffChargesIncluded() {
        return dropOffChargesIncluded;
    }

    /**
     * Sets the value of the dropOffChargesIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setDropOffChargesIncluded(Boolean value) {
        this.dropOffChargesIncluded = value;
    }

    /**
     * Gets the value of the corporateRate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isCorporateRate() {
        return corporateRate;
    }

    /**
     * Sets the value of the corporateRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setCorporateRate(Boolean value) {
        this.corporateRate = value;
    }

    /**
     * Gets the value of the advancedBooking property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getAdvancedBooking() {
        return advancedBooking;
    }

    /**
     * Sets the value of the advancedBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setAdvancedBooking(String value) {
        this.advancedBooking = value;
    }

    /**
     * Gets the value of the rentalRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isRentalRestriction() {
        return rentalRestriction;
    }

    /**
     * Sets the value of the rentalRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRentalRestriction(Boolean value) {
        this.rentalRestriction = value;
    }

    /**
     * Gets the value of the flightRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isFlightRestriction() {
        return flightRestriction;
    }

    /**
     * Sets the value of the flightRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setFlightRestriction(Boolean value) {
        this.flightRestriction = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardNumberApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public TypeTrinary getCardNumberApplied() {
        return cardNumberApplied;
    }

    /**
     * Sets the value of the cardNumberApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTrinary }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setCardNumberApplied(TypeTrinary value) {
        this.cardNumberApplied = value;
    }

    /**
     * Gets the value of the rateQualifierInd property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getRateQualifierInd() {
        return rateQualifierInd;
    }

    /**
     * Sets the value of the rateQualifierInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setRateQualifierInd(BigInteger value) {
        this.rateQualifierInd = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
