package TestNGRScreenShot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



@Listeners(Cutomlistener.class)
public class TakingScreenShotFailedTestcase extends Base
{
        
	@Test
	public void takescreenShot1()
	{
		initilazation();
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void takeScreenShot2()
	{
		initilazation();
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void takeScreenShot3()
	{
		initilazation();
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
