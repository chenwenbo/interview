package com.interview.other;

import org.junit.Test;

import static org.junit.Assert.*;

public class IncreaseTest {

    private int i = 1;

    @Test
    public void plus_plus_i_should_be_i(){
        assertEquals(2,++i);
    }

    @Test
    public void i_plus_plus_should_be_i(){
        assertEquals(1,i++);
    }

}
