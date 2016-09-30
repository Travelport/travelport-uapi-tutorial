
package com.travelport.schema.util_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v38_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseReq"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}AirUpsellCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}VehicleUpsellCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}HotelUpsellCriteria" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airUpsellCriteria",
    "vehicleUpsellCriteria",
    "hotelUpsellCriteria"
})
@XmlRootElement(name = "UpsellAdminReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class UpsellAdminReq
    extends BaseReq
{

    @XmlElement(name = "AirUpsellCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected AirUpsellCriteria airUpsellCriteria;
    @XmlElement(name = "VehicleUpsellCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected VehicleUpsellCriteria vehicleUpsellCriteria;
    @XmlElement(name = "HotelUpsellCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected HotelUpsellCriteria hotelUpsellCriteria;

    /**
     * Gets the value of the airUpsellCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirUpsellCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public AirUpsellCriteria getAirUpsellCriteria() {
        return airUpsellCriteria;
    }

    /**
     * Sets the value of the airUpsellCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirUpsellCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setAirUpsellCriteria(AirUpsellCriteria value) {
        this.airUpsellCriteria = value;
    }

    /**
     * Gets the value of the vehicleUpsellCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleUpsellCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public VehicleUpsellCriteria getVehicleUpsellCriteria() {
        return vehicleUpsellCriteria;
    }

    /**
     * Sets the value of the vehicleUpsellCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleUpsellCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setVehicleUpsellCriteria(VehicleUpsellCriteria value) {
        this.vehicleUpsellCriteria = value;
    }

    /**
     * Gets the value of the hotelUpsellCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link HotelUpsellCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public HotelUpsellCriteria getHotelUpsellCriteria() {
        return hotelUpsellCriteria;
    }

    /**
     * Sets the value of the hotelUpsellCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelUpsellCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setHotelUpsellCriteria(HotelUpsellCriteria value) {
        this.hotelUpsellCriteria = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
