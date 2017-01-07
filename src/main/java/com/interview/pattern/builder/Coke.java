package com.interview.pattern.builder;

/**
 * description : 可口可乐
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:07.
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 5.5f;
    }
}
