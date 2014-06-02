
package com.travelport.schema.air_v26_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.travelport.schema.common_v26_0.BaseRsp;
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
 *     &lt;extension base="{http://www.travelport.com/schema/common_v26_0}BaseRsp">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}AirRefundBundle" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}TCRRefundBundle" maxOccurs="unbounded" minOccurs="0"/>
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
    "airRefundBundle",
    "tcrRefundBundle"
})
@XmlRootElement(name = "AirRefundQuoteRsp")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
public class AirRefundQuoteRsp
    extends BaseRsp
{

    @XmlElement(name = "AirRefundBundle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected List<AirRefundBundle> airRefundBundle;
    @XmlElement(name = "TCRRefundBundle")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    protected List<TCRRefundBundle> tcrRefundBundle;

    /**
     * Gets the value of the airRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirRefundBundle }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public List<AirRefundBundle> getAirRefundBundle() {
        if (airRefundBundle == null) {
            airRefundBundle = new ArrayList<AirRefundBundle>();
        }
        return this.airRefundBundle;
    }

    /**
     * Provider: ACH.Gets the value of the tcrRefundBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tcrRefundBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTCRRefundBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCRRefundBundle }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public List<TCRRefundBundle> getTCRRefundBundle() {
        if (tcrRefundBundle == null) {
            tcrRefundBundle = new ArrayList<TCRRefundBundle>();
        }
        return this.tcrRefundBundle;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T10:46:24-06:00", comments = "JAXB RI v2.2.6")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

}
