package com.interview.question008;

import org.junit.Test;

import java.io.IOException;

/**
 * 第 0008 题：一个HTML文件，找出里面的正文。
 */
public class HtmlContentParseTest {

    @Test
    public void getHtmlContentTest() throws IOException {
        String content = HtmlContentParse.getContent("http://www.baidu.com");
        System.out.println(content);
    }

}