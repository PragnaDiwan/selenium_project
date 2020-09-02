package executetestcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import pages.hotelsearch;

public class hotelhomepage {
	
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://hotel.globalgarner.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		hotelsearch test=new hotelsearch(driver);
		test.searchhotel();	
		test.from();
		test.to();
		test.selectguest();
		test.searchkey();
		
		
	}

}

