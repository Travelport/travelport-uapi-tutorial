
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
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v17_0}Vendor" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="PickupDateLocation" type="{http://www.travelport.com/schema/vehicle_v17_0}typePickupDateLocation"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v15_0}ReferencePoint" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vendor",
    "pickupDateLocation",
    "referencePoint"
})
@XmlRootElement(name = "VehicleLocationReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public class VehicleLocationReq
    extends BaseReq
{

    @XmlElement(name = "Vendor")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected List<Vendor> vendor;
    @XmlElement(name = "PickupDateLocation", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected TypePickupDateLocation pickupDateLocation;
    @XmlElement(name = "ReferencePoint", namespace = "http://www.travelport.com/schema/common_v15_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    protected String referencePoint;

    /**
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vendor }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public List<Vendor> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<Vendor>();
        }
        return this.vendor;
    }

    /**
     * Gets the value of the pickupDateLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TypePickupDateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public TypePickupDateLocation getPickupDateLocation() {
        return pickupDateLocation;
    }

    /**
     * Sets the value of the pickupDateLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypePickupDateLocation }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setPickupDateLocation(TypePickupDateLocation value) {
        this.pickupDateLocation = value;
    }

    /**
     * Search Car by reference point
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public String getReferencePoint() {
        return referencePoint;
    }

    /**
     * Sets the value of the referencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
    public void setReferencePoint(String value) {
        this.referencePoint = value;
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
