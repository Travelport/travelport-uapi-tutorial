
package com.travelport.schema.air_v18_0;

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
import com.travelport.schema.common_v15_0.HostToken;
import com.travelport.schema.common_v15_0.MetaData;
import com.travelport.schema.common_v15_0.TypeResultMessage;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirSegmentRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}LegRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirPricingInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareNote" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FareNoteRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}Connection" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}MarriageGroup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}MetaData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AirPricingResultMessage" type="{http://www.travelport.com/schema/common_v15_0}typeResultMessage" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}FeeInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}TaxInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AirItinerarySolutionRef" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}HostToken" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}OptionalServices" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v18_0}AvailableSSR" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v15_0}attrPrices"/>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airSegment",
    "airSegmentRef",
    "legRef",
    "airPricingInfo",
    "fareNote",
    "fareNoteRef",
    "connection",
    "marriageGroup",
    "metaData",
    "airPricingResultMessage",
    "feeInfo",
    "taxInfo",
    "airItinerarySolutionRef",
    "hostToken",
    "optionalServices",
    "availableSSR"
})
@XmlRootElement(name = "AirPricingSolution")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class AirPricingSolution
    implements Locatable
{

    @XmlElement(name = "AirSegment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<AirSegment> airSegment;
    @XmlElement(name = "AirSegmentRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<AirSegmentRef> airSegmentRef;
    @XmlElement(name = "LegRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<LegRef> legRef;
    @XmlElement(name = "AirPricingInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<AirPricingInfo> airPricingInfo;
    @XmlElement(name = "FareNote")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<FareNote> fareNote;
    @XmlElement(name = "FareNoteRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<FareNoteRef> fareNoteRef;
    @XmlElement(name = "Connection")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<Connection> connection;
    @XmlElement(name = "MarriageGroup")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<MarriageGroup> marriageGroup;
    @XmlElement(name = "MetaData", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<MetaData> metaData;
    @XmlElement(name = "AirPricingResultMessage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeResultMessage> airPricingResultMessage;
    @XmlElement(name = "FeeInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<FeeInfo> feeInfo;
    @XmlElement(name = "TaxInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<TypeTaxInfo> taxInfo;
    @XmlElement(name = "AirItinerarySolutionRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<AirItinerarySolutionRef> airItinerarySolutionRef;
    @XmlElement(name = "HostToken", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<HostToken> hostToken;
    @XmlElement(name = "OptionalServices")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected OptionalServices optionalServices;
    @XmlElement(name = "AvailableSSR")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected AvailableSSR availableSSR;
    @XmlAttribute(name = "Key", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String key;
    @XmlAttribute(name = "TotalPrice")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String totalPrice;
    @XmlAttribute(name = "BasePrice")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String basePrice;
    @XmlAttribute(name = "ApproximateTotalPrice")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String approximateTotalPrice;
    @XmlAttribute(name = "ApproximateBasePrice")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String approximateBasePrice;
    @XmlAttribute(name = "EquivalentBasePrice")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String equivalentBasePrice;
    @XmlAttribute(name = "Taxes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String taxes;
    @XmlAttribute(name = "Fees")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String fees;
    @XmlAttribute(name = "Services")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String services;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the airSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<AirSegment> getAirSegment() {
        if (airSegment == null) {
            airSegment = new ArrayList<AirSegment>();
        }
        return this.airSegment;
    }

    /**
     * Gets the value of the airSegmentRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegmentRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<AirSegmentRef> getAirSegmentRef() {
        if (airSegmentRef == null) {
            airSegmentRef = new ArrayList<AirSegmentRef>();
        }
        return this.airSegmentRef;
    }

    /**
     * Gets the value of the legRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<LegRef> getLegRef() {
        if (legRef == null) {
            legRef = new ArrayList<LegRef>();
        }
        return this.legRef;
    }

    /**
     * Gets the value of the airPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricingInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<AirPricingInfo> getAirPricingInfo() {
        if (airPricingInfo == null) {
            airPricingInfo = new ArrayList<AirPricingInfo>();
        }
        return this.airPricingInfo;
    }

    /**
     * Gets the value of the fareNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareNote }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<FareNote> getFareNote() {
        if (fareNote == null) {
            fareNote = new ArrayList<FareNote>();
        }
        return this.fareNote;
    }

    /**
     * Gets the value of the fareNoteRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareNoteRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareNoteRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareNoteRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<FareNoteRef> getFareNoteRef() {
        if (fareNoteRef == null) {
            fareNoteRef = new ArrayList<FareNoteRef>();
        }
        return this.fareNoteRef;
    }

    /**
     * Gets the value of the connection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Connection }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<Connection> getConnection() {
        if (connection == null) {
            connection = new ArrayList<Connection>();
        }
        return this.connection;
    }

    /**
     * Gets the value of the marriageGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marriageGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarriageGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarriageGroup }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<MarriageGroup> getMarriageGroup() {
        if (marriageGroup == null) {
            marriageGroup = new ArrayList<MarriageGroup>();
        }
        return this.marriageGroup;
    }

    /**
     * Gets the value of the metaData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetaData }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<MetaData> getMetaData() {
        if (metaData == null) {
            metaData = new ArrayList<MetaData>();
        }
        return this.metaData;
    }

    /**
     * Gets the value of the airPricingResultMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airPricingResultMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirPricingResultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeResultMessage }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeResultMessage> getAirPricingResultMessage() {
        if (airPricingResultMessage == null) {
            airPricingResultMessage = new ArrayList<TypeResultMessage>();
        }
        return this.airPricingResultMessage;
    }

    /**
     * Gets the value of the feeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<FeeInfo> getFeeInfo() {
        if (feeInfo == null) {
            feeInfo = new ArrayList<FeeInfo>();
        }
        return this.feeInfo;
    }

    /**
     * Itinerary level taxes Gets the value of the taxInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTaxInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<TypeTaxInfo> getTaxInfo() {
        if (taxInfo == null) {
            taxInfo = new ArrayList<TypeTaxInfo>();
        }
        return this.taxInfo;
    }

    /**
     * Gets the value of the airItinerarySolutionRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItinerarySolutionRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItinerarySolutionRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirItinerarySolutionRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<AirItinerarySolutionRef> getAirItinerarySolutionRef() {
        if (airItinerarySolutionRef == null) {
            airItinerarySolutionRef = new ArrayList<AirItinerarySolutionRef>();
        }
        return this.airItinerarySolutionRef;
    }

    /**
     * Gets the value of the hostToken property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hostToken property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHostToken().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HostToken }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<HostToken> getHostToken() {
        if (hostToken == null) {
            hostToken = new ArrayList<HostToken>();
        }
        return this.hostToken;
    }

    /**
     * Gets the value of the optionalServices property.
     * 
     * @return
     *     possible object is
     *     {@link OptionalServices }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public OptionalServices getOptionalServices() {
        return optionalServices;
    }

    /**
     * Sets the value of the optionalServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionalServices }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setOptionalServices(OptionalServices value) {
        this.optionalServices = value;
    }

    /**
     * Gets the value of the availableSSR property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSSR }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public AvailableSSR getAvailableSSR() {
        return availableSSR;
    }

    /**
     * Sets the value of the availableSSR property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSSR }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setAvailableSSR(AvailableSSR value) {
        this.availableSSR = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Sets the value of the basePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Gets the value of the approximateTotalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getApproximateTotalPrice() {
        return approximateTotalPrice;
    }

    /**
     * Sets the value of the approximateTotalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setApproximateTotalPrice(String value) {
        this.approximateTotalPrice = value;
    }

    /**
     * Gets the value of the approximateBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getApproximateBasePrice() {
        return approximateBasePrice;
    }

    /**
     * Sets the value of the approximateBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setApproximateBasePrice(String value) {
        this.approximateBasePrice = value;
    }

    /**
     * Gets the value of the equivalentBasePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getEquivalentBasePrice() {
        return equivalentBasePrice;
    }

    /**
     * Sets the value of the equivalentBasePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setEquivalentBasePrice(String value) {
        this.equivalentBasePrice = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTaxes(String value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setFees(String value) {
        this.fees = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setServices(String value) {
        this.services = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
