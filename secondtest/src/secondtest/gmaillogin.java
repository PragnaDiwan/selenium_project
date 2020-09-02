package secondtest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class gmaillogin {

	
	
		public static void main(String[] args) throws InterruptedException 
		
		{
			System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String url = "https://www.facebook.com";
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			//driver.findElement(By.id("email")).sendKeys("pragna.diwan@globalgarner.com");
			//driver.findElement(By.id("pass")).sendKeys("123456");
			//driver.findElement(By.id("u_0_b")).click();
			
		    driver.findElement(By.name("firstname")).sendKeys("yash");
		    driver.findElement(By.name("lastname")).sendKeys("diwan");
		    driver.findElement(By.id("u_0_r")).sendKeys("8141143963");
		    driver.findElement(By.id("u_0_w")).sendKeys("Global@916");
		    
		    WebElement dropdown = driver.findElement(By.id("day"));
		    Select j= new Select(dropdown);
		    
		    
		   // Select j= new Select(driver.findElement(By.id("day")));
			//j.selectByIndex(30);
			
			Select i= new Select(driver.findElement(By.id("month")));i.selectByVisibleText("Dec");
			
			Thread.sleep(5000);
		//	i.getOptions();
			
			//i.selectByVisibleText("Dec");
			
		//	Select k= new Select(driver.findElement(By.id("year")));
			//k.selectByVisibleText("1995");
			
			//driver.findElement(By.id("u_0_6")).click();
			
			//driver.findElement(By.id("u_0_8")).click();
			
			
			// Select l= new Select(driver.findElement(By.name("preferred_pronoun")));
			//	l.selectByIndex(1);
				
			//	driver.findElement(By.id("u_0_11")).sendKeys("female");    
				driver.findElement(By.id("u_0_13")).click();
			//	
			
		}
			
		
		
	
}
