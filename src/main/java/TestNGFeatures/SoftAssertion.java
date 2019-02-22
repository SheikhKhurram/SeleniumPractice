package TestNGFeatures;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion 
{
	
	SoftAssert asrt = new SoftAssert();
	
	@Test
	public void test1()
	{
		System.out.println("line 1");
		asrt.assertEquals(false, false);
		System.out.println("line 2");
		asrt.assertTrue(false);
		System.out.println("line 3");
		asrt.assertTrue(true);
		System.out.println("line 4");
		asrt.assertAll();
		System.out.println("line 5");
	}
	
//	@Test
//	public void test2()
//	{
//	}
//
//	@Test
//	public void test3()
//	{
//	}

}
