package org.xl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.SheetUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Emptyfield {
public static void main(String[] args) throws IOException {
	File file =new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\withemptyfield.xlsx");
	FileInputStream stream = new FileInputStream(file);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet("Data");
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			System.out.println(c);
			
		}
	}
	
}
}
