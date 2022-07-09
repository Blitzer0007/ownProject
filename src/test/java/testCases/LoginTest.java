package testCases;

import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class LoginTest extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException {

		driver.get(baseURL);
		Thread.sleep(9000);
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(9000);
		lp.clicklogin();
		Thread.sleep(5000);
		lp.setUserName(uname);
		lp.setPassword(pass);
		lp.hitlogin();

	}

}
