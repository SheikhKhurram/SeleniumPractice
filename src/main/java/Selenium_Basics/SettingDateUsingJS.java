package Selenium_Basics;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SettingDateUsingJS 
{
   
	@Test
	public void settingDateUsingJS()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		

		driver.get("https://www.spicejet.com/");
		
		WebElement element = driver.findElement(By.id("ctl00_mainContent_txt_Fromdate"));
		
		selectingDate(element , driver , "02-12-2018");
		
	}
	
	
	public static void selectingDate(WebElement element , WebDriver driver , String dateVal)
	{
		
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].setAttribute('value' , '"+dateVal+"');", element);
		
		
	}
	
	
}
