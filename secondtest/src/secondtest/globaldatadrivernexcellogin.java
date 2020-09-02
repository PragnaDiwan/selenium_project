package secondtest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class globaldatadrivernexcellogin {
	
	public static void main(String args[]) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "f:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalgarner.in/#");
		driver.manage().window().maximize(); 
		
		File file=new File("f:\\java\\login.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		
		int noofrow=sheet.getLastRowNum();
		System.out.println(noofrow);
		
		sheet.createRow(4).createCell(0).setCellValue("7802951354");
		sheet.getRow(4).createCell(1).setCellValue("global916");
		
		
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
			
		for(int row=1;row<=noofrow;row++)
		
		
		{
			
			
			
			String username =sheet.getRow(row).getCell(0).toString();
			String password=sheet.getRow(row).getCell(1).getStringCellValue();
				
				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(username.toString());
		Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys(password);
		  
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[12]/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div[2]/button[1]/span")).click();
		Thread.sleep(2000);
		
		}
	}

	
	}
		
		
	
	
	



