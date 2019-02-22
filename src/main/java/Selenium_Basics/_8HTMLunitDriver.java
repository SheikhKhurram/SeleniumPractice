package Selenium_Basics;

import java.io.File;
import java.io.IOException;
import java.lang.ref.PhantomReference;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class _8HTMLunitDriver
{
	public static void main(String[] args) 
	{
		HtmlUnitDriver driver = new HtmlUnitDriver();
    
		 driver.get("http://www.google.com");
		 
		 System.out.println(driver.getTitle());
     
	 //Advantages 
     //1. Testing is happening behind the scene --- No browser is launched 
     //2. Very fast execution of test case ---- very fast performance of the script
     //3. Not suitable for Actions class ----Double click , Drag and drop , Taking screenshot and mouseMovement 
     //4. It is also called as Ghost driver or Headless browser 
    
      //PhantomJS - java script 
    
	}
}

class phatomJs
{
	public static void main(String[] args) throws IOException {
		
	  System.setProperty("phantomjs.binary.path", "D:\\SeleniumJar\\PhantomJS\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		
		WebDriver driver = new PhantomJSDriver();
		
		driver.get("https://www.youtube.com/");
		
		File file =  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(file, new File ("C:\\Users\\khurram\\eclipse-workspace\\Selenium_practice\\"
				+ "src\\main\\java\\Selenium_Basics\\youtube.png"));
		
		System.out.println(driver.getTitle());
	}
}
