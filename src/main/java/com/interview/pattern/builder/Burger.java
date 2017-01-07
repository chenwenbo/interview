package com.interview.pattern.builder;

/**
 * description : 汉堡接口
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:05.
 */
abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

}
