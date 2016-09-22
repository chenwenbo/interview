package com.interview.question010;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * 第 0010 题：使用 Python 生成类似于下图中的字母验证码图片
 */
public class RandomValidateCodeTest {

    private RandomValidateCode randomValidateCode = new RandomValidateCode();

    @Test
    public void generateValidateCodeTest() throws IOException {
        String validateCodeImage = new File(".").getCanonicalFile() + File.separator + "image" + File.separator + "validateCode.jpeg";
        randomValidateCode.getRandcode(validateCodeImage);
    }
}