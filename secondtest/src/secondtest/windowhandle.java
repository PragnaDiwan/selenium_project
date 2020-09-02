package secondtest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle {
	
	
	
		public static void main(String[] args)
		
		{
			
			System.setProperty("webdriver.chrome.driver" ,"F:\\java\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://demo.automationtesting.in/Windows.html");
			
			driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]")).click();
			
			System.out.println(driver.getTitle());
			
			         
			Set< String> s= driver.getWindowHandles();
			
			for(String i:s)
				
				
			{
				String t=driver.switchTo().window(i).getTitle();
				
				if(t.contains("Frames & windows"))
				{
				
				driver.close();}
			}
			
			
		}
	

}
