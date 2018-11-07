package Softassertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertNote 
{
     
	/**
	 * Notes 
	 * 1.hardassertion : Hard validation :  if testcase is getting failed immedetialy test case will be marked as failed and test case will be terminated 
	 * 2. SoftAssertion : if softassertion is getting failed then testcase will be marked as passed as well as next lines of the code will be executed
	 *   AssertAll : To mark the softassertion as failed if any of the testcase is getting failed 
	 * 
	 * */
	
	
	
	@Test
	public void test1()
	{
       SoftAssert softassert = new SoftAssert();
		
		System.out.println("Login");
		Assert.assertEquals(true, true);
		
		System.out.println("Create homepage page");
		softassert.assertEquals(true, false ,"unable to create homepage");
		
		
		System.out.println("Create deal page");
		softassert.assertEquals(true, true);
		
		System.out.println("Create contact page");
		softassert.assertEquals(true, false , "unable to create contacts") ;
		
		softassert.assertAll();
	}
	
}
