
package com.travelport.schema.universal_v29_0;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v29_0}NameCriteria" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v29_0}AppliedProfileCriteria" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VIPOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nameCriteria",
    "appliedProfileCriteria"
})
@XmlRootElement(name = "TravelerCriteria")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
public class TravelerCriteria
    implements Locatable
{

    @XmlElement(name = "NameCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected NameCriteria nameCriteria;
    @XmlElement(name = "AppliedProfileCriteria")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected AppliedProfileCriteria appliedProfileCriteria;
    @XmlAttribute(name = "PhoneNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String phoneNumber;
    @XmlAttribute(name = "VIPOnly")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean vipOnly;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the nameCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link NameCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public NameCriteria getNameCriteria() {
        return nameCriteria;
    }

    /**
     * Sets the value of the nameCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setNameCriteria(NameCriteria value) {
        this.nameCriteria = value;
    }

    /**
     * Gets the value of the appliedProfileCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AppliedProfileCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public AppliedProfileCriteria getAppliedProfileCriteria() {
        return appliedProfileCriteria;
    }

    /**
     * Sets the value of the appliedProfileCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppliedProfileCriteria }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setAppliedProfileCriteria(AppliedProfileCriteria value) {
        this.appliedProfileCriteria = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the vipOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public Boolean isVIPOnly() {
        return vipOnly;
    }

    /**
     * Sets the value of the vipOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setVIPOnly(Boolean value) {
        this.vipOnly = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
