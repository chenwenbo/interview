package com.interview.patten.proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void proxtTest() {
        Image proxyImage = new ProxyImage();
        proxyImage.display();
    }
}
