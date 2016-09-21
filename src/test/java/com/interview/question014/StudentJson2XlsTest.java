package com.interview.question014;

import org.junit.Test;

import java.io.IOException;

/**
 * 第 0014 题： 纯文本文件 student.txt为学生信息, 里面的内容（包括花括号）
 */
public class StudentJson2XlsTest {

    @Test
    public void convertJson2XlsTest() throws IOException {
        StudentJson2Xls.convertJson2Xls();
    }
}