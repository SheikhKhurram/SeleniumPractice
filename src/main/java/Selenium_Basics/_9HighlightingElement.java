package Selenium_Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class _9HighlightingElement {
	@Test
	public void highlightingElement() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://wordpress.com/log-in");

		WebElement elementEmail = driver.findElement(By.cssSelector("#usernameOrEmail"));
		
		webDriverWait(driver, elementEmail , "khurramSharuk");

		driver.findElement(By.xpath("//button[@type = 'submit']")).click();

		Thread.sleep(3000);
		
		WebElement elementPassword = driver.findElement(By.id("password"));
		//Khurram@12
		webDriverWait(driver, elementEmail , "Khurram@12"); 
		
		WebElement element = driver.findElement(By.xpath("//button[text() = 'Log In']"));
		
		flash(element , driver);
	}
	
	public static void flash (WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroundcolor");
		for (int i=0; i < 100 ; i++)
		{
		   	changeColor("rgb(0,200,0)" , element , driver);
		   	changeColor(bgColor ,element , driver );
		}
	}
	public static void changeColor(String color , WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].style.backgroundColor = "+color+"", element);
		
		try
		{
			Thread.sleep(20);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	public static void webDriverWait(WebDriver driver , WebElement element , String key)
	{
		WebDriverWait driverwait = new WebDriverWait(driver, 20);
		
		driverwait.ignoring(InvalidElementStateException.class).until(ExpectedConditions.elementToBeSelected(element)); 
		element.sendKeys(key);
	}
}