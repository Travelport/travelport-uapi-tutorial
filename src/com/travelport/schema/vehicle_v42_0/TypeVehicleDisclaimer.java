
package com.travelport.schema.vehicle_v42_0;

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
 * &lt;simpleType name="typeVehicleDisclaimer"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Vehicles"/&gt;
 *     &lt;enumeration value="Shuttle"/&gt;
 *     &lt;enumeration value="AgeRequirements"/&gt;
 *     &lt;enumeration value="AddlDriverInfo"/&gt;
 *     &lt;enumeration value="AddlDriverFees"/&gt;
 *     &lt;enumeration value="Payment"/&gt;
 *     &lt;enumeration value="Guarantee"/&gt;
 *     &lt;enumeration value="Deposit"/&gt;
 *     &lt;enumeration value="Voucher"/&gt;
 *     &lt;enumeration value="License"/&gt;
 *     &lt;enumeration value="Pickup"/&gt;
 *     &lt;enumeration value="DropOff"/&gt;
 *     &lt;enumeration value="Fuel"/&gt;
 *     &lt;enumeration value="Geographic"/&gt;
 *     &lt;enumeration value="Liabilities"/&gt;
 *     &lt;enumeration value="SpecialEquipment"/&gt;
 *     &lt;enumeration value="Insurance"/&gt;
 *     &lt;enumeration value="Eligibility"/&gt;
 *     &lt;enumeration value="Fees"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeVehicleDisclaimer")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
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
