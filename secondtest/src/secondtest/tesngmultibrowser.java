package secondtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tesngmultibrowser {
	
	WebDriver driver;
     
	@BeforeTest
	@Parameters("browser")
	
	public void setup(String browser)
	{
		System.out.println("browsername is : "+browser);
		
		if(browser.equalsIgnoreCase("chrome"))
			
		{
			
			System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\java\\geckodriver-v0.26.0-win32\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie"))
		{
			
			System.setProperty("webdriver.ie.driver", "F:\\java\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
			
		}
		
		
	}
	
	
		
		  @Test
		  public void testpara() throws InterruptedException
		  {
			  
			  driver.get("https://flight.globalgarner.in/");
			  Thread.sleep(5000);
			  
			  System.out.println(driver.getCurrentUrl());
			  
		  }
		  
		  @AfterTest
		  public void teardown()
		  {
			// driver.close();
			  System.out.println("test is completed");
		  }
		
	}
	

