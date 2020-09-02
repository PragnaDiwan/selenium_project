package secondtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class loginglobalgarnerdataprovi {
	
	WebDriver driver;
	
	@Test
	@Parameters({"browser","user","pass"})
	public void login(String browser,String user,String pass)
	
	{
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.globalgarner.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a/span")).click();
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@class='bp3-button bp3-button bp3-intent-primary bp3-button bp3-default bp3-fill login-btn']")).click();
		
		
		
	}

}
