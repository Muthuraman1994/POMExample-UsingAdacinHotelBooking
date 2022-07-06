package Pom_AdacinBooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumTask.Baseclass;

public class SelectHotel extends Baseclass {
	
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}
	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
}
