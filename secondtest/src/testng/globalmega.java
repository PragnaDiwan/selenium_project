package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.hotkey.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class globalmega {

	public WebDriver driver;
	
	@BeforeTest
	public  void megabrand() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mega-brands.globalgarner.com/");
	
	}
	

	
	@Test
	public void dropdown() throws InterruptedException
	
	{

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div/div[1]/div/div/div/div[2]/ul/li[14]/div/a")).click();
		
		Thread.sleep(5000);
	}
	
	@Test
	public void selectvalue() throws InterruptedException
	{
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div[1]/div/div/div[1]/div"));
		drop.click();
		Thread.sleep(5000);
		
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.DOWN,org.openqa.selenium.Keys.ARROW_DOWN,org.openqa.selenium.Keys.ENTER).build().perform();
		Thread.sleep(5000); 
		
	} 
	
	@Test
	public void selectqty() throws InterruptedException
	{
		WebElement qty=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div/div"));qty.click();
		Thread.sleep(5000);
		
		Actions act1=new Actions(driver);
		act1.sendKeys(org.openqa.selenium.Keys.ARROW_DOWN,org.openqa.selenium.Keys.ARROW_DOWN,org.openqa.selenium.Keys.ARROW_DOWN,org.openqa.selenium.Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
	}
		
		
	
	
	@AfterTest
	public  void teardown()
	{
		driver.close();
	}
	
	
	
	
}
