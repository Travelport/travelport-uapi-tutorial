
package com.travelport.schema.hotel_v17_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeHotelRateCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeHotelRateCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Standard"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Government"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="SeniorCitizen"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Weekend"/>
 *     &lt;enumeration value="Package"/>
 *     &lt;enumeration value="FamilyPlan"/>
 *     &lt;enumeration value="Association"/>
 *     &lt;enumeration value="Tour"/>
 *     &lt;enumeration value="Convention"/>
 *     &lt;enumeration value="Industry"/>
 *     &lt;enumeration value="Club"/>
 *     &lt;enumeration value="Negotiated"/>
 *     &lt;enumeration value="All"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeHotelRateCategory")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum TypeHotelRateCategory {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Government")
    GOVERNMENT("Government"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("SeniorCitizen")
    SENIOR_CITIZEN("SeniorCitizen"),
    @XmlEnumValue("Special")
    SPECIAL("Special"),
    @XmlEnumValue("Weekend")
    WEEKEND("Weekend"),
    @XmlEnumValue("Package")
    PACKAGE("Package"),
    @XmlEnumValue("FamilyPlan")
    FAMILY_PLAN("FamilyPlan"),
    @XmlEnumValue("Association")
    ASSOCIATION("Association"),
    @XmlEnumValue("Tour")
    TOUR("Tour"),
    @XmlEnumValue("Convention")
    CONVENTION("Convention"),
    @XmlEnumValue("Industry")
    INDUSTRY("Industry"),
    @XmlEnumValue("Club")
    CLUB("Club"),
    @XmlEnumValue("Negotiated")
    NEGOTIATED("Negotiated"),
    @XmlEnumValue("All")
    ALL("All");
    private final String value;

    TypeHotelRateCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeHotelRateCategory fromValue(String v) {
        for (TypeHotelRateCategory c: TypeHotelRateCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
