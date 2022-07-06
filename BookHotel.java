package Pom_AdacinBooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumTask.Baseclass;

public class BookHotel extends Baseclass{
	
	public BookHotel() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement cardNo;
	
	@FindBy(id="cc_type")
	private WebElement cardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(name="book_now")
	private WebElement bookBtn;
	
	@FindBy(name="order_no")
	private WebElement orderNo;
	
	
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardNo() {
		return cardNo;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCvvNo() {
		return cvvNo;
	}
	public WebElement getBookBtn() {
		return bookBtn;
	}
	public WebElement getorderNo() {
		return orderNo;
	}
	
}
