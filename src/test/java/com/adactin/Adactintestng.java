package com.adactin;

import java.util.Date;

import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactintestng {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\god\\Desktop\\java\\Facebook\\Driver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterClass() {
		driver.quit();
	}
	@BeforeMethod
	public void BeforeClass() {
		Date date = new Date();
		System.out.println(date);
	}
	@AfterMethod
	public void AfterClass() {
		Date date = new Date();
		System.out.println(date);
	}
	@Test
	public void test() throws InterruptedException {
		WebElement txtUser = driver.findElement(By.id("username"));
		txtUser.sendKeys("Sanjana");
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys("1234");
		Thread.sleep(30000);
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}
}
