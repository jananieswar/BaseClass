package org.baseclass;

import java.awt.AWTException;
import java.awt.Event;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
static Actions ac;
static Alert al;
static Select sl;
static JavascriptExecutor js;
public static Robot rb;
//1
public static void getDriver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}
//2
public static  void launchBrowser(String data) {
	driver.get(data);
}
//3
public static  void enterText(WebElement element , String data) {
	
element.sendKeys(data);

}
//4
public static  void getText(WebElement element) {
	String name = element.getText();
System.out.println(name);
}
//4
public static  void btnClick(WebElement element) {
	element.click();
}
//5
public static  void enterTextByJs(String data, WebElement element) {
	 js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].setAttribute('value','"+data+"')", element);
	
}
//6

public static  void setTextJs(String data,WebElement element) {
	 js = (JavascriptExecutor) driver;
	Object st = js.executeScript("return arguments[0].getAttribute('value','"+data+"')",element );
	
}
//7
public static  void scrollUp(WebElement element) {
	js.executeScript("arguments[0].scrollIntoView(true)", element);
}
//8
public static  void scrollDown(WebElement element) {
	js.executeScript("arguments[0].scrollIntoView(false)", element);
}
//9
public static  void moveToElement(WebElement element) {
	 ac = new Actions(driver);
	ac.moveToElement(element).perform();
}
//10
public static  void dragAndDrop( WebElement element1 , WebElement element ) {
	ac.dragAndDrop(element1 ,element).perform();

}
//11
public static  void doubleClick(WebElement element) {
	ac.doubleClick(element).perform();
}
//12
public static  void rightClick(WebElement element) {
	ac.contextClick(element).perform();
}
//13
public static  void keyUpDown(WebElement element , String data) {
	ac.keyDown(element,Keys.SHIFT).sendKeys(element,data).keyUp(element,Keys.SHIFT).perform();
}
//14
public static  void alert() {
al=driver.switchTo().alert();	
}
//15
public static  void acceptAlert() {
	al.accept();
}
//16
public static  void dimissAlert() {
	al.dismiss();

}
//17
public static  void textAlert(WebElement element ,String data) {
	element.sendKeys(data);

}
//18
public static  void dropDown(WebElement element) {
	sl=new Select(element);
}//19
	public static  void selectValue(String data) {
		
		sl.selectByValue(data);
	}
	


//20
public static  void selectIndex(int i) {
	sl.selectByIndex(i);
}//21
public static  void selectByText( String data) {
	sl.selectByVisibleText(data);
}
//22
public static  void selectgetoptions() {
	sl.getOptions();
}
//23
public static  void selectAllOptions() {
	sl.getAllSelectedOptions();
}
//24
public static  void selectFirstOptions() {
	sl.getFirstSelectedOption();

}
//25
public static  void singleOrMultipledropdown() {
	sl.isMultiple();
}//26
public static  void deselectIndex(int i,String data) {
	sl.deselectByIndex(i);
}//27
public static  void deselByValue(String data) {
	sl.deselectByValue(data);
}//28
	public static  void deselectAll() {
		// TODO Auto-generated method stub
		sl.deselectAll();
	}//29
	public static  void deselectText(String data) {
		// TODO Auto-generated method stub
		sl.deselectByVisibleText(data);
	}//30
	
public static  void frameIdName(String data,WebElement element, int index) {
	driver.switchTo().frame(data);
}//31
public static  void frameElement(WebElement element) {
	// TODO Auto-generated method stub
	driver.switchTo().frame(element);
}//32
	public void frameIndex(int index) {
		// TODO Auto-generated method stub
		driver.switchTo().frame(index);
		
	}
