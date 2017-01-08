package com.interview.pattern.Decorator;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 16:06.
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("circle");
    }
}
