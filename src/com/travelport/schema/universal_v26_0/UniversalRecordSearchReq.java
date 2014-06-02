
package com.travelport.schema.universal_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.travelport.schema.common_v26_0.BaseReq;
import com.travelport.schema.common_v26_0.TypeRecordStatus;
import com.travelport.schema.common_v26_0.URTicketStatus;
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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v26_0}UniversalRecordSearchModifiers" minOccurs="0"/>
 *         &lt;group ref="{http://www.travelport.com/schema/universal_v26_0}SearchCriteriaGroup"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v26_0}SearchAccount" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ActionDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="RecordStatus" type="{http://www.travelport.com/schema/common_v26_0}typeRecordStatus" />
 *       &lt;attribute name="ClientId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderLocatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExternalSearchIndex" type="{http://www.travelport.com/schema/universal_v26_0}typeExternalSearchIndex" />
 *       &lt;attribute name="RestrictToProfileId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PassiveOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TicketStatus" type="{http://www.travelport.com/schema/common_v26_0}URTicketStatus" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecordSearchModifiers",
    "travelerCriteria",
    "searchAgent",
    "airReservationCriteria",
    "hotelReservationCriteria",
    "vehicleReservationCriteria",
    "railReservationCriteria",
    "searchAccount"
})
@XmlRootElement(name = "UniversalRecordSearchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class UniversalRecordSearchReq
    extends BaseReq
{

    @XmlElement(name = "UniversalRecordSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected UniversalRecordSearchModifiers universalRecordSearchModifiers;
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
    @XmlElement(name = "SearchAccount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected SearchAccount searchAccount;
    @XmlAttribute(name = "ActionDate")
    @XmlSchemaType(name = "date")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected XMLGregorianCalendar actionDate;
    @XmlAttribute(name = "RecordStatus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeRecordStatus recordStatus;
    @XmlAttribute(name = "ClientId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String clientId;
    @XmlAttribute(name = "ProviderCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String providerCode;
    @XmlAttribute(name = "ProviderLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String providerLocatorCode;
    @XmlAttribute(name = "ExternalSearchIndex")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String externalSearchIndex;
    @XmlAttribute(name = "RestrictToProfileId")
    @XmlSchemaType(name = "anySimpleType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String restrictToProfileId;
    @XmlAttribute(name = "PassiveOnly")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Boolean passiveOnly;
    @XmlAttribute(name = "TicketStatus")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected URTicketStatus ticketStatus;

    /**
     * Gets the value of the universalRecordSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecordSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public UniversalRecordSearchModifiers getUniversalRecordSearchModifiers() {
        return universalRecordSearchModifiers;
    }

    /**
     * Sets the value of the universalRecordSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecordSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setUniversalRecordSearchModifiers(UniversalRecordSearchModifiers value) {
        this.universalRecordSearchModifiers = value;
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
     * Gets the value of the searchAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchAccount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public SearchAccount getSearchAccount() {
        return searchAccount;
    }

    /**
     * Sets the value of the searchAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchAccount }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSearchAccount(SearchAccount value) {
        this.searchAccount = value;
    }

    /**
     * Gets the value of the actionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public XMLGregorianCalendar getActionDate() {
        return actionDate;
    }

    /**
     * Sets the value of the actionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setActionDate(XMLGregorianCalendar value) {
        this.actionDate = value;
    }

    /**
     * Gets the value of the recordStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TypeRecordStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeRecordStatus getRecordStatus() {
        return recordStatus;
    }

    /**
     * Sets the value of the recordStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeRecordStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setRecordStatus(TypeRecordStatus value) {
        this.recordStatus = value;
    }

    /**
     * Gets the value of the clientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getClientId() {
        return clientId;
    }

    /**
     * Sets the value of the clientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setClientId(String value) {
        this.clientId = value;
    }

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setProviderCode(String value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the providerLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getProviderLocatorCode() {
        return providerLocatorCode;
    }

    /**
     * Sets the value of the providerLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setProviderLocatorCode(String value) {
        this.providerLocatorCode = value;
    }

    /**
     * Gets the value of the externalSearchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getExternalSearchIndex() {
        return externalSearchIndex;
    }

    /**
     * Sets the value of the externalSearchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setExternalSearchIndex(String value) {
        this.externalSearchIndex = value;
    }

    /**
     * Gets the value of the restrictToProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getRestrictToProfileId() {
        return restrictToProfileId;
    }

    /**
     * Sets the value of the restrictToProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setRestrictToProfileId(String value) {
        this.restrictToProfileId = value;
    }

    /**
     * Gets the value of the passiveOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public boolean isPassiveOnly() {
        if (passiveOnly == null) {
            return false;
        } else {
            return passiveOnly;
        }
    }

    /**
     * Sets the value of the passiveOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setPassiveOnly(Boolean value) {
        this.passiveOnly = value;
    }

    /**
     * Gets the value of the ticketStatus property.
     * 
     * @return
     *     possible object is
     *     {@link URTicketStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public URTicketStatus getTicketStatus() {
        return ticketStatus;
    }

    /**
     * Sets the value of the ticketStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link URTicketStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTicketStatus(URTicketStatus value) {
        this.ticketStatus = value;
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
