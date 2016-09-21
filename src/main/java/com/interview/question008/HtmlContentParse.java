package com.interview.question008;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * 第 0008 题：一个HTML文件，找出里面的正文。
 */
public class HtmlContentParse {

    /**
     * find content in html
     * @param url
     * @return
     */
    public static String getContent(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc.getAllElements().text();
    }

}
