package com.crm.crm_hybridframework.base;

import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

public class ExcelReader {
	public static ArrayList getTestData(String filePath) {
		ArrayList arr = new ArrayList();
		try {
			FileInputStream file = new FileInputStream(new File(filePath));
			Workbook workbook = WorkbookFactory.create(file);

			Sheet sheet = workbook.getSheetAt(0);

			for (Row row : sheet) {
				for (Cell cell : row) {
					// Checking the cell type and retrieving the cell value
					switch (cell.getCellType()) {
					case STRING:
						arr.add(cell.getStringCellValue() );
						break;
					case NUMERIC:
						arr.add(cell.getNumericCellValue() + "\t");
						break;
					case BOOLEAN:
						arr.add(cell.getBooleanCellValue() + "\t");
						break;
					}
				}
				System.out.println();
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr;
	}
}
