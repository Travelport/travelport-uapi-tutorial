
package com.travelport.schema.vehicle_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v29_0.TypeFuel;
import com.travelport.schema.common_v29_0.TypeVehicleCategory;
import com.travelport.schema.common_v29_0.TypeVehicleClass;
import com.travelport.schema.common_v29_0.TypeVehicleTransmission;
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
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NumberOfDoors" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BagCount" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Class" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeVehicleClass" />
 *       &lt;attribute name="Category" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeVehicleCategory" />
 *       &lt;attribute name="AirConditioning" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Transmission" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeVehicleTransmission" />
 *       &lt;attribute name="MakeModel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FuelType" type="{http://www.travelport.com/schema/common_v29_0}typeFuel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "VehicleDetail")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
public class VehicleDetail
    implements Locatable
{

    @XmlAttribute(name = "Code", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String code;
    @XmlAttribute(name = "SupplierCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String supplierCode;
    @XmlAttribute(name = "PassengerCount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String passengerCount;
    @XmlAttribute(name = "NumberOfDoors")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String numberOfDoors;
    @XmlAttribute(name = "BagCount")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String bagCount;
    @XmlAttribute(name = "Class", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeVehicleClass clazz;
    @XmlAttribute(name = "Category", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeVehicleCategory category;
    @XmlAttribute(name = "AirConditioning", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected boolean airConditioning;
    @XmlAttribute(name = "Transmission", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeVehicleTransmission transmission;
    @XmlAttribute(name = "MakeModel", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected String makeModel;
    @XmlAttribute(name = "FuelType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected TypeFuel fuelType;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the passengerCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String getPassengerCount() {
        return passengerCount;
    }

    /**
     * Sets the value of the passengerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setPassengerCount(String value) {
        this.passengerCount = value;
    }

    /**
     * Gets the value of the numberOfDoors property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * Sets the value of the numberOfDoors property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setNumberOfDoors(String value) {
        this.numberOfDoors = value;
    }

    /**
     * Gets the value of the bagCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String getBagCount() {
        return bagCount;
    }

    /**
     * Sets the value of the bagCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setBagCount(String value) {
        this.bagCount = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public TypeVehicleClass getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleClass }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setClazz(TypeVehicleClass value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleCategory }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setCategory(TypeVehicleCategory value) {
        this.category = value;
    }

    /**
     * Gets the value of the airConditioning property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public boolean isAirConditioning() {
        return airConditioning;
    }

    /**
     * Sets the value of the airConditioning property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setAirConditioning(boolean value) {
        this.airConditioning = value;
    }

    /**
     * Gets the value of the transmission property.
     * 
     * @return
     *     possible object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public TypeVehicleTransmission getTransmission() {
        return transmission;
    }

    /**
     * Sets the value of the transmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeVehicleTransmission }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setTransmission(TypeVehicleTransmission value) {
        this.transmission = value;
    }

    /**
     * Gets the value of the makeModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String getMakeModel() {
        return makeModel;
    }

    /**
     * Sets the value of the makeModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setMakeModel(String value) {
        this.makeModel = value;
    }

    /**
     * Gets the value of the fuelType property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFuel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setFuelType(TypeFuel value) {
        this.fuelType = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
