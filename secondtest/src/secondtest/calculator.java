package secondtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



public class calculator {

	
	public static void main(String[] args) throws IOException, InterruptedException
	
	{
		 System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
         driver.get("https://www.bigbasket.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Sign up")).click();
		
		FileInputStream file = new FileInputStream("C:\\Users\\NEW-1\\Desktop\\New folder\\register.xlsx");
		
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int noofrow = sheet.getLastRowNum();
		
		System.out.println("no of rows:" +noofrow);
		
		for(int row =1;row<=noofrow;row++)
			
			
			
		{
			XSSFRow currentrow=sheet.getRow(row);
			
			String firstname = currentrow.getCell(0).getStringCellValue();
			String lastname= currentrow.getCell(1).getStringCellValue();
			String email=currentrow.getCell(2).getStringCellValue();
			String password = currentrow.getCell(3).getStringCellValue();
			
			driver.findElement(By.id("fname")).clear();
			driver.findElement(By.id("fname")).sendKeys(firstname);
			
			driver.findElement(By.id("lname")).clear();
			driver.findElement(By.id("lname")).sendKeys(lastname);
			
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("email")).sendKeys(email);
			
			driver.findElement(By.name("password")).clear();
			driver.findElement(By.name("password")).sendKeys(password);
			
			driver.findElement(By.xpath("//button[@class='btn btn-default signup-btn']"))
			
			.click();
			
			
			Thread.sleep(10000);
			
			if(driver.getPageSource().contains("This email address is already in use."))
			{
				System.out.println("registrantion unsuceesful");
			}
			
			else
			{
				System.out.println("registration successful");
			}
			
		}
		
		
		
		
		
	}
}
