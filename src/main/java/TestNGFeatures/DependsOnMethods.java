package TestNGFeatures;

import org.testng.annotations.Test;

public class DependsOnMethods 
{
           @Test(dependsOnGroups = "Homepage" , priority = 4)
           public void test1() 
           {
        	   
        	   System.out.println("Test2 method");
           }
           
           @Test(groups = "Homepage" , priority = 1) 
           public void test2()
           {
        	   System.out.println(10/0);
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
           
           
           
           
}
