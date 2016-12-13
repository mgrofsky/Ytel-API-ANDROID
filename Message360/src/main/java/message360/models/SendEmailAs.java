/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ) on 12/12/2016
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum SendEmailAs {
    TEXT, //Email send as text format
    HTML; //Email send as HTML format

    private static TreeMap<String, SendEmailAs> valueMap = new TreeMap<String, SendEmailAs>();
    private String value;

    static {
        TEXT.value = "text";
        HTML.value = "html";

        valueMap.put("text", TEXT);
        valueMap.put("html", HTML);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static SendEmailAs fromString(String toConvert) {
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
     * Convert list of SendEmailAs values to list of string values
     * @param toConvert The list of SendEmailAs values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<SendEmailAs> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (SendEmailAs enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 