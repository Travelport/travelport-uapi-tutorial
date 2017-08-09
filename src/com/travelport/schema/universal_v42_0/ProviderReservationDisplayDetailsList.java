
package com.travelport.schema.universal_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v42_0}DisplayDetails" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/universal_v42_0}TravelerNameNum" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "displayDetails",
    "travelerNameNum"
})
@XmlRootElement(name = "ProviderReservationDisplayDetailsList")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
public class ProviderReservationDisplayDetailsList
    implements Locatable
{

    @XmlElement(name = "DisplayDetails", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<DisplayDetails> displayDetails;
    @XmlElement(name = "TravelerNameNum")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected List<TravelerNameNum> travelerNameNum;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the displayDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisplayDetails }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<DisplayDetails> getDisplayDetails() {
        if (displayDetails == null) {
            displayDetails = new ArrayList<DisplayDetails>();
        }
        return this.displayDetails;
    }

    /**
     * Gets the value of the travelerNameNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerNameNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerNameNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerNameNum }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public List<TravelerNameNum> getTravelerNameNum() {
        if (travelerNameNum == null) {
            travelerNameNum = new ArrayList<TravelerNameNum>();
        }
        return this.travelerNameNum;
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

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:55:59-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
