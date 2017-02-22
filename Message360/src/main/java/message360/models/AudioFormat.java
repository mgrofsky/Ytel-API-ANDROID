/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum AudioFormat {
    MP3, //mp3 file
    WAV; //wav file

    private static TreeMap<String, AudioFormat> valueMap = new TreeMap<String, AudioFormat>();
    private String value;

    static {
        MP3.value = "mp3";
        WAV.value = "wav";

        valueMap.put("mp3", MP3);
        valueMap.put("wav", WAV);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static AudioFormat fromString(String toConvert) {
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
     * Convert list of AudioFormat values to list of string values
     * @param toConvert The list of AudioFormat values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<AudioFormat> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (AudioFormat enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 