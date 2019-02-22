package TestNGFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethods 
{
           @Test(dependsOnGroups = "Homepage" , priority = 4)
           public void test1() 
           {
        	   
        	   System.out.println("Test1 method");
           }
           
           @Test(groups = "Homepage" , priority = 1) 
           public void test2()
           {
        	   Assert.assertTrue(false);
           }
           
           @Test(groups = "Homepage", priority = 2) 
           public void test3()
           {
        	   System.out.println("Test3 method");
           }
           
           
           @Test(groups = "Homepage" , priority = 3) 
           public void test4()
           {
        	   System.out.println("Test4 method");
           }
           
           
           @Test(dependsOnMethods = "test4" , priority = 4)
           public void test5()
           {
        	   System.out.println("dependsOnMethod");
           }
           
           
}
