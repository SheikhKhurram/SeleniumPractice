package TestNGRScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Base {

	public static WebDriver driver;
	
	public static void initilazation()
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	}
	
	public void failedTestcase(String methodName)
	{
	          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          try {
				FileHandler.copy(scrFile, new File ("C:\\Users\\khurram\\eclipse-workspace\\Selenium_practice\\src\\main\\java"
						+ "\\TestNGRScreenShot\\ScreenShot\\" +""+methodName+"" + ".jpg"));
			} 
	          catch (IOException e) 
	          {
				e.printStackTrace();
			}
	}
	
}
