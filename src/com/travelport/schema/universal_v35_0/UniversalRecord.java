
package com.travelport.schema.universal_v35_0;

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
import javax.xml.datatype.XMLGregorianCalendar;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.air_v35_0.AirReservation;
import com.travelport.schema.air_v35_0.EMDSummaryInfo;
import com.travelport.schema.common_v35_0.AccountingRemark;
import com.travelport.schema.common_v35_0.ActionStatus;
import com.travelport.schema.common_v35_0.AgencyContactInfo;
import com.travelport.schema.common_v35_0.AgencyInfo;
import com.travelport.schema.common_v35_0.AppliedProfile;
import com.travelport.schema.common_v35_0.BookingTraveler;
import com.travelport.schema.common_v35_0.CommissionRemark;
import com.travelport.schema.common_v35_0.ConsolidatorRemark;
import com.travelport.schema.common_v35_0.CustomerID;
import com.travelport.schema.common_v35_0.FormOfPayment;
import com.travelport.schema.common_v35_0.GeneralRemark;
import com.travelport.schema.common_v35_0.Group;
import com.travelport.schema.common_v35_0.InvoiceData;
import com.travelport.schema.common_v35_0.InvoiceRemark;
import com.travelport.schema.common_v35_0.LinkedUniversalRecord;
import com.travelport.schema.common_v35_0.OSI;
import com.travelport.schema.common_v35_0.Postscript;
import com.travelport.schema.common_v35_0.ProviderARNKSegment;
import com.travelport.schema.common_v35_0.ReviewBooking;
import com.travelport.schema.common_v35_0.SSR;
import com.travelport.schema.common_v35_0.ServiceFeeInfo;
import com.travelport.schema.common_v35_0.UnassociatedRemark;
import com.travelport.schema.common_v35_0.XMLRemark;
import com.travelport.schema.cruise_v35_0.CruiseReservation;
import com.travelport.schema.hotel_v35_0.HotelReservation;
import com.travelport.schema.passive_v35_0.PassiveReservation;
import com.travelport.schema.rail_v35_0.RailReservation;
import com.travelport.schema.vehicle_v35_0.VehicleReservation;
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
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}LinkedUniversalRecord" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}Group" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}BookingTraveler" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ServiceFeeInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}OSI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ActionStatus" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}ProviderReservationInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v35_0}AirReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/vehicle_v35_0}VehicleReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/passive_v35_0}PassiveReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/rail_v35_0}RailReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/cruise_v35_0}CruiseReservation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{http://www.travelport.com/schema/air_v35_0}EMDSummaryInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ProviderARNKSegment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}SegmentContinuityInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}XMLRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}GeneralRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}AccountingRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}UnassociatedRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}Postscript" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}AgencyInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}AppliedProfile" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}AgencyContactInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}CustomerID" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}CommissionRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ConsolidatorRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}UnmaskedDataRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}InvoiceRemark" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ReviewBooking" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}SSR" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}InvoiceData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}FormOfPayment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="LocatorCode" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeLocatorCode" /&gt;
 *       &lt;attribute name="SavedTripLocatorCode" type="{http://www.travelport.com/schema/common_v35_0}typeLocatorCode" /&gt;
 *       &lt;attribute name="LockReason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Version" type="{http://www.travelport.com/schema/common_v35_0}typeURVersion" /&gt;
 *       &lt;attribute name="Status" use="required" type="{http://www.travelport.com/schema/universal_v35_0}typeURStatus" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "linkedUniversalRecord",
    "group",
    "bookingTraveler",
    "serviceFeeInfo",
    "osi",
    "actionStatus",
    "providerReservationInfo",
    "airReservation",
    "hotelReservation",
    "vehicleReservation",
    "passiveReservation",
    "railReservation",
    "cruiseReservation",
    "emdSummaryInfo",
    "providerARNKSegment",
    "segmentContinuityInfo",
    "xmlRemark",
    "generalRemark",
    "accountingRemark",
    "unassociatedRemark",
    "postscript",
    "agencyInfo",
    "appliedProfile",
    "agencyContactInfo",
    "customerID",
    "commissionRemark",
    "consolidatorRemark",
    "unmaskedDataRemark",
    "invoiceRemark",
    "reviewBooking",
    "ssr",
    "invoiceData",
    "formOfPayment"
})
@XmlRootElement(name = "UniversalRecord")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public class UniversalRecord
    implements Locatable
{

    @XmlElement(name = "LinkedUniversalRecord", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<LinkedUniversalRecord> linkedUniversalRecord;
    @XmlElement(name = "Group", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected Group group;
    @XmlElement(name = "BookingTraveler", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<BookingTraveler> bookingTraveler;
    @XmlElement(name = "ServiceFeeInfo", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<ServiceFeeInfo> serviceFeeInfo;
    @XmlElement(name = "OSI", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<OSI> osi;
    @XmlElement(name = "ActionStatus", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<ActionStatus> actionStatus;
    @XmlElement(name = "ProviderReservationInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<ProviderReservationInfo> providerReservationInfo;
    @XmlElement(name = "AirReservation", namespace = "http://www.travelport.com/schema/air_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<AirReservation> airReservation;
    @XmlElement(name = "HotelReservation", namespace = "http://www.travelport.com/schema/hotel_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<HotelReservation> hotelReservation;
    @XmlElement(name = "VehicleReservation", namespace = "http://www.travelport.com/schema/vehicle_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<VehicleReservation> vehicleReservation;
    @XmlElement(name = "PassiveReservation", namespace = "http://www.travelport.com/schema/passive_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<PassiveReservation> passiveReservation;
    @XmlElement(name = "RailReservation", namespace = "http://www.travelport.com/schema/rail_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<RailReservation> railReservation;
    @XmlElement(name = "CruiseReservation", namespace = "http://www.travelport.com/schema/cruise_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<CruiseReservation> cruiseReservation;
    @XmlElement(name = "EMDSummaryInfo", namespace = "http://www.travelport.com/schema/air_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<EMDSummaryInfo> emdSummaryInfo;
    @XmlElement(name = "ProviderARNKSegment", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<ProviderARNKSegment> providerARNKSegment;
    @XmlElement(name = "SegmentContinuityInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected SegmentContinuityInfo segmentContinuityInfo;
    @XmlElement(name = "XMLRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<XMLRemark> xmlRemark;
    @XmlElement(name = "GeneralRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<GeneralRemark> generalRemark;
    @XmlElement(name = "AccountingRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<AccountingRemark> accountingRemark;
    @XmlElement(name = "UnassociatedRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<UnassociatedRemark> unassociatedRemark;
    @XmlElement(name = "Postscript", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<Postscript> postscript;
    @XmlElement(name = "AgencyInfo", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected AgencyInfo agencyInfo;
    @XmlElement(name = "AppliedProfile", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected AppliedProfile appliedProfile;
    @XmlElement(name = "AgencyContactInfo", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected AgencyContactInfo agencyContactInfo;
    @XmlElement(name = "CustomerID", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<CustomerID> customerID;
    @XmlElement(name = "CommissionRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<CommissionRemark> commissionRemark;
    @XmlElement(name = "ConsolidatorRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<ConsolidatorRemark> consolidatorRemark;
    @XmlElement(name = "UnmaskedDataRemark")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<UnmaskedDataRemark> unmaskedDataRemark;
    @XmlElement(name = "InvoiceRemark", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<InvoiceRemark> invoiceRemark;
    @XmlElement(name = "ReviewBooking", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<ReviewBooking> reviewBooking;
    @XmlElement(name = "SSR", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<SSR> ssr;
    @XmlElement(name = "InvoiceData", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<InvoiceData> invoiceData;
    @XmlElement(name = "FormOfPayment", namespace = "http://www.travelport.com/schema/common_v35_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected List<FormOfPayment> formOfPayment;
    @XmlAttribute(name = "LocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected String locatorCode;
    @XmlAttribute(name = "SavedTripLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected String savedTripLocatorCode;
    @XmlAttribute(name = "LockReason")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected String lockReason;
    @XmlAttribute(name = "CreateDate")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected XMLGregorianCalendar createDate;
    @XmlAttribute(name = "Version")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger version;
    @XmlAttribute(name = "Status", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected String status;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the linkedUniversalRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedUniversalRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedUniversalRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LinkedUniversalRecord }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<LinkedUniversalRecord> getLinkedUniversalRecord() {
        if (linkedUniversalRecord == null) {
            linkedUniversalRecord = new ArrayList<LinkedUniversalRecord>();
        }
        return this.linkedUniversalRecord;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link Group }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public Group getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link Group }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setGroup(Group value) {
        this.group = value;
    }

    /**
     * Gets the value of the bookingTraveler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingTraveler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingTraveler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingTraveler }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<BookingTraveler> getBookingTraveler() {
        if (bookingTraveler == null) {
            bookingTraveler = new ArrayList<BookingTraveler>();
        }
        return this.bookingTraveler;
    }

    /**
     * Travel Agency Service Fees (TASF) are charged by the agency through BSP or Airline Reporting Corporation (ARC). FOP will appear directly inside UniversalRecord Gets the value of the serviceFeeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceFeeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceFeeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceFeeInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<ServiceFeeInfo> getServiceFeeInfo() {
        if (serviceFeeInfo == null) {
            serviceFeeInfo = new ArrayList<ServiceFeeInfo>();
        }
        return this.serviceFeeInfo;
    }

    /**
     * Gets the value of the osi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the osi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOSI().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OSI }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<OSI> getOSI() {
        if (osi == null) {
            osi = new ArrayList<OSI>();
        }
        return this.osi;
    }

    /**
     * Gets the value of the actionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the actionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActionStatus }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<ActionStatus> getActionStatus() {
        if (actionStatus == null) {
            actionStatus = new ArrayList<ActionStatus>();
        }
        return this.actionStatus;
    }

    /**
     * Gets the value of the providerReservationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<ProviderReservationInfo> getProviderReservationInfo() {
        if (providerReservationInfo == null) {
            providerReservationInfo = new ArrayList<ProviderReservationInfo>();
        }
        return this.providerReservationInfo;
    }

    /**
     * Gets the value of the airReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<AirReservation> getAirReservation() {
        if (airReservation == null) {
            airReservation = new ArrayList<AirReservation>();
        }
        return this.airReservation;
    }

    /**
     * Gets the value of the hotelReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<HotelReservation> getHotelReservation() {
        if (hotelReservation == null) {
            hotelReservation = new ArrayList<HotelReservation>();
        }
        return this.hotelReservation;
    }

    /**
     * Gets the value of the vehicleReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<VehicleReservation> getVehicleReservation() {
        if (vehicleReservation == null) {
            vehicleReservation = new ArrayList<VehicleReservation>();
        }
        return this.vehicleReservation;
    }

    /**
     * Gets the value of the passiveReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passiveReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassiveReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassiveReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<PassiveReservation> getPassiveReservation() {
        if (passiveReservation == null) {
            passiveReservation = new ArrayList<PassiveReservation>();
        }
        return this.passiveReservation;
    }

    /**
     * Gets the value of the railReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<RailReservation> getRailReservation() {
        if (railReservation == null) {
            railReservation = new ArrayList<RailReservation>();
        }
        return this.railReservation;
    }

    /**
     * The parent container for all cruise booking data. Supported Providers :1V Gets the value of the cruiseReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cruiseReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCruiseReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CruiseReservation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<CruiseReservation> getCruiseReservation() {
        if (cruiseReservation == null) {
            cruiseReservation = new ArrayList<CruiseReservation>();
        }
        return this.cruiseReservation;
    }

    /**
     * List of EMDs to be shown as part of UR. Supported providers are 1V/1G/1P/1J Gets the value of the emdSummaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdSummaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDSummaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDSummaryInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<EMDSummaryInfo> getEMDSummaryInfo() {
        if (emdSummaryInfo == null) {
            emdSummaryInfo = new ArrayList<EMDSummaryInfo>();
        }
        return this.emdSummaryInfo;
    }

    /**
     * Gets the value of the providerARNKSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerARNKSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderARNKSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderARNKSegment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<ProviderARNKSegment> getProviderARNKSegment() {
        if (providerARNKSegment == null) {
            providerARNKSegment = new ArrayList<ProviderARNKSegment>();
        }
        return this.providerARNKSegment;
    }

    /**
     * Gets the value of the segmentContinuityInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentContinuityInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public SegmentContinuityInfo getSegmentContinuityInfo() {
        return segmentContinuityInfo;
    }

    /**
     * Sets the value of the segmentContinuityInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentContinuityInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setSegmentContinuityInfo(SegmentContinuityInfo value) {
        this.segmentContinuityInfo = value;
    }

    /**
     * Gets the value of the xmlRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXMLRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XMLRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<XMLRemark> getXMLRemark() {
        if (xmlRemark == null) {
            xmlRemark = new ArrayList<XMLRemark>();
        }
        return this.xmlRemark;
    }

    /**
     * Gets the value of the generalRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<GeneralRemark> getGeneralRemark() {
        if (generalRemark == null) {
            generalRemark = new ArrayList<GeneralRemark>();
        }
        return this.generalRemark;
    }

    /**
     * Gets the value of the accountingRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountingRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountingRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountingRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<AccountingRemark> getAccountingRemark() {
        if (accountingRemark == null) {
            accountingRemark = new ArrayList<AccountingRemark>();
        }
        return this.accountingRemark;
    }

    /**
     * Gets the value of the unassociatedRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unassociatedRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnassociatedRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnassociatedRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<UnassociatedRemark> getUnassociatedRemark() {
        if (unassociatedRemark == null) {
            unassociatedRemark = new ArrayList<UnassociatedRemark>();
        }
        return this.unassociatedRemark;
    }

    /**
     * Gets the value of the postscript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postscript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostscript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Postscript }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<Postscript> getPostscript() {
        if (postscript == null) {
            postscript = new ArrayList<Postscript>();
        }
        return this.postscript;
    }

    /**
     * Gets the value of the agencyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public AgencyInfo getAgencyInfo() {
        return agencyInfo;
    }

    /**
     * Sets the value of the agencyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setAgencyInfo(AgencyInfo value) {
        this.agencyInfo = value;
    }

    /**
     * Gets the value of the appliedProfile property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedProfile }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public AppliedProfile getAppliedProfile() {
        return appliedProfile;
    }

    /**
     * Sets the value of the appliedProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedProfile }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setAppliedProfile(AppliedProfile value) {
        this.appliedProfile = value;
    }

    /**
     * Gets the value of the agencyContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyContactInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public AgencyContactInfo getAgencyContactInfo() {
        return agencyContactInfo;
    }

    /**
     * Sets the value of the agencyContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyContactInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setAgencyContactInfo(AgencyContactInfo value) {
        this.agencyContactInfo = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerID }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<CustomerID> getCustomerID() {
        if (customerID == null) {
            customerID = new ArrayList<CustomerID>();
        }
        return this.customerID;
    }

    /**
     * Gets the value of the commissionRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commissionRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommissionRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommissionRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<CommissionRemark> getCommissionRemark() {
        if (commissionRemark == null) {
            commissionRemark = new ArrayList<CommissionRemark>();
        }
        return this.commissionRemark;
    }

    /**
     * Gets the value of the consolidatorRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the consolidatorRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConsolidatorRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsolidatorRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<ConsolidatorRemark> getConsolidatorRemark() {
        if (consolidatorRemark == null) {
            consolidatorRemark = new ArrayList<ConsolidatorRemark>();
        }
        return this.consolidatorRemark;
    }

    /**
     * Gets the value of the unmaskedDataRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unmaskedDataRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnmaskedDataRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnmaskedDataRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<UnmaskedDataRemark> getUnmaskedDataRemark() {
        if (unmaskedDataRemark == null) {
            unmaskedDataRemark = new ArrayList<UnmaskedDataRemark>();
        }
        return this.unmaskedDataRemark;
    }

    /**
     * Gets the value of the invoiceRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceRemark }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<InvoiceRemark> getInvoiceRemark() {
        if (invoiceRemark == null) {
            invoiceRemark = new ArrayList<InvoiceRemark>();
        }
        return this.invoiceRemark;
    }

    /**
     * Review Booking or Queue Minders is to add the reminders in the Provider Reservation along with the date time and Queue details. On the date time defined in reminders, the message along with the PNR goes to the desired Queue. Gets the value of the reviewBooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewBooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewBooking }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<ReviewBooking> getReviewBooking() {
        if (reviewBooking == null) {
            reviewBooking = new ArrayList<ReviewBooking>();
        }
        return this.reviewBooking;
    }

    /**
     * SSR's having no bookingTravelerRef need to add at providerReservation level outside bookingTraveler Gets the value of the ssr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SSR }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<SSR> getSSR() {
        if (ssr == null) {
            ssr = new ArrayList<SSR>();
        }
        return this.ssr;
    }

    /**
     * Gets the value of the invoiceData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceData }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<InvoiceData> getInvoiceData() {
        if (invoiceData == null) {
            invoiceData = new ArrayList<InvoiceData>();
        }
        return this.invoiceData;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH,SDK.Product:Air,Hotel,Vehicle,Cruise Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPayment }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public List<FormOfPayment> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<FormOfPayment>();
        }
        return this.formOfPayment;
    }

    /**
     * Gets the value of the locatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String getLocatorCode() {
        return locatorCode;
    }

    /**
     * Sets the value of the locatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setLocatorCode(String value) {
        this.locatorCode = value;
    }

    /**
     * Gets the value of the savedTripLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String getSavedTripLocatorCode() {
        return savedTripLocatorCode;
    }

    /**
     * Sets the value of the savedTripLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setSavedTripLocatorCode(String value) {
        this.savedTripLocatorCode = value;
    }

    /**
     * Gets the value of the lockReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String getLockReason() {
        return lockReason;
    }

    /**
     * Sets the value of the lockReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setLockReason(String value) {
        this.lockReason = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public XMLGregorianCalendar getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setCreateDate(XMLGregorianCalendar value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setVersion(BigInteger value) {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
