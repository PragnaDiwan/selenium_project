package secondtest;


import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BSW {

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
		driver.findElement(By.name("username")).sendKeys("8141143966");
		  driver.findElement(By.name("password")).sendKeys("global916");
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
	
			
			
		
		driver.findElement(By.linkText("Best Shopping Websites")).click();
		
		
        
        Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/a")).click();
        Thread.sleep(5000);
    Actions act=new Actions(driver);
    act.sendKeys(Keys.PAGE_DOWN);
    
    
      //  js.executeScript("window.scrollBy(0,2000)");
		//   Thread.sleep(5000);
	}
		/*   @Test
		   public void firstpage() throws InterruptedException 
		   {
		   
        List<WebElement> elements=driver.findElements(By.xpath("//div[@class='page']//div[@class='row']//div[@class=' brandsDiv']//a"));
    
       System.out.println(elements.size());
      
   
      List<WebElement> links=driver.findElements(By.xpath("//div[@class=' brandsDiv']//a"));
   //  List<WebElement> links=driver.findElements(By.xpath("//div[@class='col-xl-9 col-lg-9 col-md-9 col-sm-8 col-12 show-brands pl-4 p-s-0']//a"));
       
    		   ArrayList<String> targets = new ArrayList<String>();
    		   //collect targets locations
    		   for (WebElement link : links) {
    			   System.out.println(link.getText());
    			   
    		        targets.add(link.getAttribute("href"));  		    
    		        
    		   }
    		   
    		for (String target : targets) {
    		        driver.get(target);
    		        JavascriptExecutor js = (JavascriptExecutor) driver;
    		        js.executeScript("window.scrollBy(0,5000)");
    		        Thread.sleep(5000);
    		        
    		        WebElement element=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
    		        element.sendKeys(Keys.RETURN);    
  		         		       
    		        
    		        Thread.sleep(7000);
    		        System.out.println("title:"+driver.getTitle());   		        
    		        
    		       
    		     		   }  
		   } 
		   
		   
		   @Test
		   public void second() throws InterruptedException
		   {
    	//	driver.get("https://best-shopping-websites.globalgarner.in/search");
    		JavascriptExecutor js = (JavascriptExecutor) driver;
    		   js.executeScript("window.scrollBy(0,2000)");
    		   Thread.sleep(5000);
    		  
    	//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[3]/center/button/span")).sendKeys(Keys.RETURN);
    		 Thread.sleep(5000);
    		  
    	WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Load More')]"));
    		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    		Thread.sleep(5000);
    		 List<WebElement> linkall1s=driver.findElements(By.xpath("//div[@class=' brandsDiv']//a"));
    	       
  		   ArrayList<String> target1s = new ArrayList<String>();
  		   //collect targets locations
  		   for (WebElement nlink1 : linkall1s) {
  			   System.out.println(nlink1.getText());
  			   
  		        target1s.add(nlink1.getAttribute("href"));
  		      		        
  		   }
  		 for (String target1 : target1s) {
		        driver.get(target1);
		        js.executeScript("window.scrollBy(0,5000)");
		        Thread.sleep(5000);
		        
		        WebElement element1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
		        element1.sendKeys(Keys.RETURN);    
	         		       
		        
		        Thread.sleep(7000);
		        System.out.println("title:"+driver.getTitle());
		        
		        
		       
		     		   }  
    		 
    		 
		   } */
		   
		  
		  
		   
	{
		   
		 
			  WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Load More')]"));
			  ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
				  
			Thread.sleep(5000);
		 
			  {
				  
				  List<WebElement> linkall1s=driver.findElements(By.xpath("//div[@class=' brandsDiv']//a"));
				  
				  System.out.println(linkall1s.size());
		  		   ArrayList<String> target1s = new ArrayList<String>();
		  		   //collect targets locations
		  		   for (WebElement nlink1 : linkall1s) {
		  			   
		  			   System.out.println(nlink1.getText());
		  			   
		  		        target1s.add(nlink1.getAttribute("href"));
		  		        
		  		      		        
		  		   }
		  		 for (String target1 : target1s) {
				        driver.get(target1);
				        JavascriptExecutor js = (JavascriptExecutor) driver;
				        js.executeScript("window.scrollBy(0,5000)");
				        Thread.sleep(5000);
				        
				        WebElement element1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
				        element1.sendKeys(Keys.RETURN);    
			         		       
				        
				        Thread.sleep(7000);
				        System.out.println("title:"+driver.getTitle());
				        
				        
		  		 }
			  }
				  
				  
			  
		  
		   
			  
			  
			  // condition check for load more button click
			  
		 /* { //	driver.get("https://best-shopping-websites.globalgarner.in/search");
	    		JavascriptExecutor js = (JavascriptExecutor) driver;
	    		   js.executeScript("window.scrollBy(0,2000)");
	    		   Thread.sleep(5000);
	    		  
	    	//	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div/div[2]/div[3]/center/button/span")).sendKeys(Keys.RETURN);
	    		 Thread.sleep(5000);
	    		  
	    	WebElement element=driver.findElement(By.xpath("//span[contains(text(),'Load More')]"));
	    		((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	    		Thread.sleep(5000);
	    		 List<WebElement> linkall1s=driver.findElements(By.xpath("//div[@class=' brandsDiv']//a"));
	    	       
	  		   ArrayList<String> target1s = new ArrayList<String>();
	  		   //collect targets locations
	  		   for (WebElement nlink1 : linkall1s) {
	  			   System.out.println(nlink1.getText());
	  			   
	  		        target1s.add(nlink1.getAttribute("href"));
	  		      		        
	  		   }
	  		 for (String target1 : target1s) {
			        driver.get(target1);
			        js.executeScript("window.scrollBy(0,5000)");
			        Thread.sleep(5000);
			        
			        WebElement element1=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/button"));
			        element1.sendKeys(Keys.RETURN);    
		         		       
			        
			        Thread.sleep(7000);
			        System.out.println("title:"+driver.getTitle());
			        
			        
			       
			     		   }  
			   
		   } */
    		  
    	
    		 
    		
   		        
       
    
	
	

 
 
 
  



