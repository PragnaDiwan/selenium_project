package secondtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exceluposdatadriven {
	
	WebDriver driver;
	@Test
	public void upos() throws IOException, InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://upos.globalgarner.in/upos/login");
		driver.manage().window().maximize();
		
		File file =new File("f:\\upos.xlsx");
		FileInputStream fis =new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
	   int noofrows=sheet.getLastRowNum();
	   System.out.println(noofrows);
	   
	   for(int row=1;row<=noofrows;row++)
	   {
		   
		     
		   
		  
	       
		 int username=(int)sheet.getRow(row).getCell(0).getNumericCellValue();
	
		   String password= sheet.getRow(row).getCell(1).getStringCellValue();
		   
		  driver.findElement(By.id("username")).sendKeys(String.valueOf(username));
		  
		   Thread.sleep(2000);
		   
		   driver.findElement(By.id("password")).sendKeys(password);
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//button[text()='Login']")).click();

		   
		   
	   }
	   
		
		
		
	}
}
