package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.WebDriverManagerException;

public class JuegoTest 
{
 
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.juegostudio.com/");
	}
	
      
	@Test
	public void checkingBrokenLinks()
	{
		List<WebElement> element =  driver.findElements(By.tagName("a"));

		element.addAll(driver.findElements(By.tagName("img")));
				
		System.out.println(element.size() + "Actual size");
		
		List<WebElement> actualLinks = new ArrayList<WebElement>();
		
		for(WebElement ele : element)
		{
			if (ele.getCssValue("href") != null)
			{
				actualLinks.add(ele);
			}
		}
	
		System.out.println(	actualLinks.size());
		
		for (WebElement ele : actualLinks)
		{
			HttpURLConnection connection;
			String response = null;
			
			try {
				connection =(HttpURLConnection)new URL(ele.getAttribute("href")).openConnection();
				connection.connect();
				 response  =connection.getResponseMessage();
			} catch (MalformedURLException e) 
			{
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
              
			System.out.println(ele.getAttribute("href") + "----->"+ response);
	
		}
		
	}
	
}
