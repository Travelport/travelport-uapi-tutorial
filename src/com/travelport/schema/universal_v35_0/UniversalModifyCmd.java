
package com.travelport.schema.universal_v35_0;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}VehicleAdd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}VehicleDelete" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}VehicleUpdate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}AirAdd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}AirDelete" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}AirUpdate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}UniversalAdd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}UniversalDelete" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}UniversalUpdate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}HotelAdd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}HotelUpdate" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}HotelDelete" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}PassiveAdd" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}PassiveDelete" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v35_0}RailUpdate" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v35_0}typeRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vehicleAdd",
    "vehicleDelete",
    "vehicleUpdate",
    "airAdd",
    "airDelete",
    "airUpdate",
    "universalAdd",
    "universalDelete",
    "universalUpdate",
    "hotelAdd",
    "hotelUpdate",
    "hotelDelete",
    "passiveAdd",
    "passiveDelete",
    "railUpdate"
})
@XmlRootElement(name = "UniversalModifyCmd")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public class UniversalModifyCmd
    implements Locatable
{

    @XmlElement(name = "VehicleAdd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleAdd vehicleAdd;
    @XmlElement(name = "VehicleDelete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleDelete vehicleDelete;
    @XmlElement(name = "VehicleUpdate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleUpdate vehicleUpdate;
    @XmlElement(name = "AirAdd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirAdd airAdd;
    @XmlElement(name = "AirDelete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirDelete airDelete;
    @XmlElement(name = "AirUpdate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected AirUpdate airUpdate;
    @XmlElement(name = "UniversalAdd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected UniversalAdd universalAdd;
    @XmlElement(name = "UniversalDelete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected UniversalDelete universalDelete;
    @XmlElement(name = "UniversalUpdate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected UniversalUpdate universalUpdate;
    @XmlElement(name = "HotelAdd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected HotelAdd hotelAdd;
    @XmlElement(name = "HotelUpdate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected HotelUpdate hotelUpdate;
    @XmlElement(name = "HotelDelete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected HotelDelete hotelDelete;
    @XmlElement(name = "PassiveAdd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PassiveAdd passiveAdd;
    @XmlElement(name = "PassiveDelete")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected PassiveDelete passiveDelete;
    @XmlElement(name = "RailUpdate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected RailUpdate railUpdate;
    @XmlAttribute(name = "Key", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String key;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the vehicleAdd property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public VehicleAdd getVehicleAdd() {
        return vehicleAdd;
    }

    /**
     * Sets the value of the vehicleAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setVehicleAdd(VehicleAdd value) {
        this.vehicleAdd = value;
    }

    /**
     * Gets the value of the vehicleDelete property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public VehicleDelete getVehicleDelete() {
        return vehicleDelete;
    }

    /**
     * Sets the value of the vehicleDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setVehicleDelete(VehicleDelete value) {
        this.vehicleDelete = value;
    }

    /**
     * Gets the value of the vehicleUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public VehicleUpdate getVehicleUpdate() {
        return vehicleUpdate;
    }

    /**
     * Sets the value of the vehicleUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setVehicleUpdate(VehicleUpdate value) {
        this.vehicleUpdate = value;
    }

    /**
     * Gets the value of the airAdd property.
     * 
     * @return
     *     possible object is
     *     {@link AirAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirAdd getAirAdd() {
        return airAdd;
    }

    /**
     * Sets the value of the airAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setAirAdd(AirAdd value) {
        this.airAdd = value;
    }

    /**
     * Gets the value of the airDelete property.
     * 
     * @return
     *     possible object is
     *     {@link AirDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirDelete getAirDelete() {
        return airDelete;
    }

    /**
     * Sets the value of the airDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setAirDelete(AirDelete value) {
        this.airDelete = value;
    }

    /**
     * Gets the value of the airUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link AirUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public AirUpdate getAirUpdate() {
        return airUpdate;
    }

    /**
     * Sets the value of the airUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setAirUpdate(AirUpdate value) {
        this.airUpdate = value;
    }

    /**
     * Gets the value of the universalAdd property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public UniversalAdd getUniversalAdd() {
        return universalAdd;
    }

    /**
     * Sets the value of the universalAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setUniversalAdd(UniversalAdd value) {
        this.universalAdd = value;
    }

    /**
     * Gets the value of the universalDelete property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public UniversalDelete getUniversalDelete() {
        return universalDelete;
    }

    /**
     * Sets the value of the universalDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setUniversalDelete(UniversalDelete value) {
        this.universalDelete = value;
    }

    /**
     * Gets the value of the universalUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public UniversalUpdate getUniversalUpdate() {
        return universalUpdate;
    }

    /**
     * Sets the value of the universalUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setUniversalUpdate(UniversalUpdate value) {
        this.universalUpdate = value;
    }

    /**
     * Gets the value of the hotelAdd property.
     * 
     * @return
     *     possible object is
     *     {@link HotelAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public HotelAdd getHotelAdd() {
        return hotelAdd;
    }

    /**
     * Sets the value of the hotelAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelAdd(HotelAdd value) {
        this.hotelAdd = value;
    }

    /**
     * Gets the value of the hotelUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public HotelUpdate getHotelUpdate() {
        return hotelUpdate;
    }

    /**
     * Sets the value of the hotelUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelUpdate(HotelUpdate value) {
        this.hotelUpdate = value;
    }

    /**
     * Gets the value of the hotelDelete property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public HotelDelete getHotelDelete() {
        return hotelDelete;
    }

    /**
     * Sets the value of the hotelDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelDelete(HotelDelete value) {
        this.hotelDelete = value;
    }

    /**
     * Gets the value of the passiveAdd property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PassiveAdd getPassiveAdd() {
        return passiveAdd;
    }

    /**
     * Sets the value of the passiveAdd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveAdd }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPassiveAdd(PassiveAdd value) {
        this.passiveAdd = value;
    }

    /**
     * Gets the value of the passiveDelete property.
     * 
     * @return
     *     possible object is
     *     {@link PassiveDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public PassiveDelete getPassiveDelete() {
        return passiveDelete;
    }

    /**
     * Sets the value of the passiveDelete property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassiveDelete }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setPassiveDelete(PassiveDelete value) {
        this.passiveDelete = value;
    }

    /**
     * Gets the value of the railUpdate property.
     * 
     * @return
     *     possible object is
     *     {@link RailUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public RailUpdate getRailUpdate() {
        return railUpdate;
    }

    /**
     * Sets the value of the railUpdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailUpdate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setRailUpdate(RailUpdate value) {
        this.railUpdate = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setKey(String value) {
        this.key = value;
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
