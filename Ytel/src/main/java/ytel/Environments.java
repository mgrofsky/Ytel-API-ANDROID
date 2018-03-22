/*
 * Ytel
 *
 * This file was automatically generated for ytel by APIMATIC v2.0 ( https://apimatic.io ).
 */
package ytel;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Environments {
    PRODUCTION, //Our message360 production environment.  This is our latest stable release.
    PREPRODUCTION; //Pre-Production environment used to test your code in our beta systems.  There is a good chance nothing will work here.  Don't use it unless instructed by our staff.

    private static TreeMap<String, Environments> valueMap = new TreeMap<String, Environments>();
    private String value;

    static {
        PRODUCTION.value = "production";
        PREPRODUCTION.value = "preproduction";

        valueMap.put("production", PRODUCTION);
        valueMap.put("preproduction", PREPRODUCTION);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Environments fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Environments values to list of string values
     * @param toConvert The list of Environments values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Environments> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Environments enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 