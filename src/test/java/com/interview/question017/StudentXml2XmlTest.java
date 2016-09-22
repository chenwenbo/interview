package com.interview.question017;

import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contans.INPUT_XLS_PATH;
import static com.interview.other.Contans.OUTPUT_XML_PATH;
import static com.interview.question017.StudentXls2Xml.JSON_STUDENT_XLSX;
import static com.interview.question017.StudentXls2Xml.STUDENTS_XML;
import static com.interview.question017.StudentXls2Xml.writeXml;

/**
 * 第 0016 题： 纯文本文件 numbers.txt, 里面的内容（包括方括号）如下所示：
 */
public class StudentXml2XmlTest {

    @Test
    public void convertXls2XmlTest() throws IOException {
        writeXml(INPUT_XLS_PATH + JSON_STUDENT_XLSX, OUTPUT_XML_PATH + STUDENTS_XML);
    }
}