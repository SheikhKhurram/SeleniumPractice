package TestNGFeatures;

import org.testng.annotations.Test;

public class ExceptedException 
{
      @Test (expectedExceptions = NumberFormatException.class)
      public void test()
      {
    	  String s = "100a";
    	  Integer.parseInt(s);
      }
}
