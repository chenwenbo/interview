package com.interview.question018;

import com.interview.other.Xls2Xml;
import org.junit.Test;

import java.io.IOException;

import static com.interview.other.Contans.INPUT_XLS_PATH;
import static com.interview.other.Contans.OUTPUT_XML_PATH;

/**
 * 第 0018 题： 将 第 0015 题中的 city.xls 文件中的内容写到 city.xml 文件中，如下所示：
 */
public class CityXls2XmlTest {

    public static final String CITY_XML = "city.xml";
    public static final String JSON_CITY_XLSX = "city.xlsx";

    @Test
    public void convertCityXls2XmlTest() throws IOException {
        Xls2Xml cityXls2Xml = new CityXls2Xml();
        cityXls2Xml.writeXml(INPUT_XLS_PATH + JSON_CITY_XLSX, OUTPUT_XML_PATH + CITY_XML);
    }

}