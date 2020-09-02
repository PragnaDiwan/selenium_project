package mavendemo.mavendemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreportdemo {
	static WebDriver driver;

	public static void main(String[] args) {
		ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter("extentreport.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		ExtentTest test1 = extent.createTest("google search test","this is test");
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		test1.log(Status.INFO,"starting test case");
		driver.get("https://www.google.com/");
		test1.pass("navigated google");
		driver.findElement(By.name("q")).sendKeys("automation");
	}

}
