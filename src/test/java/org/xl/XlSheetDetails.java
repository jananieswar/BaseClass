package org.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlSheetDetails {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\AUTOMATIONDETAILS.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Data");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		System.out.println(" ");
		
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
		Cell c = r.getCell(j);
		int type = c.getCellType();
		
			
		if (type==1) {
			String n = c.getStringCellValue();
			System.out.println(n);
			
		}
	if (type==0) {
		if (DateUtil.isCellDateFormatted(c)) {
 java.util.Date date = c.getDateCellValue();
	SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yy");
	String name = dateformat.format(date);
	System.out.println(name);
		}else {
		double d = c.getNumericCellValue();
		long l = (long) d;
			String name = String.valueOf(l);
			System.out.println(name);
		}
			
		}
		

}
	}
	}

}
