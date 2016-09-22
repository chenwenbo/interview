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

import static com.interview.utils.ExcelUtils.setCellValue;


/**
 * 第 0014 题： 纯文本文件 student.txt为学生信息, 里面的内容（包括花括号）如下所示：
 */
public class CityJson2Xls {

    public static final String STUDENT_TXT = "city.txt";
    public static final String STUDENT_XLS = "city.xlsx";
    public static final String JSON_DIR = "json";
    public static final String CITY = "city";
    public static final String SHEET_NAME = CITY;

    public static void main(String[] args) throws IOException {
        convertJson2Xls();
    }

    public static void convertJson2Xls() throws IOException {
        File dir = new File(".");

        String txtFilePath = dir.getCanonicalPath() + File.separator + JSON_DIR + File.separator + STUDENT_TXT;
        String json = Words.readFile(new File(txtFilePath));
        JSONObject jsonObject = new JSONObject(json);

        String xlsFilePath = dir.getCanonicalPath() + File.separator + JSON_DIR + File.separator + STUDENT_XLS;
        try (FileOutputStream os = new FileOutputStream(xlsFilePath)) {
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
