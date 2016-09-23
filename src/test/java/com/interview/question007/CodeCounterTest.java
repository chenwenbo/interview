package com.interview.question007;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contants.CODE_RESOURCE_PATH;

/**
 * Created by Administrator on 2016/9/19.
 */
public class CodeCounterTest {

    private CodeCounter counter;

    @Before
    public void before() throws IOException {
        counter = new CodeCounter();
    }

    @Test
    public void test() throws IOException {
        counter.printAnalyzeResult(CODE_RESOURCE_PATH);
    }
}