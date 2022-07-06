package Pom_AdacinBooking;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import SeleniumTask.Baseclass;


public class Login extends Baseclass {

	public Login() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindBy(id="username")
	private WebElement txtuser;
	@CacheLookup
	@FindBy(id="password")
	private WebElement txtpass;
	@CacheLookup
	@FindBy(id="login")
	private WebElement login;


	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getLogin() {
		return login;
	}



}
