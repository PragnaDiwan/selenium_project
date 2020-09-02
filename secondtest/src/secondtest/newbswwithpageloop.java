package secondtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newbswwithpageloop {
	
	WebDriver driver;
	@BeforeMethod
	public void startup() throws InterruptedException
	{
          ChromeOptions options =new ChromeOptions();
         
		options.addArguments("disable-notifications");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);	
		
				
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		driver.get("https://www.globalgarner.com/");
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("8141143966");
		Thread.sleep(2000);
		  driver.findElement(By.name("password")).sendKeys("global916");
		  
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();	
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,2000)");
		   Thread.sleep(5000);
		
		driver.findElement(By.linkText("Best Shopping Websites")).click();
		Thread.sleep(2000);	
		
        
       
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/a")).click();                  // click for all website name 
	    Thread.sleep(2000);
	    
        js.executeScript("window.scrollBy(0,2000)");
		   Thread.sleep(5000);
	}
		
		  
	
	
		  @Test
		  
		  public void second() throws InterruptedException
		  {			   	  
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			  
			  int count=0;
		   
		  while(driver.findElement(By.xpath("//span[contains(text(),'Load More')]")).isDisplayed()==true)   // condition check for load more button click
			  
		  {  WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Load More')]"));
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
				  
			Thread.sleep(5000);
		 js.executeScript("window.scrollBy(0,2000)"); 
	  		 	    		
		 
			  
			count++;
			System.out.println("count:"+count);
			
			if(count==6) {
	  		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='page']//div[@class='row']//div[@class=' brandsDiv']//a"));
			  
	 	    System.out.println(elements.size());
	 	     
	 	     
	 	  List<WebElement> links=driver.findElements(By.xpath("//div[@class=' brandsDiv']//a"));
	    	 
	 	  
	    	 		   ArrayList<String> targets = new ArrayList<String>();
	    	  		   //collect targets locations                                               //store all link for different location
	    	  		   for (WebElement link : links) {
	    	  			 //  System.out.println(link.getText());                         
	    	  			   
	    	  			  
	    	  		        targets.add(link.getAttribute("href"));  	
	    	  		        
	    	  		        
	    	  		       
	    	  		   }
	    	  		 for (String target : targets) {
	    	  			 
	    	  			  ((JavascriptExecutor) driver).executeScript("window.open()");
		    	  		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());            //open all link on new tab
		    	  		    driver.switchTo().window(tabs.get(1));                                                
	    	  			    System.out.println(tabs.size());
	    	  			  
	    	  			  driver.get(target);
	    	  			    	  			
	    	  			 
	    	  		        js.executeScript("window.scrollBy(0,5000)");
	    	  		        Thread.sleep(5000);
	    	  		        
	    	  		       WebElement element1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
	    	  		       element1.sendKeys(Keys.RETURN);  
	    			         		       
	    	  		        
	    	  		     if (js.executeScript("return document.readyState").toString().equals("complete")); //first link load  and status complete
	    	  		 	 Thread.sleep(10000);      	  		        
	    	  		       
	    	  		 	for (String handle : driver.getWindowHandles())
	    	  		 	{
	    	  	    	    driver.switchTo().window(handle);
	    	  	    	   // System.out.println(String.format(" url: %s", driver.getCurrentUrl()));
	    	  	    	  
	    	  	    	    String url=driver.getCurrentUrl();                                           //convert url to string
	    	  	    	   
	    	  	        	if((url.contains("globalgarner"))||(url.contains("blank")))
	    	  	    	    {
	    	  	        		
	    	  	    	    if(url.contains("dummy"))                                         // take final url and match with expirel ink
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
	    	  	   
	    	  		  driver.close();                                //  close url after loading one url
		    	      		    	      
		    		   Iterator<String> it = tabs.iterator();
		    		       String child = it.next();                              // get second tab or url
		    		       Thread.sleep(2000);                        
		    		       
		    		       driver.switchTo().window(child);      		      
	    	  		      	   
	    	  		 }
	    	  		      	  		     	 
	    		 
	    		
	    		       break;
	    		     }
				
		          
	    		     }  
		            
		
	    	  		 
		  }
		  
		  
		  
        }
	
	
		  



	

