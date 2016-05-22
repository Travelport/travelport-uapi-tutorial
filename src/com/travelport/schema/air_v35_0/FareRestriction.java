
package com.travelport.schema.air_v35_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FareRestrictionDaysOfWeek" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FareRestrictionDate" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}FareRestrictionSaleDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FareRestrictiontype" type="{http://www.travelport.com/schema/air_v35_0}typeFareRestrictionType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fareRestrictionDaysOfWeek",
    "fareRestrictionDate",
    "fareRestrictionSaleDate"
})
@XmlRootElement(name = "FareRestriction")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public class FareRestriction
    implements Locatable
{

    @XmlElement(name = "FareRestrictionDaysOfWeek")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected List<FareRestrictionDaysOfWeek> fareRestrictionDaysOfWeek;
    @XmlElement(name = "FareRestrictionDate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected List<FareRestrictionDate> fareRestrictionDate;
    @XmlElement(name = "FareRestrictionSaleDate")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected FareRestrictionSaleDate fareRestrictionSaleDate;
    @XmlAttribute(name = "FareRestrictiontype")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected TypeFareRestrictionType fareRestrictiontype;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the fareRestrictionDaysOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictionDaysOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictionDaysOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictionDaysOfWeek }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public List<FareRestrictionDaysOfWeek> getFareRestrictionDaysOfWeek() {
        if (fareRestrictionDaysOfWeek == null) {
            fareRestrictionDaysOfWeek = new ArrayList<FareRestrictionDaysOfWeek>();
        }
        return this.fareRestrictionDaysOfWeek;
    }

    /**
     * Gets the value of the fareRestrictionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareRestrictionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareRestrictionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareRestrictionDate }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public List<FareRestrictionDate> getFareRestrictionDate() {
        if (fareRestrictionDate == null) {
            fareRestrictionDate = new ArrayList<FareRestrictionDate>();
        }
        return this.fareRestrictionDate;
    }

    /**
     * Gets the value of the fareRestrictionSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link FareRestrictionSaleDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public FareRestrictionSaleDate getFareRestrictionSaleDate() {
        return fareRestrictionSaleDate;
    }

    /**
     * Sets the value of the fareRestrictionSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRestrictionSaleDate }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setFareRestrictionSaleDate(FareRestrictionSaleDate value) {
        this.fareRestrictionSaleDate = value;
    }

    /**
     * Gets the value of the fareRestrictiontype property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFareRestrictionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public TypeFareRestrictionType getFareRestrictiontype() {
        return fareRestrictiontype;
    }

    /**
     * Sets the value of the fareRestrictiontype property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFareRestrictionType }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setFareRestrictiontype(TypeFareRestrictionType value) {
        this.fareRestrictiontype = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
