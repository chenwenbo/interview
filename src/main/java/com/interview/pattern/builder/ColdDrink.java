package com.interview.pattern.builder;

/**
 * description : 冷饮
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:05.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
