
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeTripType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeTripType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cheapest"/>
 *     &lt;enumeration value="Quickest"/>
 *     &lt;enumeration value="MostConvenient"/>
 *     &lt;enumeration value="Leisure"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Luxury"/>
 *     &lt;enumeration value="PreferFirst"/>
 *     &lt;enumeration value="BusinessOrFirst"/>
 *     &lt;enumeration value="NoPenalty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeTripType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeTripType {

    @XmlEnumValue("Cheapest")
    CHEAPEST("Cheapest"),
    @XmlEnumValue("Quickest")
    QUICKEST("Quickest"),
    @XmlEnumValue("MostConvenient")
    MOST_CONVENIENT("MostConvenient"),
    @XmlEnumValue("Leisure")
    LEISURE("Leisure"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Luxury")
    LUXURY("Luxury"),
    @XmlEnumValue("PreferFirst")
    PREFER_FIRST("PreferFirst"),
    @XmlEnumValue("BusinessOrFirst")
    BUSINESS_OR_FIRST("BusinessOrFirst"),
    @XmlEnumValue("NoPenalty")
    NO_PENALTY("NoPenalty");
    private final String value;

    TypeTripType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeTripType fromValue(String v) {
        for (TypeTripType c: TypeTripType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
