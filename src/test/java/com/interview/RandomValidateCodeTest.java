package com.interview;

import com.interview.question010.RandomValidateCode;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/9/20.
 */
public class RandomValidateCodeTest {

    private RandomValidateCode randomValidateCode = new RandomValidateCode();

    @Test
    public void generateValidateCodeTest() throws IOException {
        String validateCodeImage = new File(".").getCanonicalFile() + File.separator + "image" + File.separator+"validateCode.jpeg";
        randomValidateCode.getRandcode(validateCodeImage);
    }
}