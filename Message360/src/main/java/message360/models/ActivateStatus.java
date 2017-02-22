/*
 * Message360
 *
 * This file was automatically generated for message360 by APIMATIC v2.0 ( https://apimatic.io ).
 */
package message360.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum ActivateStatus {
    ACTIVATE, //TODO: Write general description for this element
    DEACTIVATE; //TODO: Write general description for this element

    private static TreeMap<Integer, ActivateStatus> valueMap = new TreeMap<Integer, ActivateStatus>();
    private Integer value;

    static {
        ACTIVATE.value = 1;
        DEACTIVATE.value = 0;

        valueMap.put(1, ACTIVATE);
        valueMap.put(0, DEACTIVATE);
    }

    /**
     * Returns the enum member associated with the given integer value
     * @return The enum member against the given integer value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static ActivateStatus fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member
     * @return The integer value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public Integer value() {
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
     * Convert list of ActivateStatus values to list of integer values
     * @param toConvert The list of ActivateStatus values to convert
     * @return List of representative integer values */
    public static List<Integer> toValue(List<ActivateStatus> toConvert) {
        if(toConvert == null)
            return null;
        List<Integer> convertedValues = new ArrayList<Integer>();
        for (ActivateStatus enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 