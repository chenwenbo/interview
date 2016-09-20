package com.interview.str;


import com.interview.other.StringToNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *  interview program test case
 *  description : convert string to number
 *  eg : "1" --> 1 , "2" --> 2
 *       "11" --> 11 , "22" --> 22
 *       "111" --> 111 , "222" --> 222
 */
public class StringToNumberTest {

    private StringToNumber str = new StringToNumber();

    @Test
    public void char_single_should_be_long_single() throws Exception {
        assertEquals(1, str.convert("1"));
        assertEquals(2, str.convert("2"));
        assertEquals(3, str.convert("3"));
    }

    @Test
    public void char_double_should_be_long_double() throws Exception {
        assertEquals(11, str.convert("11"));
        assertEquals(22, str.convert("22"));
        assertEquals(33, str.convert("33"));
    }

    @Test
    public void char_three_bit_should_be_long_three_bit() throws Exception {
        assertEquals(111, str.convert("111"));
        assertEquals(222, str.convert("222"));
        assertEquals(333, str.convert("333"));
    }

    @Test
    public void char_more_bit_should_be_long_more_bit() throws Exception {
        assertEquals(1111, str.convert("1111"));
        assertEquals(22222, str.convert("22222"));
        assertEquals(333333, str.convert("333333"));
        assertEquals(4444444, str.convert("4444444"));
        assertEquals(55555555, str.convert("55555555"));
    }
}
