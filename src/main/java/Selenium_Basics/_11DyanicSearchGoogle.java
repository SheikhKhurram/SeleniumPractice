package Selenium_Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _11DyanicSearchGoogle {

	@Test
	public void dynamicSearch()
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.google.com");
		 
		 driver.findElement(By.id("lst-ib")).sendKeys("testing");
		 
		 List<WebElement> list = driver.findElements(By.xpath("//div[@class = 'sbqs_c']"));

		 System.out.println(list.size());
		 
		 
		 for(WebElement element : list)
		 {
			 System.out.println(element.getText());
			 
			 if (element.getText().contains("tools"))
			 {
				 element.click();
				 
			 }
		 }
	}
	
}
