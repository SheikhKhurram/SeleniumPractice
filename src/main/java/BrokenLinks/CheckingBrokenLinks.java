package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CheckingBrokenLinks {
	public static String hreftValue;
	public static HttpURLConnection connection;

	@Test
	public void checkBrokenLinks() throws MalformedURLException, IOException {
		// HttpURLConnection connection = null;
		String response = null;
        int responseCode = 0;
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.juegostudio.com/");

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));

		allLinks.addAll(driver.findElements(By.tagName("img")));

		System.out.println(allLinks.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		for (WebElement list : allLinks) {
			hreftValue = list.getAttribute("href");

			if (hreftValue != null && (!hreftValue.contains("mailto")) && (!(hreftValue.contains("skype")))) {
				activeLinks.add(list);
			}

		}

		System.out.println(activeLinks.size());

		for (WebElement link : activeLinks) {
			hreftValue = link.getAttribute("href");

			System.out.println(hreftValue);

		     connection = (HttpURLConnection) new URL(hreftValue).openConnection();
		     
			connection.connect();

			response = connection.getResponseMessage();
			
            responseCode = connection.getResponseCode();     
			
			connection.disconnect();

			System.out.println("reponse after hitting URL " + hreftValue + "-----> " + "\""+response+"\""  + "  And reponse code is" +"----> " + "\""+responseCode+"\"");


		}

	}
}