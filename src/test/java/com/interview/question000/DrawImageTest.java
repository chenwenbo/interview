package com.interview.question000;

import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contans.INPUT_IMAGE_PATH;
import static com.interview.other.Contans.OUTPUT_IMAGE_PATH;

/**
 * 将你的 QQ 头像（或者微博头像）右上角加上红色的数字，类似于微信未读信息数量那种提示效果。
 */
public class DrawImageTest {

    private DrawImage drawImage = new DrawImage();

    @Test
    public void drawWordImageTest() throws IOException {
        drawImage.drawWordInImage(INPUT_IMAGE_PATH + "icon.jpg", "2", "jpg", OUTPUT_IMAGE_PATH + "icon_new.jpg");
        drawImage.drawWordInImage(INPUT_IMAGE_PATH + "icon1.jpg", "2", "jpg", OUTPUT_IMAGE_PATH + "icon1_new.jpg");
    }

}