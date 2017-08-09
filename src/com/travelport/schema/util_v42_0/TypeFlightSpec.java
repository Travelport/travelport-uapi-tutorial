
package com.travelport.schema.util_v42_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * 
 *             Specifies flight number as either specific flight number
 *             or a flight number range
 *          
 * 
 * <p>Java class for typeFlightSpec complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeFlightSpec"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="FlightNumberRange" type="{http://www.travelport.com/schema/util_v42_0}typeFlightNumberRange" minOccurs="0"/&gt;
 *         &lt;element name="SpecificFlightNumber" type="{http://www.travelport.com/schema/util_v42_0}typeSpecificFlightNumber" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeFlightSpec", propOrder = {
    "flightNumberRange",
    "specificFlightNumber"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
public class TypeFlightSpec
    implements Locatable
{

    @XmlElement(name = "FlightNumberRange")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeFlightNumberRange flightNumberRange;
    @XmlElement(name = "SpecificFlightNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected TypeSpecificFlightNumber specificFlightNumber;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the flightNumberRange property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFlightNumberRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeFlightNumberRange getFlightNumberRange() {
        return flightNumberRange;
    }

    /**
     * Sets the value of the flightNumberRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFlightNumberRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setFlightNumberRange(TypeFlightNumberRange value) {
        this.flightNumberRange = value;
    }

    /**
     * Gets the value of the specificFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link TypeSpecificFlightNumber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public TypeSpecificFlightNumber getSpecificFlightNumber() {
        return specificFlightNumber;
    }

    /**
     * Sets the value of the specificFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeSpecificFlightNumber }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSpecificFlightNumber(TypeSpecificFlightNumber value) {
        this.specificFlightNumber = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T04:06:27-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
