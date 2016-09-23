package com.interview.question010;

import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contants.OUTPUT_IMAGE_PATH;

/**
 * 第 0010 题：使用 Python 生成类似于下图中的字母验证码图片
 */
public class RandomValidateCodeTest {

    private RandomValidateCode randomValidateCode = new RandomValidateCode();

    @Test
    public void generateValidateCodeTest() throws IOException {
        randomValidateCode.getRandcode(OUTPUT_IMAGE_PATH + "validateCode.jpeg");
    }
}