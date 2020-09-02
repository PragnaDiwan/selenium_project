package secondtest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.bind.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googlesearch {
	
	 public static void main(String[] args) throws InterruptedException
		
		{
		 System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
		 driver.findElement(By.name("q")).sendKeys("testing");
	driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);
		 
		 
		 List<WebElement> suggestion= driver.findElements(By.className("sb11"));
		 for(WebElement suggest:suggestion)
			 
		 {
			 System.out.println(suggest.getText());
		 }
		 
		
		 
		
	}
	 

}
