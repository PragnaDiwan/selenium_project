package secondtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readexcelfile {
	@Test
	public void read() throws IOException
	{
	
	File file=new File("F:\\test.xlsx");
	FileInputStream fis =new FileInputStream(file);
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	
	XSSFSheet sheet=wb.getSheetAt(0);
	System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
	System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	System.out.println(sheet.getRow(0).getCell(2).getStringCellValue());
	
	sheet.createRow(3).createCell(3).setCellValue("home");
	
	FileOutputStream fos=new FileOutputStream(file);
	wb.write(fos);
	
	}
	
	

}
