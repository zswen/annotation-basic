package com.wen.annotationTest;

import com.wen.annotationTest.FruitColor.Color;

/**
 * 注解使用
 */

@FruitName("Apple")
@FruitColor(fruitColor=Color.RED)
@FruitProvider(id=1,name="陕西红富士集团",address="陕西省西安市延安路89号红富士大厦")
public class Apple {
    
    private String appleName;
    
    private String appleColor;
    
    private String appleProvider;
    
    public void setAppleColor(String appleColor) {
        this.appleColor = appleColor;
    }
    public String getAppleColor() {
        return appleColor;
    }
    
    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }
    
    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
    public String getAppleProvider() {
        return appleProvider;
    }
    
    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
}