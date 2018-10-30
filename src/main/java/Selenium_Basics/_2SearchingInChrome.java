package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _2SearchingInChrome 
{
      @Test
      public void launchingMyGit() throws InterruptedException
      {
    	 System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
  		WebDriver driver = new ChromeDriver();
  		
  		driver.get("https://wordpress.com/log-in");
  		
  		driver.findElement(By.id("usernameOrEmail")).sendKeys("khurramSharuk");
  		
  		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
  		
  		Thread.sleep(3000);
  		driver.findElement(By.id("password")).sendKeys("Khurram@12");
  		
  		driver.findElement(By.xpath("//button[text() = 'Log In']")).click();
  		
  		
  		String actual = driver.getTitle();
  		
  		String expected = "WordPress.com";
  		
  		if (actual.contains(expected)) System.out.println("Test pass");
  		else System.out.println("test fail");
  		
      }
}
