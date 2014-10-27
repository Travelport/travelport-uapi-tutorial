
package com.travelport.schema.vehicle_v29_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeVehicleDisclaimer.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeVehicleDisclaimer">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Vehicles"/>
 *     &lt;enumeration value="Shuttle"/>
 *     &lt;enumeration value="AgeRequirements"/>
 *     &lt;enumeration value="AddlDriverInfo"/>
 *     &lt;enumeration value="AddlDriverFees"/>
 *     &lt;enumeration value="Payment"/>
 *     &lt;enumeration value="Guarantee"/>
 *     &lt;enumeration value="Deposit"/>
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="License"/>
 *     &lt;enumeration value="Pickup"/>
 *     &lt;enumeration value="DropOff"/>
 *     &lt;enumeration value="Fuel"/>
 *     &lt;enumeration value="Geographic"/>
 *     &lt;enumeration value="Liabilities"/>
 *     &lt;enumeration value="SpecialEquipment"/>
 *     &lt;enumeration value="Insurance"/>
 *     &lt;enumeration value="Eligibility"/>
 *     &lt;enumeration value="Fees"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleDisclaimer")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-09-19T03:08:59-06:00", comment = "JAXB RI v2.2.6")
public enum TypeVehicleDisclaimer {

    @XmlEnumValue("Vehicles")
    VEHICLES("Vehicles"),
    @XmlEnumValue("Shuttle")
    SHUTTLE("Shuttle"),
    @XmlEnumValue("AgeRequirements")
    AGE_REQUIREMENTS("AgeRequirements"),
    @XmlEnumValue("AddlDriverInfo")
    ADDL_DRIVER_INFO("AddlDriverInfo"),
    @XmlEnumValue("AddlDriverFees")
    ADDL_DRIVER_FEES("AddlDriverFees"),
    @XmlEnumValue("Payment")
    PAYMENT("Payment"),
    @XmlEnumValue("Guarantee")
    GUARANTEE("Guarantee"),
    @XmlEnumValue("Deposit")
    DEPOSIT("Deposit"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),
    @XmlEnumValue("License")
    LICENSE("License"),
    @XmlEnumValue("Pickup")
    PICKUP("Pickup"),
    @XmlEnumValue("DropOff")
    DROP_OFF("DropOff"),
    @XmlEnumValue("Fuel")
    FUEL("Fuel"),
    @XmlEnumValue("Geographic")
    GEOGRAPHIC("Geographic"),
    @XmlEnumValue("Liabilities")
    LIABILITIES("Liabilities"),
    @XmlEnumValue("SpecialEquipment")
    SPECIAL_EQUIPMENT("SpecialEquipment"),
    @XmlEnumValue("Insurance")
    INSURANCE("Insurance"),
    @XmlEnumValue("Eligibility")
    ELIGIBILITY("Eligibility"),
    @XmlEnumValue("Fees")
    FEES("Fees"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TypeVehicleDisclaimer(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeVehicleDisclaimer fromValue(String v) {
        for (TypeVehicleDisclaimer c: TypeVehicleDisclaimer.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
