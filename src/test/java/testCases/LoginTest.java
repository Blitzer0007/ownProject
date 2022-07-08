package testCases;


import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get(baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.clicklogin().click();
		Thread.sleep(5000);
		lp.setUserName(uname);
		lp.setPassword(pass);
		lp.hitlogin();
		
	}

}
