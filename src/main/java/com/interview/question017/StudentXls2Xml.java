package com.interview.question017;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
import com.interview.other.Xls2Xml;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 第 0017 题： 将 第 0014 题中的 student.xls 文件中的内容写到 student.xml 文件中
 */
public class StudentXls2Xml extends Xls2Xml {

    public static final String COMMENT = "学生信息表\n" +
            "    \"id\" : [名字, 数学, 语文, 英文]";
    public static final String FIRST_LEVEL_ELEMENT = "students";

    public String convertXls2Json(XSSFSheet sheet) {
        Map<String, Object> result = new LinkedHashMap<>();
        int rowSize = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowSize; i++) {
            Row row = sheet.getRow(i);
            JsonArray jsonArray = new JsonArray();
            int cellSize = row.getPhysicalNumberOfCells();
            for (int k = 0; k < cellSize; k++) {
                Cell cell = row.getCell(k);
                Object cellValue = getCellValue(cell);
                if (k == 0) {
                    result.put((String) cellValue, jsonArray);
                } else {
                    if (cellValue instanceof Double) {
                        DecimalFormat df = new DecimalFormat("###.#");
                        String value = df.format(cellValue);
                        if (isInteger(value)) {
                            jsonArray.add(new JsonPrimitive(Integer.valueOf(value)));
                        } else {
                            jsonArray.add(new JsonPrimitive((double) cellValue));
                        }
                    }
                    if (cellValue instanceof String) {
                        jsonArray.add(new JsonPrimitive((String) cellValue));
                    }
                }
            }
        }
        Gson gson = new Gson();
        String json = gson.toJson(result);
        return json;
    }

    public String getFirstLevelElement() {
        return FIRST_LEVEL_ELEMENT;
    }

    public String getXmlComment() {
        return COMMENT;
    }

    private boolean isInteger(String str) {
        return str.indexOf(".") == -1;
    }
}
