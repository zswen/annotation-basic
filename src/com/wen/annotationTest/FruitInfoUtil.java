package com.wen.annotationTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * 注解处理器
 */
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz){
        
        String strFruitName=" 水果名称：";
        String strFruitColor=" 水果颜色：";
        String strFruitProvicer="供应商信息：";
        
        Annotation[] fields = clazz.getDeclaredAnnotations();
        System.out.println(fields.length);
        
        for(Annotation field :fields){
        	System.out.println(field.annotationType() == FruitName.class);
        	if (field.annotationType() == FruitName.class) {
        		strFruitName=strFruitName + ((FruitName)field).value();
        		System.out.println(strFruitName);
        	}
            
        }
        
    }
}