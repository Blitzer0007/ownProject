package testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilities.ReadConfig;

public class BaseClass {
	//Creating object to access config.
	ReadConfig read = new ReadConfig();
	
	public String baseURL=read.getbaseURL();
	public String uname=read.getUname();
	public String pass=read.getPass();
	public static WebDriver driver;
	public static Logger loggs;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",read.getChromePath());
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
