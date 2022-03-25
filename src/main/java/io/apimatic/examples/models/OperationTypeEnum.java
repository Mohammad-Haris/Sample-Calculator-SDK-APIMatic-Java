/*
 * CalculatorMHarisLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package io.apimatic.examples.models;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * OperationTypeEnum to be used.
 */
public enum OperationTypeEnum {
    ADD,

    SUBTRACT;


    private static TreeMap<String, OperationTypeEnum> valueMap = new TreeMap<>();
    private String value;

    static {
        ADD.value = "SUM";
        SUBTRACT.value = "SUBTRACT";

        valueMap.put("SUM", ADD);
        valueMap.put("SUBTRACT", SUBTRACT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static OperationTypeEnum fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of OperationTypeEnum values to list of string values.
     * @param toConvert The list of OperationTypeEnum values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<OperationTypeEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (OperationTypeEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 