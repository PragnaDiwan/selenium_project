package executetestcase;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.glologin;

import pages.recharge;
import pages.rechargeapplyggvoucher;

public class globalogintest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
	
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");

		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver(options);
		
		//JavascriptExecutor js= (JavascriptExecutor)(driver);

		driver.get("https://www.globalgarner.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void newtest() throws InterruptedException
	{
		

		glologin login1 = new glologin(driver);

		
		login1.loginsetup("8141143966", "global916");
	   //  js.executeScript("window.scrollby(2000,0)");
	     
	     Thread.sleep(5000);
	     recharge r1=new recharge(driver);
           r1.recharge1();	
		
		   rechargeapplyggvoucher gg=new rechargeapplyggvoucher(driver);
		   gg.applyvoucher();
		
	}

}
