package com.interview.question009;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * 第 0008 题：一个HTML文件，找出里面的正文。
 * 第 0009 题：一个HTML文件，找出里面的链接。
 */
public class HtmlLinkParseTest {

    private String html = "<!doctype html>\n" +
            "<html>\n" +
            " <body> \n" +
            "     <div id=\"u1\"> \n" +
            "      <a href=\"http://news.baidu.com\" name=\"tj_trnews\" class=\"mnav\">百度一下</a> \n" +
            "     </div> \n" +
            " </body>\n" +
            "</html>";

    @Test
    public void getHtmlLinkTest() throws IOException {
        String links = HtmlLinkParse.getLinkByHtml(html);
        assertEquals("百度一下", links);

    }
}