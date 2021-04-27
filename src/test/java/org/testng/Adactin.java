package org.testng;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.pom.SearchHotel2;
import org.pom.SelectDetail3;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Adactin extends BaseClass {
	ExtentReports reports;
	ExtentHtmlReporter htmlreport;
	ExtentTest test;
	@BeforeClass
	public void browserLaunch() {
		 reports = new ExtentReports();
		 htmlreport=new ExtentHtmlReporter("Adactin.html");
		 reports.attachReporter(htmlreport);
		 getDriver();
		 launchBrowser("https://adactinhotelapp.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
	}
	@BeforeMethod
	public void timedate() {
		Date date = new Date();
		System.out.println(date);

	}
//	@AfterMethod
//	public void scrshot (Method method) throws IOException {
//		
//		screenShot(method.getName());
//	}
	@Test 
	private void test1() throws IOException {
		test=reports.createTest("Validating LoginPage of Adatin");
		test.log(Status.INFO,"Verifying Url of adactin");
		if (driver.getCurrentUrl().contains("adactinhotel")) {
			test.log(Status.PASS, "Validating Url");
		} else {
			test.log(Status.FAIL,"Invalide Url");
		}
		
		}
	@Test
	public void test2() throws IOException {
		test=reports.createTest("Validating Logo");
		test.log(Status.INFO, "Validating Logo ");
	WebElement logo = driver.findElement(By.className("logo"));
	if (logo.isDisplayed()) {
		test.log(Status.PASS,"Adactin logo is present" );
		File screenshotAs = logo.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs, new File("logo.png"));
		test.addScreenCaptureFromPath("logo.png");
	} else {
		test.log(Status.FAIL,"Adactin logo is Not present" );
	}

	}
	@Test
	public void test3() throws IOException {
		test=reports.createTest("Entering UserName and Password");
		WebElement txtuser = driver.findElement(By.id("username"));
		if (txtuser.isEnabled()&&txtuser.isDisplayed()) {
			test.log(Status.PASS, "UserName Field is enabled and displayed");
			txtuser.sendKeys("karthi007");
				} else {
			test.log(Status.FAIL,"UserName Field is not enabled and displayed" );
		}
		WebElement txtpass = driver.findElement(By.id("password"));
		if (txtuser.isEnabled()&&txtuser.isDisplayed()) {
			test.log(Status.PASS, "Userpass Field is enabled and displayed");
			txtpass.sendKeys("Karthi@1989");
				} else {
			test.log(Status.FAIL,"Userpass Field is not enabled and displayed" );
		}
		TakesScreenshot ts = (TakesScreenshot) driver;
	    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
	    File f = new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\ScreenShot\\adactinpage1.png");
	    FileUtils.copyFile(screenshotAs, f);
	
		WebElement btnlogin = driver.findElement(By.id("login"));
		if (btnlogin.isEnabled()&&btnlogin.isDisplayed()) {
			test.log(Status.PASS, "Login field is enabled and displayed");
			btnlogin.click();
		} else {
			test.log(Status.FAIL, "Login field is not enabled and displayed");
		}
		 
	}

@Test
public void test4() throws  IOException {
	test=reports.createTest("Validating Search Hotel Page");
	SearchHotel2 searchhotel = new SearchHotel2();
	WebElement selectLocation = searchhotel.getSelectLocation();
	dropDown(selectLocation);
	if (selectLocation.isDisplayed()&&selectLocation.isEnabled()) {
		test.log(Status.PASS, "Location is Selected");
		selectValue("Melbourne");
	} else {
		test.log(Status.PASS, "Location is not Selected");
	}
	
	WebElement hotel = searchhotel.getSelectHotel();
	dropDown(hotel);
    if (hotel.isDisplayed()&&hotel.isEnabled()) {
	test.log(Status.PASS, "Hotel is Selected");
	selectValue("Hotel Creek");
} else {
	test.log(Status.FAIL,"Hotel is not Selected");
}
    WebElement roomType = searchhotel.getRoomType();
    dropDown(roomType);
    if (roomType.isDisplayed()&&roomType.isEnabled()) {
    	test.log(Status.PASS, "RoomType is Selected");
    	selectIndex(2);
	} else {
test.log(Status.FAIL, "RoomType is not selected");
	}
    WebElement noRoom = searchhotel.getNORoom();
    dropDown(noRoom);
    if (noRoom.isDisplayed()&&noRoom.isEnabled()) {
    	test.log(Status.PASS, "Room No is Selected");
    	selectIndex(3);
	} else {
		test.log(Status.FAIL,"No Room is not Selected");
	}
    WebElement datePick = searchhotel.getDatePick();
    datePick.clear();
    if (datePick.isDisplayed()&&datePick.isEnabled()) {
    	test.log(Status.PASS, "PickDate is Validated");
    	enterText(datePick,"23/05/2021");
		
	} else {
		test.log(Status.FAIL, "PickDate is Validated");
	}
    WebElement dateOut = searchhotel.getDateOut();
    dateOut.clear();
    if (dateOut.isDisplayed()&&dateOut.isEnabled()) {
    	test.log(Status.PASS, "OutDate is Validated");
    	enterText(dateOut,"06/06/2021");
		
	} else {
		test.log(Status.FAIL, "OutDate is Validated");
	}
    WebElement adultRoom = searchhotel.getAdultRoom();
    dropDown(adultRoom);
    if (adultRoom.isDisplayed()&&adultRoom.isEnabled()) {
		test.log(Status.PASS, "AdultRoom is selected");
		selectIndex(1);
		
	} else {
		test.log(Status.FAIL, "AdultRoom is not Selected");
	}
    WebElement childRoom = searchhotel.getChildRoom();
    dropDown(childRoom );
    if (childRoom .isDisplayed()&&childRoom .isEnabled()) {
    	test.log(Status.PASS, "Child Room is Selected");
    	selectValue("1");
		
	} else {
		test.log(Status.FAIL, "Child Room is not Selected");
	}
    TakesScreenshot ts = (TakesScreenshot) driver;
    File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
    File f = new File("C:\\Users\\god\\Desktop\\java\\FrameWork\\ScreenShot\\adactinpage2.png");
    FileUtils.copyFile(screenshotAs, f);
    WebElement submit = searchhotel.getSubmit();
    if (submit.isDisplayed()&&submit.isEnabled()) {
    	test.log(Status.PASS, "Submit is Clicking");
    	btnClick(submit);
		
	} else {
		test.log(Status.PASS, "Submit is not Clicking");
	}
   
}

@Test
public void test5()  {
	test=reports.createTest("Validating Search Hotel Page");
	 WebElement clkRadioBtn = driver.findElement(By.id("radiobutton_0"));
	 if (clkRadioBtn.isDisplayed()&&clkRadioBtn.isEnabled()) {
		test.log(Status.PASS, "clkRadioBtn is selected");
		 btnClick(clkRadioBtn);
	} else {
		test.log(Status.FAIL, "clkRadioBtn is not selected");
	}
		
		
	WebElement clkContinueBtn = driver.findElement(By.id("continue"));
	if (clkContinueBtn.isDisplayed()&&clkContinueBtn.isEnabled()) {
		test.log(Status.PASS, "clkContinueBtn is selected");
		btnClick(clkContinueBtn);
	} else {
		test.log(Status.FAIL, "clkContinueBtn is not selected");
	}
	
}
@Test
private void test6() {
	// TODO Auto-generated method stub

}

@AfterClass
public void reportGenerate() {
	reports.flush();
}
}
