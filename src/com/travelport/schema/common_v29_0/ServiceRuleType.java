
package com.travelport.schema.common_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * Contains the rules for applying service rules
 * 
 * <p>Java class for ServiceRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicationRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RequiredForAllTravelers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RequiredForAllSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="RequiredForAllSegmentsInOD" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="UnselectedOptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="SecondaryOptionCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ApplicationLevel" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ApplicationLimits" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicationLimitType" maxOccurs="10"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ServiceData" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ApplicableLevels">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicabilityType" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ProviderDefinedApplicableLevels" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ModifyRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ModifyRule" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}ModificationRulesGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SupportedModifications">
 *                   &lt;simpleType>
 *                     &lt;list itemType="{http://www.travelport.com/schema/common_v29_0}ModificationType" />
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ProviderDefinedModificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SecondaryTypeRules" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SecondaryTypeRule" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remarks" type="{http://www.travelport.com/schema/common_v29_0}FormattedTextTextType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRuleType", propOrder = {
    "applicationRules",
    "applicationLevel",
    "modifyRules",
    "secondaryTypeRules",
    "remarks"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public class ServiceRuleType
    implements Locatable
{

    @XmlElement(name = "ApplicationRules")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected ServiceRuleType.ApplicationRules applicationRules;
    @XmlElement(name = "ApplicationLevel")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected ServiceRuleType.ApplicationLevel applicationLevel;
    @XmlElement(name = "ModifyRules")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected ServiceRuleType.ModifyRules modifyRules;
    @XmlElement(name = "SecondaryTypeRules")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected ServiceRuleType.SecondaryTypeRules secondaryTypeRules;
    @XmlElement(name = "Remarks")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected List<FormattedTextTextType> remarks;
    @XmlAttribute(name = "Key", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected String key;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the applicationRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ApplicationRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public ServiceRuleType.ApplicationRules getApplicationRules() {
        return applicationRules;
    }

    /**
     * Sets the value of the applicationRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ApplicationRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setApplicationRules(ServiceRuleType.ApplicationRules value) {
        this.applicationRules = value;
    }

    /**
     * Gets the value of the applicationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ApplicationLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public ServiceRuleType.ApplicationLevel getApplicationLevel() {
        return applicationLevel;
    }

    /**
     * Sets the value of the applicationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ApplicationLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setApplicationLevel(ServiceRuleType.ApplicationLevel value) {
        this.applicationLevel = value;
    }

    /**
     * Gets the value of the modifyRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.ModifyRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public ServiceRuleType.ModifyRules getModifyRules() {
        return modifyRules;
    }

    /**
     * Sets the value of the modifyRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.ModifyRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setModifyRules(ServiceRuleType.ModifyRules value) {
        this.modifyRules = value;
    }

    /**
     * Gets the value of the secondaryTypeRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceRuleType.SecondaryTypeRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public ServiceRuleType.SecondaryTypeRules getSecondaryTypeRules() {
        return secondaryTypeRules;
    }

    /**
     * Sets the value of the secondaryTypeRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceRuleType.SecondaryTypeRules }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setSecondaryTypeRules(ServiceRuleType.SecondaryTypeRules value) {
        this.secondaryTypeRules = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remarks property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemarks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public List<FormattedTextTextType> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<FormattedTextTextType>();
        }
        return this.remarks;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }


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
     *         &lt;element name="ApplicationLimits" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicationLimitType" maxOccurs="10"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ServiceData" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ApplicableLevels">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicabilityType" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ProviderDefinedApplicableLevels" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "applicationLimits",
        "serviceData"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ApplicationLevel
        implements Locatable
    {

        @XmlElement(name = "ApplicationLimits")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected ServiceRuleType.ApplicationLevel.ApplicationLimits applicationLimits;
        @XmlElement(name = "ServiceData")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<ServiceData> serviceData;
        @XmlAttribute(name = "ApplicableLevels")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<OptionalServiceApplicabilityType> applicableLevels;
        @XmlAttribute(name = "ProviderDefinedApplicableLevels")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected String providerDefinedApplicableLevels;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the applicationLimits property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public ServiceRuleType.ApplicationLevel.ApplicationLimits getApplicationLimits() {
            return applicationLimits;
        }

        /**
         * Sets the value of the applicationLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRuleType.ApplicationLevel.ApplicationLimits }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setApplicationLimits(ServiceRuleType.ApplicationLevel.ApplicationLimits value) {
            this.applicationLimits = value;
        }

        /**
         * Gets the value of the serviceData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceData }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<ServiceData> getServiceData() {
            if (serviceData == null) {
                serviceData = new ArrayList<ServiceData>();
            }
            return this.serviceData;
        }

        /**
         * Gets the value of the applicableLevels property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the applicableLevels property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApplicableLevels().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OptionalServiceApplicabilityType }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<OptionalServiceApplicabilityType> getApplicableLevels() {
            if (applicableLevels == null) {
                applicableLevels = new ArrayList<OptionalServiceApplicabilityType>();
            }
            return this.applicableLevels;
        }

        /**
         * Gets the value of the providerDefinedApplicableLevels property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String getProviderDefinedApplicableLevels() {
            return providerDefinedApplicableLevels;
        }

        /**
         * Sets the value of the providerDefinedApplicableLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setProviderDefinedApplicableLevels(String value) {
            this.providerDefinedApplicableLevels = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }


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
         *         &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicationLimitType" maxOccurs="10"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicationLimit"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public static class ApplicationLimits
            implements Locatable
        {

            @XmlElement(name = "ApplicationLimit", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected List<OptionalServiceApplicationLimitType> applicationLimit;
            @XmlLocation
            @XmlTransient
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Locator locator;

            /**
             * Gets the value of the applicationLimit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationLimit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplicationLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionalServiceApplicationLimitType }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public List<OptionalServiceApplicationLimitType> getApplicationLimit() {
                if (applicationLimit == null) {
                    applicationLimit = new ArrayList<OptionalServiceApplicationLimitType>();
                }
                return this.applicationLimit;
            }

            /**
             * Generates a String representation of the contents of this type.
             * This is an extension method, produced by the 'ts' xjc plugin
             * 
             */
            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public String toString() {
                return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public Locator sourceLocation() {
                return locator;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setSourceLocation(Locator newLocator) {
                locator = newLocator;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="RequiredForAllTravelers" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RequiredForAllSegments" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RequiredForAllSegmentsInOD" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="UnselectedOptionRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="SecondaryOptionCodeRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ApplicationRules
        implements Locatable
    {

        @XmlAttribute(name = "RequiredForAllTravelers")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Boolean requiredForAllTravelers;
        @XmlAttribute(name = "RequiredForAllSegments")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Boolean requiredForAllSegments;
        @XmlAttribute(name = "RequiredForAllSegmentsInOD")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Boolean requiredForAllSegmentsInOD;
        @XmlAttribute(name = "UnselectedOptionRequired")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Boolean unselectedOptionRequired;
        @XmlAttribute(name = "SecondaryOptionCodeRequired")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Boolean secondaryOptionCodeRequired;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the requiredForAllTravelers property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Boolean isRequiredForAllTravelers() {
            return requiredForAllTravelers;
        }

        /**
         * Sets the value of the requiredForAllTravelers property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setRequiredForAllTravelers(Boolean value) {
            this.requiredForAllTravelers = value;
        }

        /**
         * Gets the value of the requiredForAllSegments property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Boolean isRequiredForAllSegments() {
            return requiredForAllSegments;
        }

        /**
         * Sets the value of the requiredForAllSegments property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setRequiredForAllSegments(Boolean value) {
            this.requiredForAllSegments = value;
        }

        /**
         * Gets the value of the requiredForAllSegmentsInOD property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Boolean isRequiredForAllSegmentsInOD() {
            return requiredForAllSegmentsInOD;
        }

        /**
         * Sets the value of the requiredForAllSegmentsInOD property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setRequiredForAllSegmentsInOD(Boolean value) {
            this.requiredForAllSegmentsInOD = value;
        }

        /**
         * Gets the value of the unselectedOptionRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Boolean isUnselectedOptionRequired() {
            return unselectedOptionRequired;
        }

        /**
         * Sets the value of the unselectedOptionRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setUnselectedOptionRequired(Boolean value) {
            this.unselectedOptionRequired = value;
        }

        /**
         * Gets the value of the secondaryOptionCodeRequired property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Boolean isSecondaryOptionCodeRequired() {
            return secondaryOptionCodeRequired;
        }

        /**
         * Sets the value of the secondaryOptionCodeRequired property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setSecondaryOptionCodeRequired(Boolean value) {
            this.secondaryOptionCodeRequired = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }


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
     *         &lt;element name="ModifyRule" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}ModificationRulesGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="SupportedModifications">
     *         &lt;simpleType>
     *           &lt;list itemType="{http://www.travelport.com/schema/common_v29_0}ModificationType" />
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ProviderDefinedModificationType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "modifyRule"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class ModifyRules
        implements Locatable
    {

        @XmlElement(name = "ModifyRule", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<ServiceRuleType.ModifyRules.ModifyRule> modifyRule;
        @XmlAttribute(name = "SupportedModifications")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<ModificationType> supportedModifications;
        @XmlAttribute(name = "ProviderDefinedModificationType")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected String providerDefinedModificationType;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the modifyRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the modifyRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getModifyRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRuleType.ModifyRules.ModifyRule }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<ServiceRuleType.ModifyRules.ModifyRule> getModifyRule() {
            if (modifyRule == null) {
                modifyRule = new ArrayList<ServiceRuleType.ModifyRules.ModifyRule>();
            }
            return this.modifyRule;
        }

        /**
         * Gets the value of the supportedModifications property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedModifications property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupportedModifications().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModificationType }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<ModificationType> getSupportedModifications() {
            if (supportedModifications == null) {
                supportedModifications = new ArrayList<ModificationType>();
            }
            return this.supportedModifications;
        }

        /**
         * Gets the value of the providerDefinedModificationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String getProviderDefinedModificationType() {
            return providerDefinedModificationType;
        }

        /**
         * Sets the value of the providerDefinedModificationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setProviderDefinedModificationType(String value) {
            this.providerDefinedModificationType = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v29_0}ModificationRulesGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public static class ModifyRule
            implements Locatable
        {

            @XmlAttribute(name = "Modification", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected ModificationType modification;
            @XmlAttribute(name = "AutomaticallyAppliedOnAdd")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Boolean automaticallyAppliedOnAdd;
            @XmlAttribute(name = "CanDelete")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Boolean canDelete;
            @XmlAttribute(name = "CanAdd")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Boolean canAdd;
            @XmlAttribute(name = "Refundable")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Boolean refundable;
            @XmlAttribute(name = "ProviderDefinedModificationType")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected String providerDefinedModificationType;
            @XmlLocation
            @XmlTransient
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Locator locator;

            /**
             * Gets the value of the modification property.
             * 
             * @return
             *     possible object is
             *     {@link ModificationType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public ModificationType getModification() {
                return modification;
            }

            /**
             * Sets the value of the modification property.
             * 
             * @param value
             *     allowed object is
             *     {@link ModificationType }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setModification(ModificationType value) {
                this.modification = value;
            }

            /**
             * Gets the value of the automaticallyAppliedOnAdd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public boolean isAutomaticallyAppliedOnAdd() {
                if (automaticallyAppliedOnAdd == null) {
                    return false;
                } else {
                    return automaticallyAppliedOnAdd;
                }
            }

            /**
             * Sets the value of the automaticallyAppliedOnAdd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setAutomaticallyAppliedOnAdd(Boolean value) {
                this.automaticallyAppliedOnAdd = value;
            }

            /**
             * Gets the value of the canDelete property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public Boolean isCanDelete() {
                return canDelete;
            }

            /**
             * Sets the value of the canDelete property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setCanDelete(Boolean value) {
                this.canDelete = value;
            }

            /**
             * Gets the value of the canAdd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public Boolean isCanAdd() {
                return canAdd;
            }

            /**
             * Sets the value of the canAdd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setCanAdd(Boolean value) {
                this.canAdd = value;
            }

            /**
             * Gets the value of the refundable property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public Boolean isRefundable() {
                return refundable;
            }

            /**
             * Sets the value of the refundable property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setRefundable(Boolean value) {
                this.refundable = value;
            }

            /**
             * Gets the value of the providerDefinedModificationType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public String getProviderDefinedModificationType() {
                return providerDefinedModificationType;
            }

            /**
             * Sets the value of the providerDefinedModificationType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setProviderDefinedModificationType(String value) {
                this.providerDefinedModificationType = value;
            }

            /**
             * Generates a String representation of the contents of this type.
             * This is an extension method, produced by the 'ts' xjc plugin
             * 
             */
            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public String toString() {
                return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public Locator sourceLocation() {
                return locator;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setSourceLocation(Locator newLocator) {
                locator = newLocator;
            }

        }

    }


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
     *         &lt;element name="SecondaryTypeRule" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "secondaryTypeRule"
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public static class SecondaryTypeRules
        implements Locatable
    {

        @XmlElement(name = "SecondaryTypeRule", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected List<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule> secondaryTypeRule;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        protected Locator locator;

        /**
         * Gets the value of the secondaryTypeRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondaryTypeRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecondaryTypeRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule }
         * 
         * 
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public List<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule> getSecondaryTypeRule() {
            if (secondaryTypeRule == null) {
                secondaryTypeRule = new ArrayList<ServiceRuleType.SecondaryTypeRules.SecondaryTypeRule>();
            }
            return this.secondaryTypeRule;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }


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
         *         &lt;element name="ApplicationLimit" type="{http://www.travelport.com/schema/common_v29_0}OptionalServiceApplicationLimitType" maxOccurs="10" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="SecondaryType" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeRef" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "applicationLimit"
        })
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
        public static class SecondaryTypeRule
            implements Locatable
        {

            @XmlElement(name = "ApplicationLimit")
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected List<OptionalServiceApplicationLimitType> applicationLimit;
            @XmlAttribute(name = "SecondaryType", required = true)
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected String secondaryType;
            @XmlLocation
            @XmlTransient
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            protected Locator locator;

            /**
             * Gets the value of the applicationLimit property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the applicationLimit property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getApplicationLimit().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OptionalServiceApplicationLimitType }
             * 
             * 
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public List<OptionalServiceApplicationLimitType> getApplicationLimit() {
                if (applicationLimit == null) {
                    applicationLimit = new ArrayList<OptionalServiceApplicationLimitType>();
                }
                return this.applicationLimit;
            }

            /**
             * Gets the value of the secondaryType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public String getSecondaryType() {
                return secondaryType;
            }

            /**
             * Sets the value of the secondaryType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setSecondaryType(String value) {
                this.secondaryType = value;
            }

            /**
             * Generates a String representation of the contents of this type.
             * This is an extension method, produced by the 'ts' xjc plugin
             * 
             */
            @Override
            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public String toString() {
                return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public Locator sourceLocation() {
                return locator;
            }

            @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
            public void setSourceLocation(Locator newLocator) {
                locator = newLocator;
            }

        }

    }

}
