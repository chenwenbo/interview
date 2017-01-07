package com.interview.pattern.builder;

/**
 * description : 百事
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:07.
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
