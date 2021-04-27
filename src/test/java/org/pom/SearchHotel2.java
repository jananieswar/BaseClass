package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel2 extends BaseClass {
	public SearchHotel2() {
		PageFactory.initElements(driver,this);
	}
	@FindAll({@FindBy(xpath="//select[@id='location']"),@FindBy(name="location")})
	private WebElement selectLocation;
	@FindAll({@FindBy(xpath="//select[@id='hotels']"),@FindBy(name="hotels")})
	private WebElement selectHotel;
	@FindAll({@FindBy(xpath="//select[@id='room_type']"),@FindBy(name="room_type")})
      private WebElement roomType;
	@FindAll({@FindBy(xpath="//select[@id='room_nos']"),@FindBy(name="room_nos")})
	private WebElement NORoom;
	@FindAll({@FindBy(xpath="//select[@id='datepick_in']"),@FindBy(name="datepick_in")})
	private WebElement datePick;
	@FindAll({@FindBy(xpath="//select[@id='datepick_out']"),@FindBy(name="datepick_out")})
	private WebElement dateOut;
	@FindAll({@FindBy(xpath="//select[@id='adult_room']"),@FindBy(name="adult_room")})
	private WebElement adultRoom;
	@FindAll({@FindBy(xpath="//select[@id='child_room']"),@FindBy(name="child_room")})
	private WebElement childRoom;
	@FindAll({@FindBy(xpath="//select[@id='Submit']"),@FindBy(name="Submit")})
	private WebElement submit;
	
	
	public WebElement getSelectLocation() {
		return selectLocation;
	}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getNORoom() {
		return NORoom;
	}
	public WebElement getDatePick() {
		return datePick;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
}
