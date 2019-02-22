package Selenium_Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingBootStrap 
{
     @Test
     public void handlingBootStarp()
     {
        System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
 		
 		WebDriver driver = new ChromeDriver();
 		
 		driver.manage().window().maximize();
 		driver.manage().deleteAllCookies();
 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 		driver.manage().timeouts().pageLoadTimeout(40 , TimeUnit.SECONDS);
 		
 		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
 		
 		driver.findElement(By.xpath("//button[@type='button']")).click();
 		
 	    List<WebElement> list=driver.findElements(By.xpath("//ul[@class = 'multiselect-container dropdown-menu']//li//a//label//input"));
 		
 		/* for (WebElement ele : list)
 		 {
 	         if (ele.getText().contains("Angular"))
 	         {
 	        	 ele.click();
 	        	 break;
 	         }
 		 }*/
 		 
 		 //selecting all the checkbox 
 		 
 		 for (WebElement ele : list)
 		 {
 			 if (!ele.isSelected())
 			 {
 				 ele.click();
 			 }
 		 }
 		 
     }
}
