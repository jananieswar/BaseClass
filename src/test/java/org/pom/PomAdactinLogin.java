package org.pom;

import org.apache.poi.hssf.record.DrawingRecordForBiffViewer;
import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

public class PomAdactinLogin extends BaseClass {
	
        public static void main(String[] args) throws InterruptedException {
			getDriver();
			launchBrowser("https://adactinhotelapp.com/");
			PageLogin loginPage = new PageLogin();
			WebElement txtUserName = loginPage.getTxtUserName();
			enterText(txtUserName, "karthi007");
			WebElement txtPassword = loginPage.getTxtPassword();
			enterText(txtPassword, "Karthi@1989");
			WebElement btnLogin = loginPage.getBtnLogin();
			btnClick(btnLogin);
			SearchHotel2 searchHotel = new SearchHotel2();
			WebElement location = searchHotel.getSelectLocation();
			dropDown(location);
			selectValue("Melbourne");
			WebElement selectHotel = searchHotel.getSelectHotel();
			dropDown(selectHotel);
			selectIndex(3);
			WebElement roomType = searchHotel.getRoomType();
			dropDown(roomType);
			selectValue("Double");
			WebElement noRoom = searchHotel.getNORoom();
			dropDown(noRoom);
			selectIndex(4);
		    WebElement datePick = searchHotel.getDatePick();
		    datePick.clear();
		    enterText(datePick, "27-4-2021");
		    WebElement dateOut = searchHotel.getDateOut();
		    dateOut.clear();
		    enterText(dateOut, "29-4-2021");
		    WebElement adultRoom = searchHotel.getAdultRoom();
		    dropDown(adultRoom);
		    selectIndex(3);
		    WebElement childRoom = searchHotel.getChildRoom();
		    dropDown(childRoom);
		    selectIndex(2);
		    WebElement submit = searchHotel.getSubmit();
		    btnClick(submit);
		    SelectDetail3 Details = new SelectDetail3();
		    WebElement clkRadioBtn = Details.getClkRadioBtn();
		    btnClick(clkRadioBtn);
		    WebElement continueBtn = Details.getContinueBtn();
		    btnClick(continueBtn);
		    BookHotelPayment4 payment4 =new BookHotelPayment4();
		    WebElement txtFirstName = payment4.getTxtFirstName();
		    enterText(txtFirstName, "janani");
		    WebElement txtLastName = payment4.getTxtLastName();
		    enterText(txtLastName, "eswar");
		    WebElement txtBillingAddress = payment4.getTxtBillingAddress();
		   enterText(txtBillingAddress, "chennai");
		    WebElement enterCardNo = payment4.getTxtEnterCardNo();
		    enterText(enterCardNo,"1234567890123456");
		    WebElement btnCardType = payment4.getBtnCardType();
		    BaseClass.dropDown(btnCardType);
		    selectIndex(2);
		    WebElement btnExpiryMonth = payment4.getBtnExpiryMonth();
		    dropDown(btnExpiryMonth);
		    selectIndex(8);
		    WebElement btnExpiryYear = payment4.getBtnExpiryYear();
		    dropDown(btnExpiryYear);
		    selectByText("2021");
		    WebElement btnEnterCvv = payment4.getBtnEnterCvv();
		    enterText(btnEnterCvv,"123");
		    WebElement btnclick = payment4.getBtnclick();
		    BaseClass.btnClick(btnclick);
//		    WebElement btncancel = payment4.getBtncancel();
//		    btnClick(btncancel);
		    Thread.sleep(6000);
		    BookingInformation5 bookInformation= new BookingInformation5();
	  // WebElement btnSearch = bookInformation.getBtnSearch();
	  //  btnSearch.submit();
//	    WebElement btnMyItinerary = bookInformation.getBtnMyItinerary();
//		    btnClick(btnMyItinerary);
//		   
    WebElement btnLogout = bookInformation.getBtnLogout();
	btnClick(btnLogout);
		    
		
			
			}
	}
	




