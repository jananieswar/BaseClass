package org.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AutomationinXl extends BaseClass {
//	static WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		BaseClass.getDriver();
		BaseClass.launchBrowser("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void test1() throws Exception, Exception {
		BaseClass.findElementXpath("//input[@placeholder='First Name']").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 0));
		
		BaseClass.findElementXpath("//input[@placeholder='Last Name']").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 1));
		BaseClass.findElementXpath("//textarea[@ng-model='Adress']").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 2));
		BaseClass.findElementXpath("//input[@type='email']").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 3));
		BaseClass.findElementXpath("//input[@type='tel']").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 4));
		BaseClass.findElementXpath("//input[@value='Male']").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 5));
		BaseClass.findElementXpath("//input[@value='FeMale']").click();
		BaseClass.findElementId("checkbox1").click();
		BaseClass.findElementXpath("//div[@id='msdd']").click();
		BaseClass.findElementXpath("//a[text()='English']").click();
		Thread.sleep(2000);
		WebElement skills = BaseClass.findElementXpath("//select[@ng-model='Skill']");
		BaseClass.dropDown(skills);
		BaseClass.selectIndex(10);
		WebElement contry = BaseClass.findElementId("countries");
		BaseClass.dropDown(contry);
		BaseClass.selectByText("India");
		BaseClass.findElementXpath("//span[@role='combobox']").click();
		BaseClass.robotAct();
		WebElement year = BaseClass.findElementId("yearbox");
		BaseClass.dropDown(year);
		BaseClass.selectByText("1991");
		WebElement Month = BaseClass.findElementXpath("//select[@placeholder='Month']");
		BaseClass.dropDown(Month);
		BaseClass.selectByText("March");
		WebElement Day = BaseClass.findElementXpath("//select[@placeholder='Day']");
		BaseClass.dropDown(Day);
		BaseClass.selectByText("4");
		BaseClass.findElementId("firstpassword").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 12));
		BaseClass.findElementId("secondpassword").sendKeys(BaseClass.printAllValues("C:\\Users\\god\\Desktop\\java\\FrameWork\\XLSheet\\XL.AUTOMATIONDETAIL.xlsx", "Sheet1", 1, 13));
		BaseClass.findElementId("submitbtn").click();
		
		
		
		
		 
		
	}
	

	}


