package com.interview.pattern.singleton;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LazySingletonTest {


    @Test
    public void lazySingletonTest(){
        LazySingleton s = LazySingleton.getInstance();
        LazySingleton s1 = LazySingleton.getInstance();
        assertEquals(s1, s1);
    }

    @Test
    public void lazySafeSingletonTest(){
        LazySingleton s = LazySingleton.getSafeInstance();
        LazySingleton s1 = LazySingleton.getSafeInstance();
        assertEquals(s, s1);
    }
}
