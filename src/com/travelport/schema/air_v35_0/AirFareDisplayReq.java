
package com.travelport.schema.air_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v35_0.AccountCode;
import com.travelport.schema.common_v35_0.BaseReq;
import com.travelport.schema.common_v35_0.Carrier;
import com.travelport.schema.common_v35_0.PointOfSale;
import com.travelport.schema.common_v35_0.TypePassengerType;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FareType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="PassengerType" type="{http://www.travelport.com/schema/common_v35_0}typePassengerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}BookingCode" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}IncludeAddlBookingCodeInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FareBasis" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}Carrier" maxOccurs="10" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}AccountCode" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}ContractCode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirFareDisplayModifiers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}PointOfSale" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirFareDisplayRuleKey" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Origin" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeIATACode" /&gt;
 *       &lt;attribute name="Destination" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeIATACode" /&gt;
 *       &lt;attribute name="ProviderCode" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeProviderCode" /&gt;
 *       &lt;attribute name="IncludeMileRouteInformation" type="{http://www.travelport.com/schema/air_v35_0}typeMileOrRouteBasedFare" /&gt;
 *       &lt;attribute name="UnSaleableFaresOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareType",
    "passengerType",
    "bookingCode",
    "includeAddlBookingCodeInfo",
    "fareBasis",
    "carrier",
    "accountCode",
    "contractCode",
    "airFareDisplayModifiers",
    "pointOfSale",
    "airFareDisplayRuleKey"
})
@XmlRootElement(name = "AirFareDisplayReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
public class AirFareDisplayReq
    extends BaseReq
{

    @XmlElement(name = "FareType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<FareType> fareType;
    @XmlElement(name = "PassengerType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypePassengerType> passengerType;
    @XmlElement(name = "BookingCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<BookingCode> bookingCode;
    @XmlElement(name = "IncludeAddlBookingCodeInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected IncludeAddlBookingCodeInfo includeAddlBookingCodeInfo;
    @XmlElement(name = "FareBasis")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected FareBasis fareBasis;
    @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<Carrier> carrier;
    @XmlElement(name = "AccountCode", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<AccountCode> accountCode;
    @XmlElement(name = "ContractCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected ContractCode contractCode;
    @XmlElement(name = "AirFareDisplayModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected AirFareDisplayModifiers airFareDisplayModifiers;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected List<PointOfSale> pointOfSale;
    @XmlElement(name = "AirFareDisplayRuleKey")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected AirFareDisplayRuleKey airFareDisplayRuleKey;
    @XmlAttribute(name = "Origin", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected String origin;
    @XmlAttribute(name = "Destination", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected String destination;
    @XmlAttribute(name = "ProviderCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected String providerCode;
    @XmlAttribute(name = "IncludeMileRouteInformation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected TypeMileOrRouteBasedFare includeMileRouteInformation;
    @XmlAttribute(name = "UnSaleableFaresOnly")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean unSaleableFaresOnly;

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the fareType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<FareType> getFareType() {
        if (fareType == null) {
            fareType = new ArrayList<FareType>();
        }
        return this.fareType;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypePassengerType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<TypePassengerType> getPassengerType() {
        if (passengerType == null) {
            passengerType = new ArrayList<TypePassengerType>();
        }
        return this.passengerType;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the bookingCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingCode }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<BookingCode> getBookingCode() {
        if (bookingCode == null) {
            bookingCode = new ArrayList<BookingCode>();
        }
        return this.bookingCode;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link IncludeAddlBookingCodeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public IncludeAddlBookingCodeInfo getIncludeAddlBookingCodeInfo() {
        return includeAddlBookingCodeInfo;
    }

    /**
     * Sets the value of the includeAddlBookingCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncludeAddlBookingCodeInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setIncludeAddlBookingCodeInfo(IncludeAddlBookingCodeInfo value) {
        this.includeAddlBookingCodeInfo = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link FareBasis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasis }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setFareBasis(FareBasis value) {
        this.fareBasis = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the carrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Carrier }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<Carrier> getCarrier() {
        if (carrier == null) {
            carrier = new ArrayList<Carrier>();
        }
        return this.carrier;
    }

    /**
     * Provider: 1G,1V,1P,1J.Gets the value of the accountCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountCode }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<AccountCode> getAccountCode() {
        if (accountCode == null) {
            accountCode = new ArrayList<AccountCode>();
        }
        return this.accountCode;
    }

    /**
     * Provider: 1G,1V.
     * 
     * @return
     *     possible object is
     *     {@link ContractCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public ContractCode getContractCode() {
        return contractCode;
    }

    /**
     * Sets the value of the contractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractCode }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setContractCode(ContractCode value) {
        this.contractCode = value;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public AirFareDisplayModifiers getAirFareDisplayModifiers() {
        return airFareDisplayModifiers;
    }

    /**
     * Sets the value of the airFareDisplayModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setAirFareDisplayModifiers(AirFareDisplayModifiers value) {
        this.airFareDisplayModifiers = value;
    }

    /**
     * Provider: 1G,1V.Gets the value of the pointOfSale property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSale property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSale().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PointOfSale }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public List<PointOfSale> getPointOfSale() {
        if (pointOfSale == null) {
            pointOfSale = new ArrayList<PointOfSale>();
        }
        return this.pointOfSale;
    }

    /**
     * Provider: 1G,1V,1P,1J.
     * 
     * @return
     *     possible object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public AirFareDisplayRuleKey getAirFareDisplayRuleKey() {
        return airFareDisplayRuleKey;
    }

    /**
     * Sets the value of the airFareDisplayRuleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirFareDisplayRuleKey }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setAirFareDisplayRuleKey(AirFareDisplayRuleKey value) {
        this.airFareDisplayRuleKey = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the includeMileRouteInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public TypeMileOrRouteBasedFare getIncludeMileRouteInformation() {
        return includeMileRouteInformation;
    }

    /**
     * Sets the value of the includeMileRouteInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeMileOrRouteBasedFare }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setIncludeMileRouteInformation(TypeMileOrRouteBasedFare value) {
        this.includeMileRouteInformation = value;
    }

    /**
     * Gets the value of the unSaleableFaresOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isUnSaleableFaresOnly() {
        return unSaleableFaresOnly;
    }

    /**
     * Sets the value of the unSaleableFaresOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public void setUnSaleableFaresOnly(Boolean value) {
        this.unSaleableFaresOnly = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T10:09:46-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
