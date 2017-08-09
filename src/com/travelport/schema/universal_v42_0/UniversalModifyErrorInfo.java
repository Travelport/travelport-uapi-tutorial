
package com.travelport.schema.universal_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.air_v42_0.AirSegmentError;
import com.travelport.schema.common_v42_0.TypeErrorInfo;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v42_0}typeErrorInfo"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v42_0}UniversalModifyCommandError" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/air_v42_0}AirSegmentError" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "universalModifyCommandError",
    "airSegmentError"
})
@XmlRootElement(name = "UniversalModifyErrorInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
public class UniversalModifyErrorInfo
    extends TypeErrorInfo
{

    @XmlElement(name = "UniversalModifyCommandError")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<UniversalModifyCommandError> universalModifyCommandError;
    @XmlElement(name = "AirSegmentError", namespace = "http://www.travelport.com/schema/air_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<AirSegmentError> airSegmentError;

    /**
     * Gets the value of the universalModifyCommandError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the universalModifyCommandError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUniversalModifyCommandError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UniversalModifyCommandError }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<UniversalModifyCommandError> getUniversalModifyCommandError() {
        if (universalModifyCommandError == null) {
            universalModifyCommandError = new ArrayList<UniversalModifyCommandError>();
        }
        return this.universalModifyCommandError;
    }

    /**
     * Gets the value of the airSegmentError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airSegmentError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirSegmentError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirSegmentError }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<AirSegmentError> getAirSegmentError() {
        if (airSegmentError == null) {
            airSegmentError = new ArrayList<AirSegmentError>();
        }
        return this.airSegmentError;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
