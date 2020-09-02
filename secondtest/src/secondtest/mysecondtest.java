package secondtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mysecondtest {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
		
		driver.get("https://www.globalgarner.com/");
	driver.manage().window().maximize();	
	
	
		driver.get("https://best-shopping-websites.globalgarner.com/");
		
		Thread.sleep(500);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
	}

}
