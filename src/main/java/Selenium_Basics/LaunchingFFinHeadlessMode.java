package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class LaunchingFFinHeadlessMode 
{

	
	@Test
	public void firefoxheadless()
	{
		FirefoxBinary binary = new FirefoxBinary();
		binary.addCommandLineOptions("--headless");
		
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJar\\FF.exe\\geckodriver.exe");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.setBinary(binary);
		
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.findElements(By.xpath("ssds")).size();
		
	}
}
