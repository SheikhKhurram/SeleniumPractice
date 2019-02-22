package Selenium_Basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingDataFromExcel {

	public static void main(String[] args) 
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
    	  
    	String s = sheet.getRow(1).getCell(0).getStringCellValue();
    	
	      System.out.println(sheet.getLastRowNum());
	      
	      System.out.println(s);
	      
	}

}
