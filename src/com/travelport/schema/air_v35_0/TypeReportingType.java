
package com.travelport.schema.air_v35_0;

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
 * &lt;simpleType name="typeReportingType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AvailabilityFailure"/&gt;
 *     &lt;enumeration value="PriceDiscrepancies"/&gt;
 *     &lt;enumeration value="MarriageDiscrepancies"/&gt;
 *     &lt;enumeration value="Success"/&gt;
 *     &lt;enumeration value="ScheduleDiscrepancies"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeReportingType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-05-15T12:41:43-06:00", comment = "JAXB RI v2.2.11")
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
