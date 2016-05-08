
package com.travelport.schema.common_v35_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.travelport.schema.universal_v35_0.AckScheduleChangeReq;
import com.travelport.schema.universal_v35_0.AirCancelReq;
import com.travelport.schema.universal_v35_0.AirMerchandisingFulfillmentReq;
import com.travelport.schema.universal_v35_0.HotelCancelReq;
import com.travelport.schema.universal_v35_0.PassiveCancelReq;
import com.travelport.schema.universal_v35_0.ProviderReservationDisplayDetailsReq;
import com.travelport.schema.universal_v35_0.ProviderReservationDivideReq;
import com.travelport.schema.universal_v35_0.SavedTripCreateReq;
import com.travelport.schema.universal_v35_0.SavedTripDeleteReq;
import com.travelport.schema.universal_v35_0.SavedTripModifyReq;
import com.travelport.schema.universal_v35_0.SavedTripRetrieveReq;
import com.travelport.schema.universal_v35_0.SavedTripSearchReq;
import com.travelport.schema.universal_v35_0.UniversalRecordCancelReq;
import com.travelport.schema.universal_v35_0.UniversalRecordHistorySearchReq;
import com.travelport.schema.universal_v35_0.UniversalRecordImportReq;
import com.travelport.schema.universal_v35_0.UniversalRecordModifyReq;
import com.travelport.schema.universal_v35_0.UniversalRecordRetrieveReq;
import com.travelport.schema.universal_v35_0.UniversalRecordSearchReq;
import com.travelport.schema.universal_v35_0.VehicleCancelReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;

import com.travelport.schema.vehicle_v35_0.VehicleLocationDetailReq;
import com.travelport.schema.vehicle_v35_0.VehicleLocationReq;
import com.travelport.schema.vehicle_v35_0.VehicleMediaLinksReq;
import com.travelport.schema.vehicle_v35_0.VehicleRetrieveReq;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseCoreReq"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}OverridePCC" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RetrieveProviderReservationDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "overridePCC"
})
@XmlSeeAlso({
    BaseSearchReq.class,
    PassiveCancelReq.class,
    AirMerchandisingFulfillmentReq.class,
    AirCancelReq.class,
    HotelCancelReq.class,
    VehicleCancelReq.class,
    BaseCreateReservationReq.class,
    SavedTripSearchReq.class,
    SavedTripRetrieveReq.class,
    SavedTripModifyReq.class,
    SavedTripCreateReq.class,
    ProviderReservationDisplayDetailsReq.class,
    SavedTripDeleteReq.class,
    UniversalRecordSearchReq.class,
    UniversalRecordHistorySearchReq.class,
    UniversalRecordModifyReq.class,
    UniversalRecordImportReq.class,
    AckScheduleChangeReq.class,
    UniversalRecordCancelReq.class,
    ProviderReservationDivideReq.class,
    UniversalRecordRetrieveReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
public class BaseReq
    extends BaseCoreReq
{

    @XmlElement(name = "OverridePCC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "RetrieveProviderReservationDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean retrieveProviderReservationDetails;

    /**
     * Gets the value of the overridePCC property.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
    }

    /**
     * Gets the value of the retrieveProviderReservationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public boolean isRetrieveProviderReservationDetails() {
        if (retrieveProviderReservationDetails == null) {
            return false;
        } else {
            return retrieveProviderReservationDetails;
        }
    }

    /**
     * Sets the value of the retrieveProviderReservationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
    public void setRetrieveProviderReservationDetails(Boolean value) {
        this.retrieveProviderReservationDetails = value;
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

}
