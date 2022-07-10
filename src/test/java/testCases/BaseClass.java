package testCases;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://www.bet365.com/#/HO/";
	public String uname="ILAVARASU365";
	public String pass="Hammer777$";
	public static WebDriver driver;
	public static Logger loggs;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		loggs = Logger.getLogger("Bet365");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
