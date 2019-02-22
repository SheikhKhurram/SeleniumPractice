package Selenium_Basics;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandlingHttpsCertificate {

	public static void main(String[] args)
	{
	        
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
         
		WebDriver driver = new ChromeDriver(cap);
		
		
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setAcceptUntrustedCertificates(true);
		
		
         // driver  = new FirefoxDriver(profile);
		
	}

}
