
package com.travelport.schema.vehicle_v38_0;

import java.util.ArrayList;
import java.util.List;
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
import com.travelport.schema.common_v38_0.BaseSearchRsp;
import com.travelport.schema.common_v38_0.MarketingInformation;
import com.travelport.schema.common_v38_0.TypeKeyword;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseSearchRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v38_0}Vehicle"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v38_0}OperationTime" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="StartEndTimes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EarliestStart" type="{http://www.travelport.com/schema/vehicle_v38_0}typeStartEndTime" minOccurs="0"/&gt;
 *                   &lt;element name="LatestStart" type="{http://www.travelport.com/schema/vehicle_v38_0}typeStartEndTime" minOccurs="0"/&gt;
 *                   &lt;element name="LatestEnd" type="{http://www.travelport.com/schema/vehicle_v38_0}typeStartEndTime" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RentalPeriodRules" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="MaxRental" type="{http://www.travelport.com/schema/vehicle_v38_0}typeRentalPeriod" minOccurs="0"/&gt;
 *                   &lt;element name="MinRental" type="{http://www.travelport.com/schema/vehicle_v38_0}typeRentalPeriod" minOccurs="0"/&gt;
 *                   &lt;element name="AbsoluteMax" type="{http://www.travelport.com/schema/vehicle_v38_0}typeRentalPeriod" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PrePayCancelInfo" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
 *                 &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="NumberOfDaysHours" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="RentalDays" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentRule" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.travelport.com/schema/vehicle_v38_0}typeDepositGuarantee"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CreditCard" maxOccurs="13" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;length value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PaymentCreditCard" maxOccurs="13" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="VehicleCharge" type="{http://www.travelport.com/schema/vehicle_v38_0}typeVehicleCharge" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}MarketingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v38_0}Policy" maxOccurs="999" minOccurs="0"/&gt;
 *         &lt;element name="PickupLocationInformation" type="{http://www.travelport.com/schema/vehicle_v38_0}typeVehicleLocationInformation" minOccurs="0"/&gt;
 *         &lt;element name="ReturnLocationInformation" type="{http://www.travelport.com/schema/vehicle_v38_0}typeVehicleLocationInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
    "prePayCancelInfo",
    "paymentRule",
    "paymentCreditCard",
    "vehicleCharge",
    "marketingInformation",
    "policy",
    "pickupLocationInformation",
    "returnLocationInformation"
})
@XmlRootElement(name = "VehicleRulesRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
public class VehicleRulesRsp
    extends BaseSearchRsp
{

    @XmlElement(name = "Vehicle", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected Vehicle vehicle;
    @XmlElement(name = "OperationTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> operationTime;
    @XmlElement(name = "StartEndTimes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleRulesRsp.StartEndTimes startEndTimes;
    @XmlElement(name = "RentalPeriodRules")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleRulesRsp.RentalPeriodRules rentalPeriodRules;
    @XmlElement(name = "PrePayCancelInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<VehicleRulesRsp.PrePayCancelInfo> prePayCancelInfo;
    @XmlElement(name = "PaymentRule")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<VehicleRulesRsp.PaymentRule> paymentRule;
    @XmlElement(name = "PaymentCreditCard")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> paymentCreditCard;
    @XmlElement(name = "VehicleCharge")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeVehicleCharge> vehicleCharge;
    @XmlElement(name = "MarketingInformation", namespace = "http://www.travelport.com/schema/common_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected MarketingInformation marketingInformation;
    @XmlElement(name = "Policy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeKeyword> policy;
    @XmlElement(name = "PickupLocationInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected TypeVehicleLocationInformation pickupLocationInformation;
    @XmlElement(name = "ReturnLocationInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected TypeVehicleLocationInformation returnLocationInformation;

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link Vehicle }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setRentalPeriodRules(VehicleRulesRsp.RentalPeriodRules value) {
        this.rentalPeriodRules = value;
    }

    /**
     * Gets the value of the prePayCancelInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePayCancelInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrePayCancelInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRulesRsp.PrePayCancelInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public List<VehicleRulesRsp.PrePayCancelInfo> getPrePayCancelInfo() {
        if (prePayCancelInfo == null) {
            prePayCancelInfo = new ArrayList<VehicleRulesRsp.PrePayCancelInfo>();
        }
        return this.prePayCancelInfo;
    }

    /**
     * Gets the value of the paymentRule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentRule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleRulesRsp.PaymentRule }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public List<VehicleRulesRsp.PaymentRule> getPaymentRule() {
        if (paymentRule == null) {
            paymentRule = new ArrayList<VehicleRulesRsp.PaymentRule>();
        }
        return this.paymentRule;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setMarketingInformation(MarketingInformation value) {
        this.marketingInformation = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeKeyword }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public List<TypeKeyword> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<TypeKeyword>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the pickupLocationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocationInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public TypeVehicleLocationInformation getPickupLocationInformation() {
        return pickupLocationInformation;
    }

    /**
     * Sets the value of the pickupLocationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocationInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setPickupLocationInformation(TypeVehicleLocationInformation value) {
        this.pickupLocationInformation = value;
    }

    /**
     * Gets the value of the returnLocationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleLocationInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public TypeVehicleLocationInformation getReturnLocationInformation() {
        return returnLocationInformation;
    }

    /**
     * Sets the value of the returnLocationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleLocationInformation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setReturnLocationInformation(TypeVehicleLocationInformation value) {
        this.returnLocationInformation = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.travelport.com/schema/vehicle_v38_0}typeDepositGuarantee"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CreditCard" maxOccurs="13" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;length value="2"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "creditCard"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public static class PaymentRule
        extends TypeDepositGuarantee
    {

        @XmlElement(name = "CreditCard")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.travelport.com/schema/common_v38_0}typeMoney" /&gt;
     *       &lt;attribute name="Percent" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="NumberOfDaysHours" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="RentalDays" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public static class PrePayCancelInfo
        implements Locatable
    {

        @XmlAttribute(name = "Code", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected int code;
        @XmlAttribute(name = "Amount")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected String amount;
        @XmlAttribute(name = "Percent")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected Integer percent;
        @XmlAttribute(name = "NumberOfDaysHours")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected Integer numberOfDaysHours;
        @XmlAttribute(name = "RentalDays")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected Integer rentalDays;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the code property.
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public int getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setCode(int value) {
            this.code = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setAmount(String value) {
            this.amount = value;
        }

        /**
         * Gets the value of the percent property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public Integer getPercent() {
            return percent;
        }

        /**
         * Sets the value of the percent property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setPercent(Integer value) {
            this.percent = value;
        }

        /**
         * Gets the value of the numberOfDaysHours property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public Integer getNumberOfDaysHours() {
            return numberOfDaysHours;
        }

        /**
         * Sets the value of the numberOfDaysHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setNumberOfDaysHours(Integer value) {
            this.numberOfDaysHours = value;
        }

        /**
         * Gets the value of the rentalDays property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public Integer getRentalDays() {
            return rentalDays;
        }

        /**
         * Sets the value of the rentalDays property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setRentalDays(Integer value) {
            this.rentalDays = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="MaxRental" type="{http://www.travelport.com/schema/vehicle_v38_0}typeRentalPeriod" minOccurs="0"/&gt;
     *         &lt;element name="MinRental" type="{http://www.travelport.com/schema/vehicle_v38_0}typeRentalPeriod" minOccurs="0"/&gt;
     *         &lt;element name="AbsoluteMax" type="{http://www.travelport.com/schema/vehicle_v38_0}typeRentalPeriod" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public static class RentalPeriodRules
        implements Locatable
    {

        @XmlElement(name = "MaxRental")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected TypeRentalPeriod maxRental;
        @XmlElement(name = "MinRental")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected TypeRentalPeriod minRental;
        @XmlElement(name = "AbsoluteMax")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected TypeRentalPeriod absoluteMax;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the maxRental property.
         * 
         * @return
         *     possible object is
         *     {@link TypeRentalPeriod }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setAbsoluteMax(TypeRentalPeriod value) {
            this.absoluteMax = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EarliestStart" type="{http://www.travelport.com/schema/vehicle_v38_0}typeStartEndTime" minOccurs="0"/&gt;
     *         &lt;element name="LatestStart" type="{http://www.travelport.com/schema/vehicle_v38_0}typeStartEndTime" minOccurs="0"/&gt;
     *         &lt;element name="LatestEnd" type="{http://www.travelport.com/schema/vehicle_v38_0}typeStartEndTime" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public static class StartEndTimes
        implements Locatable
    {

        @XmlElement(name = "EarliestStart")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected TypeStartEndTime earliestStart;
        @XmlElement(name = "LatestStart")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected TypeStartEndTime latestStart;
        @XmlElement(name = "LatestEnd")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected TypeStartEndTime latestEnd;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the earliestStart property.
         * 
         * @return
         *     possible object is
         *     {@link TypeStartEndTime }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setLatestEnd(TypeStartEndTime value) {
            this.latestEnd = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
