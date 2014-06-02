
package com.travelport.schema.common_v26_0;

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
 *         &lt;element name="Air" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.travelport.com/schema/common_v26_0}typeTransactionsAllowed">
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v26_0}attrFlexShopping"/>
 *                 &lt;attribute name="OneWayShop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="FlexExplore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Hotel" type="{http://www.travelport.com/schema/common_v26_0}typeTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="Rail" type="{http://www.travelport.com/schema/common_v26_0}typeTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="Vehicle" type="{http://www.travelport.com/schema/common_v26_0}typeTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="Passive" type="{http://www.travelport.com/schema/common_v26_0}typeBookingTransactionsAllowed" minOccurs="0"/>
 *         &lt;element name="BackgroundPassive" type="{http://www.travelport.com/schema/common_v26_0}typeBookingTransactionsAllowed" minOccurs="0"/>
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
    "air",
    "hotel",
    "rail",
    "vehicle",
    "passive",
    "backgroundPassive"
})
@XmlRootElement(name = "TransactionType")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class TransactionType
    implements Locatable
{

    @XmlElement(name = "Air")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TransactionType.Air air;
    @XmlElement(name = "Hotel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeTransactionsAllowed hotel;
    @XmlElement(name = "Rail")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeTransactionsAllowed rail;
    @XmlElement(name = "Vehicle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeTransactionsAllowed vehicle;
    @XmlElement(name = "Passive")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeBookingTransactionsAllowed passive;
    @XmlElement(name = "BackgroundPassive")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeBookingTransactionsAllowed backgroundPassive;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the air property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType.Air }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TransactionType.Air getAir() {
        return air;
    }

    /**
     * Sets the value of the air property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType.Air }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAir(TransactionType.Air value) {
        this.air = value;
    }

    /**
     * Gets the value of the hotel property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeTransactionsAllowed getHotel() {
        return hotel;
    }

    /**
     * Sets the value of the hotel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setHotel(TypeTransactionsAllowed value) {
        this.hotel = value;
    }

    /**
     * Gets the value of the rail property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeTransactionsAllowed getRail() {
        return rail;
    }

    /**
     * Sets the value of the rail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setRail(TypeTransactionsAllowed value) {
        this.rail = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * @return
     *     possible object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeTransactionsAllowed getVehicle() {
        return vehicle;
    }

    /**
     * Sets the value of the vehicle property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setVehicle(TypeTransactionsAllowed value) {
        this.vehicle = value;
    }

    /**
     * Gets the value of the passive property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeBookingTransactionsAllowed getPassive() {
        return passive;
    }

    /**
     * Sets the value of the passive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setPassive(TypeBookingTransactionsAllowed value) {
        this.passive = value;
    }

    /**
     * Gets the value of the backgroundPassive property.
     * 
     * @return
     *     possible object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeBookingTransactionsAllowed getBackgroundPassive() {
        return backgroundPassive;
    }

    /**
     * Sets the value of the backgroundPassive property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeBookingTransactionsAllowed }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setBackgroundPassive(TypeBookingTransactionsAllowed value) {
        this.backgroundPassive = value;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
     *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}typeTransactionsAllowed">
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v26_0}attrFlexShopping"/>
     *       &lt;attribute name="OneWayShop" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="FlexExplore" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public static class Air
        extends TypeTransactionsAllowed
    {

        @XmlAttribute(name = "OneWayShop")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Boolean oneWayShop;
        @XmlAttribute(name = "FlexExplore")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Boolean flexExplore;
        @XmlAttribute(name = "Tier")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Integer tier;
        @XmlAttribute(name = "DaysEnabled")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Boolean daysEnabled;
        @XmlAttribute(name = "WeekendsEnabled")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Boolean weekendsEnabled;
        @XmlAttribute(name = "AirportsEnabled")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Boolean airportsEnabled;
        @XmlAttribute(name = "ODEnabled")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        protected Boolean odEnabled;

        /**
         * Gets the value of the oneWayShop property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Boolean isOneWayShop() {
            return oneWayShop;
        }

        /**
         * Sets the value of the oneWayShop property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setOneWayShop(Boolean value) {
            this.oneWayShop = value;
        }

        /**
         * Gets the value of the flexExplore property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Boolean isFlexExplore() {
            return flexExplore;
        }

        /**
         * Sets the value of the flexExplore property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setFlexExplore(Boolean value) {
            this.flexExplore = value;
        }

        /**
         * Gets the value of the tier property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Integer getTier() {
            return tier;
        }

        /**
         * Sets the value of the tier property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setTier(Integer value) {
            this.tier = value;
        }

        /**
         * Gets the value of the daysEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Boolean isDaysEnabled() {
            return daysEnabled;
        }

        /**
         * Sets the value of the daysEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setDaysEnabled(Boolean value) {
            this.daysEnabled = value;
        }

        /**
         * Gets the value of the weekendsEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Boolean isWeekendsEnabled() {
            return weekendsEnabled;
        }

        /**
         * Sets the value of the weekendsEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setWeekendsEnabled(Boolean value) {
            this.weekendsEnabled = value;
        }

        /**
         * Gets the value of the airportsEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Boolean isAirportsEnabled() {
            return airportsEnabled;
        }

        /**
         * Sets the value of the airportsEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setAirportsEnabled(Boolean value) {
            this.airportsEnabled = value;
        }

        /**
         * Gets the value of the odEnabled property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public Boolean isODEnabled() {
            return odEnabled;
        }

        /**
         * Sets the value of the odEnabled property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
        public void setODEnabled(Boolean value) {
            this.odEnabled = value;
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

}
