package TestNGFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;


public class ParametersTestNG 
{
     
	@Test
	@Parameters({"url" , "userName"})
	public void FBLogin(String url , String userName)
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("email")).sendKeys(userName);

		
	}
	
	
}
