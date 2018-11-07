package Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeHeadless 
{
    @Test
    public void headlessChrome()
    {
       ChromeOptions option = new ChromeOptions();
       option.addArguments("window-size=1400, 800");
       option.addArguments("headless");
       System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
       WebDriver driver = new ChromeDriver(option);
       
       driver.get("http://www.google.com");
       
       System.out.println(driver.getTitle());
    }
}
