package com.interview.question017;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonPrimitive;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jdom.Comment;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 第 0017 题： 将 第 0014 题中的 student.xls 文件中的内容写到 student.xml 文件中
 */
public class StudentXls2Xml {

    public static final String COMMENT = "学生信息表\n" +
            "    \"id\" : [名字, 数学, 语文, 英文]";

    public static final String STUDENTS_XML = "student.xml";
    public static final String JSON_STUDENT_XLSX = "student.xlsx";

    public static void writeXml(String xlsPath, String xmlPath) throws IOException {
        Element root = new Element("root");
        Document doc = new Document();

        Element students = new Element("students");
        students.addContent(new Comment(COMMENT));
        students.addContent(getStudents(xlsPath));

        root.addContent(students);
        doc.setRootElement(root);

        XMLOutputter outter = new XMLOutputter();
        outter.setFormat(Format.getPrettyFormat());
        outter.output(doc, new FileWriter(new File(xmlPath)));
    }

    public static String getStudents(String xlsPath) throws IOException {
        File file = new File(xlsPath);
        if (!file.exists()) {
            file.createNewFile();
        }
        try (
                FileInputStream inputStream = new FileInputStream(file)
        ) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            return convertXls2Json(sheet);
        }
    }

    private static String convertXls2Json(XSSFSheet sheet) {
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

    private static Object getCellValue(Cell cell) {
        Object cellValue = new Object();
        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_NUMERIC:
                cellValue = cell.getNumericCellValue();
                break;
            case Cell.CELL_TYPE_STRING:
                cellValue = cell.getStringCellValue();
                break;
        }
        return cellValue;
    }

    private static boolean isInteger(String str) {
        return str.indexOf(".") == -1;
    }
}
