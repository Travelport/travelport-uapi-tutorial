
package com.travelport.schema.air_v35_0;

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
 * &lt;simpleType name="typeTripType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cheapest"/&gt;
 *     &lt;enumeration value="Quickest"/&gt;
 *     &lt;enumeration value="MostConvenient"/&gt;
 *     &lt;enumeration value="Leisure"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Luxury"/&gt;
 *     &lt;enumeration value="PreferFirst"/&gt;
 *     &lt;enumeration value="BusinessOrFirst"/&gt;
 *     &lt;enumeration value="NoPenalty"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeTripType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-08T01:24:05-06:00", comment = "JAXB RI v2.2.11")
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
