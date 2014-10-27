
package com.travelport.schema.universal_v29_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v29_0.AirSolutionChangedInfo;
import com.travelport.schema.common_v29_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v29_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v29_0}UniversalRecord" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v29_0}AirSolutionChangedInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v29_0}UniversalModifyFailureInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="QueueSessionToken" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecord",
    "airSolutionChangedInfo",
    "universalModifyFailureInfo"
})
@XmlRootElement(name = "UniversalRecordModifyRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
public class UniversalRecordModifyRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected UniversalRecord universalRecord;
    @XmlElement(name = "AirSolutionChangedInfo", namespace = "http://www.travelport.com/schema/air_v29_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected List<AirSolutionChangedInfo> airSolutionChangedInfo;
    @XmlElement(name = "UniversalModifyFailureInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected UniversalModifyFailureInfo universalModifyFailureInfo;
    @XmlAttribute(name = "QueueSessionToken")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected String queueSessionToken;

    /**
     * Gets the value of the universalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecord }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public UniversalRecord getUniversalRecord() {
        return universalRecord;
    }

    /**
     * Sets the value of the universalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalRecord }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setUniversalRecord(UniversalRecord value) {
        this.universalRecord = value;
    }

    /**
     * Gets the value of the airSolutionChangedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSolutionChangedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSolutionChangedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSolutionChangedInfo }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public List<AirSolutionChangedInfo> getAirSolutionChangedInfo() {
        if (airSolutionChangedInfo == null) {
            airSolutionChangedInfo = new ArrayList<AirSolutionChangedInfo>();
        }
        return this.airSolutionChangedInfo;
    }

    /**
     * Gets the value of the universalModifyFailureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalModifyFailureInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public UniversalModifyFailureInfo getUniversalModifyFailureInfo() {
        return universalModifyFailureInfo;
    }

    /**
     * Sets the value of the universalModifyFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniversalModifyFailureInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setUniversalModifyFailureInfo(UniversalModifyFailureInfo value) {
        this.universalModifyFailureInfo = value;
    }

    /**
     * Gets the value of the queueSessionToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public String getQueueSessionToken() {
        return queueSessionToken;
    }

    /**
     * Sets the value of the queueSessionToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setQueueSessionToken(String value) {
        this.queueSessionToken = value;
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

}
