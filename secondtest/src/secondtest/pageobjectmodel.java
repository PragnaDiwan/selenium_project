package secondtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobjectmodel {

	
	public static void main(String args)
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/index.php");
		
		
		
	}
}
