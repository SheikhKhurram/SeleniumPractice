package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _7ExplicitWait 
{
 
	@Test 
	public void explicitwait()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
	    WebElement element = driver.findElement(By.id("lst-ib"));
		
		WebDriverWait wait = new WebDriverWait(driver , 20);
		
		wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
		
		element.sendKeys("facebook");
		
		driver.findElement(By.name("btnK")).click();
		
	}
	
}