//33
public static  void parentFrame() {
driver.switchTo().parentFrame();
}//34
public static  void getScreenShotAS() {
	TakesScreenshot  ts =(TakesScreenshot) driver; 
	ts.getScreenshotAs(OutputType.FILE);
}//35
public static  void getParentWinId() {
	driver.getWindowHandle();

}//36
public static  void getAllWinId() {
driver.getWindowHandles();
}//37
public static  void getWinUrl(String url) {
	driver.switchTo().window(url);
}//38
public static  void getWinTitle(String title) {
	// TODO Auto-generated method stub
	driver.switchTo().window(title);
}
	//39
public static  void navigateUrl(String url) {
	driver.navigate().to(url);
}//40
	public static  void navigateForward() {
		driver.navigate().forward();
	}//41
	public static  void navigateback() {
		
		driver.navigate().back();
	}//42
	
	public static  void nagivateFresh() {
		
		driver.navigate().refresh();
	}//43
		
public static  void closeDriver() {

driver.close();
}//44
public static  void quitDriver() {
	driver.quit();
}//45
public static WebElement findElementId(String data) {
 WebElement findElement = driver.findElement(By.id(data));
return findElement;
	
}//46
public static  void createExcel(String path , int i, String data , String Sheet) throws Exception, IOException  {
	File f = new File(path);
	Workbook w = new XSSFWorkbook();
	Sheet s = w.createSheet(Sheet);
	Row row = s.createRow(0);
   	Cell cell = row.createCell(0);
   	cell.setCellValue(data);
   	FileOutputStream stream = new FileOutputStream(f);
	w.write(stream);
}
//47
public static  String printAllValues(String path,String Sheet,int rowNo,int cellNo ) throws Exception, IOException {
	File f = new File(path);
	FileInputStream stream = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(stream);
	Sheet s = w.getSheet(Sheet);
	Row row = s.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	int type = cell.getCellType();
	String value = " ";
	if(type==1)
	{
		value = cell.getStringCellValue();
		
	}
	
	else if (DateUtil.isCellDateFormatted(cell)) {
			Date date = cell.getDateCellValue();
			SimpleDateFormat dateformate = new SimpleDateFormat("dd-MMM-YY");
			value= dateformate.format(date);
		} else {
			double d = cell.getNumericCellValue();
			long l =(long) d;
			value = String.valueOf(l);
			
		
}
	return value;
	
}//48
public static  void implicityWait(long timeout, TimeUnit TimeUint) {
	
	driver.manage().timeouts().implicitlyWait(timeout, TimeUint);
}
//49
public static WebElement findElementName(String data) {
	WebElement findElement = driver.findElement(By.name(data));
	return findElement;

}//50
public static WebElement findElementXpath(String data) {
	WebElement findElement = driver.findElement(By.xpath(data));
	return findElement;
}

//51
public static WebElement findElementTagName(String data) {
	WebElement findElement = driver.findElement(By.tagName(data));
	return findElement;

}//52
public static  void robotAct() throws Exception {
	Robot rb = new Robot();
	 rb.keyPress(KeyEvent.VK_DOWN);
	 rb.keyRelease(KeyEvent.VK_DOWN);
	 rb.keyPress(KeyEvent.VK_DOWN);
	 rb.keyRelease(KeyEvent.VK_DOWN);
	 rb.keyPress(KeyEvent.VK_DOWN);
	 rb.keyRelease(KeyEvent.VK_DOWN);
	 rb.keyPress(KeyEvent.VK_DOWN);
	 rb.keyRelease(KeyEvent.VK_DOWN);
	 rb.keyPress(KeyEvent.VK_DOWN);
	 rb.keyRelease(KeyEvent.VK_DOWN);
	 rb.keyPress(KeyEvent.VK_ENTER);
	 rb.keyRelease(KeyEvent.VK_ENTER);
}


public static void jsClick(WebElement element) {
	 js = (JavascriptExecutor) driver;
	js.executeScript("argument[0].click", element);

}
public static  void screenShot(String path ) throws IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
File f = new File (path);
FileUtils.copyFile(screenshot, f);
}




















}