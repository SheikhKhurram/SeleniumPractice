package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


/*
 * Following are the logging levels 
 * 1.Info 
 * 2.debug 
 * 3.fatal 
 * 4.log
 * 5.warning
 * **/

public class CodeOfExtentReport
{
	ExtentHtmlReporter htmlReporter;
    ExtentReports extent;
    ExtentTest logger;
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
     htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\test-output\\extentReport.html");
     extent = new ExtentReports();
 
     extent.attachReporter(htmlReporter);
   
     extent.setSystemInfo("HostName", "Khurram.pc");
     extent.setSystemInfo("Envirornment", "QA");
     extent.setSystemInfo("userName", "Khurram");
	}
	
	@AfterTest
	public void endReport()
	{
		extent.flush();
	}
	
	@BeforeMethod
	public void prerequisities()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumJar\\Chorme.exe\\chromedriver.exe" );
		driver =  new ChromeDriver();
		driver.get("https://www.naukri.com/");
	     	
	}
	
//	@Test
//	public void test1()
//	{
//		String expected = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
//	        Assert.assertEquals(driver.getTitle() , expected);
//	}
	
	@Test
	public void test2()
	{
		String actual = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
		Assert.assertEquals(actual+123, driver.getTitle());
	}
	
	@Test ()
	public void test3()
	{
           throw new SkipException("this method is skipped");    		
	}
	
	@AfterMethod()
	public void tearDown(ITestResult result) throws IOException
	{
        logger = extent.createTest(result.getName());
        
		if (result.getStatus() == ITestResult.SUCCESS)
		{
			logger.log(Status.PASS, "Testcase is passed " + result.getName());
		}
		
		else if (result.getStatus() == ITestResult.FAILURE)
		{
			logger.log(Status.FAIL, "TestCase"+result.getName()+"is failed" );
			logger.log(Status.FAIL, "error status " + result.getThrowable());
			logger.addScreenCaptureFromPath(CodeOfExtentReport.takeScreenShot(driver, result.getName()));
		}
		
		else if (result.getStatus() == ITestResult.SKIP)
		{
			logger.log(Status.SKIP, "testcase "+result.getName()+" is skipped");
		}
		driver.quit();
	}
	
	public static String takeScreenShot(WebDriver driver ,  String methodName) throws IOException
	{
		String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "src\\test\\java\\FailedTestCases"+methodName+date+ ".png";
		FileUtils.copyFile(file,  new File(destination));
		return destination;
	}
	
}
