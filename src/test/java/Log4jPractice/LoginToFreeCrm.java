package Log4jPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.apache.log4j.Logger;

public class LoginToFreeCrm {

	//What is log? : capturing info/activities at the time of program execution. 
		// types of logs:
			//1. info
			//2. warn
			//3. debug
			//4. fatal
			
		//how to generate the logs? : use Apache log4j API (log4j jar)
		//How it works? : it reads log 4j configuration from log4j.properties file
		//where to create: create inside resources folder
	
	
	WebDriver driver;
	Logger log = Logger.getLogger(LoginToFreeCrm.class);
	
	@BeforeMethod
	public void setUP()
	{
		
	System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.freecrm.com/");
	
	}
	
	@Test
	public void loginPage()
	{
		Assert.assertTrue(driver.findElement(By.cssSelector("a.navbar-brand>img")).isDisplayed());
	}
	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
