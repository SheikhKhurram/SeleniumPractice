package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class _1LaunchingBrowser 
{
   
	@Test
	public void launchingChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
	}
	
	@Test
	public void launchingFFBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJar\\FF.exe\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
	}
	 
	@Test
	public void launchingInternetExplorer()
	{
		System.setProperty("webdriver.ie.driver", "D:\\SeleniumJar\\Internetexplorer\\MicrosoftWebDriver.exe");
		WebDriver driver = new InternetExplorerDriver();
	}
	
	
}
