package com.interview.pattern.proxy;

import org.junit.Test;

public class ProxyTest {

    @Test
    public void proxyTest() {
        Image proxyImage = new ProxyImage();
        proxyImage.display();
    }
}
