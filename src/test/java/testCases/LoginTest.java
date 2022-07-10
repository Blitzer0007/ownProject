package testCases;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		driver.get(baseURL);
		loggs.info("URL is opened");
		Thread.sleep(9000);
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(9000);
		
		lp.clicklogin();
		loggs.info("Login form is opened");
		Thread.sleep(5000);
		
		lp.setUserName(uname);
		loggs.info("Entered username successfully");
		
		lp.setPassword(pass);
		loggs.info("Entered password successfully");

		lp.hitlogin();
		loggs.info("Login successfull");

	}

}
