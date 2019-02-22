package RetryLogicTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCases {

	
	@Test(retryAnalyzer = Retry.class)
	public void test1()
	{
		Assert.assertTrue(false);
	}
	

	@Test
	public void test2()
	{
		Assert.assertTrue(false);
	}
	

	@Test
	public void test3()
	{
		Assert.assertTrue(true);
	}
	
	
}
