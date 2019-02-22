package Selenium_Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CheckingCalender

{

	static Select select;

	public static void main(String[] args) 
	{
		String date = "31-11-2018";
		choosingDate(date);

	}

	public static void choosingDate(String date) {

		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.freecrm.com/index.html");

		driver.findElement(By.name("username")).sendKeys("khurram");

		driver.findElement(By.name("password")).sendKeys("Khurram@12");

		driver.findElement(By.xpath("//input[@type = 'submit']")).submit();

		driver.switchTo().frame("mainpanel");

		String[] s = date.split("-");
		String day = s[0];
		String month = s[1];
		String year = s[2];

		WebElement monthDropdown = driver.findElement(By.name("slctMonth"));
		select = new Select(monthDropdown);
		select.selectByValue(month);

		WebElement yearDropDown = driver.findElement(By.name("slctYear"));
		new Select(yearDropDown).selectByValue(year);

		String baseXpath = "//div[@id = 'crmcalendar']//td[@align = 'Center']//";

		String IterationXpath = "tr[]//td[]";
        
	
		for (int i = 2; i <=6 ; i++) 
		{
			for (int j = 1 ; j <=7 ; j++)
			{
					{
                    	WebElement elementDay = driver.findElement(By.xpath(baseXpath + "tr["+i+"]//" +  "td["+j+"]" ));
                    	
                    	try {
                    	if (elementDay.getText().equals(day))
                    	{
                    		elementDay.click();
                    	
                    	}
                    	}catch (NoSuchElementException e)
                    	{
                    		System.out.println("Enter the correct day");
                    	}
					} 
				}
		}
		
		
	}
}

