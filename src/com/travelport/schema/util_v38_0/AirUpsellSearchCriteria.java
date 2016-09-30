
package com.travelport.schema.util_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}AirUpsellOfferSearchCriteria" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/util_v38_0}AirUpsellQualifySearchCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "airUpsellOfferSearchCriteria",
    "airUpsellQualifySearchCriteria"
})
@XmlRootElement(name = "AirUpsellSearchCriteria")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public class AirUpsellSearchCriteria
    implements Locatable
{

    @XmlElement(name = "AirUpsellOfferSearchCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected AirUpsellOfferSearchCriteria airUpsellOfferSearchCriteria;
    @XmlElement(name = "AirUpsellQualifySearchCriteria", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected AirUpsellQualifySearchCriteria airUpsellQualifySearchCriteria;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the airUpsellOfferSearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirUpsellOfferSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public AirUpsellOfferSearchCriteria getAirUpsellOfferSearchCriteria() {
        return airUpsellOfferSearchCriteria;
    }

    /**
     * Sets the value of the airUpsellOfferSearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirUpsellOfferSearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setAirUpsellOfferSearchCriteria(AirUpsellOfferSearchCriteria value) {
        this.airUpsellOfferSearchCriteria = value;
    }

    /**
     * Gets the value of the airUpsellQualifySearchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AirUpsellQualifySearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public AirUpsellQualifySearchCriteria getAirUpsellQualifySearchCriteria() {
        return airUpsellQualifySearchCriteria;
    }

    /**
     * Sets the value of the airUpsellQualifySearchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirUpsellQualifySearchCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setAirUpsellQualifySearchCriteria(AirUpsellQualifySearchCriteria value) {
        this.airUpsellQualifySearchCriteria = value;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
