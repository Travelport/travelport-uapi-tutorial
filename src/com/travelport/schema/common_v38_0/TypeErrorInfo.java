
package com.travelport.schema.common_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.air_v38_0.AvailabilityErrorInfo;
import com.travelport.schema.universal_v38_0.UniversalModifyErrorInfo;
import com.travelport.schema.universal_v38_0.UniversalRecordErrorInfo;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * Container for error data when there is an application error.
 * 
 * <p>Java class for typeErrorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="typeErrorInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CommandHistory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v38_0}Auxdata" minOccurs="0"/&gt;
 *         &lt;element name="StackTrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "typeErrorInfo", propOrder = {
    "code",
    "service",
    "type",
    "description",
    "transactionId",
    "traceId",
    "commandHistory",
    "auxdata",
    "stackTrace"
})
@XmlSeeAlso({
    ErrorInfo.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
public class TypeErrorInfo
    implements Locatable
{

    @XmlElement(name = "Code", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String code;
    @XmlElement(name = "Service", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String service;
    @XmlElement(name = "Type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String type;
    @XmlElement(name = "Description", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String description;
    @XmlElement(name = "TransactionId", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String transactionId;
    @XmlElement(name = "TraceId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String traceId;
    @XmlElement(name = "CommandHistory")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String commandHistory;
    @XmlElement(name = "Auxdata")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected Auxdata auxdata;
    @XmlElement(name = "StackTrace")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected String stackTrace;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String getTraceId() {
        return traceId;
    }

    /**
     * Sets the value of the traceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the commandHistory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String getCommandHistory() {
        return commandHistory;
    }

    /**
     * Sets the value of the commandHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setCommandHistory(String value) {
        this.commandHistory = value;
    }

    /**
     * Gets the value of the auxdata property.
     * 
     * @return
     *     possible object is
     *     {@link Auxdata }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public Auxdata getAuxdata() {
        return auxdata;
    }

    /**
     * Sets the value of the auxdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Auxdata }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setAuxdata(Auxdata value) {
        this.auxdata = value;
    }

    /**
     * Gets the value of the stackTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String getStackTrace() {
        return stackTrace;
    }

    /**
     * Sets the value of the stackTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:40:15-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
