package secondtest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class capturescreenshot { 

	static WebDriver driver;              //mukesh motvani
		
		@Test
		public static void capture() {
			
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("fakebox-input")).sendKeys("test");
		
		}
		
		
		@AfterMethod
		public void failresult(ITestResult result) throws IOException
		{
			if(ITestResult.FAILURE==result.getStatus()){
			
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:/selenium/error.png"));
		
		System.out.println("the Screenshot is taken");
		}
		
		
	}}


