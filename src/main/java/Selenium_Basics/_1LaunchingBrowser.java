package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _1LaunchingBrowser 
{
   
	@Test
	public void launchingChromeBrowser() throws InterruptedException
	{
		/**
		 * Why we need to set system.setProperty?
		 * 		System.setProperty("propertyName , value");
		 * We use this method in selenium because browsers does not have in build servers to run automation code so we
		 * need chrome/Gecko/IE driver servers to communicate the our selenium code with the browsers 
		 * 		In simple words to set the path of the driver for the respective browser you will need system.setProperty
		 * 
		 * */
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		/**
		 * Why WebDriver driver = new ChromeDriver() ?
		 * 
		 * Link : https://www.softwaretestingmaterial.com/webdriver-driver-new-firefoxdriver/
		 * 
		 * 
		 * 
		 * */
       
}

	@Test
	public void launchingFFBrowser() throws InterruptedException
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
	
	@Test
	public void launchingSafariBowser()
	{
		System.setProperty("webdriver.safari.driver", "Location");
	}
	
}
