
package com.travelport.schema.vehicle_v17_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v15_0.TypeFuel;
import com.travelport.schema.common_v15_0.TypeVehicleCategory;
import com.travelport.schema.common_v15_0.TypeVehicleClass;
import com.travelport.schema.common_v15_0.TypeVehicleTransmission;
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
 *       &lt;attribute name="AirConditioning" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="TransmissionType" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleTransmission" default="Automatic" />
 *       &lt;attribute name="VehicleClass" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleClass" />
 *       &lt;attribute name="Category" type="{http://www.travelport.com/schema/common_v15_0}typeVehicleCategory" />
 *       &lt;attribute name="DoorCount" type="{http://www.travelport.com/schema/common_v15_0}typeDoorCount" />
 *       &lt;attribute name="FuelType" type="{http://www.travelport.com/schema/common_v15_0}typeFuel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleModifier")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class VehicleModifier
    implements Locatable
{

    @XmlAttribute(name = "AirConditioning")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Boolean airConditioning;
    @XmlAttribute(name = "TransmissionType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypeVehicleTransmission transmissionType;
    @XmlAttribute(name = "VehicleClass")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypeVehicleClass vehicleClass;
    @XmlAttribute(name = "Category")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypeVehicleCategory category;
    @XmlAttribute(name = "DoorCount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String doorCount;
    @XmlAttribute(name = "FuelType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypeFuel fuelType;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the airConditioning property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public boolean isAirConditioning() {
        if (airConditioning == null) {
            return true;
        } else {
            return airConditioning;
        }
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setAirConditioning(Boolean value) {
        this.airConditioning = value;
    }

    /**
     * Gets the value of the transmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypeVehicleTransmission getTransmissionType() {
        if (transmissionType == null) {
            return TypeVehicleTransmission.AUTOMATIC;
        } else {
            return transmissionType;
        }
    }

    /**
     * Sets the value of the transmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setTransmissionType(TypeVehicleTransmission value) {
        this.transmissionType = value;
    }

    /**
     * Gets the value of the vehicleClass property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypeVehicleClass getVehicleClass() {
        return vehicleClass;
    }

    /**
     * Sets the value of the vehicleClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setVehicleClass(TypeVehicleClass value) {
        this.vehicleClass = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypeVehicleCategory getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setCategory(TypeVehicleCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the doorCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getDoorCount() {
        return doorCount;
    }

    /**
     * Sets the value of the doorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setDoorCount(String value) {
        this.doorCount = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFuel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypeFuel getFuelType() {
        return fuelType;
    }

    /**
     * Sets the value of the fuelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFuel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setFuelType(TypeFuel value) {
        this.fuelType = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
