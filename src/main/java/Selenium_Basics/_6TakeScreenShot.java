package Selenium_Basics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class _6TakeScreenShot 
{
   @Test
   public void takeScreenShot() throws IOException
   {
	   
	   System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		
		File file =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File ("C:\\Users\\khurram\\eclipse-workspace\\Selenium_practice\\src\\main\\java\\Selenium_Basics\\google.png"));
		
		
   }
}