package com.interview.question019;

import com.interview.other.Xls2Xml;
import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contants.INPUT_XLS_PATH;
import static com.interview.other.Contants.OUTPUT_XML_PATH;

/**
 * 第 0019 题： 将 第 0016 题中的 numbers.xls 文件中的内容写到 numbers.xml 文件中，如下
 */
public class NumbersXls2XmlTest {

    public static final String NUMBERS_XML = "numbers.xml";
    public static final String JSON_NUMBERS_XLSX = "numbers.xlsx";

    @Test
    public void convertNumbersXls2XmlTest() throws IOException {
        Xls2Xml numbersXls2Xml = new NumbersXls2Xml();
        numbersXls2Xml.writeXml(INPUT_XLS_PATH + JSON_NUMBERS_XLSX, OUTPUT_XML_PATH + NUMBERS_XML);
    }

}