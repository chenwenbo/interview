package com.interview.pattern.proxy;

public class RealImage implements Image{

    @Override
    public void display() {
        System.out.println("real image");
    }

}
