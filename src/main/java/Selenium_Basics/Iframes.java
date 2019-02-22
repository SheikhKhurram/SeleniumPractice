package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		
//		driver.switchTo().frame(index);
//		
//		driver.switchTo().frame(nameOrId);
//		
//		driver.switchTo().frame(WebElement frameElement);
//		
//		driver.switchTo().defaultContent();
//		
//		driver.switchTo().parentFrame(); 
		
		
		//getting all the iframes in the page 
		
		List<WebElement> list = driver.findElements(By.tagName("iframes"));
		
		//getting all the iframes using javaScript
		
		JavascriptExecutor js =((JavascriptExecutor)driver);
		
	 Integer numberOfIframes =Integer.parseInt(js.executeScript("return window.length").toString());
		
	 	

	}

}
