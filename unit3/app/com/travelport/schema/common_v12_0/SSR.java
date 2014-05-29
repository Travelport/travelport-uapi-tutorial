
package com.travelport.schema.common_v12_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="Key" type="{http://www.travelport.com/schema/common_v12_0}typeRef" />
 *       &lt;attribute name="SegmentRef" type="{http://www.travelport.com/schema/common_v12_0}typeRef" />
 *       &lt;attribute name="PassiveSegmentRef" type="{http://www.travelport.com/schema/common_v12_0}typeRef" />
 *       &lt;attribute name="Type" use="required" type="{http://www.travelport.com/schema/common_v12_0}typeSSRCode" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FreeText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Carrier" type="{http://www.travelport.com/schema/common_v12_0}typeCarrier" />
 *       &lt;attribute name="CarrierSpecificText">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="64"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProviderDefinedType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="16"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="SSRRuleRef" type="{http://www.travelport.com/schema/common_v12_0}typeRef" />
 *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "SSR")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public class SSR
    implements Locatable
{

    @XmlAttribute(name = "Key")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String key;
    @XmlAttribute(name = "SegmentRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String segmentRef;
    @XmlAttribute(name = "PassiveSegmentRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String passiveSegmentRef;
    @XmlAttribute(name = "Type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String type;
    @XmlAttribute(name = "Status")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String status;
    @XmlAttribute(name = "FreeText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String freeText;
    @XmlAttribute(name = "Carrier")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String carrier;
    @XmlAttribute(name = "CarrierSpecificText")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String carrierSpecificText;
    @XmlAttribute(name = "Description")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String description;
    @XmlAttribute(name = "ProviderDefinedType")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String providerDefinedType;
    @XmlAttribute(name = "SSRRuleRef")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String ssrRuleRef;
    @XmlAttribute(name = "URL")
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected String url;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    protected Locator locator;

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the segmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getSegmentRef() {
        return segmentRef;
    }

    /**
     * Sets the value of the segmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setSegmentRef(String value) {
        this.segmentRef = value;
    }

    /**
     * Gets the value of the passiveSegmentRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getPassiveSegmentRef() {
        return passiveSegmentRef;
    }

    /**
     * Sets the value of the passiveSegmentRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setPassiveSegmentRef(String value) {
        this.passiveSegmentRef = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setFreeText(String value) {
        this.freeText = value;
    }

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setCarrier(String value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the carrierSpecificText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getCarrierSpecificText() {
        return carrierSpecificText;
    }

    /**
     * Sets the value of the carrierSpecificText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setCarrierSpecificText(String value) {
        this.carrierSpecificText = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the providerDefinedType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getProviderDefinedType() {
        return providerDefinedType;
    }

    /**
     * Sets the value of the providerDefinedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setProviderDefinedType(String value) {
        this.providerDefinedType = value;
    }

    /**
     * Gets the value of the ssrRuleRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getSSRRuleRef() {
        return ssrRuleRef;
    }

    /**
     * Sets the value of the ssrRuleRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setSSRRuleRef(String value) {
        this.ssrRuleRef = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
