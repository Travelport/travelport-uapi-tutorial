
package com.travelport.schema.universal_v38_0;

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
import com.travelport.schema.common_v38_0.BaseReq;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseReq"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UniversalRecordLocatorCode" type="{http://www.travelport.com/schema/common_v38_0}typeLocatorCode"/&gt;
 *         &lt;element name="ProviderReservationInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attGroup ref="{http://www.travelport.com/schema/common_v38_0}ProviderReservation"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ViewOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="TravelerLastName" type="{http://www.travelport.com/schema/common_v38_0}typeTravelerLastName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecordLocatorCode",
    "providerReservationInfo"
})
@XmlRootElement(name = "UniversalRecordRetrieveReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
public class UniversalRecordRetrieveReq
    extends BaseReq
{

    @XmlElement(name = "UniversalRecordLocatorCode")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected String universalRecordLocatorCode;
    @XmlElement(name = "ProviderReservationInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected UniversalRecordRetrieveReq.ProviderReservationInfo providerReservationInfo;
    @XmlAttribute(name = "ViewOnlyInd")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean viewOnlyInd;
    @XmlAttribute(name = "TravelerLastName")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected String travelerLastName;

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public String getUniversalRecordLocatorCode() {
        return universalRecordLocatorCode;
    }

    /**
     * Sets the value of the universalRecordLocatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the providerReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecordRetrieveReq.ProviderReservationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public UniversalRecordRetrieveReq.ProviderReservationInfo getProviderReservationInfo() {
        return providerReservationInfo;
    }

    /**
     * Sets the value of the providerReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecordRetrieveReq.ProviderReservationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public void setProviderReservationInfo(UniversalRecordRetrieveReq.ProviderReservationInfo value) {
        this.providerReservationInfo = value;
    }

    /**
     * Gets the value of the viewOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public boolean isViewOnlyInd() {
        if (viewOnlyInd == null) {
            return false;
        } else {
            return viewOnlyInd;
        }
    }

    /**
     * Sets the value of the viewOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public void setViewOnlyInd(Boolean value) {
        this.viewOnlyInd = value;
    }

    /**
     * Gets the value of the travelerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public String getTravelerLastName() {
        return travelerLastName;
    }

    /**
     * Sets the value of the travelerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public void setTravelerLastName(String value) {
        this.travelerLastName = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attGroup ref="{http://www.travelport.com/schema/common_v38_0}ProviderReservation"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public static class ProviderReservationInfo
        implements Locatable
    {

        @XmlAttribute(name = "ProviderCode", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        protected String providerCode;
        @XmlAttribute(name = "ProviderLocatorCode", required = true)
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        protected String providerLocatorCode;
        @XmlLocation
        @XmlTransient
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        protected Locator locator;

        /**
         * Gets the value of the providerCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public String getProviderCode() {
            return providerCode;
        }

        /**
         * Sets the value of the providerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public void setProviderCode(String value) {
            this.providerCode = value;
        }

        /**
         * Gets the value of the providerLocatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public String getProviderLocatorCode() {
            return providerLocatorCode;
        }

        /**
         * Sets the value of the providerLocatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public void setProviderLocatorCode(String value) {
            this.providerLocatorCode = value;
        }

        /**
         * Generates a String representation of the contents of this type.
         * This is an extension method, produced by the 'ts' xjc plugin
         * 
         */
        @Override
        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public String toString() {
            return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public Locator sourceLocation() {
            return locator;
        }

        @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
        public void setSourceLocation(Locator newLocator) {
            locator = newLocator;
        }

    }

}
