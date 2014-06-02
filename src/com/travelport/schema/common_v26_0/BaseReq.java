
package com.travelport.schema.common_v26_0;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;

import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.universal_v26_0.AckScheduleChangeReq;
import com.travelport.schema.universal_v26_0.AirCancelReq;
import com.travelport.schema.universal_v26_0.AirMerchandisingFulfillmentReq;
import com.travelport.schema.universal_v26_0.HotelCancelReq;
import com.travelport.schema.universal_v26_0.PassiveCancelReq;
import com.travelport.schema.universal_v26_0.ProviderReservationDisplayDetailsReq;
import com.travelport.schema.universal_v26_0.ProviderReservationDivideReq;
import com.travelport.schema.universal_v26_0.SavedTripCreateReq;
import com.travelport.schema.universal_v26_0.SavedTripDeleteReq;
import com.travelport.schema.universal_v26_0.SavedTripModifyReq;
import com.travelport.schema.universal_v26_0.SavedTripRetrieveReq;
import com.travelport.schema.universal_v26_0.SavedTripSearchReq;
import com.travelport.schema.universal_v26_0.UniversalRecordCancelReq;
import com.travelport.schema.universal_v26_0.UniversalRecordHistorySearchReq;
import com.travelport.schema.universal_v26_0.UniversalRecordImportReq;
import com.travelport.schema.universal_v26_0.UniversalRecordModifyReq;
import com.travelport.schema.universal_v26_0.UniversalRecordRetrieveReq;
import com.travelport.schema.universal_v26_0.UniversalRecordSearchReq;
import com.travelport.schema.universal_v26_0.VehicleCancelReq;


/**
 * <p>Java class for BaseReq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseReq">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}BillingPointOfSaleInfo"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}AgentIDOverride" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}TerminalSessionInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v26_0}OverridePCC" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TraceId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TokenId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuthorizedBy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetBranch" type="{http://www.travelport.com/schema/common_v26_0}typeBranchCode" />
 *       &lt;attribute name="OverrideLogging" type="{http://www.travelport.com/schema/common_v26_0}typeLoggingLevel" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseReq", propOrder = {
    "billingPointOfSaleInfo",
    "agentIDOverride",
    "terminalSessionInfo",
    "overridePCC"
})
@XmlSeeAlso({
    BaseSearchReq.class,
    SavedTripRetrieveReq.class,
    ProviderReservationDisplayDetailsReq.class,
    AirCancelReq.class,
    HotelCancelReq.class,
    PassiveCancelReq.class,
    AirMerchandisingFulfillmentReq.class,
    ProviderReservationDivideReq.class,
    SavedTripModifyReq.class,
    UniversalRecordHistorySearchReq.class,
    VehicleCancelReq.class,
    UniversalRecordSearchReq.class,
    SavedTripDeleteReq.class,
    SavedTripSearchReq.class,
    UniversalRecordImportReq.class,
    SavedTripCreateReq.class,
    UniversalRecordCancelReq.class,
    UniversalRecordRetrieveReq.class,
    BaseCreateReservationReq.class,
    AckScheduleChangeReq.class,
    UniversalRecordModifyReq.class
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class BaseReq
    implements Locatable
{

    @XmlElement(name = "BillingPointOfSaleInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected BillingPointOfSaleInfo billingPointOfSaleInfo;
    @XmlElement(name = "AgentIDOverride")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<AgentIDOverride> agentIDOverride;
    @XmlElement(name = "TerminalSessionInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String terminalSessionInfo;
    @XmlElement(name = "OverridePCC")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected OverridePCC overridePCC;
    @XmlAttribute(name = "TraceId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String traceId;
    @XmlAttribute(name = "TokenId")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String tokenId;
    @XmlAttribute(name = "AuthorizedBy")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String authorizedBy;
    @XmlAttribute(name = "TargetBranch")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected String targetBranch;
    @XmlAttribute(name = "OverrideLogging")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected TypeLoggingLevel overrideLogging;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the billingPointOfSaleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public BillingPointOfSaleInfo getBillingPointOfSaleInfo() {
        return billingPointOfSaleInfo;
    }

    /**
     * Sets the value of the billingPointOfSaleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingPointOfSaleInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setBillingPointOfSaleInfo(BillingPointOfSaleInfo value) {
        this.billingPointOfSaleInfo = value;
    }

    /**
     * Gets the value of the agentIDOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentIDOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentIDOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentIDOverride }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<AgentIDOverride> getAgentIDOverride() {
        if (agentIDOverride == null) {
            agentIDOverride = new ArrayList<AgentIDOverride>();
        }
        return this.agentIDOverride;
    }

    /**
     * Gets the value of the terminalSessionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getTerminalSessionInfo() {
        return terminalSessionInfo;
    }

    /**
     * Sets the value of the terminalSessionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTerminalSessionInfo(String value) {
        this.terminalSessionInfo = value;
    }

    /**
     * Gets the value of the overridePCC property.
     * 
     * @return
     *     possible object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public OverridePCC getOverridePCC() {
        return overridePCC;
    }

    /**
     * Sets the value of the overridePCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverridePCC }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setOverridePCC(OverridePCC value) {
        this.overridePCC = value;
    }

    /**
     * Gets the value of the traceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTraceId(String value) {
        this.traceId = value;
    }

    /**
     * Gets the value of the tokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getTokenId() {
        return tokenId;
    }

    /**
     * Sets the value of the tokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTokenId(String value) {
        this.tokenId = value;
    }

    /**
     * Gets the value of the authorizedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getAuthorizedBy() {
        return authorizedBy;
    }

    /**
     * Sets the value of the authorizedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAuthorizedBy(String value) {
        this.authorizedBy = value;
    }

    /**
     * Gets the value of the targetBranch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String getTargetBranch() {
        return targetBranch;
    }

    /**
     * Sets the value of the targetBranch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setTargetBranch(String value) {
        this.targetBranch = value;
    }

    /**
     * Gets the value of the overrideLogging property.
     * 
     * @return
     *     possible object is
     *     {@link TypeLoggingLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public TypeLoggingLevel getOverrideLogging() {
        return overrideLogging;
    }

    /**
     * Sets the value of the overrideLogging property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeLoggingLevel }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setOverrideLogging(TypeLoggingLevel value) {
        this.overrideLogging = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
