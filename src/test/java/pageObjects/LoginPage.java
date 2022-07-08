package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//div[@class='hm-MainHeaderRHSLoggedOutMed_Login']")
	WebElement clickLogin;
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement txtUserName;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement txtPassword;
	
	@FindBy(className = "lms-LoginButton_Text")
	WebElement btnLogin;
	
	public WebElement clicklogin() {
		return clickLogin;
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