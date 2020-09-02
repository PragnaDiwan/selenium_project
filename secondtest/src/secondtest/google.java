package secondtest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class google {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("test");
		
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li[@role='presentation']"));
		
				
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
		
		if(list.get(i).getText().contains("testing"))
				{
					list.get(i).click();
				}
			}

}
}