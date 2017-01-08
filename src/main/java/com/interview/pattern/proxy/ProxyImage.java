package com.interview.pattern.proxy;

public class ProxyImage implements Image{

    private final Image image;

    public ProxyImage() {
        this.image = new RealImage();
    }

    @Override
    public void display() {
        System.out.println("proxy before action");
        image.display();
        System.out.println("proxy after action");
    }
}
