
package com.travelport.schema.universal_v38_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v38_0.AirSegmentSellFailureInfo;
import com.travelport.schema.air_v38_0.AirSolutionChangedInfo;
import com.travelport.schema.common_v38_0.BaseRsp;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.travelport.com/schema/common_v38_0}BaseRsp"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v38_0}UniversalRecord" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}AirSolutionChangedInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v38_0}AirSegmentSellFailureInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "universalRecord",
    "airSolutionChangedInfo",
    "airSegmentSellFailureInfo"
})
@XmlRootElement(name = "AirCreateReservationRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
public class AirCreateReservationRsp
    extends BaseRsp
{

    @XmlElement(name = "UniversalRecord")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected UniversalRecord universalRecord;
    @XmlElement(name = "AirSolutionChangedInfo", namespace = "http://www.travelport.com/schema/air_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected List<AirSolutionChangedInfo> airSolutionChangedInfo;
    @XmlElement(name = "AirSegmentSellFailureInfo", namespace = "http://www.travelport.com/schema/air_v38_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    protected AirSegmentSellFailureInfo airSegmentSellFailureInfo;

    /**
     * Gets the value of the universalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link UniversalRecord }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public void setUniversalRecord(UniversalRecord value) {
        this.universalRecord = value;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.Gets the value of the airSolutionChangedInfo property.
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public List<AirSolutionChangedInfo> getAirSolutionChangedInfo() {
        if (airSolutionChangedInfo == null) {
            airSolutionChangedInfo = new ArrayList<AirSolutionChangedInfo>();
        }
        return this.airSolutionChangedInfo;
    }

    /**
     * Provider: 1G,1V,1P,1J,ACH.
     * 
     * @return
     *     possible object is
     *     {@link AirSegmentSellFailureInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public AirSegmentSellFailureInfo getAirSegmentSellFailureInfo() {
        return airSegmentSellFailureInfo;
    }

    /**
     * Sets the value of the airSegmentSellFailureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirSegmentSellFailureInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:38:31-06:00", comment = "JAXB RI v2.2.11")
    public void setAirSegmentSellFailureInfo(AirSegmentSellFailureInfo value) {
        this.airSegmentSellFailureInfo = value;
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

}
