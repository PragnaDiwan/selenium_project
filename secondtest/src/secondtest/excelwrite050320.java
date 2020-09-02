package secondtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class excelwrite050320<XSSfsheet> {
	
	@Test
	public void excelwrite() throws IOException 
	{
		File file=new File("F:\\test.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sheet =wb.createSheet();
		sheet.createRow(0).createCell(0).setCellValue("name");
		sheet.getRow(0).createCell(1).setCellValue("age");
		sheet.createRow(1).createCell(1).setCellValue("height");
		
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos); 
		
		
		
	}
	
	
		
	

}
