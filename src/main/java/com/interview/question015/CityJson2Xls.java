package com.interview.question015;

import com.interview.question004.Words;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import static com.interview.other.Contants.*;
import static com.interview.utils.ExcelUtils.setCellValue;


/**
 * 第 0015 题： 纯文本文件 city.txt为城市信息, 里面的内容（包括花括号）如下所示：
 */
public class CityJson2Xls {

    public static final String CITY_TXT = "city.txt";
    public static final String CITY_XLS = "city.xlsx";
    public static final String SHEET_NAME = "city";

    public static void convertJson2Xls() throws IOException {

        String json = Words.readFile(new File(INPUT_JSON_PATH + CITY_TXT));
        JSONObject jsonObject = new JSONObject(json);

        try (FileOutputStream os = new FileOutputStream(OUTPUT_XLS_PATH + CITY_XLS)) {
            write2Excel(jsonObject.toMap(), os);
        }
    }

    private static void write2Excel(Map<String, Object> students, OutputStream os) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(SHEET_NAME);

        int i = students.size();
        for (Map.Entry<String, Object> studentEntry : students.entrySet()) {
            Row row = sheet.createRow(--i);
            row.createCell(0).setCellValue(studentEntry.getKey());
            Cell cell = row.createCell(1);
            setCellValue(cell, studentEntry.getValue());
        }

        workbook.write(os);
        os.close();
    }

}
