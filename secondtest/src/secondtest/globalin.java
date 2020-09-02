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




public class globalin {
	public static <alert> void main(String[] args) throws InterruptedException 
	
	{
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver =new ChromeDriver();
	driver.get("https://www.globalgarner.in/");
	driver.manage().window().maximize();
	

	
	driver.findElement(By.id("mobile")).sendKeys("8141143966");
	
	driver.findElement(By.xpath("(//div[contains(.,'Service Provider')])[16]")).
click();
	
	Thread.sleep(1000);
	
	Actions act = new Actions(driver);
	
	act.sendKeys("vodafone" +Keys.ENTER);
	act.build().perform();
	
     driver.findElement(By.id("amount")).sendKeys("10");
     
     driver.findElement(By.xpath("//button[@class='bp3-button bp3-intent-primary proceed-btn']")).click();
     
     driver.findElement(By.name("username")).sendKeys("ashish@99");
     driver.findElement(By.name("password")).sendKeys("global916");
     driver.findElement(By.xpath("//button[@class='bp3-button bp3-button bp3-intent-primary bp3-button bp3-default bp3-fill login-btn']")).click();
     
     driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
   driver.findElement(By.xpath("//button[@type='button'][contains(.,'Pay Now')]")).click();
     
   driver.findElement(By.xpath("//*[@id=\"credit\"]/div[3]/span/a")).click();
 
  
// WebDriverWait wait = new WebDriverWait(driver,5);
  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='button'][contains(.,'Pay Now')]")));
    // driver.findElement(By.xpath("//button[@type='button'][contains(.,'Pay Now')]")).click();
   
 /*   
  WebElement j=driver.findElement(By.xpath("button[@type='button'][contains(.,'Pay Now')]"));
  /*JavascriptExecutor  js =(JavascriptExecutor)driver;
   js.executeScript("arguments[0].click();",j); */

  
   /*Actions action = new Actions(driver);

  action.moveToElement(j).sendKeys(Keys.ENTER).build().perform();
    action.click();*/


   
     // String js = "arguments[0].style.height='auto'; arguments[0].style.visibility='visible';";
     // ((JavascriptExecutor) driver).executeScript(js, j);
      
   //   j.click();
                   
      
     // WebElement element = driver.findElement(By.xpath("//*[@id=\"credit\"]/div[3]/span/a"));
      
 
  
 // System.out.println(driver.getTitle());
  
      

		
      
    // driver.findElement(By.linkText("www.globalgarner.com")).click();
     
   //driver.getPageSource();
    
   // System.out.println(driver.getPageSource());
    
    
     
    
	
	
	
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

