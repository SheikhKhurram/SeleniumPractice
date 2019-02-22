package Rough;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Pra 
{

    @BeforeSuite
    public void settingSystemProperty()
    {
    	System.out.println("settingSystemProperty");
    }
	
	@BeforeTest
	public void launchingBrowser()
	{
		System.out.println("launchingBrowser");
	}
	
	@BeforeClass
	public void nav()
	{
		System.out.println("Navigating to perticular URL");
	}
	
	@BeforeMethod
	public void login ()
	{
		System.out.println("login to the app");
	}
	
	@Test 
	public void test()
	{
		System.out.println("Get the title ");
	}
	
	@AfterMethod 
	public void a()
	{
		System.out.println("logout from the app");
	}
	
	@AfterClass 
	public void clear()
	{
	    System.out.println("Delete all cookies");	
	}
	
	@AfterTest
	public void close()
	{
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void report ()
	{
		System.out.println("Generate report ");
	}
}
