package org.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumberText {
	public static void main(String[] args) throws IOException {
			File file = new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\xlSample(12hj).xlsx");
			FileInputStream stream = new FileInputStream(file);
			Workbook w = new XSSFWorkbook(stream);
			Sheet s = w.getSheet("Sheet1");
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int type=c.getCellType();
				if (type==1) {
				//String name=c.getStringCellValue();
				System.out.println(type);
				}
				if (type==0) {
//					double d = c.getNumericCellValue();
//					long l=(long) d;
				//	String name = String.valueOf(l);
					System.out.println(type);
				}
				
			}	
			}
			
		
		
	}

}
