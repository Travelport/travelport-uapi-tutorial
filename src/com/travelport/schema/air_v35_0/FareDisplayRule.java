
package com.travelport.schema.air_v35_0;

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
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}RuleAdvancedPurchase" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}RuleLengthOfStay" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v35_0}RuleCharges" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="RuleNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="TariffNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ruleAdvancedPurchase",
    "ruleLengthOfStay",
    "ruleCharges"
})
@XmlRootElement(name = "FareDisplayRule")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
public class FareDisplayRule
    implements Locatable
{

    @XmlElement(name = "RuleAdvancedPurchase")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected RuleAdvancedPurchase ruleAdvancedPurchase;
    @XmlElement(name = "RuleLengthOfStay")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected RuleLengthOfStay ruleLengthOfStay;
    @XmlElement(name = "RuleCharges")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected RuleCharges ruleCharges;
    @XmlAttribute(name = "RuleNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String ruleNumber;
    @XmlAttribute(name = "Source")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String source;
    @XmlAttribute(name = "TariffNumber")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected String tariffNumber;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the ruleAdvancedPurchase property.
     * 
     * @return
     *     possible object is
     *     {@link RuleAdvancedPurchase }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public RuleAdvancedPurchase getRuleAdvancedPurchase() {
        return ruleAdvancedPurchase;
    }

    /**
     * Sets the value of the ruleAdvancedPurchase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleAdvancedPurchase }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setRuleAdvancedPurchase(RuleAdvancedPurchase value) {
        this.ruleAdvancedPurchase = value;
    }

    /**
     * Gets the value of the ruleLengthOfStay property.
     * 
     * @return
     *     possible object is
     *     {@link RuleLengthOfStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public RuleLengthOfStay getRuleLengthOfStay() {
        return ruleLengthOfStay;
    }

    /**
     * Sets the value of the ruleLengthOfStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleLengthOfStay }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setRuleLengthOfStay(RuleLengthOfStay value) {
        this.ruleLengthOfStay = value;
    }

    /**
     * Gets the value of the ruleCharges property.
     * 
     * @return
     *     possible object is
     *     {@link RuleCharges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public RuleCharges getRuleCharges() {
        return ruleCharges;
    }

    /**
     * Sets the value of the ruleCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleCharges }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setRuleCharges(RuleCharges value) {
        this.ruleCharges = value;
    }

    /**
     * Gets the value of the ruleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getRuleNumber() {
        return ruleNumber;
    }

    /**
     * Sets the value of the ruleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setRuleNumber(String value) {
        this.ruleNumber = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the tariffNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public String getTariffNumber() {
        return tariffNumber;
    }

    /**
     * Sets the value of the tariffNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
    public void setTariffNumber(String value) {
        this.tariffNumber = value;
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
