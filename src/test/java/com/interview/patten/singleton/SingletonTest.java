package com.interview.patten.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {

    @Test
    public void singletonTest() {
        EnumSingleton s = EnumSingleton.getInstance();
        EnumSingleton s1 = EnumSingleton.getInstance();
        assertEquals(s, s1);
    }
}