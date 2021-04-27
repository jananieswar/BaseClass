package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoAuto {
	WebDriver driver;
	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	@Test
	@Parameters({"firstName","lastName", "address","emailid","phoneno","pass","confirmpass"})
	public void tc01(String firstName, String lastName ,String address ,String emailid,String phoneno, String pass, String confirmpass ) throws Exception {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstName);;
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(address);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phoneno);
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		WebElement male = driver.findElement(By.xpath("//input[@value='FeMale']"));
		male.click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox2")).click();
		driver.findElement(By.id("checkbox3")).click();
		WebElement Language = driver.findElement(By.xpath("//div[@id='msdd']"));
		Language.click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
		WebElement skills = driver.findElement(By.xpath("(//select[@type='text'])[1]"));
		Select sel = new Select(skills);
		 sel.selectByIndex(12);
		 WebElement country = driver.findElement(By.id("countries"));
		 Select sl = new Select(country);
		 sl.selectByVisibleText("Andorra");
		 driver.findElement(By.xpath("//span[@role='combobox']")).click();
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
		 Thread.sleep(3000);
		 WebElement year = driver.findElement(By.id("yearbox"));
		 Select dt = new Select(year);
		dt.selectByVisibleText("1991");
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select mon = new Select(month);
		mon.selectByVisibleText("March");
		WebElement day = driver.findElement(By.xpath("//select[@placeholder='Day']"));
		Select sele = new Select(day);
		sele.selectByVisibleText("24");;
		driver.findElement(By.id("firstpassword")).sendKeys(pass);
		driver.findElement(By.id("secondpassword")).sendKeys(confirmpass);
		driver.findElement(By.id("submitbtn")).click();
	}
	

}
