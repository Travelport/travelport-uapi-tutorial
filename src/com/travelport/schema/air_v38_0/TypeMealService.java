
package com.travelport.schema.air_v38_0;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeMealService.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="typeMealService"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Meal"/&gt;
 *     &lt;enumeration value="ColdMeal"/&gt;
 *     &lt;enumeration value="HotMeal"/&gt;
 *     &lt;enumeration value="Breakfast"/&gt;
 *     &lt;enumeration value="ContinentalBreakfast"/&gt;
 *     &lt;enumeration value="Lunch"/&gt;
 *     &lt;enumeration value="Dinner"/&gt;
 *     &lt;enumeration value="SnackOrBrunch"/&gt;
 *     &lt;enumeration value="FoodForPurchase"/&gt;
 *     &lt;enumeration value="ComplimentaryRefreshments"/&gt;
 *     &lt;enumeration value="AlcoholicBeveragesForPurchase"/&gt;
 *     &lt;enumeration value="ComplimentaryAlcoholicBeverages"/&gt;
 *     &lt;enumeration value="FoodAndBeveragesForPurchase"/&gt;
 *     &lt;enumeration value="NoMealService"/&gt;
 *     &lt;enumeration value="RefreshmentsForPurchase"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeMealService")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2016-09-13T11:39:20-06:00", comment = "JAXB RI v2.2.11")
public enum TypeMealService {

    @XmlEnumValue("Meal")
    MEAL("Meal"),
    @XmlEnumValue("ColdMeal")
    COLD_MEAL("ColdMeal"),
    @XmlEnumValue("HotMeal")
    HOT_MEAL("HotMeal"),
    @XmlEnumValue("Breakfast")
    BREAKFAST("Breakfast"),
    @XmlEnumValue("ContinentalBreakfast")
    CONTINENTAL_BREAKFAST("ContinentalBreakfast"),
    @XmlEnumValue("Lunch")
    LUNCH("Lunch"),
    @XmlEnumValue("Dinner")
    DINNER("Dinner"),
    @XmlEnumValue("SnackOrBrunch")
    SNACK_OR_BRUNCH("SnackOrBrunch"),
    @XmlEnumValue("FoodForPurchase")
    FOOD_FOR_PURCHASE("FoodForPurchase"),
    @XmlEnumValue("ComplimentaryRefreshments")
    COMPLIMENTARY_REFRESHMENTS("ComplimentaryRefreshments"),
    @XmlEnumValue("AlcoholicBeveragesForPurchase")
    ALCOHOLIC_BEVERAGES_FOR_PURCHASE("AlcoholicBeveragesForPurchase"),
    @XmlEnumValue("ComplimentaryAlcoholicBeverages")
    COMPLIMENTARY_ALCOHOLIC_BEVERAGES("ComplimentaryAlcoholicBeverages"),
    @XmlEnumValue("FoodAndBeveragesForPurchase")
    FOOD_AND_BEVERAGES_FOR_PURCHASE("FoodAndBeveragesForPurchase"),
    @XmlEnumValue("NoMealService")
    NO_MEAL_SERVICE("NoMealService"),
    @XmlEnumValue("RefreshmentsForPurchase")
    REFRESHMENTS_FOR_PURCHASE("RefreshmentsForPurchase");
    private final String value;

    TypeMealService(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeMealService fromValue(String v) {
        for (TypeMealService c: TypeMealService.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
