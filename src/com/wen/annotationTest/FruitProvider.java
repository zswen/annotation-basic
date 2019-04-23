package com.wen.annotationTest;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


/**
 * 水果供应者注解
 */
@Target(TYPE) 
@Retention(RUNTIME)
@Documented
public @interface FruitProvider { // 定义的 这个 annotation 里面有三个 variable
    /**
     * 供应商编号
     */
    public int id() default -1;
    
    /**
     * 供应商名称
     */
    public String name() default "";
    
    /**
     * 供应商地址
     */
    public String address() default "";
}