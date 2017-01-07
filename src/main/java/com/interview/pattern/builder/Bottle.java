package com.interview.pattern.builder;

/**
 * description :
 * author : wenbo.chen@boldseas.com
 * Created time : 2017/01/07 13:16.
 */
public class Bottle implements Packing{
    @Override
    public String pack() {
        return "bottle";
    }
}
