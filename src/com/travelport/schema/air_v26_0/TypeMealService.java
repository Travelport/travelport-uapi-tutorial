
package com.travelport.schema.air_v26_0;

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
 * &lt;simpleType name="typeMealService">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Meal"/>
 *     &lt;enumeration value="ColdMeal"/>
 *     &lt;enumeration value="HotMeal"/>
 *     &lt;enumeration value="Breakfast"/>
 *     &lt;enumeration value="ContinentalBreakfast"/>
 *     &lt;enumeration value="Lunch"/>
 *     &lt;enumeration value="Dinner"/>
 *     &lt;enumeration value="SnackOrBrunch"/>
 *     &lt;enumeration value="FoodForPurchase"/>
 *     &lt;enumeration value="ComplimentaryRefreshments"/>
 *     &lt;enumeration value="AlcoholicBeveragesForPurchase"/>
 *     &lt;enumeration value="ComplimentaryAlcoholicBeverages"/>
 *     &lt;enumeration value="FoodAndBeveragesForPurchase"/>
 *     &lt;enumeration value="NoMealService"/>
 *     &lt;enumeration value="RefreshmentsForPurchase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeMealService")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2014-04-08T11:02:22-06:00", comments = "JAXB RI v2.2.6")
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
