package secondtest;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreporttestng {
	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void setup()
	{
		 htmlreporter= new ExtentHtmlReporter("f:\\extent2.html");
		 extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
				
		
	}
	
	@Test
	public void test1() throws IOException
	{
		ExtentTest test1=extent.createTest("test1","this is fisrt testcase");
		test1.log(Status.INFO, "this is log");
		test1.info("this is informaton");
		test1.pass("this is logfail");
		test1.addScreenCaptureFromPath("f:\\screenshot.png");
		
	}
	@Test
	public void test2() throws IOException
	{
		ExtentTest test2=extent.createTest("test1","this is fisrt testcase");
		test2.log(Status.INFO, "this is log");
		test2.info("this is informaton");
		
		test2.addScreenCaptureFromPath("f:\\Untitled1.png");
		
	}
	
	
	@AfterSuite
	public void teardown()
	{
		extent.flush();
		
	}
	
	
	
}







