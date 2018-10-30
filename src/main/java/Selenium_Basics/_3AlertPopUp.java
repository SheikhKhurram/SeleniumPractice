package Selenium_Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _3AlertPopUp 
{
    @Test
    public void handlingPopup() throws InterruptedException
    {
    	 System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		
   		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
   		
   		driver.findElement(By.xpath("//input[@type= 'submit']")).click();
   		
   		Alert alert  = driver.switchTo().alert() ; 
   		
   		System.out.println(alert.getText());
   		
   		alert.accept();
   		
   		Thread.sleep(5000);
   		driver.quit();
   		
    }
	
	
	
}
