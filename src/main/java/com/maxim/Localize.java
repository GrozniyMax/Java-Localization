package com.maxim;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation that is made to mark classes and fields that should be localized
 * <strong>All classes that hava to be localized should be marked with this annotations</strong>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Localize {

    /**
     * <h3>For class</h3><br>
     * {@code value()} is interpreted as path to {@link java.util.ResourceBundle} in resources folder/package
     * If value is absent, full name of class (e.g. {@code com.smth.smth.etc}) will be used
     * <br>
     *
     * <h3>For Enum</h3>
     * All instances of enum class will be localized.<br>
     * <strong>Field value for enum must have prefix of lower cased instance name</strong>
     *
     * <h3>For field</h3><br>
     * <strong>For String fields</strong><br>
     * Key name in required {@link java.util.Properties} file
     * If no value is provided, will be used name of the field, which will be changed to properties-like syntax
     *  (e.g. {@code CamelCaseName} to {@code camel.case.name})
     * <br>
     * <strong>No value needed if field has complex type, that should be also localized</strong><br>
     */
    String value() default "";


}
