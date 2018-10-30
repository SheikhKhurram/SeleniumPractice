package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _10isDisplayeEnabledSelected
{
	/**
	 * Notes : 
	 * 	isDisplayed : This methods is used to check the presence of webelement in the webpage
	 *                This method return "true" if the value of webelement present in the webpage "false" if webelement is not present
	 *  			  It is capable to check for the presence of all kinds of webelements are available 
	 *  
	 *   isEnabled :  This method is used to verify webelement is enabled or disabled with in the webpage
	 *                It is primarily used for the buttons
	 * 
	 *   isSelected : This method is used to verify if the webelement is selected or not 
	 *   			  This method is used pre-dominantly used with radiobutton ,DropDowns and checkboxes
	 *   			   
	 * 
	 * 
	 * */
	
	
	
     @Test
     public void differentMethods()
     {
    	 
    	 System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		
   		driver.get("https://www.freecrm.com/register");
   		
   		WebElement submitElement = driver.findElement(By.id("submitButton")); 
   		
   		//checking button is Displayed or not 
   		boolean bol = submitElement.isDisplayed();
   		System.out.println(bol);
    	 
   		
   		//check submitbutton isEnabled 
   		boolean bolen = submitElement.isEnabled();
   		System.out.println(bolen);
   		
   		WebElement checkElement = driver.findElement(By.name("agreeTerms"));

   		//Making enable
   		checkElement.click();
   		boolean bole = checkElement.isEnabled();
   		System.out.println(bole);
   		
   		//Checking isSelected for checkBox 
   		boolean check = checkElement.isSelected();
   		System.out.println(check);
     }
}
