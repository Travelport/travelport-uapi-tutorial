
package com.travelport.schema.air_v26_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *     &lt;extension base="{http://www.travelport.com/schema/air_v26_0}BaseLowFareSearchReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}AirSearchAsynchModifiers" minOccurs="0"/>
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
    "airSearchAsynchModifiers"
})
@XmlRootElement(name = "LowFareSearchAsynchReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
public class LowFareSearchAsynchReq
    extends BaseLowFareSearchReq
{

    @XmlElement(name = "AirSearchAsynchModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected AirSearchAsynchModifiers airSearchAsynchModifiers;

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSearchAsynchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public AirSearchAsynchModifiers getAirSearchAsynchModifiers() {
        return airSearchAsynchModifiers;
    }

    /**
     * Sets the value of the airSearchAsynchModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSearchAsynchModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public void setAirSearchAsynchModifiers(AirSearchAsynchModifiers value) {
        this.airSearchAsynchModifiers = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
