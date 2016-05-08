
package com.travelport.schema.hotel_v35_0;

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
import com.travelport.schema.common_v35_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v35_0}BaseReq"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="HotelReservationLocatorCode" type="{http://www.travelport.com/schema/common_v35_0}typeLocatorCode"/&gt;
 *         &lt;element name="HotelRulesLookup"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelProperty"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelStay"/&gt;
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelRulesModifiers" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="RatePlanType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Base" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeMoney" /&gt;
 *                 &lt;attribute name="RulesDetailReqd"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="Rules"/&gt;
 *                       &lt;enumeration value="Details"/&gt;
 *                       &lt;enumeration value="All"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelReservationLocatorCode",
    "hotelRulesLookup"
})
@XmlRootElement(name = "HotelRulesReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
public class HotelRulesReq
    extends BaseReq
{

    @XmlElement(name = "HotelReservationLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected String hotelReservationLocatorCode;
    @XmlElement(name = "HotelRulesLookup")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    protected HotelRulesReq.HotelRulesLookup hotelRulesLookup;

    /**
     * Gets the value of the hotelReservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public String getHotelReservationLocatorCode() {
        return hotelReservationLocatorCode;
    }

    /**
     * Sets the value of the hotelReservationLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setHotelReservationLocatorCode(String value) {
        this.hotelReservationLocatorCode = value;
    }

    /**
     * Gets the value of the hotelRulesLookup property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRulesReq.HotelRulesLookup }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public HotelRulesReq.HotelRulesLookup getHotelRulesLookup() {
        return hotelRulesLookup;
    }

    /**
     * Sets the value of the hotelRulesLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRulesReq.HotelRulesLookup }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public void setHotelRulesLookup(HotelRulesReq.HotelRulesLookup value) {
        this.hotelRulesLookup = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelProperty"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelStay"/&gt;
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v35_0}HotelRulesModifiers" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="RatePlanType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Base" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeMoney" /&gt;
     *       &lt;attribute name="RulesDetailReqd"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="Rules"/&gt;
     *             &lt;enumeration value="Details"/&gt;
     *             &lt;enumeration value="All"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelProperty",
        "hotelStay",
        "hotelRulesModifiers"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
    public static class HotelRulesLookup
        implements Locatable
    {

        @XmlElement(name = "HotelProperty", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected HotelProperty hotelProperty;
        @XmlElement(name = "HotelStay", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected HotelStay hotelStay;
        @XmlElement(name = "HotelRulesModifiers")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected HotelRulesModifiers hotelRulesModifiers;
        @XmlAttribute(name = "RatePlanType", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected String ratePlanType;
        @XmlAttribute(name = "Base", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected String base;
        @XmlAttribute(name = "RulesDetailReqd")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected String rulesDetailReqd;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the hotelProperty property.
         * 
         * @return
         *     possible object is
         *     {@link HotelProperty }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public HotelProperty getHotelProperty() {
            return hotelProperty;
        }

        /**
         * Sets the value of the hotelProperty property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelProperty }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setHotelProperty(HotelProperty value) {
            this.hotelProperty = value;
        }

        /**
         * Gets the value of the hotelStay property.
         * 
         * @return
         *     possible object is
         *     {@link HotelStay }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public HotelStay getHotelStay() {
            return hotelStay;
        }

        /**
         * Sets the value of the hotelStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelStay }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setHotelStay(HotelStay value) {
            this.hotelStay = value;
        }

        /**
         * Gets the value of the hotelRulesModifiers property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRulesModifiers }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public HotelRulesModifiers getHotelRulesModifiers() {
            return hotelRulesModifiers;
        }

        /**
         * Sets the value of the hotelRulesModifiers property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRulesModifiers }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setHotelRulesModifiers(HotelRulesModifiers value) {
            this.hotelRulesModifiers = value;
        }

        /**
         * Gets the value of the ratePlanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public String getRatePlanType() {
            return ratePlanType;
        }

        /**
         * Sets the value of the ratePlanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setRatePlanType(String value) {
            this.ratePlanType = value;
        }

        /**
         * Gets the value of the base property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public String getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setBase(String value) {
            this.base = value;
        }

        /**
         * Gets the value of the rulesDetailReqd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public String getRulesDetailReqd() {
            return rulesDetailReqd;
        }

        /**
         * Sets the value of the rulesDetailReqd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setRulesDetailReqd(String value) {
            this.rulesDetailReqd = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-03-09T04:22:41-07:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
