package com.interview.question009;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * 第 0009 题：一个HTML文件，找出里面的链接。
 */
public class HtmlLinkParse {

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

}
