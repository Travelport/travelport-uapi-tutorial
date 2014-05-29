
package com.travelport.schema.vehicle_v17_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v15_0.BaseReq;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


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
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehicleSearchId"/>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}VehiclePickupLocation" maxOccurs="unbounded"/>
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
    "vehicleSearchId",
    "vehiclePickupLocation"
})
@XmlRootElement(name = "VehicleMediaLinksReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class VehicleMediaLinksReq
    extends BaseReq
{

    @XmlElement(name = "VehicleSearchId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected VehicleSearchId vehicleSearchId;
    @XmlElement(name = "VehiclePickupLocation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<VehiclePickupLocation> vehiclePickupLocation;

    /**
     * Gets the value of the vehicleSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleSearchId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public VehicleSearchId getVehicleSearchId() {
        return vehicleSearchId;
    }

    /**
     * Sets the value of the vehicleSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSearchId }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setVehicleSearchId(VehicleSearchId value) {
        this.vehicleSearchId = value;
    }

    /**
     * Gets the value of the vehiclePickupLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehiclePickupLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehiclePickupLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehiclePickupLocation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<VehiclePickupLocation> getVehiclePickupLocation() {
        if (vehiclePickupLocation == null) {
            vehiclePickupLocation = new ArrayList<VehiclePickupLocation>();
        }
        return this.vehiclePickupLocation;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.SIMPLE_STYLE);
    }

}
