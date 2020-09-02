import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FIRST {

	

	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    
	  String url = ("https://www.globalgarner.com");
		
	driver.get("https://www.globalgarner.com/");
	Thread.sleep(5000);	
		
			
		
		driver.get("https://www.alltestingstuff.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);		
		
		
		String stringname=driver.findElement(By.linkText("view all")).getText();
		System.out.println("stringname");
		
		
		
		driver.findElement(By.id("mobile")).sendKeys("8141143966");
		
		
		Thread.sleep(5000);	
		
		
		Thread.sleep(5000);	
		
		
		
	   
		
		driver.findElement(By.id("amount")).sendKeys("10");
	
		String title = driver.getTitle();
		
		int titleLength = driver.getTitle().length();  
	       
  
		System.out.println("Title of the page is : " + title); 
		System.out.println("Length of the title is : "+ titleLength);  
		
		String actualUrl = driver.getCurrentUrl();
		
		if(actualUrl.equals("https://www.globalgarner.com/")) {
			System.out.println("Verifiaction succesull");
		}
		else
			
		{System.out.println("verification fail");
		}
		
		
	driver.manage().window().maximize();	
	
	
		driver.get("https://best-shopping-websites.globalgarner.com/");
		
		Thread.sleep(5000);		
		
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().forward();
		
		driver.navigate().to("https://www.spicejet.com");
		
		Thread.sleep(5000);
		
		driver.close();
	}

}

