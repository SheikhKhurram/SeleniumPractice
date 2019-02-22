package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _5DragAndDrop 

/**
 * Drag and drop can be performed by method called dragAndDrop of Action class 
 * OR 
 * Series of methods action.clickAndHold("source Element").moveToElement("target element").release().build().perform();
 * 
 * */


{
 
 @Test
 public void dragAndDrop()
 {
	 System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/droppable");
		
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		//action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		action.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
	
		
 }
	
}
