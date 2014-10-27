
package com.travelport.schema.vehicle_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v29_0.BaseSearchRsp;
import com.travelport.schema.common_v29_0.MarketingInformation;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseSearchRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v29_0}Vehicle"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v29_0}OperationTime" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="StartEndTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="EarliestStart" type="{http://www.travelport.com/schema/vehicle_v29_0}typeStartEndTime" minOccurs="0"/>
 *                   &lt;element name="LatestStart" type="{http://www.travelport.com/schema/vehicle_v29_0}typeStartEndTime" minOccurs="0"/>
 *                   &lt;element name="LatestEnd" type="{http://www.travelport.com/schema/vehicle_v29_0}typeStartEndTime" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RentalPeriodRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MaxRental" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRentalPeriod" minOccurs="0"/>
 *                   &lt;element name="MinRental" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRentalPeriod" minOccurs="0"/>
 *                   &lt;element name="AbsoluteMax" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRentalPeriod" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DepositGuaranteeRule" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.travelport.com/schema/vehicle_v29_0}typeDepositGuarantee">
 *                 &lt;sequence>
 *                   &lt;element name="CreditCard" maxOccurs="13" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PaymentCreditCard" maxOccurs="13" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;length value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="VehicleCharge" type="{http://www.travelport.com/schema/vehicle_v29_0}typeVehicleCharge" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}MarketingInformation" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicle",
    "operationTime",
    "startEndTimes",
    "rentalPeriodRules",
    "depositGuaranteeRule",
    "paymentCreditCard",
    "vehicleCharge",
    "marketingInformation"
})
@XmlRootElement(name = "VehicleRulesRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
public class VehicleRulesRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "Vehicle", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Vehicle vehicle;
    @XmlElement(name = "OperationTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected List<String> operationTime;
    @XmlElement(name = "StartEndTimes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected VehicleRulesRsp.StartEndTimes startEndTimes;
    @XmlElement(name = "RentalPeriodRules")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected VehicleRulesRsp.RentalPeriodRules rentalPeriodRules;
    @XmlElement(name = "DepositGuaranteeRule")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected List<VehicleRulesRsp.DepositGuaranteeRule> depositGuaranteeRule;
    @XmlElement(name = "PaymentCreditCard")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected List<String> paymentCreditCard;
    @XmlElement(name = "VehicleCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected List<TypeVehicleCharge> vehicleCharge;
    @XmlElement(name = "MarketingInformation", namespace = "http://www.travelport.com/schema/common_v29_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected MarketingInformation marketingInformation;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vehicle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setVehicle(Vehicle value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the operationTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public List<String> getOperationTime() {
        if (operationTime == null) {
            operationTime = new ArrayList<String>();
        }
        return this.operationTime;
    }

    /**
     * Gets the value of the startEndTimes property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRulesRsp.StartEndTimes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public VehicleRulesRsp.StartEndTimes getStartEndTimes() {
        return startEndTimes;
    }

    /**
     * Sets the value of the startEndTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRulesRsp.StartEndTimes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setStartEndTimes(VehicleRulesRsp.StartEndTimes value) {
        this.startEndTimes = value;
    }

    /**
     * Gets the value of the rentalPeriodRules property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRulesRsp.RentalPeriodRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public VehicleRulesRsp.RentalPeriodRules getRentalPeriodRules() {
        return rentalPeriodRules;
    }

    /**
     * Sets the value of the rentalPeriodRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRulesRsp.RentalPeriodRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setRentalPeriodRules(VehicleRulesRsp.RentalPeriodRules value) {
        this.rentalPeriodRules = value;
    }

    /**
     * Gets the value of the depositGuaranteeRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositGuaranteeRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositGuaranteeRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRulesRsp.DepositGuaranteeRule }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public List<VehicleRulesRsp.DepositGuaranteeRule> getDepositGuaranteeRule() {
        if (depositGuaranteeRule == null) {
            depositGuaranteeRule = new ArrayList<VehicleRulesRsp.DepositGuaranteeRule>();
        }
        return this.depositGuaranteeRule;
    }

    /**
     * Gets the value of the paymentCreditCard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCreditCard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCreditCard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public List<String> getPaymentCreditCard() {
        if (paymentCreditCard == null) {
            paymentCreditCard = new ArrayList<String>();
        }
        return this.paymentCreditCard;
    }

    /**
     * Gets the value of the vehicleCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeVehicleCharge }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public List<TypeVehicleCharge> getVehicleCharge() {
        if (vehicleCharge == null) {
            vehicleCharge = new ArrayList<TypeVehicleCharge>();
        }
        return this.vehicleCharge;
    }

    /**
     * Gets the value of the marketingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public MarketingInformation getMarketingInformation() {
        return marketingInformation;
    }

    /**
     * Sets the value of the marketingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setMarketingInformation(MarketingInformation value) {
        this.marketingInformation = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.travelport.com/schema/vehicle_v29_0}typeDepositGuarantee">
     *       &lt;sequence>
     *         &lt;element name="CreditCard" maxOccurs="13" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creditCard"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public static class DepositGuaranteeRule
        extends TypeDepositGuarantee
    {

        @XmlElement(name = "CreditCard")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected List<String> creditCard;

        /**
         * Gets the value of the creditCard property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the creditCard property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCreditCard().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public List<String> getCreditCard() {
            if (creditCard == null) {
                creditCard = new ArrayList<String>();
            }
            return this.creditCard;
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

    }


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
     *         &lt;element name="MaxRental" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRentalPeriod" minOccurs="0"/>
     *         &lt;element name="MinRental" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRentalPeriod" minOccurs="0"/>
     *         &lt;element name="AbsoluteMax" type="{http://www.travelport.com/schema/vehicle_v29_0}typeRentalPeriod" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "maxRental",
        "minRental",
        "absoluteMax"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public static class RentalPeriodRules
        implements Locatable
    {

        @XmlElement(name = "MaxRental")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected TypeRentalPeriod maxRental;
        @XmlElement(name = "MinRental")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected TypeRentalPeriod minRental;
        @XmlElement(name = "AbsoluteMax")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected TypeRentalPeriod absoluteMax;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the maxRental property.
         * 
         * @return
         *     possible object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public TypeRentalPeriod getMaxRental() {
            return maxRental;
        }

        /**
         * Sets the value of the maxRental property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public void setMaxRental(TypeRentalPeriod value) {
            this.maxRental = value;
        }

        /**
         * Gets the value of the minRental property.
         * 
         * @return
         *     possible object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public TypeRentalPeriod getMinRental() {
            return minRental;
        }

        /**
         * Sets the value of the minRental property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public void setMinRental(TypeRentalPeriod value) {
            this.minRental = value;
        }

        /**
         * Gets the value of the absoluteMax property.
         * 
         * @return
         *     possible object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public TypeRentalPeriod getAbsoluteMax() {
            return absoluteMax;
        }

        /**
         * Sets the value of the absoluteMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public void setAbsoluteMax(TypeRentalPeriod value) {
            this.absoluteMax = value;
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
     *         &lt;element name="EarliestStart" type="{http://www.travelport.com/schema/vehicle_v29_0}typeStartEndTime" minOccurs="0"/>
     *         &lt;element name="LatestStart" type="{http://www.travelport.com/schema/vehicle_v29_0}typeStartEndTime" minOccurs="0"/>
     *         &lt;element name="LatestEnd" type="{http://www.travelport.com/schema/vehicle_v29_0}typeStartEndTime" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "earliestStart",
        "latestStart",
        "latestEnd"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public static class StartEndTimes
        implements Locatable
    {

        @XmlElement(name = "EarliestStart")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected TypeStartEndTime earliestStart;
        @XmlElement(name = "LatestStart")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected TypeStartEndTime latestStart;
        @XmlElement(name = "LatestEnd")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected TypeStartEndTime latestEnd;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the earliestStart property.
         * 
         * @return
         *     possible object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public TypeStartEndTime getEarliestStart() {
            return earliestStart;
        }

        /**
         * Sets the value of the earliestStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public void setEarliestStart(TypeStartEndTime value) {
            this.earliestStart = value;
        }

        /**
         * Gets the value of the latestStart property.
         * 
         * @return
         *     possible object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public TypeStartEndTime getLatestStart() {
            return latestStart;
        }

        /**
         * Sets the value of the latestStart property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public void setLatestStart(TypeStartEndTime value) {
            this.latestStart = value;
        }

        /**
         * Gets the value of the latestEnd property.
         * 
         * @return
         *     possible object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public TypeStartEndTime getLatestEnd() {
            return latestEnd;
        }

        /**
         * Sets the value of the latestEnd property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
        public void setLatestEnd(TypeStartEndTime value) {
            this.latestEnd = value;
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

}
