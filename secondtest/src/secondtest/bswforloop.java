package secondtest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class bswforloop {
	WebDriver driver;


@SuppressWarnings("unlikely-arg-type")
@Test
public void startup() throws InterruptedException, MalformedURLException, MessagingException
{
	
	ChromeOptions options =new ChromeOptions();
	
	options.addArguments("disable-notifications");
	
	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	
	System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver(options);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	driver.get("https://www.globalgarner.com/sitemap");
	
	

	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a/span")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
	driver.findElement(By.name("username")).sendKeys("8141143966");
	  driver.findElement(By.name("password")).sendKeys("global916");
	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
	Thread.sleep(5000);


			WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[1]/div/div/div/ul/li[10]/a"));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);  
	Thread.sleep(15000); 
	
	/* long start = System.currentTimeMillis();

	

	 WebElement ele = driver.findElement(By.xpath("/html/body/div/div/div[4]/div[1]/div/div[1]/div/div/div/ul/li[10]/a"));  //pageload time
	 long finish = System.currentTimeMillis();
	 long totalTime = finish - start; 
	 System.out.println("Total Time for page load - "+totalTime); */

	
   
   List<WebElement>links=driver.findElements(By.xpath("//div[@class='sitemap-list mb-5']//h2[contains(text(), 'best-shopping-websites')]//following-sibling::*"));
   
   System.out.println(links.size());
   
   ArrayList<String> targets=new ArrayList<String>();
   for(WebElement link:links)
   {
	   System.out.println(link.getText());
	   
	   targets.add(link.getAttribute("href"));  
	   
   }
   
   for(String target:targets)
   {
	 
	 ((JavascriptExecutor) driver).executeScript("window.open()");
	 
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    System.out.println(tabs.size());
		  driver.switchTo().window(tabs.get(1));  
		  	    
		    
	  driver.get(target);  
		
       
      WebElement element1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
      element1.sendKeys(Keys.RETURN);  
       
     
     Thread.sleep(7000);
     if (js.executeScript("return document.readyState").toString().equals("complete"));
 	 Thread.sleep(10000); 
      
         
      
       
  
   for (String handle : driver.getWindowHandles()) {
    	    driver.switchTo().window(handle);
    	   // System.out.println(String.format(" url: %s", driver.getCurrentUrl()));
    	  
    	    String url=driver.getCurrentUrl();   
    	   
        	if((url.contains("globalgarner"))||(url.contains("blank")))
    	    {
        		
    	    if(url.contains("dummy"))
    	    	{ 
    	    		System.out.println(url);
    	    		Thread.sleep(2000);
    	     	   System.out.println("Page Is not loaded.");
    	     	       	 
    	    	}
       }
    	    
    	    else
    	    {
    	    	
    	    	
    	    	System.out.println(url);
    	    	if(url.contains("dummy"))
    	    	{
    	    		System.out.println("page is not loaded");
    	    	}
    	    }
    	
   }
   
     
        driver.close();      
      

      
   Iterator<String> it = tabs.iterator();
       String child = it.next();
       Thread.sleep(2000); 
       
       driver.switchTo().window(child);    
    
    
       
     }   
   
     }
	  
}


