package secondtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class uploadsikuli {

	
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@id='imagesrc']")).sendKeys("C:\\Users\\NEW-1\\Desktop\\New folder\\open.PNG");
		
		Thread.sleep(5000);
		
		//String imagepath = "C:\\Users\\NEW-1\\Desktop\\New folder";
		
		//String inputpath = "C:\\Users\\NEW-1\\Desktop\\New folder";
		
		//Screen s = new Screen();
		
		//Pattern fileinputname = new Pattern("C:\\Users\\NEW-1\\Desktop\\New folder\\input.PNG");
		
		//Pattern open = new Pattern("C:\\Users\\NEW-1\\Desktop\\New folder\\open.PNG");
		
	//	Thread.sleep(3000);
		
		
	//	s.type(fileinputname,"C:\\Users\\NEW-1\\Desktop\\New folder\\termscondition.png");
		
		
		
		
		
		
		
		
		
		
		
		
				
				
	}
	
}
