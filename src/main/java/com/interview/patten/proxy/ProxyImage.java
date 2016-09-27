package com.interview.patten.proxy;

public class ProxyImage implements Image{

    private final Image image;

    public ProxyImage() {
        this.image = new RealImage();
    }

    @Override
    public void display() {
        System.out.println("proxt before action");
        image.display();
        System.out.println("proxy after action");
    }
}
