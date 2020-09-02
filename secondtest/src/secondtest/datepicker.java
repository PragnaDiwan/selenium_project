package secondtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class datepicker {
	
	
	
		public static void main(String[] args) throws InterruptedException
		{
			
			
			String month = "March,2020";
			String date = "20";
					
		//	System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");	
			
		//System.setProperty("webdriver.gecko.driver", "F:\\java\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		
		System.setProperty("webdriver.ie.driver", "F:\\java\\IEDriverServer_x64_2.48.0\\IEDriverServer.exe");
		
			
			WebDriver driver = new InternetExplorerDriver();
			
			//WebDriver driver = new FirefoxDriver();
		// driver.navigate().to("http://www.phptravels.net/");
			driver.get("http://www.phptravels.net/");
			
			driver.manage().window().maximize();
			Thread.sleep(2000);

			driver.findElement(By.cssSelector("#checkin")).click();
			
			Thread.sleep(2000);

			
			
			while(true)
				
			{ 
				String text = driver.findElement(By.xpath("//div[@class='datepicker--nav-title'][1]")).getText();
				
				
				if(text.equals(month))
				{
					break;
				}
				else
				{
					driver.findElement(By.xpath("/html/body/div[3]/div[1]/nav/div[3]/svg")).click();
				}
					
			
			}
			
		driver.findElement(By.xpath("//div[1]//div[1]//div[1]//div[2]//div[11]")).click();
			
			
			
		}
		
	

}
