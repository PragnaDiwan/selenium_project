package secondtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreportdemo {

	public static void main(String[] args) {
		ExtentHtmlReporter  htmlreport = new ExtentHtmlReporter ("extentreports.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlreport);
		ExtentTest test1=extent.createTest("google search test one","this is test");
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		test1.log(Status.INFO,"starting testcase");
		driver.get("https://www.bigbasket.com/");
		test1.pass( "navigated to bigbasket");
		test1.info("test completed");
		
       extent.flush();
	}

	
}
