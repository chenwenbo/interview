package com.interview.question018;

import com.google.gson.Gson;
import com.interview.other.Xls2Xml;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.util.LinkedHashMap;
import java.util.Map;

import static com.interview.utils.ExcelUtils.getCellValue;

/**
 * 第 0017 题： 将 第 0014 题中的 student.xls 文件中的内容写到 student.xml 文件中
 */
public class CityXls2Xml extends Xls2Xml{

    public static final String COMMENT = "城市信息";
    public static final String FIRST_LEVEL_ELEMENT = "citys";

    public String convertXls2Json(XSSFSheet sheet) {
        Map<String, Object> result = new LinkedHashMap<>();
        int rowSize = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowSize; i++) {
            Row row = sheet.getRow(i);
            String cell1 = (String) getCellValue(row.getCell(0));
            String cell2 = (String) getCellValue(row.getCell(1));
            result.put(cell1, cell2);
        }
        Gson gson = new Gson();
        String json = gson.toJson(result);
        return json;
    }

    public String getFirstLevelElement() {
        return COMMENT;
    }

    public String getXmlComment() {
        return FIRST_LEVEL_ELEMENT;
    }

}
