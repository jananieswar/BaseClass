package org.xl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationBrowser {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\Desktop\\java\\FrameWork\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		WebElement drop = driver.findElement(By.id("countries"));
		
	Select s=new Select(drop);
		List<WebElement> options = s.getOptions();
		File file = new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\Countries.xlsx");
		Workbook w = new XSSFWorkbook();
	Sheet sheet= w.createSheet("Data");
		for (int i = 0; i < options.size(); i++) {
			WebElement element = options.get(i);
			String name = element.getText();
		System.out.println(name);
	Row row = sheet.createRow(i);
	Cell cell = row.createCell(0);
	cell.setCellValue(name);
		}
	FileOutputStream stream = new FileOutputStream(file);
	w.write(stream);
	
		}
		
	

}

