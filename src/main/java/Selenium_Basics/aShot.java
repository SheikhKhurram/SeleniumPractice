package Selenium_Basics;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class aShot {

	/*
	 * 1. Takes the screenshot of perticular element 
	 * 2. Capture the full screenshot 
	 * 3.Decorate the screenshot
	 * 4. Provides flexible screenshot comparison
	 * 
	 * **/
	
	
	
	
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
        
		takingElementScreenshot(driver);
	}

	public static void takingFullPageScreenshot(WebDriver driver) throws IOException
	{
		
		Screenshot screenShot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).
				takeScreenshot(driver);
		
		
		ImageIO.write(screenShot.getImage(), "PNG" , new File("Location"));
		
		
	}
	
	public static void takingElementScreenshot(WebDriver driver) throws IOException
	{
		WebElement element = driver.findElement(By.id("hplogo"));
		Screenshot screenshot = new AShot().takeScreenshot(driver , element);
		
		ImageIO.write(screenshot.getImage(), "PNG", new File(System.getProperty("user.dir") + "//Selenium_Basics//element.png"));
		
	}
	
	public static void comparingImage(WebDriver driver)
	{
		
	}
	
}
