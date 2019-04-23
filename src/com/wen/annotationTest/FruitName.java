package com.wen.annotationTest;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * 水果名称注解
 */
@Target(TYPE)
@Retention(RUNTIME)
@Documented
public @interface FruitName {
    String value() default "";
}