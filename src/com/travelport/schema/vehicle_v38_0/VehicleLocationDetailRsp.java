
package com.travelport.schema.vehicle_v38_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v38_0}VendorInfo"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v38_0}LocationInfo" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v38_0}VehiclePolicy" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendorInfo",
    "locationInfo",
    "vehiclePolicy"
})
@XmlRootElement(name = "VehicleLocationDetailRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
public class VehicleLocationDetailRsp
    extends BaseRsp
{

    @XmlElement(name = "VendorInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected VendorInfo vendorInfo;
    @XmlElement(name = "LocationInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected List<LocationInfo> locationInfo;
    @XmlElement(name = "VehiclePolicy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected VehiclePolicy vehiclePolicy;

    /**
     * Gets the value of the vendorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VendorInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public VendorInfo getVendorInfo() {
        return vendorInfo;
    }

    /**
     * Sets the value of the vendorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setVendorInfo(VendorInfo value) {
        this.vendorInfo = value;
    }

    /**
     * Gets the value of the locationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public List<LocationInfo> getLocationInfo() {
        if (locationInfo == null) {
            locationInfo = new ArrayList<LocationInfo>();
        }
        return this.locationInfo;
    }

    /**
     * Gets the value of the vehiclePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePolicy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public VehiclePolicy getVehiclePolicy() {
        return vehiclePolicy;
    }

    /**
     * Sets the value of the vehiclePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePolicy }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setVehiclePolicy(VehiclePolicy value) {
        this.vehiclePolicy = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
