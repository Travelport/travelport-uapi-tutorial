
package com.travelport.schema.system_v8_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeCacheName.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeCacheName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ASYNCH_LFS_CACHE"/>
 *     &lt;enumeration value="HOTEL_CALENDAR_CACHE"/>
 *     &lt;enumeration value="SERVER_STATUS_TEST"/>
 *     &lt;enumeration value="FARE_FAMILY_CACHE"/>
 *     &lt;enumeration value="VEHICLE_MEDIALINKS_CACHE"/>
 *     &lt;enumeration value="PROVISIONING_AGENT_CACHE"/>
 *     &lt;enumeration value="PROVISIONING_BRANCH_CACHE"/>
 *     &lt;enumeration value="PROVISIONING_AGENCY_CACHE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeCacheName")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-04-23T07:15:26+02:00", comments = "JAXB RI v2.2.5")
public enum TypeCacheName {

    ASYNCH_LFS_CACHE,
    HOTEL_CALENDAR_CACHE,
    SERVER_STATUS_TEST,
    FARE_FAMILY_CACHE,
    VEHICLE_MEDIALINKS_CACHE,
    PROVISIONING_AGENT_CACHE,
    PROVISIONING_BRANCH_CACHE,
    PROVISIONING_AGENCY_CACHE;

    public String value() {
        return name();
    }

    public static TypeCacheName fromValue(String v) {
        return valueOf(v);
    }

}
