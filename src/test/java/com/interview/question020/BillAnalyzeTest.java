package com.interview.question020;

import org.junit.Test;

import java.io.IOException;

import static com.interview.question020.BillAnalyze.getBills;
import static com.interview.question020.BillAnalyze.getCallTotalTime;
import static org.junit.Assert.assertEquals;

/**
 * Created by Administrator on 2016/9/23.
 */
public class BillAnalyzeTest {

    @Test
    public void test() throws IOException {
        int time = getCallTotalTime(getBills());
        assertEquals(time,12861);
        assertEquals(time/60,214);
        assertEquals(time%60,21);
    }
}