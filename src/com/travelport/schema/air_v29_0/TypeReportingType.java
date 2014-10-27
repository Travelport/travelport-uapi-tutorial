
package com.travelport.schema.air_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeReportingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeReportingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AvailabilityFailure"/>
 *     &lt;enumeration value="PriceDiscrepancies"/>
 *     &lt;enumeration value="MarriageDiscrepancies"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="ScheduleDiscrepancies"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeReportingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:10:02-06:00", comment = "JAXB RI v2.2.6")
public enum TypeReportingType {

    @XmlEnumValue("AvailabilityFailure")
    AVAILABILITY_FAILURE("AvailabilityFailure"),
    @XmlEnumValue("PriceDiscrepancies")
    PRICE_DISCREPANCIES("PriceDiscrepancies"),
    @XmlEnumValue("MarriageDiscrepancies")
    MARRIAGE_DISCREPANCIES("MarriageDiscrepancies"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("ScheduleDiscrepancies")
    SCHEDULE_DISCREPANCIES("ScheduleDiscrepancies");
    private final String value;

    TypeReportingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeReportingType fromValue(String v) {
        for (TypeReportingType c: TypeReportingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
