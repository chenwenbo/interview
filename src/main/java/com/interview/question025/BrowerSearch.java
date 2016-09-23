package com.interview.question025;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * 第 0025 题： 使用 Python 实现：对着电脑吼一声,自动打开浏览器中的默认网站。
 */
public class BrowerSearch {
    public static void main(String[] args) throws URISyntaxException, IOException {
        browerSearch(recognitionVoice());
    }

    public static String recognitionVoice() {
        //TODO speech to text ? 1 : use google api recognition voice 2 : use third-party library
        return "http://www.baidu.com";
    }

    public static void browerSearch(String uri) throws IOException, URISyntaxException {
        if (Desktop.isDesktopSupported()) {
            Desktop.getDesktop().browse(new URI(uri));
        }
    }
}
