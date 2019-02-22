package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.testng.annotations.Test;

public class ByclassLocators 
{
	
	@Test
	public void locator()
	{
	    System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		/**
		 * using ByAll
		 * 
		 * In this we can pass multiple locators if one is failed it use another locators to find the element 
		 * Example : If selenium unable find by.name ("firstname") it will move to By.id ("u_0_j") to look for webelement
		 * 
		 * **/
		 
		//driver.findElement(new ByAll(By.name("firstname"), By.id("u_0_j") , By.xpath("//input[@name = 'firstname']")
			//	 )).sendKeys("khurram");
		
		
		/**using ByIDorName
		 * 
		 * In this either we can pass ID or a name 
		 * 
		 * **/
		
	//	driver.findElement(new ByIdOrName("u_0_j")).sendKeys("khurram");
		
		/**
		 * Using byChained
		 * 
		 * It's parent to child relation 
		 * **/
		driver.findElement(new ByChained(By.id("u_0_i") , By.xpath("//div[@class= 'uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']") ,
				By.id("u_0_j"))).sendKeys("khurram");
		
}
}