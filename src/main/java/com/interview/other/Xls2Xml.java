package com.interview.other;

import org.apache.poi.ss.usermodel.Cell;
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

public abstract class Xls2Xml {

    public void writeXml(String xlsPath, String xmlPath) throws IOException {
        Element root = new Element("root");
        Document doc = new Document();

        Element students = new Element(getFirstLevelElement());
        students.addContent(new Comment(getXmlComment()));
        students.addContent(getJsonData(xlsPath));

        root.addContent(students);
        doc.setRootElement(root);

        XMLOutputter outter = new XMLOutputter();
        outter.setFormat(Format.getPrettyFormat());
        outter.output(doc, new FileWriter(new File(xmlPath)));
    }

    public abstract String getFirstLevelElement();

    public abstract String getXmlComment();

    public String getJsonData(String xlsPath) throws IOException {
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

    public abstract String convertXls2Json(XSSFSheet sheet);

    public Object getCellValue(Cell cell) {
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
}
