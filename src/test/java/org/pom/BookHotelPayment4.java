package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPayment4 extends BaseClass {
	
	public BookHotelPayment4() {
	PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(name="first_name"),@FindBy(xpath="//input[@id='first_name']")})
	private WebElement txtFirstName;
	@FindAll({@FindBy(name="last_name"),@FindBy(xpath="//input[@id='last_name']")})
	private WebElement txtLastName;
	@FindAll({@FindBy(name="address"),@FindBy(xpath="//input[@id='address']")})
	private WebElement txtBillingAddress;
	@FindAll({@FindBy(name="cc_num"),@FindBy(xpath="//input[@id='cc_num']")})
	private WebElement txtEnterCardNo;
	@FindAll({@FindBy(name="cc_type"),@FindBy(xpath="//input[@id='cc_type']")})
	private WebElement btnCardType;
	@FindAll({@FindBy(name="cc_exp_month"),@FindBy(xpath="//input[@id='cc_exp_month']")})
	private WebElement btnExpiryMonth;
	@FindAll({@FindBy(name="cc_exp_year"),@FindBy(xpath="//input[@id='cc_exp_year']")})
	private WebElement btnExpiryYear;
	@FindAll({@FindBy(name="cc_cvv"),@FindBy(xpath="//input[@id='cc_cvv']")})
	private WebElement btnEnterCvv;
	@FindAll({@FindBy(name="book_now"),@FindBy(xpath="//input[@id='book_now']")})
	private WebElement btnclick;
	@FindAll({@FindBy(name="cancel"),@FindBy(xpath="//input[@id='cancel']")})
	private WebElement btncancel;
	public WebElement getTxtFirstName() {
		return txtFirstName;
	}
	public WebElement getTxtLastName() {
		return txtLastName;
	}
	public WebElement getTxtBillingAddress() {
		return txtBillingAddress;
	}
	public WebElement getTxtEnterCardNo() {
		return txtEnterCardNo;
	}
	public WebElement getBtnCardType() {
		return btnCardType;
	}
	public WebElement getBtnExpiryMonth() {
		return btnExpiryMonth;
	}
	public WebElement getBtnExpiryYear() {
		return btnExpiryYear;
	}
	public WebElement getBtnEnterCvv() {
		return btnEnterCvv;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}
	public WebElement getBtncancel() {
		return btncancel;
	}
	
	
}
