
package com.travelport.schema.air_v26_0;

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
import com.travelport.schema.common_v26_0.TypeFlexibleTimeSpec;
import com.travelport.schema.common_v26_0.TypeSearchLocation;
import com.travelport.schema.common_v26_0.TypeTimeSpec;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SearchOrigin" type="{http://www.travelport.com/schema/common_v26_0}typeSearchLocation" maxOccurs="unbounded"/>
 *         &lt;element name="SearchDestination" type="{http://www.travelport.com/schema/common_v26_0}typeSearchLocation" maxOccurs="unbounded"/>
 *         &lt;choice>
 *           &lt;element name="SearchDepTime" type="{http://www.travelport.com/schema/common_v26_0}typeFlexibleTimeSpec" maxOccurs="unbounded"/>
 *           &lt;element name="SearchArvTime" type="{http://www.travelport.com/schema/common_v26_0}typeTimeSpec" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.travelport.com/schema/air_v26_0}AirLegModifiers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "searchOrigin",
    "searchDestination",
    "searchDepTime",
    "searchArvTime",
    "airLegModifiers"
})
@XmlRootElement(name = "SearchAirLeg")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
public class SearchAirLeg
    implements Locatable
{

    @XmlElement(name = "SearchOrigin", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<TypeSearchLocation> searchOrigin;
    @XmlElement(name = "SearchDestination", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<TypeSearchLocation> searchDestination;
    @XmlElement(name = "SearchDepTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<TypeFlexibleTimeSpec> searchDepTime;
    @XmlElement(name = "SearchArvTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected List<TypeTimeSpec> searchArvTime;
    @XmlElement(name = "AirLegModifiers")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected AirLegModifiers airLegModifiers;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    protected Locator locator;

    /**
     * Gets the value of the searchOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSearchLocation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<TypeSearchLocation> getSearchOrigin() {
        if (searchOrigin == null) {
            searchOrigin = new ArrayList<TypeSearchLocation>();
        }
        return this.searchOrigin;
    }

    /**
     * Gets the value of the searchDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeSearchLocation }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<TypeSearchLocation> getSearchDestination() {
        if (searchDestination == null) {
            searchDestination = new ArrayList<TypeSearchLocation>();
        }
        return this.searchDestination;
    }

    /**
     * Gets the value of the searchDepTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchDepTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchDepTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeFlexibleTimeSpec }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<TypeFlexibleTimeSpec> getSearchDepTime() {
        if (searchDepTime == null) {
            searchDepTime = new ArrayList<TypeFlexibleTimeSpec>();
        }
        return this.searchDepTime;
    }

    /**
     * Gets the value of the searchArvTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchArvTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchArvTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeTimeSpec }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public List<TypeTimeSpec> getSearchArvTime() {
        if (searchArvTime == null) {
            searchArvTime = new ArrayList<TypeTimeSpec>();
        }
        return this.searchArvTime;
    }

    /**
     * Gets the value of the airLegModifiers property.
     * 
     * @return
     *     possible object is
     *     {@link AirLegModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public AirLegModifiers getAirLegModifiers() {
        return airLegModifiers;
    }

    /**
     * Sets the value of the airLegModifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirLegModifiers }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
    public void setAirLegModifiers(AirLegModifiers value) {
        this.airLegModifiers = value;
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
