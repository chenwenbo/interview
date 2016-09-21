package com.interview.question005;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
 */
public class ImageSizeProcessTest {

    private String imagePrefix;
    private ImageSizeProcess imageSizeProcess = new ImageSizeProcess();

    @Before
    public void before() throws IOException {
        imagePrefix = new File(".").getCanonicalFile() + File.separator + "image" + File.separator;
    }

    @Test
    public void drawIphone5ImageTest() throws IOException {
        imageSizeProcess.generateIphone5Image(imagePrefix+"icon.jpg","jpg",imagePrefix+"icon_iphone5.jpg");
        imageSizeProcess.generateIphone5Image(imagePrefix+"icon1.jpg","jpg",imagePrefix+"icon1_iphone5.jpg");
        imageSizeProcess.generateIphone5Image(imagePrefix+"icon2.jpg","jpg",imagePrefix+"icon2_iphone5.jpg");
    }

}