package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectDetail3 extends BaseClass{
	public SelectDetail3() {
		PageFactory.initElements(driver, this);
	}
	
	@FindAll({@FindBy(xpath="//select[@id='radiobutton_0']"),@FindBy(name="radiobutton_0")})
	private WebElement clkRadioBtn;
	@FindAll({@FindBy(xpath="//select[@id='continue']"),@FindBy(name="continue")})
	private WebElement continueBtn;
	public WebElement getClkRadioBtn() {
		return clkRadioBtn;
	}
	public WebElement getContinueBtn() {
		return continueBtn;
	}
	 
}
