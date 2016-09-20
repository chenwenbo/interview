package com.interview.yeap;

import com.interview.other.Yeap;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class YeapTest {

    private Yeap yeap = new Yeap();

    @Test
    public void year_1992_should_be_yeap() {
        assertTrue(yeap.isYeap(1992));
    }

    @Test
    public void year_1993_should_not_be_yeap() {
        assertFalse(yeap.isYeap(1993));
    }

    @Test
    public void year_1900_should_not_be_yeap() {
        assertFalse(yeap.isYeap(1900));
    }

    @Test
    public void year_2000_should_be_yeap() {
        assertTrue(yeap.isYeap(2000));
    }

    @Test
    public void year_2001_should_be_yeap() {
        assertFalse(yeap.isYeap(2001));
    }

}