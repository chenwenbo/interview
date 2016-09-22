package com.interview.question005;

import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contans.INPUT_IMAGE_PATH;
import static com.interview.other.Contans.OUTPUT_IMAGE_PATH;

/**
 * 将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
 */
public class ImageSizeProcessTest {

    private ImageSizeProcess imageSizeProcess = new ImageSizeProcess();


    @Test
    public void drawIphone5ImageTest() throws IOException {
        imageSizeProcess.generateIphone5Image(INPUT_IMAGE_PATH + "icon.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon_iphone5.jpg");
        imageSizeProcess.generateIphone5Image(INPUT_IMAGE_PATH + "icon1.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon1_iphone5.jpg");
        imageSizeProcess.generateIphone5Image(INPUT_IMAGE_PATH + "icon2.jpg", "jpg", OUTPUT_IMAGE_PATH + "icon2_iphone5.jpg");
    }

}