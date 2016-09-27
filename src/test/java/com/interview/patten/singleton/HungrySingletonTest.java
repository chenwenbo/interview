package com.interview.patten.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2016/9/27.
 */
public class HungrySingletonTest {

    @Test
    public void hungrySingletonTest() {
        HungrySingleton s = HungrySingleton.getInstance();
        HungrySingleton s1 = HungrySingleton.getInstance();
        assertEquals(s, s1);
    }
}