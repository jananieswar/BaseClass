package org.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlSheetCount {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\withemptyfield.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data");
		Row row = s.getRow(1);
		int r = s.getPhysicalNumberOfRows();
		System.out.println(r);
	
		int cells = row.getPhysicalNumberOfCells();
		System.out.println(cells);
		
	}

}
