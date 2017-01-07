package com.interview.pattern.builder;

/**
 * description : 蔬菜汉堡
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:06.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "vegBurger";
    }

    @Override
    public float price() {
        return 2.5f;
    }
}
