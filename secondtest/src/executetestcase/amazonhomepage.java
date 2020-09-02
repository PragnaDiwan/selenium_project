package executetestcase;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.addtocart;

import pages.searchamazon;

public class amazonhomepage {
	
public static void main(String[] args) throws InterruptedException, IOException
{
	System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	TakesScreenshot ts= ((TakesScreenshot)driver);
	File dest=new File("F:\\java\\test.png");
	File src=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, dest);
	
	searchamazon test1=new searchamazon(driver);
	test1.searchproduct();
	test1.seachonclick();
	
	addtocart test2=new addtocart(driver);
	test2.clickonproduct();
	test2.cart();
	
	
	
	
	
}


}

