package com.interview.question017;

import com.interview.other.Xls2Xml;
import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contants.INPUT_XLS_PATH;
import static com.interview.other.Contants.OUTPUT_XML_PATH;

/**
 * 第 0016 题： 纯文本文件 numbers.txt, 里面的内容（包括方括号）如下所示：
 */
public class StudentXls2XmlTest {

    public static final String STUDENTS_XML = "student.xml";
    public static final String JSON_STUDENT_XLSX = "student.xlsx";

    @Test
    public void convertStudentXls2XmlTest() throws IOException {
        Xls2Xml studentXls2Xml = new StudentXls2Xml();
        studentXls2Xml.writeXml(INPUT_XLS_PATH + JSON_STUDENT_XLSX, OUTPUT_XML_PATH + STUDENTS_XML);
    }
}