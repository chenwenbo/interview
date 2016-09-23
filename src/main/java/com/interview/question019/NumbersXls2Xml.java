package com.interview.question019;

import com.interview.other.Xls2Xml;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.json.JSONArray;

import static com.interview.utils.ExcelUtils.getCellValue;

/**
 * 第 0019 题： 将 第 0016 题中的 numbers.xls 文件中的内容写到 numbers.xml 文件中，如下
 */
public class NumbersXls2Xml extends Xls2Xml{

    public static final String COMMENT = "数字信息";
    public static final String FIRST_LEVEL_ELEMENT = "numbers";

    public String convertXls2Json(XSSFSheet sheet) {
        JSONArray result = new JSONArray();
        int rowSize = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowSize; i++) {
            Row row = sheet.getRow(i);
            JSONArray jsonArray = new JSONArray();
            int cellSize = row.getPhysicalNumberOfCells();
            for (int k = 0; k < cellSize; k++) {
                Cell cell = row.getCell(k);
                Object cellValue = getCellValue(cell);
                jsonArray.put(cellValue);
            }
            result.put(jsonArray);
        }
        return result.toString();
    }

    public String getFirstLevelElement() {
        return COMMENT;
    }

    public String getXmlComment() {
        return FIRST_LEVEL_ELEMENT;
    }

}
