package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingInformation5 extends BaseClass {
	
	public BookingInformation5() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="search_hotel")
	private WebElement btnSearch;
	@FindBy(xpath="//input[@name='my_itinerary']")
	private WebElement btnMyItinerary;
	@FindAll({@FindBy(xpath="//input[@name='logout']"),@FindBy(name="logout")})
	private WebElement btnLogout;
	public WebElement getBtnSearch() {
		return btnSearch;
	}
	public WebElement getBtnMyItinerary() {
		return btnMyItinerary;
	}
	public WebElement getBtnLogout() {
		return btnLogout;
	}
	
}
