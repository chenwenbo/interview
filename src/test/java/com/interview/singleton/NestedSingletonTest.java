package com.interview.singleton;

import org.junit.Test;

import static org.junit.Assert.*;


public class NestedSingletonTest {

    @Test
    public void nestedSingletonTest() {
        NestedSingleton s = NestedSingleton.getInstance();
        NestedSingleton s1 = NestedSingleton.getInstance();
        assertEquals(s, s1);
    }
}