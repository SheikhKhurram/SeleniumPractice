package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test {

	public static void main(String[] args) throws InterruptedException 
	{
		 System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured");
		 
		 Thread.sleep(5000);
		 
         driver.findElement(By.id("subscribe-close")).click();
		
         Thread.sleep(5000);
         
         driver.manage().window().maximize();
         
		 JavascriptExecutor js  = ((JavascriptExecutor)driver);
		 
		// js.executeScript("window.scrollTo(0 ,document.body.scrollHeight)");
		 
		 js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		     
		 WebElement element = null;
		 
		 js.executeScript("argument[0].scrollIntoView();" , element);
		 

	}

}
