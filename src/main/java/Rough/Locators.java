package Rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Locators

{
	
	public void test(String url , String sendkeys)
	{
		WebDriver driver = new ChromeDriver();
		
		
		WebElement element = null;
		
		driver.getWindowHandles();
		
		Select select = new Select(element);
		
		select.getOptions();
		
	}

}
