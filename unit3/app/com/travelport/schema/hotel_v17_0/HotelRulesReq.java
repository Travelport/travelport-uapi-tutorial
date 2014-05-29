
package com.travelport.schema.hotel_v17_0;

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
import com.travelport.schema.common_v15_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v15_0}BaseReq">
 *       &lt;choice>
 *         &lt;element name="HotelReservationLocatorCode" type="{http://www.travelport.com/schema/common_v15_0}typeLocatorCode"/>
 *         &lt;element name="HotelRulesLookup">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty"/>
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelStay"/>
 *                   &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRulesModifiers" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="RatePlanType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Base" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
public class HotelRulesReq
    extends BaseReq
{

    @XmlElement(name = "HotelReservationLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected String hotelReservationLocatorCode;
    @XmlElement(name = "HotelRulesLookup")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    protected HotelRulesReq.HotelRulesLookup hotelRulesLookup;

    /**
     * Gets the value of the hotelReservationLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public void setHotelRulesLookup(HotelRulesReq.HotelRulesLookup value) {
        this.hotelRulesLookup = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
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
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelProperty"/>
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelStay"/>
     *         &lt;element ref="{http://www.travelport.com/schema/hotel_v17_0}HotelRulesModifiers" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="RatePlanType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Base" use="required" type="{http://www.travelport.com/schema/common_v15_0}typeMoney" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
    public static class HotelRulesLookup
        implements Locatable
    {

        @XmlElement(name = "HotelProperty", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        protected HotelProperty hotelProperty;
        @XmlElement(name = "HotelStay", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        protected HotelStay hotelStay;
        @XmlElement(name = "HotelRulesModifiers")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        protected HotelRulesModifiers hotelRulesModifiers;
        @XmlAttribute(name = "RatePlanType", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        protected String ratePlanType;
        @XmlAttribute(name = "Base", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        protected String base;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        protected Locator locator;

        /**
         * Gets the value of the hotelProperty property.
         * 
         * @return
         *     possible object is
         *     {@link HotelProperty }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
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
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        public void setBase(String value) {
            this.base = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T01:55:15+02:00", comments = "JAXB RI v2.2.5")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
