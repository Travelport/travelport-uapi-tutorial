
package com.travelport.schema.universal_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
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
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v29_0}ParentProviderReservationInfo"/>
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v29_0}ChildProviderReservationInfo"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parentProviderReservationInfo",
    "childProviderReservationInfo"
})
@XmlRootElement(name = "ProviderReservationDivideRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
public class ProviderReservationDivideRsp
    extends BaseRsp
{

    @XmlElement(name = "ParentProviderReservationInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected ParentProviderReservationInfo parentProviderReservationInfo;
    @XmlElement(name = "ChildProviderReservationInfo", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    protected ChildProviderReservationInfo childProviderReservationInfo;

    /**
     * Gets the value of the parentProviderReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParentProviderReservationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public ParentProviderReservationInfo getParentProviderReservationInfo() {
        return parentProviderReservationInfo;
    }

    /**
     * Sets the value of the parentProviderReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentProviderReservationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setParentProviderReservationInfo(ParentProviderReservationInfo value) {
        this.parentProviderReservationInfo = value;
    }

    /**
     * Gets the value of the childProviderReservationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ChildProviderReservationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public ChildProviderReservationInfo getChildProviderReservationInfo() {
        return childProviderReservationInfo;
    }

    /**
     * Sets the value of the childProviderReservationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChildProviderReservationInfo }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:06-06:00", comment = "JAXB RI v2.2.6")
    public void setChildProviderReservationInfo(ChildProviderReservationInfo value) {
        this.childProviderReservationInfo = value;
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
