package TestNGFeatures;

import org.testng.annotations.Test;

public class InvocationCount 

{
	
	@Test(invocationCount = 5)
	public void test ()
	{
		System.out.println("Testing invocation count property");
	}
	
}
