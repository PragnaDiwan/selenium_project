package secondtest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flightnew {
	public static void main(String[] args) throws InterruptedException
	
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable--notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.globalgarner.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(15 ,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a/span")).click();
	//	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a/div")).click();
		
	//	driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[1]/div/div/input")).sendKeys("8141143966"); 
		  
		//  driver.findElement(By.name("password")).sendKeys("global916");
		  Thread.sleep(5000);
		 // driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
		
		  driver.findElement(By.xpath("//span[contains(text(),'Flight')]")).click();	
		
		
		
		Thread.sleep(6000);
	
		driver.findElement(By.id("react-select-3-input")).sendKeys("goa");
		Thread.sleep(5000);
		Actions tof = new Actions(driver);
		
		tof.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();
		
		driver.findElement(By.id("react-select-4-input")).sendKeys("mumbai");
		Thread.sleep(5000);
		 
		tof.sendKeys(Keys.DOWN,Keys.DOWN,Keys.DOWN,Keys.ENTER).build().perform();
		
		WebElement j =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/span[1]/span/div/input"));
		j.clear();
		j.sendKeys("12/25/2019");
		
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[5]/div/span/span/span")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/ul[1]/li[1]/div/div/div[2]/div/button[2]")).click();
		
	driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/div/ul[1]/li[2]/div/div/div[2]/div/button[2]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[2]/div[6]/button")).click();
	
	Thread.sleep(10000);
	

	
   WebElement k= driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/div/div/div/span[1]/div"));
   
   Thread.sleep(5000);
   
 //  k.clear();
	
   
   // for loop method to move slider 
 /*  k.click();    
   
   
  
   Thread.sleep(5000);
   
    for(int i=0;i<=10;i++)
    {
    tof.sendKeys(Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT,Keys.ARROW_RIGHT).build().perform();
    System.out.println(i);
   
    }  */
    
    
    
   
   
  tof.dragAndDropBy(k, 5, 0).build().perform(); // drag and drop by mouse
  
   
//for window scroll
   JavascriptExecutor js = (JavascriptExecutor) driver;
   
  //js.executeScript("window.scrollBy(0,500)");
     
       
    
/*	// FIND THE X AND Y CORDINATES
	
	Point MOUSE = k.getLocation();
	
	int XCORD= MOUSE.getX();
	
	System.out.println("element position x:"+XCORD +"");
	
	int ycord = MOUSE.getY();
	
	System.out.println("element of y side:"+ycord+"");
	
	//tof.clickAndHold(k);
	
	Thread.sleep(5000);
	
	//tof.moveByOffset(40, 0).build().perform();
	
   //tof.dragAndDropBy(k, 600, 0).build().perform();
	Thread.sleep(3000);  */
	
  // Thread.sleep(5000);
  
   
driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div[1]/p")).click();
  
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div[2]/div/div[4]/p")).click();  

Thread.sleep(5000);

//js.executeScript("window.scrollBy(200,0)");


/*WebElement m = driver.findElement(By.xpath("//label[contains(text(),'British Airways')]"));

Point p = m.getLocation();

int xcord=p.getX();
int ycord=p.getY();

System.out.println("element of x:"+xcord+"");
System.out.println("element of y:"+ycord+"");


tof.moveToElement(m).moveByOffset(418,1296).click().perform(); 


//WebDriverWait wait = new WebDriverWait(driver,15);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div/div[6]/div[2]/label[3]"))); */


 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[2]/div[2]/div[3]/div[1]/div/div/div[1]/div/div[2]/div/div/label/span")).click();
 Thread.sleep(5000);
  driver.findElement(By.xpath("//button[@class='bp3-button btn-flightbooking']")).click();
  
  driver.findElement(By.xpath("//body[@class='bp3-overlay-open']/div/div[@class='bp3-overlay bp3-overlay-open bp3-overlay-inline bp3-toast-container bp3-toast-container-top recipe-toaster']/div[@class='bp3-toast bp3-intent-danger bp3-overlay-content bp3-toast-appear-done bp3-toast-enter-done']/div[@class='bp3-button-group bp3-minimal']/button[@class='bp3-button']/span[@class='bp3-icon bp3-icon-cross']/*[1]")).click();
  
  
  //login
  Thread.sleep(5000);
  

  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[1]/div/div/input")).sendKeys("8141143966"); 
  
  driver.findElement(By.name("password")).sendKeys("global916");
  driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button")).click();
  
  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[2]/div/div/input")).sendKeys("8141143969");
  driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div[3]/div/div/input")).sendKeys("p@g.com");
  
  Thread.sleep(5000);
  
// WebDriverWait wait= new WebDriverWait(driver,15);
// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[3]/div[2]/div/div/div/div/div[1]/div[1]")));
 
 
 // driver.findElement(By.xpath("//div[contains(@class,'css-1wa3eu0-placeholder')]")).click();
  

/*  WebElement text= driver.findElement(By.xpath("//div[contains(@class,'css-1wa3eu0-placeholder')]"));
  
//text.click();
  
//text.sendKeys("Mr.");

  Point p = text.getLocation();
  
  int xcord=p.getX();
  int ycord=p.getY();

  System.out.println("element of x:"+xcord+"");
  System.out.println("element of y:"+ycord+""); 
  
//  tof.moveToElement(text).moveByOffset(441, 1283).click().perform(); */
  
  

  
  Thread.sleep(5000);
  
  
 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[3]/div[3]/div/div/input")).sendKeys("test");
 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[3]/div[4]/div/div/input")).sendKeys("test");
 driver.findElement(By.name("passport_no")).sendKeys("123sdsd");
 
// driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[5]/div[2]/div/div/div/div/div[1]")).sendKeys("Mr.");
  
 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[5]/div[3]/div/div/input")).sendKeys("test1");
 driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[5]/div[4]/div/div/input")).sendKeys("test2");
  
driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[5]/div[5]/div/div/input")).sendKeys("adsdsdsd");
  
//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[7]/div[2]/div/div/div/div/div[2]/div")).sendKeys("Mr.");

driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[7]/div[3]/div/div/input")).sendKeys("test2");
driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[7]/div[4]/div/div/input")).sendKeys("test");

driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[7]/div[5]/div/div/span/span/div/input")).sendKeys("12/31/2012");

driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div/div/div[2]/div[1]/div[2]/div[7]/div[6]/div/div/input")).sendKeys("dfdfdfdf");
Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='bp3-button bp3-intent-primary bp3-button flight-btnproceed']//span[@class='bp3-button-text'][contains(text(),'Proceed to pay')]")).click();
  
driver.findElement(By.linkText("www.globalgarner.com")).click();  
  

	}


}



	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


