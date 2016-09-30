
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeBillingDetailsName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeBillingDetailsName"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PersonalId"/&gt;
 *     &lt;enumeration value="CostAccountNumber"/&gt;
 *     &lt;enumeration value="AccountNumber"/&gt;
 *     &lt;enumeration value="ProjectNumber"/&gt;
 *     &lt;enumeration value="ActionCode"/&gt;
 *     &lt;enumeration value="DepartmentCode"/&gt;
 *     &lt;enumeration value="AccountingUnit"/&gt;
 *     &lt;enumeration value="OrderNumber"/&gt;
 *     &lt;enumeration value="Destination"/&gt;
 *     &lt;enumeration value="FileDate"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeBillingDetailsName")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeBillingDetailsName {

    @XmlEnumValue("PersonalId")
    PERSONAL_ID("PersonalId"),
    @XmlEnumValue("CostAccountNumber")
    COST_ACCOUNT_NUMBER("CostAccountNumber"),
    @XmlEnumValue("AccountNumber")
    ACCOUNT_NUMBER("AccountNumber"),
    @XmlEnumValue("ProjectNumber")
    PROJECT_NUMBER("ProjectNumber"),
    @XmlEnumValue("ActionCode")
    ACTION_CODE("ActionCode"),
    @XmlEnumValue("DepartmentCode")
    DEPARTMENT_CODE("DepartmentCode"),
    @XmlEnumValue("AccountingUnit")
    ACCOUNTING_UNIT("AccountingUnit"),
    @XmlEnumValue("OrderNumber")
    ORDER_NUMBER("OrderNumber"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("FileDate")
    FILE_DATE("FileDate");
    private final String value;

    TypeBillingDetailsName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeBillingDetailsName fromValue(String v) {
        for (TypeBillingDetailsName c: TypeBillingDetailsName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
