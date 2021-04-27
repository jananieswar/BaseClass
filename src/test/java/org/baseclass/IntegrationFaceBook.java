package org.baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;

public class IntegrationFaceBook extends BaseClass{
	public static void main(String[] args) throws Exception {
		BaseClass baseclass = new BaseClass();
				baseclass.getDriver();
				baseclass.launchBrowser("https://www.facebook.com/");
				WebElement txtname = baseclass.findElement("email");
				//baseclass.enterText(txtname, "janu");
				//baseclass.enterText(baseclass.findElement("pass"), "12345");
				//WebElement findElement = baseclass.findElementName("login");
				//baseclass.btnClick(findElement);
				baseclass.robotFb();
				WebElement findElement = baseclass.findElement("day");
				baseclass.dropDown(findElement, null);
				
}
}