
package com.travelport.schema.vehicle_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v29_0.TypeDistance;
import com.travelport.schema.common_v29_0.TypeRateCategory;
import com.travelport.schema.common_v29_0.TypeRateGuarantee;
import com.travelport.schema.common_v29_0.TypeRateTimePeriod;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SupplierRate" type="{http://www.travelport.com/schema/vehicle_v29_0}typeVehicleRates" minOccurs="0"/>
 *         &lt;element name="ApproximateRate" type="{http://www.travelport.com/schema/vehicle_v29_0}typeVehicleRates" minOccurs="0"/>
 *         &lt;element name="VehicleRateDescription" type="{http://www.travelport.com/schema/vehicle_v29_0}typeVehicleRateDescription" minOccurs="0"/>
 *         &lt;element name="RateHostIndicator" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRateHostIndicator" minOccurs="0"/>
 *         &lt;element name="HourlyLateCharge" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRateInfo" minOccurs="0"/>
 *         &lt;element name="DailyLateCharge" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRateInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v29_0}RateInclusions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RatePeriod" type="{http://www.travelport.com/schema/common_v29_0}typeRateTimePeriod" />
 *       &lt;attribute name="NumberOfPeriods" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="UnlimitedMileage" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MileageAllowance" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Units" type="{http://www.travelport.com/schema/common_v29_0}typeDistance" />
 *       &lt;attribute name="RateSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateAvailability" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRateAvailability" />
 *       &lt;attribute name="RequiredCharges" type="{http://www.travelport.com/schema/common_v29_0}typeMoney" />
 *       &lt;attribute name="RateCode" type="{http://www.travelport.com/schema/common_v29_0}typeRateCode" />
 *       &lt;attribute name="RateCategory" type="{http://www.travelport.com/schema/common_v29_0}typeRateCategory" />
 *       &lt;attribute name="DiscountNumber" type="{http://www.travelport.com/schema/common_v29_0}typeDiscountNumber" />
 *       &lt;attribute name="VendorCode" type="{http://www.travelport.com/schema/common_v29_0}typeSupplierCode" />
 *       &lt;attribute name="RateGuaranteed" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RateCodePeriod" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PromotionalCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TourCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RateGuaranteeType" type="{http://www.travelport.com/schema/common_v29_0}typeRateGuarantee" />
 *       &lt;attribute name="RequiredPayment">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Guarantee"/>
 *             &lt;enumeration value="Deposit"/>
 *             &lt;enumeration value="PrePayment"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DropOffChargesIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "supplierRate",
    "approximateRate",
    "vehicleRateDescription",
    "rateHostIndicator",
    "hourlyLateCharge",
    "dailyLateCharge",
    "rateInclusions"
})
@XmlRootElement(name = "VehicleRate")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
public class VehicleRate
    implements Locatable
{

    @XmlElement(name = "SupplierRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeVehicleRates supplierRate;
    @XmlElement(name = "ApproximateRate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeVehicleRates approximateRate;
    @XmlElement(name = "VehicleRateDescription")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeVehicleRateDescription vehicleRateDescription;
    @XmlElement(name = "RateHostIndicator")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateHostIndicator rateHostIndicator;
    @XmlElement(name = "HourlyLateCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateInfo hourlyLateCharge;
    @XmlElement(name = "DailyLateCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateInfo dailyLateCharge;
    @XmlElement(name = "RateInclusions")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected RateInclusions rateInclusions;
    @XmlAttribute(name = "RatePeriod")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateTimePeriod ratePeriod;
    @XmlAttribute(name = "NumberOfPeriods")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Integer numberOfPeriods;
    @XmlAttribute(name = "UnlimitedMileage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean unlimitedMileage;
    @XmlAttribute(name = "MileageAllowance")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Integer mileageAllowance;
    @XmlAttribute(name = "Units")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeDistance units;
    @XmlAttribute(name = "RateSource")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String rateSource;
    @XmlAttribute(name = "RateAvailability")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateAvailability rateAvailability;
    @XmlAttribute(name = "RequiredCharges")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String requiredCharges;
    @XmlAttribute(name = "RateCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String rateCode;
    @XmlAttribute(name = "RateCategory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateCategory rateCategory;
    @XmlAttribute(name = "DiscountNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String discountNumber;
    @XmlAttribute(name = "VendorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String vendorCode;
    @XmlAttribute(name = "RateGuaranteed")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean rateGuaranteed;
    @XmlAttribute(name = "RateCodePeriod")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String rateCodePeriod;
    @XmlAttribute(name = "PromotionalCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String promotionalCode;
    @XmlAttribute(name = "TourCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String tourCode;
    @XmlAttribute(name = "RateGuaranteeType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeRateGuarantee rateGuaranteeType;
    @XmlAttribute(name = "RequiredPayment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String requiredPayment;
    @XmlAttribute(name = "DropOffChargesIncluded")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean dropOffChargesIncluded;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the supplierRate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleRates }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public TypeVehicleRates getSupplierRate() {
        return supplierRate;
    }

    /**
     * Sets the value of the supplierRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleRates }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setSupplierRate(TypeVehicleRates value) {
        this.supplierRate = value;
    }

    /**
     * Gets the value of the approximateRate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleRates }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setApproximateRate(TypeVehicleRates value) {
        this.approximateRate = value;
    }

    /**
     * Gets the value of the vehicleRateDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleRateDescription }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public TypeVehicleRateDescription getVehicleRateDescription() {
        return vehicleRateDescription;
    }

    /**
     * Sets the value of the vehicleRateDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleRateDescription }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setVehicleRateDescription(TypeVehicleRateDescription value) {
        this.vehicleRateDescription = value;
    }

    /**
     * Gets the value of the rateHostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateHostIndicator }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setDailyLateCharge(TypeRateInfo value) {
        this.dailyLateCharge = value;
    }

    /**
     * Gets the value of the rateInclusions property.
     * 
     * @return
     *     possible object is
     *     {@link RateInclusions }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setRateInclusions(RateInclusions value) {
        this.rateInclusions = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateTimePeriod }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setDiscountNumber(String value) {
        this.discountNumber = value;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setPromotionalCode(String value) {
        this.promotionalCode = value;
    }

    /**
     * Gets the value of the tourCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * Gets the value of the rateGuaranteeType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRateGuarantee }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setDropOffChargesIncluded(Boolean value) {
        this.dropOffChargesIncluded = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
