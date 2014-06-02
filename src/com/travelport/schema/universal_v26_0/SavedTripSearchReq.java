
package com.travelport.schema.universal_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v26_0}SavedTripSearchModifiers" minOccurs="0"/>
 *         &lt;group ref="{http://www.travelport.com/schema/universal_v26_0}SearchCriteriaGroup"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RecordStatus" type="{http://www.travelport.com/schema/universal_v26_0}typeSavedTripRecordStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "savedTripSearchModifiers",
    "travelerCriteria",
    "searchAgent",
    "airReservationCriteria",
    "hotelReservationCriteria",
    "vehicleReservationCriteria",
    "railReservationCriteria"
})
@XmlRootElement(name = "SavedTripSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class SavedTripSearchReq
    extends BaseReq
{

    @XmlElement(name = "SavedTripSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected SavedTripSearchModifiers savedTripSearchModifiers;
    @XmlElement(name = "TravelerCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TravelerCriteria travelerCriteria;
    @XmlElement(name = "SearchAgent")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected SearchAgent searchAgent;
    @XmlElement(name = "AirReservationCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected AirReservationCriteria airReservationCriteria;
    @XmlElement(name = "HotelReservationCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected HotelReservationCriteria hotelReservationCriteria;
    @XmlElement(name = "VehicleReservationCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected VehicleReservationCriteria vehicleReservationCriteria;
    @XmlElement(name = "RailReservationCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected RailReservationCriteria railReservationCriteria;
    @XmlAttribute(name = "RecordStatus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeSavedTripRecordStatus recordStatus;

    /**
     * Gets the value of the savedTripSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link SavedTripSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public SavedTripSearchModifiers getSavedTripSearchModifiers() {
        return savedTripSearchModifiers;
    }

    /**
     * Sets the value of the savedTripSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SavedTripSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSavedTripSearchModifiers(SavedTripSearchModifiers value) {
        this.savedTripSearchModifiers = value;
    }

    /**
     * Gets the value of the travelerCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TravelerCriteria getTravelerCriteria() {
        return travelerCriteria;
    }

    /**
     * Sets the value of the travelerCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTravelerCriteria(TravelerCriteria value) {
        this.travelerCriteria = value;
    }

    /**
     * Gets the value of the searchAgent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAgent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public SearchAgent getSearchAgent() {
        return searchAgent;
    }

    /**
     * Sets the value of the searchAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAgent }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSearchAgent(SearchAgent value) {
        this.searchAgent = value;
    }

    /**
     * Gets the value of the airReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public AirReservationCriteria getAirReservationCriteria() {
        return airReservationCriteria;
    }

    /**
     * Sets the value of the airReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAirReservationCriteria(AirReservationCriteria value) {
        this.airReservationCriteria = value;
    }

    /**
     * Gets the value of the hotelReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HotelReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public HotelReservationCriteria getHotelReservationCriteria() {
        return hotelReservationCriteria;
    }

    /**
     * Sets the value of the hotelReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setHotelReservationCriteria(HotelReservationCriteria value) {
        this.hotelReservationCriteria = value;
    }

    /**
     * Gets the value of the vehicleReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public VehicleReservationCriteria getVehicleReservationCriteria() {
        return vehicleReservationCriteria;
    }

    /**
     * Sets the value of the vehicleReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setVehicleReservationCriteria(VehicleReservationCriteria value) {
        this.vehicleReservationCriteria = value;
    }

    /**
     * Gets the value of the railReservationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link RailReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public RailReservationCriteria getRailReservationCriteria() {
        return railReservationCriteria;
    }

    /**
     * Sets the value of the railReservationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailReservationCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setRailReservationCriteria(RailReservationCriteria value) {
        this.railReservationCriteria = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSavedTripRecordStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeSavedTripRecordStatus getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSavedTripRecordStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setRecordStatus(TypeSavedTripRecordStatus value) {
        this.recordStatus = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
