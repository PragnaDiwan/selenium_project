package secondtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class datadriven {
	
	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream("F://data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount= sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowcount;i++)
		{
		XSSFRow	currentrow = sheet.getRow(i);
		
		for(int j=0;j<colcount;j++)
			
		{
			String value=currentrow.getCell(j).toString();
			System.out.println("  " +value);
		}
		System.out.println();
		}
	}

}
