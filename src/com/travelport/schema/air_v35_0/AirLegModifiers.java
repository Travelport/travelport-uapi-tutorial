
package com.travelport.schema.air_v35_0;

import java.math.BigInteger;
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
import com.travelport.schema.common_v35_0.TypeLocation;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}PermittedCabins" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}PreferredCabins" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}PermittedCarriers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}ProhibitedCarriers" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}PreferredCarriers" minOccurs="0"/&gt;
 *         &lt;element name="PermittedConnectionPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ConnectionPoint" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProhibitedConnectionPoints" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ConnectionPoint" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PermittedBookingCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v35_0}BookingCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}PreferredBookingCodes" minOccurs="0"/&gt;
 *         &lt;element name="PreferredAlliances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v35_0}Alliance" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProhibitedBookingCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v35_0}BookingCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DisfavoredAlliances" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v35_0}Alliance" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FlightType" minOccurs="0"/&gt;
 *         &lt;element name="AnchorFlightData" type="{http://www.travelport.com/schema/air_v35_0}typeAnchorFlightData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="ReturnFirstAvailableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllowDirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="ProhibitMultiAirportConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="PreferNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="OrderBy"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="JourneyTime"/&gt;
 *             &lt;enumeration value="DepartureTime"/&gt;
 *             &lt;enumeration value="ArrivalTime"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="MaxJourneyTime" type="{http://www.travelport.com/schema/air_v35_0}typeMaxJourneyTime" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "permittedCabins",
    "preferredCabins",
    "permittedCarriers",
    "prohibitedCarriers",
    "preferredCarriers",
    "permittedConnectionPoints",
    "prohibitedConnectionPoints",
    "permittedBookingCodes",
    "preferredBookingCodes",
    "preferredAlliances",
    "prohibitedBookingCodes",
    "disfavoredAlliances",
    "flightType",
    "anchorFlightData"
})
@XmlRootElement(name = "AirLegModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public class AirLegModifiers
    implements Locatable
{

    @XmlElement(name = "PermittedCabins")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PermittedCabins permittedCabins;
    @XmlElement(name = "PreferredCabins")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PreferredCabins preferredCabins;
    @XmlElement(name = "PermittedCarriers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PermittedCarriers permittedCarriers;
    @XmlElement(name = "ProhibitedCarriers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PreferredCarriers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PreferredCarriers preferredCarriers;
    @XmlElement(name = "PermittedConnectionPoints")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirLegModifiers.PermittedConnectionPoints permittedConnectionPoints;
    @XmlElement(name = "ProhibitedConnectionPoints")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirLegModifiers.ProhibitedConnectionPoints prohibitedConnectionPoints;
    @XmlElement(name = "PermittedBookingCodes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirLegModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlElement(name = "PreferredBookingCodes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PreferredBookingCodes preferredBookingCodes;
    @XmlElement(name = "PreferredAlliances")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirLegModifiers.PreferredAlliances preferredAlliances;
    @XmlElement(name = "ProhibitedBookingCodes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirLegModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "DisfavoredAlliances")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirLegModifiers.DisfavoredAlliances disfavoredAlliances;
    @XmlElement(name = "FlightType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected FlightType flightType;
    @XmlElement(name = "AnchorFlightData")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected TypeAnchorFlightData anchorFlightData;
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean prohibitOvernightLayovers;
    @XmlAttribute(name = "MaxConnectionTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected BigInteger maxConnectionTime;
    @XmlAttribute(name = "ReturnFirstAvailableOnly")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean returnFirstAvailableOnly;
    @XmlAttribute(name = "AllowDirectAccess")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean allowDirectAccess;
    @XmlAttribute(name = "ProhibitMultiAirportConnection")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean prohibitMultiAirportConnection;
    @XmlAttribute(name = "PreferNonStop")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean preferNonStop;
    @XmlAttribute(name = "OrderBy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String orderBy;
    @XmlAttribute(name = "MaxJourneyTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Integer maxJourneyTime;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the permittedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PermittedCabins getPermittedCabins() {
        return permittedCabins;
    }

    /**
     * Sets the value of the permittedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPermittedCabins(PermittedCabins value) {
        this.permittedCabins = value;
    }

    /**
     * Gets the value of the preferredCabins property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PreferredCabins getPreferredCabins() {
        return preferredCabins;
    }

    /**
     * Sets the value of the preferredCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferredCabins(PreferredCabins value) {
        this.preferredCabins = value;
    }

    /**
     * Gets the value of the permittedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link PermittedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PermittedCarriers getPermittedCarriers() {
        return permittedCarriers;
    }

    /**
     * Sets the value of the permittedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermittedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPermittedCarriers(PermittedCarriers value) {
        this.permittedCarriers = value;
    }

    /**
     * Gets the value of the prohibitedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link ProhibitedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public ProhibitedCarriers getProhibitedCarriers() {
        return prohibitedCarriers;
    }

    /**
     * Sets the value of the prohibitedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProhibitedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setProhibitedCarriers(ProhibitedCarriers value) {
        this.prohibitedCarriers = value;
    }

    /**
     * Gets the value of the preferredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PreferredCarriers getPreferredCarriers() {
        return preferredCarriers;
    }

    /**
     * Sets the value of the preferredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferredCarriers(PreferredCarriers value) {
        this.preferredCarriers = value;
    }

    /**
     * Gets the value of the permittedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirLegModifiers.PermittedConnectionPoints getPermittedConnectionPoints() {
        return permittedConnectionPoints;
    }

    /**
     * Sets the value of the permittedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPermittedConnectionPoints(AirLegModifiers.PermittedConnectionPoints value) {
        this.permittedConnectionPoints = value;
    }

    /**
     * Gets the value of the prohibitedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirLegModifiers.ProhibitedConnectionPoints getProhibitedConnectionPoints() {
        return prohibitedConnectionPoints;
    }

    /**
     * Sets the value of the prohibitedConnectionPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedConnectionPoints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setProhibitedConnectionPoints(AirLegModifiers.ProhibitedConnectionPoints value) {
        this.prohibitedConnectionPoints = value;
    }

    /**
     * Gets the value of the permittedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedBookingCodes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirLegModifiers.PermittedBookingCodes getPermittedBookingCodes() {
        return permittedBookingCodes;
    }

    /**
     * Sets the value of the permittedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedBookingCodes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPermittedBookingCodes(AirLegModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the preferredBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredBookingCodes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PreferredBookingCodes getPreferredBookingCodes() {
        return preferredBookingCodes;
    }

    /**
     * Sets the value of the preferredBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredBookingCodes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferredBookingCodes(PreferredBookingCodes value) {
        this.preferredBookingCodes = value;
    }

    /**
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirLegModifiers.PreferredAlliances getPreferredAlliances() {
        return preferredAlliances;
    }

    /**
     * Sets the value of the preferredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferredAlliances(AirLegModifiers.PreferredAlliances value) {
        this.preferredAlliances = value;
    }

    /**
     * Gets the value of the prohibitedBookingCodes property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedBookingCodes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirLegModifiers.ProhibitedBookingCodes getProhibitedBookingCodes() {
        return prohibitedBookingCodes;
    }

    /**
     * Sets the value of the prohibitedBookingCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedBookingCodes }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setProhibitedBookingCodes(AirLegModifiers.ProhibitedBookingCodes value) {
        this.prohibitedBookingCodes = value;
    }

    /**
     * Gets the value of the disfavoredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.DisfavoredAlliances }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirLegModifiers.DisfavoredAlliances getDisfavoredAlliances() {
        return disfavoredAlliances;
    }

    /**
     * Sets the value of the disfavoredAlliances property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.DisfavoredAlliances }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setDisfavoredAlliances(AirLegModifiers.DisfavoredAlliances value) {
        this.disfavoredAlliances = value;
    }

    /**
     * Gets the value of the flightType property.
     * 
     * @return
     *     possible object is
     *     {@link FlightType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public FlightType getFlightType() {
        return flightType;
    }

    /**
     * Sets the value of the flightType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setFlightType(FlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the anchorFlightData property.
     * 
     * @return
     *     possible object is
     *     {@link TypeAnchorFlightData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public TypeAnchorFlightData getAnchorFlightData() {
        return anchorFlightData;
    }

    /**
     * Sets the value of the anchorFlightData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeAnchorFlightData }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setAnchorFlightData(TypeAnchorFlightData value) {
        this.anchorFlightData = value;
    }

    /**
     * Gets the value of the prohibitOvernightLayovers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public boolean isProhibitOvernightLayovers() {
        if (prohibitOvernightLayovers == null) {
            return false;
        } else {
            return prohibitOvernightLayovers;
        }
    }

    /**
     * Sets the value of the prohibitOvernightLayovers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setProhibitOvernightLayovers(Boolean value) {
        this.prohibitOvernightLayovers = value;
    }

    /**
     * Gets the value of the maxConnectionTime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public BigInteger getMaxConnectionTime() {
        return maxConnectionTime;
    }

    /**
     * Sets the value of the maxConnectionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setMaxConnectionTime(BigInteger value) {
        this.maxConnectionTime = value;
    }

    /**
     * Gets the value of the returnFirstAvailableOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isReturnFirstAvailableOnly() {
        return returnFirstAvailableOnly;
    }

    /**
     * Sets the value of the returnFirstAvailableOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setReturnFirstAvailableOnly(Boolean value) {
        this.returnFirstAvailableOnly = value;
    }

    /**
     * Gets the value of the allowDirectAccess property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public boolean isAllowDirectAccess() {
        if (allowDirectAccess == null) {
            return false;
        } else {
            return allowDirectAccess;
        }
    }

    /**
     * Sets the value of the allowDirectAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setAllowDirectAccess(Boolean value) {
        this.allowDirectAccess = value;
    }

    /**
     * Gets the value of the prohibitMultiAirportConnection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isProhibitMultiAirportConnection() {
        return prohibitMultiAirportConnection;
    }

    /**
     * Sets the value of the prohibitMultiAirportConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setProhibitMultiAirportConnection(Boolean value) {
        this.prohibitMultiAirportConnection = value;
    }

    /**
     * Gets the value of the preferNonStop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public boolean isPreferNonStop() {
        if (preferNonStop == null) {
            return false;
        } else {
            return preferNonStop;
        }
    }

    /**
     * Sets the value of the preferNonStop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferNonStop(Boolean value) {
        this.preferNonStop = value;
    }

    /**
     * Gets the value of the orderBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getOrderBy() {
        return orderBy;
    }

    /**
     * Sets the value of the orderBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Gets the value of the maxJourneyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public Integer getMaxJourneyTime() {
        return maxJourneyTime;
    }

    /**
     * Sets the value of the maxJourneyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setMaxJourneyTime(Integer value) {
        this.maxJourneyTime = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}Alliance" maxOccurs="unbounded"/&gt;
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
        "alliance"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public static class DisfavoredAlliances
        implements Locatable
    {

        @XmlElement(name = "Alliance", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected List<Alliance> alliance;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<Alliance>();
            }
            return this.alliance;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}BookingCode" maxOccurs="unbounded"/&gt;
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
        "bookingCode"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public static class PermittedBookingCodes
        implements Locatable
    {

        @XmlElement(name = "BookingCode", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected List<BookingCode> bookingCode;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the bookingCode property.
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ConnectionPoint" maxOccurs="unbounded"/&gt;
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
        "connectionPoint"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public static class PermittedConnectionPoints
        implements Locatable
    {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v35_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected List<TypeLocation> connectionPoint;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the connectionPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<TypeLocation>();
            }
            return this.connectionPoint;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}Alliance" maxOccurs="unbounded"/&gt;
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
        "alliance"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public static class PreferredAlliances
        implements Locatable
    {

        @XmlElement(name = "Alliance", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected List<Alliance> alliance;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the alliance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alliance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlliance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Alliance }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public List<Alliance> getAlliance() {
            if (alliance == null) {
                alliance = new ArrayList<Alliance>();
            }
            return this.alliance;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}BookingCode" maxOccurs="unbounded"/&gt;
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
        "bookingCode"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public static class ProhibitedBookingCodes
        implements Locatable
    {

        @XmlElement(name = "BookingCode", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected List<BookingCode> bookingCode;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the bookingCode property.
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public List<BookingCode> getBookingCode() {
            if (bookingCode == null) {
                bookingCode = new ArrayList<BookingCode>();
            }
            return this.bookingCode;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v35_0}ConnectionPoint" maxOccurs="unbounded"/&gt;
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
        "connectionPoint"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public static class ProhibitedConnectionPoints
        implements Locatable
    {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v35_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected List<TypeLocation> connectionPoint;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the connectionPoint property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the connectionPoint property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getConnectionPoint().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TypeLocation }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public List<TypeLocation> getConnectionPoint() {
            if (connectionPoint == null) {
                connectionPoint = new ArrayList<TypeLocation>();
            }
            return this.connectionPoint;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
