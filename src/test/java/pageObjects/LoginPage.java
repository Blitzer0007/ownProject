package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	//Constructor
	public LoginPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	//@FindBy xpaths and WebElement
	@FindBy(xpath = "//div[contains(@class,'hm-MainHeaderRHSLoggedOutWide_Login')][normalize-space()='Log In']")
	WebElement clickLogin;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(className = "lms-LoginButton_Text")
	WebElement btnLogin;
	
	//Methods
	public void clicklogin() {
		 clickLogin.click();
	}
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void hitlogin() {
		btnLogin.click();
	}
}
