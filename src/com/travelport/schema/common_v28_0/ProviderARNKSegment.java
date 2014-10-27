
package com.travelport.schema.common_v28_0;

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
 *         &lt;element name="PreviousSegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
 *                   &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NextSegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
 *                   &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
 *                   &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v28_0}typeRef" />
 *       &lt;attribute name="ProviderReservationInfoRef" type="{http://www.travelport.com/schema/common_v28_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "previousSegment",
    "nextSegment"
})
@XmlRootElement(name = "ProviderARNKSegment")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
public class ProviderARNKSegment
    implements Locatable
{

    @XmlElement(name = "PreviousSegment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    protected ProviderARNKSegment.PreviousSegment previousSegment;
    @XmlElement(name = "NextSegment")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    protected ProviderARNKSegment.NextSegment nextSegment;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    protected String key;
    @XmlAttribute(name = "ProviderReservationInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    protected String providerReservationInfoRef;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the previousSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderARNKSegment.PreviousSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public ProviderARNKSegment.PreviousSegment getPreviousSegment() {
        return previousSegment;
    }

    /**
     * Sets the value of the previousSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderARNKSegment.PreviousSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public void setPreviousSegment(ProviderARNKSegment.PreviousSegment value) {
        this.previousSegment = value;
    }

    /**
     * Gets the value of the nextSegment property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderARNKSegment.NextSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public ProviderARNKSegment.NextSegment getNextSegment() {
        return nextSegment;
    }

    /**
     * Sets the value of the nextSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderARNKSegment.NextSegment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public void setNextSegment(ProviderARNKSegment.NextSegment value) {
        this.nextSegment = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public String getProviderReservationInfoRef() {
        return providerReservationInfoRef;
    }

    /**
     * Sets the value of the providerReservationInfoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public void setProviderReservationInfoRef(String value) {
        this.providerReservationInfoRef = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
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
     *       &lt;choice>
     *         &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
     *         &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airSegmentRef",
        "hotelReservationRef",
        "vehicleReservationRef",
        "passiveSegmentRef"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public static class NextSegment
        implements Locatable
    {

        @XmlElement(name = "AirSegmentRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeSegmentRef airSegmentRef;
        @XmlElement(name = "HotelReservationRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeNonAirReservationRef hotelReservationRef;
        @XmlElement(name = "VehicleReservationRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeNonAirReservationRef vehicleReservationRef;
        @XmlElement(name = "PassiveSegmentRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeSegmentRef passiveSegmentRef;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the airSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeSegmentRef getAirSegmentRef() {
            return airSegmentRef;
        }

        /**
         * Sets the value of the airSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setAirSegmentRef(TypeSegmentRef value) {
            this.airSegmentRef = value;
        }

        /**
         * Gets the value of the hotelReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeNonAirReservationRef getHotelReservationRef() {
            return hotelReservationRef;
        }

        /**
         * Sets the value of the hotelReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setHotelReservationRef(TypeNonAirReservationRef value) {
            this.hotelReservationRef = value;
        }

        /**
         * Gets the value of the vehicleReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeNonAirReservationRef getVehicleReservationRef() {
            return vehicleReservationRef;
        }

        /**
         * Sets the value of the vehicleReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setVehicleReservationRef(TypeNonAirReservationRef value) {
            this.vehicleReservationRef = value;
        }

        /**
         * Gets the value of the passiveSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeSegmentRef getPassiveSegmentRef() {
            return passiveSegmentRef;
        }

        /**
         * Sets the value of the passiveSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setPassiveSegmentRef(TypeSegmentRef value) {
            this.passiveSegmentRef = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
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
     *       &lt;choice>
     *         &lt;element name="AirSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
     *         &lt;element name="HotelReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="VehicleReservationRef" type="{http://www.travelport.com/schema/common_v28_0}typeNonAirReservationRef" minOccurs="0"/>
     *         &lt;element name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v28_0}typeSegmentRef" minOccurs="0"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airSegmentRef",
        "hotelReservationRef",
        "vehicleReservationRef",
        "passiveSegmentRef"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
    public static class PreviousSegment
        implements Locatable
    {

        @XmlElement(name = "AirSegmentRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeSegmentRef airSegmentRef;
        @XmlElement(name = "HotelReservationRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeNonAirReservationRef hotelReservationRef;
        @XmlElement(name = "VehicleReservationRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeNonAirReservationRef vehicleReservationRef;
        @XmlElement(name = "PassiveSegmentRef")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected TypeSegmentRef passiveSegmentRef;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the airSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeSegmentRef getAirSegmentRef() {
            return airSegmentRef;
        }

        /**
         * Sets the value of the airSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setAirSegmentRef(TypeSegmentRef value) {
            this.airSegmentRef = value;
        }

        /**
         * Gets the value of the hotelReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeNonAirReservationRef getHotelReservationRef() {
            return hotelReservationRef;
        }

        /**
         * Sets the value of the hotelReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setHotelReservationRef(TypeNonAirReservationRef value) {
            this.hotelReservationRef = value;
        }

        /**
         * Gets the value of the vehicleReservationRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeNonAirReservationRef getVehicleReservationRef() {
            return vehicleReservationRef;
        }

        /**
         * Sets the value of the vehicleReservationRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeNonAirReservationRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setVehicleReservationRef(TypeNonAirReservationRef value) {
            this.vehicleReservationRef = value;
        }

        /**
         * Gets the value of the passiveSegmentRef property.
         * 
         * @return
         *     possible object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public TypeSegmentRef getPassiveSegmentRef() {
            return passiveSegmentRef;
        }

        /**
         * Sets the value of the passiveSegmentRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link TypeSegmentRef }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setPassiveSegmentRef(TypeSegmentRef value) {
            this.passiveSegmentRef = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:09:21-06:00", comment = "JAXB RI v2.2.6")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
