
package com.travelport.schema.hotel_v42_0;

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
import com.travelport.schema.common_v42_0.CoordinateLocation;
import com.travelport.schema.common_v42_0.Distance;
import com.travelport.schema.common_v42_0.PhoneNumber;
import com.travelport.schema.common_v42_0.TypeReserveRequirement;
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
 *         &lt;element name="PropertyAddress" type="{http://www.travelport.com/schema/hotel_v42_0}typeUnstructuredAddress" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}PhoneNumber" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}CoordinateLocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}Distance" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}HotelRating" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}Amenities" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/hotel_v42_0}MarketingMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HotelChain" use="required" type="{http://www.travelport.com/schema/common_v42_0}typeHotelChainCode" /&gt;
 *       &lt;attribute name="HotelCode" use="required" type="{http://www.travelport.com/schema/common_v42_0}typeHotelCode" /&gt;
 *       &lt;attribute name="HotelLocation" type="{http://www.travelport.com/schema/hotel_v42_0}typeHotelLocationCode" /&gt;
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="VendorLocationKey" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="HotelTransportation" type="{http://www.travelport.com/schema/common_v42_0}typeOTACode" /&gt;
 *       &lt;attribute name="ReserveRequirement" type="{http://www.travelport.com/schema/common_v42_0}typeReserveRequirement" /&gt;
 *       &lt;attribute name="ParticipationLevel" type="{http://www.travelport.com/schema/common_v42_0}StringLength1" /&gt;
 *       &lt;attribute name="Availability" type="{http://www.travelport.com/schema/hotel_v42_0}typeHotelAvailability" /&gt;
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v42_0}typeRef" /&gt;
 *       &lt;attribute name="PreferredOption" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreRates" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MoreRatesToken"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;minLength value="1"/&gt;
 *             &lt;maxLength value="30"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="NetTransCommissionInd" type="{http://www.travelport.com/schema/hotel_v42_0}typeNetTransCommission" /&gt;
 *       &lt;attribute name="NumOfRatePlans" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "propertyAddress",
    "phoneNumber",
    "coordinateLocation",
    "distance",
    "hotelRating",
    "amenities",
    "marketingMessage"
})
@XmlRootElement(name = "HotelProperty")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
public class HotelProperty
    implements Locatable
{

    @XmlElement(name = "PropertyAddress")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypeUnstructuredAddress propertyAddress;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "CoordinateLocation", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected CoordinateLocation coordinateLocation;
    @XmlElement(name = "Distance", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Distance distance;
    @XmlElement(name = "HotelRating")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<HotelRating> hotelRating;
    @XmlElement(name = "Amenities")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Amenities amenities;
    @XmlElement(name = "MarketingMessage")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected MarketingMessage marketingMessage;
    @XmlAttribute(name = "HotelChain", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String hotelChain;
    @XmlAttribute(name = "HotelCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String hotelCode;
    @XmlAttribute(name = "HotelLocation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String hotelLocation;
    @XmlAttribute(name = "Name")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String name;
    @XmlAttribute(name = "VendorLocationKey")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String vendorLocationKey;
    @XmlAttribute(name = "HotelTransportation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger hotelTransportation;
    @XmlAttribute(name = "ReserveRequirement")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypeReserveRequirement reserveRequirement;
    @XmlAttribute(name = "ParticipationLevel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String participationLevel;
    @XmlAttribute(name = "Availability")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypeHotelAvailability availability;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String key;
    @XmlAttribute(name = "PreferredOption")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean preferredOption;
    @XmlAttribute(name = "MoreRates")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean moreRates;
    @XmlAttribute(name = "MoreRatesToken")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected String moreRatesToken;
    @XmlAttribute(name = "NetTransCommissionInd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected TypeNetTransCommission netTransCommissionInd;
    @XmlAttribute(name = "NumOfRatePlans")
    @XmlSchemaType(name = "positiveInteger")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger numOfRatePlans;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the propertyAddress property.
     * 
     * @return
     *     possible object is
     *     {@link TypeUnstructuredAddress }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypeUnstructuredAddress getPropertyAddress() {
        return propertyAddress;
    }

    /**
     * Sets the value of the propertyAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeUnstructuredAddress }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setPropertyAddress(TypeUnstructuredAddress value) {
        this.propertyAddress = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the coordinateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public CoordinateLocation getCoordinateLocation() {
        return coordinateLocation;
    }

    /**
     * Sets the value of the coordinateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setCoordinateLocation(CoordinateLocation value) {
        this.coordinateLocation = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link Distance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Distance getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Distance }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setDistance(Distance value) {
        this.distance = value;
    }

    /**
     * Gets the value of the hotelRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelRating }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<HotelRating> getHotelRating() {
        if (hotelRating == null) {
            hotelRating = new ArrayList<HotelRating>();
        }
        return this.hotelRating;
    }

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link Amenities }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Amenities getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amenities }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setAmenities(Amenities value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the marketingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingMessage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public MarketingMessage getMarketingMessage() {
        return marketingMessage;
    }

    /**
     * Sets the value of the marketingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingMessage }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setMarketingMessage(MarketingMessage value) {
        this.marketingMessage = value;
    }

    /**
     * Gets the value of the hotelChain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getHotelChain() {
        return hotelChain;
    }

    /**
     * Sets the value of the hotelChain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelChain(String value) {
        this.hotelChain = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the hotelLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getHotelLocation() {
        return hotelLocation;
    }

    /**
     * Sets the value of the hotelLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelLocation(String value) {
        this.hotelLocation = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the vendorLocationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getVendorLocationKey() {
        return vendorLocationKey;
    }

    /**
     * Sets the value of the vendorLocationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setVendorLocationKey(String value) {
        this.vendorLocationKey = value;
    }

    /**
     * Gets the value of the hotelTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getHotelTransportation() {
        return hotelTransportation;
    }

    /**
     * Sets the value of the hotelTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelTransportation(BigInteger value) {
        this.hotelTransportation = value;
    }

    /**
     * Gets the value of the reserveRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link TypeReserveRequirement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypeReserveRequirement getReserveRequirement() {
        return reserveRequirement;
    }

    /**
     * Sets the value of the reserveRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeReserveRequirement }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setReserveRequirement(TypeReserveRequirement value) {
        this.reserveRequirement = value;
    }

    /**
     * Gets the value of the participationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getParticipationLevel() {
        return participationLevel;
    }

    /**
     * Sets the value of the participationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setParticipationLevel(String value) {
        this.participationLevel = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link TypeHotelAvailability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypeHotelAvailability getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeHotelAvailability }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setAvailability(TypeHotelAvailability value) {
        this.availability = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the preferredOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

    /**
     * Gets the value of the moreRates property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isMoreRates() {
        return moreRates;
    }

    /**
     * Sets the value of the moreRates property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setMoreRates(Boolean value) {
        this.moreRates = value;
    }

    /**
     * Gets the value of the moreRatesToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String getMoreRatesToken() {
        return moreRatesToken;
    }

    /**
     * Sets the value of the moreRatesToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setMoreRatesToken(String value) {
        this.moreRatesToken = value;
    }

    /**
     * Gets the value of the netTransCommissionInd property.
     * 
     * @return
     *     possible object is
     *     {@link TypeNetTransCommission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public TypeNetTransCommission getNetTransCommissionInd() {
        return netTransCommissionInd;
    }

    /**
     * Sets the value of the netTransCommissionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeNetTransCommission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setNetTransCommissionInd(TypeNetTransCommission value) {
        this.netTransCommissionInd = value;
    }

    /**
     * Gets the value of the numOfRatePlans property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getNumOfRatePlans() {
        return numOfRatePlans;
    }

    /**
     * Sets the value of the numOfRatePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setNumOfRatePlans(BigInteger value) {
        this.numOfRatePlans = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
