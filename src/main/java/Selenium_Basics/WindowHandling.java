package Selenium_Basics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.Map;
public class WindowHandling 
{
    @Test
    public void windowHandling()
    {
    	
    	System.setProperty("webdriver.chrome.driver" , "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://popuptest.com/goodpopups.html");
		
		System.out.println(driver.getTitle());
		
		String pa = driver.getWindowHandle();
		System.out.println("parent   ----"+pa);
		
		driver.findElement(By.className("black")).click();
		
		Set<String> handle  = driver.getWindowHandles();
		
		System.out.println(handle.size());
		
		Iterator<String> itr  = handle.iterator();
		
		Map<String, String> m = new HashMap<String, String>();
		
		int i =0 ;
		while (itr.hasNext())
		{
			m.put("window"+i+"" ,itr.next());
			i++;
		}
		
		String parent = m.get("window0");
		System.out.println("parent " + parent);
		
		String child = m.get("window1");
		System.out.println("child " + child);

		driver.switchTo().window(child);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
    }
}
