package executetestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.guru99loginpage;
import pages.hompageobject;

public class testguru99site {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		
		guru99loginpage loginpage=new guru99loginpage(driver);
		
		
		loginpage.name("mgr123");
		loginpage.password1("mgr!23");
		loginpage.loginb();
		
		hompageobject clickonnew= new hompageobject(driver);
		clickonnew.newcustom();
	}
}
