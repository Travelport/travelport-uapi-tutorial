
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v29_0.BaseReq;
import com.travelport.schema.common_v29_0.TypeProviderReservationDetail;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseReq">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}ProviderReservationDetail"/>
 *         &lt;element ref="{http://www.travelport.com/schema/common_v29_0}TicketNumber" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}IssuanceModifiers" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}SelectionModifiers" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UniversalRecordLocatorCode" use="required" type="{http://www.travelport.com/schema/common_v29_0}typeLocatorCode" />
 *       &lt;attribute name="ShowDetails" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "providerReservationDetail",
    "ticketNumber",
    "issuanceModifiers",
    "selectionModifiers"
})
@XmlRootElement(name = "EMDIssuanceReq")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public class EMDIssuanceReq
    extends BaseReq
{

    @XmlElement(name = "ProviderReservationDetail", namespace = "http://www.travelport.com/schema/common_v29_0", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected TypeProviderReservationDetail providerReservationDetail;
    @XmlElement(name = "TicketNumber", namespace = "http://www.travelport.com/schema/common_v29_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected String ticketNumber;
    @XmlElement(name = "IssuanceModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected IssuanceModifiers issuanceModifiers;
    @XmlElement(name = "SelectionModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected SelectionModifiers selectionModifiers;
    @XmlAttribute(name = "UniversalRecordLocatorCode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected String universalRecordLocatorCode;
    @XmlAttribute(name = "ShowDetails")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    protected Boolean showDetails;

    /**
     * PNR information for which EMD is going to be issued.
     * 
     * @return
     *     possible object is
     *     {@link TypeProviderReservationDetail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public TypeProviderReservationDetail getProviderReservationDetail() {
        return providerReservationDetail;
    }

    /**
     * Sets the value of the providerReservationDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeProviderReservationDetail }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setProviderReservationDetail(TypeProviderReservationDetail value) {
        this.providerReservationDetail = value;
    }

    /**
     * Ticket number for which EMD is going to be issued.Required for EMD-A issuance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

    /**
     * General modifiers related to EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link IssuanceModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public IssuanceModifiers getIssuanceModifiers() {
        return issuanceModifiers;
    }

    /**
     * Sets the value of the issuanceModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuanceModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setIssuanceModifiers(IssuanceModifiers value) {
        this.issuanceModifiers = value;
    }

    /**
     * Modifiers related to selection of services during EMD issuance.
     * 
     * @return
     *     possible object is
     *     {@link SelectionModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public SelectionModifiers getSelectionModifiers() {
        return selectionModifiers;
    }

    /**
     * Sets the value of the selectionModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setSelectionModifiers(SelectionModifiers value) {
        this.selectionModifiers = value;
    }

    /**
     * Gets the value of the universalRecordLocatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setUniversalRecordLocatorCode(String value) {
        this.universalRecordLocatorCode = value;
    }

    /**
     * Gets the value of the showDetails property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public boolean isShowDetails() {
        if (showDetails == null) {
            return false;
        } else {
            return showDetails;
        }
    }

    /**
     * Sets the value of the showDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
    public void setShowDetails(Boolean value) {
        this.showDetails = value;
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

}
