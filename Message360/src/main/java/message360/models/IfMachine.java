/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/02/2016
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum IfMachine {
    CONTINUE, //TODO: Write general description for this element
    HANGUP; //TODO: Write general description for this element

    private static TreeMap<String, IfMachine> valueMap = new TreeMap<String, IfMachine>();
    private String value;

    static {
        CONTINUE.value = "continue";
        HANGUP.value = "hangup";

        valueMap.put("continue", CONTINUE);
        valueMap.put("hangup", HANGUP);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static IfMachine fromString(String toConvert) {
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
     * Convert list of IfMachine values to list of string values
     * @param toConvert The list of IfMachine values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<IfMachine> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (IfMachine enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 