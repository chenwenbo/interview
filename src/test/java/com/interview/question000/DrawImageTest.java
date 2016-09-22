package com.interview.question000;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
 */
public class DrawImageTest {

    private String imagePrefix;
    private DrawImage drawImage = new DrawImage();

    @Before
    public void before() throws IOException {
        imagePrefix = new File(".").getCanonicalFile() + File.separator + "image" + File.separator;
    }

    @Test
    public void drawWordImageTest() throws IOException {
        drawImage.drawWordInImage(imagePrefix + "icon.jpg", "2", "jpg", imagePrefix + "icon_new.jpg");
        drawImage.drawWordInImage(imagePrefix + "icon1.jpg", "2", "jpg", imagePrefix + "icon1_new.jpg");
    }

}