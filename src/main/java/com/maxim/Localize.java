package com.maxim;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Данной аннотацией надо помечать все поля подлежащие локализации
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Localize {

    /**
     * <h3>Для класса</h3><br>
     * Значение обозначает путь к {@link java.util.ResourceBundle} в ресурсах приложения (разделитель .)
     * Если не указано значение, то будет использовано полное имя класса
     * <br>
     *
     * <h3>Для Enum</h3>
     *
     * <h3>Для поля</h3><br>
     * <strong>Для строковых полей</strong><br>
     * Значение обозначает имя ключ в {@link java.util.Properties} файле
     * Если не указано значение, то будет использоваться имя переменной,
     * где "CamelCase" будет преобразован в "camel.case"
     * <br>
     * <strong>Для полей сложных объектов</strong><br>
     * Значение указывать не обязательно<br>
     */
    String value() default "";


}
