
package com.travelport.schema.vehicle_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseSearchReq;
import com.travelport.schema.common_v26_0.PointOfSale;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * Base request to search for vehicle availability.
 * 
 * <p>Java class for BaseVehicleSearchAvailabilityReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseVehicleSearchAvailabilityReq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseSearchReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v26_0}VehicleDateLocation"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v26_0}VehicleSearchModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}PointOfSale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseVehicleSearchAvailabilityReq", propOrder = {
    "vehicleDateLocation",
    "vehicleSearchModifiers",
    "pointOfSale"
})
@XmlSeeAlso({
    VehicleSearchAvailabilityReq.class,
    VehicleUpsellSearchAvailabilityReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
public class BaseVehicleSearchAvailabilityReq
    extends BaseSearchReq
{

    @XmlElement(name = "VehicleDateLocation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    protected VehicleDateLocation vehicleDateLocation;
    @XmlElement(name = "VehicleSearchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    protected VehicleSearchModifiers vehicleSearchModifiers;
    @XmlElement(name = "PointOfSale", namespace = "http://www.travelport.com/schema/common_v26_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    protected PointOfSale pointOfSale;

    /**
     * Gets the value of the vehicleDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public VehicleDateLocation getVehicleDateLocation() {
        return vehicleDateLocation;
    }

    /**
     * Sets the value of the vehicleDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public void setVehicleDateLocation(VehicleDateLocation value) {
        this.vehicleDateLocation = value;
    }

    /**
     * Gets the value of the vehicleSearchModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public VehicleSearchModifiers getVehicleSearchModifiers() {
        return vehicleSearchModifiers;
    }

    /**
     * Sets the value of the vehicleSearchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public void setVehicleSearchModifiers(VehicleSearchModifiers value) {
        this.vehicleSearchModifiers = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSale }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public PointOfSale getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSale }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public void setPointOfSale(PointOfSale value) {
        this.pointOfSale = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:45-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
