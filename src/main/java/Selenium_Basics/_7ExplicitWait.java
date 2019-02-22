package Selenium_Basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

import TestNGFeatures.ExceptedException;


public class _7ExplicitWait 
{
	WebDriver driver;
	@Test 
	public void explicitwait()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(time, unit)
		driver.get("http://www.google.com");
		
	    WebElement element = driver.findElement(By.id("lst-ib"));
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
		
		element.sendKeys("facebook");
		
		driver.findElement(By.name("btnK")).click();
		
		
	}
	
	public void fluentwait()
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(20))
		         .pollingEvery(Duration.ofSeconds(2));
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply (WebDriver driver)
			{
			 return driver.findElement(By.xpath("pass xpath"));  
			}
		});
		
		element.click();
	}
	
}

/*
 * Why do we need waits in selenium ? 
 * 	1.Most of the application are developed using Ajax and javascript.When a page is loaded by the browser 
 *  the elements which may want to interact with may load at different time interval 
 *  
 *  2.if our selenium API try interact non-loaded elements in the document it will throw the "elementNotVisibleException"
 * 
 *  3. 
 *  
 * */
