package secondtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demotour {
	
	public static void main(String[] args) throws InterruptedException
	
	{
	
            System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.newtours.demoaut.com/");
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/font[1]/b[1]")).getText();
	
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("login")).click();
	
	
	
	
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	
	//System.out.println(driver.getPageSource());
	
	
	
	
}
}