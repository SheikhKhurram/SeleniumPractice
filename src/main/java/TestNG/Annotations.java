package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations
{
 
	@BeforeSuite
	public void setUp()
	{
		System.out.println("Setting system properties");
		
	}
	
	@BeforeTest
	public void launching()
	
	{
		System.out.println("Launching browser");
	}
	
	@BeforeClass
	public void navigate()
	{
		System.out.println("Go to URL");
	}
	
	@BeforeMethod()
	public void login()
	{
		System.out.println("Login to app");
	}
	
	@Test
	public void getTitle()
	{
		System.out.println("Get page title");
	}
	
	@AfterMethod
	public void Logout()
	{
		System.out.println("Logout from the app");
	}
	
	@AfterClass
	public void deleteAllCookies()
	{
		System.out.println("deleting all cookies");

	}
	
	@AfterTest
	public void closeBrowser()
	{
		System.out.println("Close browser");
	}
	
	@AfterSuite
	public void generate_reports()
	{
		System.out.println("Generating reports");
	}
}
