package secondtest;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	
	WebDriver driver;
	
	
  @Test
    
  public void startup() throws InterruptedException
  
  {    
	  
	  
	  ChromeOptions options = new ChromeOptions();
	   options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	    
	  driver.get("https://www.globalgarner.com/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();  
	 
	  
	  driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a/span")).click();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
	  System.out.println(driver.getTitle());
		 String actual="Big Cashback Deals | Cashback Voucher | Global Garner";
		 String expected=driver.getTitle();
		
	 
	  Assert.assertEquals(actual, expected);
	  
	  
  }
  
  @Test(dependsOnMethods ="startup" )
  
  public void login() throws InterruptedException
	  
  { 
  
	  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[1]/div/div/input")).sendKeys("8141143966");
	  Thread.sleep(5000);
	  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[2]/div/div/input")).sendKeys("global916");
	  driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();   
	  
  
  
  }
  
  
}




