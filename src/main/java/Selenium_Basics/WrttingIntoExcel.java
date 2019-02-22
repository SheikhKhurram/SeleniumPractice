package Selenium_Basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrttingIntoExcel {

	public static void main(String[] args) throws IOException 
	{
	     
		File file = new File ("C:\\Users\\khurram\\Desktop\\CompanyData.xlsx");
       
		FileInputStream fileinput = new FileInputStream(file);
	 
		XSSFWorkbook wb = new XSSFWorkbook(fileinput);

		XSSFSheet sheet  = wb.getSheetAt(0);
		 
		sheet.getRow(1).createCell(4).setCellValue("pass");
		
		FileOutputStream output = new FileOutputStream(file);
		
		wb.write(output);

		
	}

}
