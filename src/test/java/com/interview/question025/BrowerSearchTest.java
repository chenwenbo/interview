package com.interview.question025;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.interview.question025.BrowerSearch.browerSearch;

/**
 * 第 0025 题： 使用 Python 实现：对着电脑吼一声,自动打开浏览器中的默认网站。
 */
public class BrowerSearchTest {

    @Test
    public void test() throws IOException, URISyntaxException {
        browerSearch("http://www.baidu.com");
    }
}