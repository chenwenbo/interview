package com.interview.utils;

import org.apache.poi.ss.usermodel.Cell;

/**
 * excel utils
 */
public class ExcelUtils {

    public static void setCellValue(Cell cell, Object obj) {
        if (obj == null) {
            cell.setCellValue("");
        } else if (obj instanceof String) {
            cell.setCellValue((String) obj);
        } else if (obj instanceof Integer) {
            cell.setCellValue((Integer) obj);
        } else if (obj instanceof Long) {
            cell.setCellValue((Long) obj);
        } else if (obj instanceof Double) {
            cell.setCellValue((Double) obj);
        } else if (obj instanceof Float) {
            cell.setCellValue((Float) obj);
        }
    }

    public static Object getCellValue(Cell cell) {
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
