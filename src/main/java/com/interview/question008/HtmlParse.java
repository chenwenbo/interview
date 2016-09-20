package com.interview.question008;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 *  html 解析 : 利用jsoup进行处理
 */
public class HtmlParse {

    /**
     * find all link in html
     * @param url
     * other method: Elements links = doc.select("a[href]");
     * @return
     */
    public static Elements getLink(String url) throws IOException {
        Document doc = Jsoup.connect(url).get();
        return doc.getElementsByTag("a");
    }

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
