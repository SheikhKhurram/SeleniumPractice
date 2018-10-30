package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptMethods 
{
	@Test
     public void test()
     {
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement element = driver.findElement(By.id("u_0_2"));
		
		
		WebElement forgotElement = driver.findElement(By.xpath("//a[text() = 'Forgotten account?']"));
		
		//Highlight
		flash (element ,driver);
		
		//Drawing Borader
		drawBoarder(element , driver);
		
		//Generating alert 
		//generatingAlertMessege(driver , "Generating alert messege using js");
		
		
		//Clicking on webelement using js 
		clickingOnElement (driver , forgotElement);
		
		//Refreshing the pa ge 
		refreshBrowser(driver);
		
		//Getting title 
		System.out.println(gettingTitle(driver));
		
		//GettingInnertext
		System.out.println(gettingInnertext(driver));
		
	      //Scrolling 
		//scrollingDown(driver);
		
		//ScrollIntoView
		WebElement instaElement = driver.findElement(By.xpath("//a[text()  = 'Instagram']"));
		scrollIntoView(driver, instaElement);
		
		
     }
	
	//Flashing a element
	public static void flash (WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgColor = element.getCssValue("backgroundcolor");
		for (int i=0; i < 10 ; i++)
		{
		   	changeColor("rgb(0,200,0)" , element , driver);
		   	changeColor(bgColor ,element , driver );
		}
	}
	public static void changeColor(String color , WebElement element , WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].style.backgroundColor = '"+color+"'", element);
		
		try
		{
			Thread.sleep(20);
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	//Creating a boarder
	public static void drawBoarder(WebElement element , WebDriver driver)
	{
	      JavascriptExecutor js = ((JavascriptExecutor) driver);
	      
	      js.executeScript("arguments[0].style.border = '3px solid red'", element);
	}
	
	//Generating alert pop-up 
	public static void generatingAlertMessege(WebDriver driver , String messeage)
	{
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
	      
		 js.executeScript("alert('"+messeage+"')");
	}
	
	
	//Clicking a webelement using JS 
	
	public void clickingOnElement (WebDriver driver , WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].click();", element);
	}
	
	//Refershing browser
	public void refreshBrowser(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("history.go(0)");
	}
	
	//Getting title from the JS 
	public String  gettingTitle (WebDriver driver)
	{
        JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		return js.executeScript("return document.title;").toString();
	}
	
	//Getting inner Text Of The page
	public String gettingInnertext(WebDriver driver)
	{
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
			
		 return js.executeScript("return document.documentElement.innerText;").toString();
	}
	
	//Scrolling down the page 
	public void scrollingDown(WebDriver driver)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("window.scrollTo(0 ,document.body.scrollHeight)");
	}
	
	//Scrolling into view 
	public void scrollIntoView(WebDriver driver , WebElement element)
	{
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}
