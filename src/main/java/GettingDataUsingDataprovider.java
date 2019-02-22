import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GettingDataUsingDataprovider {

	
	@Test(dataProvider = "getData")
	public void gettingData(String company , String emp , String phone , String email)
	{
		System.out.println(company +"   "+ emp +"   "+ phone +"   "+ email);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		FileInputStream file = null ;
		  XSSFWorkbook wb = null;
		  XSSFSheet sheet = null;

		  
		  try
	      {
	    	   file = new FileInputStream("C:\\Users\\khurram\\Desktop\\CompanyData.xlsx");
	    	  
	    	   wb = new XSSFWorkbook(file);
	    	  
	      }
		 
	      catch(FileNotFoundException e)
	      {
	    	  e.printStackTrace();
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }
		  
		  sheet = wb.getSheetAt(0);
		  
		  Object[][] obj = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		  
         for (int i=0 ; i<sheet.getLastRowNum() ; i++)
         {
        	 for (int j = 0 ; j < sheet.getRow(0).getLastCellNum() ; j++)
        	 {
        		 obj[i][j] = sheet.getRow(i).getCell(j).toString();
        	 }
         }
		
         return obj;
	}
	
	
}
