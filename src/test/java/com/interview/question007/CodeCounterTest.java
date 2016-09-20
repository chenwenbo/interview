package com.interview.question007;

import com.interview.question007.CodeCounter;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.interview.question007.CodeCounter.CODE_RESOURCE;

/**
 * Created by Administrator on 2016/9/19.
 */
public class CodeCounterTest {

    private File dir;
    private String path;
    private CodeCounter counter;

    @Before
    public void before() throws IOException {
        dir = new File(".");
        path = dir.getCanonicalPath() + File.separator + CODE_RESOURCE;
        counter = new CodeCounter();
    }

    @Test
    public void test() throws IOException {
        counter.printAnalyzeResult(path);
    }
}