package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testngglobalgarnerlogin {

	WebDriver driver;
	
	
	@Test
	@Parameters({"Browser","url","user","pass"})
	public void login(String Browser,String url,String user,String pass)
	
	{    
		if(Browser.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();}
		else if(Browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\java\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
			
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
		
	}
	
	
}
