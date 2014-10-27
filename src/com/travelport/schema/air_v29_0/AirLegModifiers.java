
package com.travelport.schema.air_v29_0;

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
import com.travelport.schema.common_v29_0.CabinClass;
import com.travelport.schema.common_v29_0.Carrier;
import com.travelport.schema.common_v29_0.TypeLocation;
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
 *         &lt;element name="PreferredCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="3"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedCabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="5"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedConnectionPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedConnectionPoints" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PermittedBookingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PreferredAlliances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ProhibitedBookingCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DisfavoredAlliances" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}FlightType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ProhibitOvernightLayovers" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="MaxConnectionTime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ReturnFirstAvailableOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AllowDirectAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ProhibitMultiAirportConnection" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PreferNonStop" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="OrderBy">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="JourneyTime"/>
 *             &lt;enumeration value="DepartureTime"/>
 *             &lt;enumeration value="ArrivalTime"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "preferredCabins",
    "prohibitedCabins",
    "preferredCarriers",
    "permittedCabins",
    "prohibitedCarriers",
    "permittedCarriers",
    "permittedConnectionPoints",
    "prohibitedConnectionPoints",
    "permittedBookingCodes",
    "preferredAlliances",
    "prohibitedBookingCodes",
    "disfavoredAlliances",
    "flightType"
})
@XmlRootElement(name = "AirLegModifiers")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public class AirLegModifiers
    implements Locatable
{

    @XmlElement(name = "PreferredCabins")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PreferredCabins preferredCabins;
    @XmlElement(name = "ProhibitedCabins")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.ProhibitedCabins prohibitedCabins;
    @XmlElement(name = "PreferredCarriers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PreferredCarriers preferredCarriers;
    @XmlElement(name = "PermittedCabins")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PermittedCabins permittedCabins;
    @XmlElement(name = "ProhibitedCarriers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.ProhibitedCarriers prohibitedCarriers;
    @XmlElement(name = "PermittedCarriers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PermittedCarriers permittedCarriers;
    @XmlElement(name = "PermittedConnectionPoints")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PermittedConnectionPoints permittedConnectionPoints;
    @XmlElement(name = "ProhibitedConnectionPoints")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.ProhibitedConnectionPoints prohibitedConnectionPoints;
    @XmlElement(name = "PermittedBookingCodes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PermittedBookingCodes permittedBookingCodes;
    @XmlElement(name = "PreferredAlliances")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.PreferredAlliances preferredAlliances;
    @XmlElement(name = "ProhibitedBookingCodes")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.ProhibitedBookingCodes prohibitedBookingCodes;
    @XmlElement(name = "DisfavoredAlliances")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected AirLegModifiers.DisfavoredAlliances disfavoredAlliances;
    @XmlElement(name = "FlightType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected FlightType flightType;
    @XmlAttribute(name = "ProhibitOvernightLayovers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean prohibitOvernightLayovers;
    @XmlAttribute(name = "MaxConnectionTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected BigInteger maxConnectionTime;
    @XmlAttribute(name = "ReturnFirstAvailableOnly")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean returnFirstAvailableOnly;
    @XmlAttribute(name = "AllowDirectAccess")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean allowDirectAccess;
    @XmlAttribute(name = "ProhibitMultiAirportConnection")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean prohibitMultiAirportConnection;
    @XmlAttribute(name = "PreferNonStop")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean preferNonStop;
    @XmlAttribute(name = "OrderBy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected String orderBy;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the preferredCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public AirLegModifiers.PreferredCabins getPreferredCabins() {
        return preferredCabins;
    }

    /**
     * Sets the value of the preferredCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setPreferredCabins(AirLegModifiers.PreferredCabins value) {
        this.preferredCabins = value;
    }

    /**
     * Gets the value of the prohibitedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public AirLegModifiers.ProhibitedCabins getProhibitedCabins() {
        return prohibitedCabins;
    }

    /**
     * Sets the value of the prohibitedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setProhibitedCabins(AirLegModifiers.ProhibitedCabins value) {
        this.prohibitedCabins = value;
    }

    /**
     * Gets the value of the preferredCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public AirLegModifiers.PreferredCarriers getPreferredCarriers() {
        return preferredCarriers;
    }

    /**
     * Sets the value of the preferredCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PreferredCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setPreferredCarriers(AirLegModifiers.PreferredCarriers value) {
        this.preferredCarriers = value;
    }

    /**
     * Gets the value of the permittedCabins property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public AirLegModifiers.PermittedCabins getPermittedCabins() {
        return permittedCabins;
    }

    /**
     * Sets the value of the permittedCabins property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedCabins }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setPermittedCabins(AirLegModifiers.PermittedCabins value) {
        this.permittedCabins = value;
    }

    /**
     * Gets the value of the prohibitedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.ProhibitedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public AirLegModifiers.ProhibitedCarriers getProhibitedCarriers() {
        return prohibitedCarriers;
    }

    /**
     * Sets the value of the prohibitedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.ProhibitedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setProhibitedCarriers(AirLegModifiers.ProhibitedCarriers value) {
        this.prohibitedCarriers = value;
    }

    /**
     * Gets the value of the permittedCarriers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public AirLegModifiers.PermittedCarriers getPermittedCarriers() {
        return permittedCarriers;
    }

    /**
     * Sets the value of the permittedCarriers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers.PermittedCarriers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setPermittedCarriers(AirLegModifiers.PermittedCarriers value) {
        this.permittedCarriers = value;
    }

    /**
     * Gets the value of the permittedConnectionPoints property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PermittedConnectionPoints }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setPermittedBookingCodes(AirLegModifiers.PermittedBookingCodes value) {
        this.permittedBookingCodes = value;
    }

    /**
     * Gets the value of the preferredAlliances property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers.PreferredAlliances }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setFlightType(FlightType value) {
        this.flightType = value;
    }

    /**
     * Gets the value of the prohibitOvernightLayovers property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setOrderBy(String value) {
        this.orderBy = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
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
        "alliance"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class DisfavoredAlliances
        implements Locatable
    {

        @XmlElement(name = "Alliance", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<Alliance> alliance;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
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
        "bookingCode"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PermittedBookingCodes
        implements Locatable
    {

        @XmlElement(name = "BookingCode", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<BookingCode> bookingCode;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="5"/>
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
        "cabinClass"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PermittedCabins
        implements Locatable
    {

        @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<CabinClass> cabinClass;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinClass }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<CabinClass>();
            }
            return this.cabinClass;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
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
        "carrier"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PermittedCarriers
        implements Locatable
    {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<Carrier> carrier;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the carrier property.
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
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
        "connectionPoint"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PermittedConnectionPoints
        implements Locatable
    {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<TypeLocation> connectionPoint;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}Alliance" maxOccurs="unbounded"/>
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
        "alliance"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PreferredAlliances
        implements Locatable
    {

        @XmlElement(name = "Alliance", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<Alliance> alliance;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass"/>
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
        "cabinClass"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PreferredCabins
        implements Locatable
    {

        @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected CabinClass cabinClass;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the cabinClass property.
         * 
         * @return
         *     possible object is
         *     {@link CabinClass }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public CabinClass getCabinClass() {
            return cabinClass;
        }

        /**
         * Sets the value of the cabinClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinClass }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setCabinClass(CabinClass value) {
            this.cabinClass = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
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
        "carrier"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class PreferredCarriers
        implements Locatable
    {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<Carrier> carrier;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the carrier property.
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}BookingCode" maxOccurs="unbounded"/>
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
        "bookingCode"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ProhibitedBookingCodes
        implements Locatable
    {

        @XmlElement(name = "BookingCode", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<BookingCode> bookingCode;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}CabinClass" maxOccurs="3"/>
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
        "cabinClass"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ProhibitedCabins
        implements Locatable
    {

        @XmlElement(name = "CabinClass", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<CabinClass> cabinClass;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the cabinClass property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinClass property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinClass().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CabinClass }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<CabinClass> getCabinClass() {
            if (cabinClass == null) {
                cabinClass = new ArrayList<CabinClass>();
            }
            return this.cabinClass;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}Carrier" maxOccurs="unbounded"/>
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
        "carrier"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ProhibitedCarriers
        implements Locatable
    {

        @XmlElement(name = "Carrier", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<Carrier> carrier;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the carrier property.
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<Carrier> getCarrier() {
            if (carrier == null) {
                carrier = new ArrayList<Carrier>();
            }
            return this.carrier;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ConnectionPoint" maxOccurs="unbounded"/>
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
        "connectionPoint"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ProhibitedConnectionPoints
        implements Locatable
    {

        @XmlElement(name = "ConnectionPoint", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<TypeLocation> connectionPoint;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
