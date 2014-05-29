
package com.travelport.schema.common_v15_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ModificationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ModificationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="AddSegment"/>
 *     &lt;enumeration value="RemoveSegment"/>
 *     &lt;enumeration value="ReplaceSegment"/>
 *     &lt;enumeration value="AddPassenger"/>
 *     &lt;enumeration value="RemovePassenger"/>
 *     &lt;enumeration value="OptionsOnly"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModificationType")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2012-05-05T07:46:37+02:00", comments = "JAXB RI v2.2.5")
public enum ModificationType {


    /**
     * Add a segment to the itinerary
     * 
     */
    @XmlEnumValue("AddSegment")
    ADD_SEGMENT("AddSegment"),

    /**
     * Delete a segment from the itinerary
     * 
     */
    @XmlEnumValue("RemoveSegment")
    REMOVE_SEGMENT("RemoveSegment"),

    /**
     * Replace a segment in the itinerary with a new segment
     * 
     */
    @XmlEnumValue("ReplaceSegment")
    REPLACE_SEGMENT("ReplaceSegment"),

    /**
     * Add a passenger to the itinerary
     * 
     */
    @XmlEnumValue("AddPassenger")
    ADD_PASSENGER("AddPassenger"),

    /**
     * Remove a passenger from the itinerary
     * 
     */
    @XmlEnumValue("RemovePassenger")
    REMOVE_PASSENGER("RemovePassenger"),

    /**
     * Modification where only options are added / removed from the itinerary
     * 
     */
    @XmlEnumValue("OptionsOnly")
    OPTIONS_ONLY("OptionsOnly"),

    /**
     * Other modification types
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    ModificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ModificationType fromValue(String v) {
        for (ModificationType c: ModificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
