import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	
	public static <webelement> void main(String[] args) throws InterruptedException
	
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.uitestpractice.com/Students/Select");
		driver.manage().window().maximize();
		
		Select i = new Select(driver.findElement(By.id("countriesSingle")));
		i.selectByValue("china");
		Thread.sleep(10000);
		i.selectByValue("india");
		
		
		List<WebElement>elements=i.getOptions();
		System.out.println(elements.size());
		
		for(WebElement element:elements)
			
		{System.out.println(element.getText());
		
		}
		Select j = new Select(driver.findElement(By.id("countriesMultiple")));
		j.selectByIndex(1);
		
		j.selectByIndex(3);
		j.selectByIndex(2);
		
		List<WebElement>options= j.getAllSelectedOptions();
		System.out.println(options.size());
		
		for(WebElement option:options)
			
{System.out.println(option.getText());


		
		}
		
		driver.findElement(By.xpath("//button[@id='dropdownMenu1']")).
		click();
		
		
		
		
	}}

