package com.interview.question020;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.interview.other.Contants.INPUT_XLS_PATH;
import static com.interview.utils.ExcelUtils.getCellValue;

/**
 * 第 0020 题： 登陆中国联通网上营业厅 后选择「自助服务」 --> 「详单查询」，然后选择你要查询的时间段，点击「查询」按钮，查询结果页面的最下方，
 * 点击「导出」，就会生成类似于 2014年10月01日～2014年10月31日通话详单.xls 文件。写代码，对每月通话时间做个统计。
 */
public class BillAnalyze {

    public static final String BILL_XLS = "bill.xlsx";

    public static int getCallTotalTime(List<String[]> bills) {
        int result = 0;
        for (String[] bill : bills) {
            result += Integer.valueOf(bill[3]);
        }
        return result;
    }

    public static List<String[]> getBills() throws IOException {
        System.out.println(INPUT_XLS_PATH + BILL_XLS);
        InputStream inputStream = new FileInputStream(INPUT_XLS_PATH + BILL_XLS);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheetAt(0);
        List<String[]> bills = new ArrayList<>();
        int rowSize = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowSize; i++) {
            Row row = sheet.getRow(i);
            int cellSize = row.getPhysicalNumberOfCells();
            String[] bill = new String[cellSize];
            for (int k = 0; k < cellSize; k++) {
                Cell cell = row.getCell(k);
                Object cellValue = getCellValue(cell);
                bill[k] = (String) cellValue;
            }
            if (i != 0) {
                bills.add(bill);
            }
        }
        return bills;
    }

}
