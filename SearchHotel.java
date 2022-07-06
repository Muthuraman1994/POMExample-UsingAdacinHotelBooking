package Pom_AdacinBooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumTask.Baseclass;

public class SearchHotel extends Baseclass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement btnlocation;
	
	@FindBy(id="hotels")
	private WebElement Hotel;
	
	@FindBy(id="room_type")
	private WebElement Roomtype;
	
	@FindBy(id="room_nos")
	private WebElement NoRoom;
	
	@FindBy(id="datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id ="adult_room")
	private WebElement AdultRoom;
	
	@FindBy(id ="Submit")
	private WebElement searchButton;

	public WebElement getBtnlocation() {
		return btnlocation;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomtype() {
		return Roomtype;
	}

	public WebElement getNoRoom() {
		return NoRoom;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultRoom() {
		return AdultRoom;
	}
	
	public WebElement getsearchButton() {
		return searchButton;
	}
	
	
	
	
}
