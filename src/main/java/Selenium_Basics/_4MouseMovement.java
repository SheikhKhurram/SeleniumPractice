package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _4MouseMovement 
{
      //Drop down of HTML5 
	
	
	/**
	 * Check the below link where added for action class 
	 * Link : https://docs.google.com/document/d/1GLDa7D7ieHxIhsMBxXe5Fw98o6bkkzLXJp6BdcAH-E0/edit.
	 * */
	
	
	
	
	@Test
	public void mouseHover()
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.juegostudio.com/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//ul[@id = 'menu-mainmenu']//a[text() = 'Services']"))).build().perform();
	
	}
}
