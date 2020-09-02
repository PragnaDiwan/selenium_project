package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testngdataprovider {

	WebDriver driver;
	
	@BeforeMethod
	public void startup() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://accounts.globalgarner.in");
		 Thread.sleep(5000);
		
	}
	
	@Test(dataProvider="readdata")
	
	public void login(String user,String pass) throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[1]/div/div/input")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
			
	}
	
		
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}
	
	@DataProvider(name="readdata")
	
	public Object[][] readdata()
	
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0]="8141143966";
		data[0][1]="global916";
		data[1][0]="ashish@99";
		data[1][1]="global916";
		return data;
		
	}
}
