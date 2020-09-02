
package secondtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


public class rechargeglobal {
	

	
	
		public static <alert> void main(String[] args) throws InterruptedException 
		
		{
			
			ChromeOptions options = new ChromeOptions();
			
			options.addArguments("disable-notifications");
			System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver(options);
			//WebDriver driver =new ChromeDriver();
		driver.get("https://www.globalgarner.com/");
		
	
		
		driver.findElement(By.id("mobile")).sendKeys("8141143966");
		
		driver.findElement(By.xpath("(//div[contains(.,'Service Provider')])[16]")).
	click();
		
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.sendKeys("vodafone" +Keys.ENTER);
		act.build().perform();
		
         driver.findElement(By.id("amount")).sendKeys("10");
         
         driver.findElement(By.xpath("//button[@class='bp3-button bp3-intent-primary proceed-btn']")).click();
         
         driver.findElement(By.name("username")).sendKeys("8141143966");
         driver.findElement(By.name("password")).sendKeys("global916");
         driver.findElement(By.xpath("//button[@class='bp3-button bp3-button bp3-intent-primary bp3-button bp3-default bp3-fill login-btn']")).click();
         
         driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         
          driver.findElement(By.xpath("//button[@type='button'][contains(.,'Pay Now')]")).click();
          
          
       
      //   WebDriverWait wait = new WebDriverWait(driver,30);
       //   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"credit\"]/div[3]/span/a")));
        
          
          
          
      
          

        // driver.findElement(By.xpath("//*[@id=\"credit\"]/div[3]/span/a")).click();
         
         JavascriptExecutor  js =(JavascriptExecutor)driver;
         WebElement j=driver.findElement(By.xpath("//*[@id=\"credit\"]/div[3]/span/a"));
         js.executeScript("arguments[0].click();",j);
        // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      
         System.out.println(driver.getTitle());
         
      // Thread.sleep(10000);
         
 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         
          
          //WebElement element = driver.findElement(By.xpath("//*[@id=\"credit\"]/div[3]/span/a"));
        
      //Actions action = new Actions(driver);

  //    action.moveToElement(element).sendKeys(Keys.ENTER,Keys.ENTER).build().perform();
  //    action.click();
      
    
    // 
      
      

  		
          
        // driver.findElement(By.linkText("www.globalgarner.com")).click();
         
       //driver.getPageSource();
        
       // System.out.println(driver.getPageSource());
        
        
         
        
      
		
		
		
		
		}
}
