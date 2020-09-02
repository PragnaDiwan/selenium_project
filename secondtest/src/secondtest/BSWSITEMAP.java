package secondtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSWSITEMAP {
	
	WebDriver driver;
	
	@BeforeMethod
	public void bswsite() throws InterruptedException
	
	{
		
ChromeOptions options =new ChromeOptions();
		
		options.addArguments("disable-notifications");
        System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.globalgarner.com/sitemap");
	//	driver.get("https://www.globalgarner.com/");
        driver.manage().window().maximize();
		
				 js.executeScript("window.scrollBy(0,5000)");
				 Thread.sleep(7000);
		
	}
	@Test
	
	public void bsw() throws InterruptedException
	
	
	{
		
		List<WebElement> elements=driver.findElements(By.tagName("h2"));
    	
	       System.out.println(elements.size());
	
		/*driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/ul/div[8]/a[1]")).click();
		Thread.sleep(5000);
		WebElement accept=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
		accept.click();
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[1]/div/div/input")).sendKeys("8141143966");
		  driver.findElement(By.name("password")).sendKeys("global916");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button")).click();
		System.out.println(driver.getTitle()); */
	}
	
/*	@AfterMethod
	public void teardown()
	{
		driver.close();
	}*/
	

}
