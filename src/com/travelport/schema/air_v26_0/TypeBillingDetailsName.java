
package com.travelport.schema.air_v26_0;

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
 * &lt;simpleType name="typeBillingDetailsName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PersonalId"/>
 *     &lt;enumeration value="CostAccountNumber"/>
 *     &lt;enumeration value="AccountNumber"/>
 *     &lt;enumeration value="ProjectNumber"/>
 *     &lt;enumeration value="ActionCode"/>
 *     &lt;enumeration value="DepartmentCode"/>
 *     &lt;enumeration value="AccountingUnit"/>
 *     &lt;enumeration value="OrderNumber"/>
 *     &lt;enumeration value="Destination"/>
 *     &lt;enumeration value="FileDate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeBillingDetailsName")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
