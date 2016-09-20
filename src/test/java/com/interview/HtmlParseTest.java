package com.interview;

import com.interview.question008.HtmlParse;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.IOException;

/**
  *第 0008 题：一个HTML文件，找出里面的正文。
  *第 0009 题：一个HTML文件，找出里面的链接。
 */
public class HtmlParseTest {

    @Test
    public void getHtmlContentTest() throws IOException {
        String content = HtmlParse.getContent("http://www.baidu.com");
        System.out.println(content);
    }

    @Test
    public void getHtmlLinkTest() throws IOException {
        Elements links = HtmlParse.getLink("http://www.baidu.com");
        for (Element link : links) {
            System.out.println(link);
        }
    }
}