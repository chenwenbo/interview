package com.interview.question013;

import org.junit.Test;

import java.io.IOException;

/**
 * 第 0013 题： 用 Python 写一个爬图片的程序，爬 这个链接里的日本妹子图片 :-)
 */
public class WebSpiderTest {

    private WebSpider webSpider = new WebSpider();

    @Test
    public void fetchImageTest() throws IOException {
        webSpider.fetchImage("http://tieba.baidu.com/p/2166231880");
    }

}
