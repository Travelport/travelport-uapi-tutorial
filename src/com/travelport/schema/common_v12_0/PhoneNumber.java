
package com.travelport.schema.common_v12_0;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v12_0}ProviderReservationInfoRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v12_0}typeRef" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Agency"/>
 *             &lt;enumeration value="Business"/>
 *             &lt;enumeration value="Mobile"/>
 *             &lt;enumeration value="Home"/>
 *             &lt;enumeration value="Fax"/>
 *             &lt;enumeration value="Hotel"/>
 *             &lt;enumeration value="Other"/>
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="Email"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Location">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CountryCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="5"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="AreaCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Number" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="50"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Extension">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="10"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Text">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;maxLength value="1024"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationInfoRef"
})
@XmlRootElement(name = "PhoneNumber")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
public class PhoneNumber
    implements Locatable
{

    @XmlElement(name = "ProviderReservationInfoRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected List<ProviderReservationInfoRef> providerReservationInfoRef;
    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String key;
    @XmlAttribute(name = "Type")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String type;
    @XmlAttribute(name = "Location")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String location;
    @XmlAttribute(name = "CountryCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String countryCode;
    @XmlAttribute(name = "AreaCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String areaCode;
    @XmlAttribute(name = "Number", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String number;
    @XmlAttribute(name = "Extension")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String extension;
    @XmlAttribute(name = "Text")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected String text;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the providerReservationInfoRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providerReservationInfoRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProviderReservationInfoRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderReservationInfoRef }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public List<ProviderReservationInfoRef> getProviderReservationInfoRef() {
        if (providerReservationInfoRef == null) {
            providerReservationInfoRef = new ArrayList<ProviderReservationInfoRef>();
        }
        return this.providerReservationInfoRef;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the areaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Sets the value of the areaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setExtension(String value) {
        this.extension = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:54:06-06:00", comments = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
