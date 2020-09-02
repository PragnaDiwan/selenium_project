package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testnggoogledataprovider {
	
	WebDriver driver;
	
	@BeforeMethod
	public void searchgoogle() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://www.google.com/");		 
		 
	}
	
	
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

	
	@Test(dataProvider="googlesearch")
	public void search(String param) throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys(param);
		 Thread.sleep(5000);
		 driver.findElement(By.name("btnK")).click();
	}
	
	@DataProvider(name="googlesearch")
	public Object[] readdata()
		
	{
		Object[] data=new Object[2];
		data[0]="testing";
		data[1]="selenium";
		
		return data;
		
	}

}
