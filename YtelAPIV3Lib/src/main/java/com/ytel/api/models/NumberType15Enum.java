/*
 * YtelAPIV3Lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.ytel.api.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum NumberType15Enum {
    ALL, //TODO: Write general description for this element
    VOICE, //TODO: Write general description for this element
    SMS; //TODO: Write general description for this element

    private static TreeMap<String, NumberType15Enum> valueMap = new TreeMap<String, NumberType15Enum>();
    private String value;

    static {
        ALL.value = "all";
        VOICE.value = "voice";
        SMS.value = "sms";

        valueMap.put("all", ALL);
        valueMap.put("voice", VOICE);
        valueMap.put("sms", SMS);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static NumberType15Enum fromString(String toConvert) {
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
     * Convert list of NumberType15Enum values to list of string values
     * @param toConvert The list of NumberType15Enum values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<NumberType15Enum> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (NumberType15Enum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 