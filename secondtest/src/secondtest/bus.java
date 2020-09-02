package secondtest;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bus {
	
	
	
public static void main(String[] args) throws InterruptedException
	
	{
	
	LocalDate date=java.time.LocalDate.now();
	System.out.println(date);
	
	Calendar cal=Calendar.getInstance();
	System.out.println(cal.get(Calendar.DATE));
	cal.add(Calendar.DATE, 7);
	System.out.println(cal.getTime());
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver(options);
		
		driver.get("https://www.globalgarner.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/span[3]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div")).click();//for from textbox
		
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		
		act.sendKeys("mandi" +Keys.ENTER);
		
		act.build().perform();
		
	
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 
		Thread.sleep(5000);
		
	
		//WebElement j =driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[1]"));
		
		//j.click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[1]")).click();
	//	act.moveToElement(j).sendKeys("rajkot" +Keys.ENTER).build().perform();
		act.sendKeys("rajkot" +Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
            
		driver.findElement(By.cssSelector("div.retail:nth-child(1) div.Home-container div.container-fluid.p-0:nth-child(1) div.retail-strips.text-center div.container.retail-strip-box div.strip-body.text-left div.strip-form div.row.mt-3.mt-s-0 div.col-xl-1.col-lg-1.col-md-1.col-sm-2.col-12.px-sm-0.d-flex.justify-content-center.align-item-center:nth-child(2) > img.img-fluid.transitionImg")).click();
		
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[4]/span[1]/span/div/input")).sendKeys(date.toString());
        
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[5]/button")).click();
		
        
               Thread.sleep(5000);
	
		
			
	if(driver.getPageSource().contains("No Bus Found."))
						
	{	System.out.println("no result found");
	
	driver.navigate().back();
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[1]/span[3]")).click();
	Thread.sleep(5000);
	
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[1]/div/div/div/div")).click();//for from textbox
	
	Thread.sleep(5000);
	
	
	act.sendKeys("Ahmedabad" +Keys.ENTER);
	
	act.build().perform();
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[3]/div/div/div/div/div[1]/div[1]")).click();
	
		act.sendKeys("rajkot" +Keys.ENTER).build().perform();
		
		
		 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[4]/span[1]/span/div/input")).sendKeys(date.toString());
	        
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/div[2]/div/div/div[5]/button")).click();
			
	}
	
	

	
	
	//WebDriverWait wait = new WebDriverWait(driver,15);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div/div/div/div[1]/div/article[1]/div[2]/label[5]")));
	
	//driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div[3]/div/div/div/div[1]/div/article[1]/div[2]/label[5]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//label[contains(text(),'Shyam travels')]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//label[contains(text(),'Patel tours and travels')]")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-8 col-12']//div[2]//div[1]//div[2]//div[1]//div[2]//button[1]")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/div/div/div/div[5]/div[4]/div/span")).click();
	
	
	
    //boarding point
   
	
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/div/div/div/div[1]")).click();
    
    act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).perform();
    
	//act.sendKeys("Domestic Airport Parking 8866155888",Keys.ENTER);
	//act.build().perform();
		
	
	
	//dropping point
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[1]")).click();
		act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER);
		Thread.sleep(5000);
		act.build().perform(); 
		Thread.sleep(1000); 
		
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/div[3]/div[2]/div/button[2]/span")).click(); //proceed button click
	
	driver.findElement(By.name("username")).sendKeys("8141143966");
	
	driver.findElement(By.name("password")).sendKeys("global916");
	driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/form/div/div/div/div/div/div/div[3]/button/span/span")).click();
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//div[contains(text(),'Title')]")).click();
	
	act.sendKeys(Keys.DOWN,Keys.ENTER).perform();
	
	driver.findElement(By.name("name")).sendKeys("test");
	driver.findElement(By.name("age")).sendKeys("30");
	driver.findElement(By.name("email")).sendKeys("p@g.com");
	driver.findElement(By.name("mobile")).sendKeys("8141143969");
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/div[1]/div/div/div/div/div[7]/div/div/div[1]")).click();
	
	act.sendKeys(Keys.DOWN,Keys.DOWN,Keys.ENTER).perform();
	driver.findElement(By.name("id_number")).sendKeys("ahm2512q");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/div[1]/div/div/div/div/div[9]/div/div/div[1]")).click();
	act.sendKeys(Keys.ENTER).perform();
	
	
	driver.findElement(By.name("gg-coin")).sendKeys("27");
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/div[2]/div/div[7]/div[2]/button/span")).click();
	
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div/div[2]/div/div[10]/button/span")).click(); //proceed to pay
	
	Thread.sleep(5000);
	driver.findElement(By.name("ccard_number")).sendKeys("5123456789012345");
	
	driver.findElement(By.name("cname_on_card")).sendKeys("test");
	
	driver.findElement(By.name("ccvv_number")).sendKeys("123");
	
	Select month = new Select(driver.findElement(By.id("cexpiry_date_month")));
	
	month.selectByIndex(5);
	
	Select year = new Select(driver.findElement(By.id("cexpiry_date_year")));
	
	year.selectByVisibleText("2020");
	
	Thread.sleep(1000);
	
	driver.findElement(By.name("pay_button")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"credit\"]/div[3]/span/a")).click();
	
	
		
	
	
	
	}
}


			
			
	
		
		

		
		
		
		

