package secondtest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {
	public static void main(String[] args) throws InterruptedException, IOException
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://globalwebguru.co.uk/");
		//driver.get("https://www.uvdesk.com/");
		
		Thread.sleep(5000);
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(WebElement link:links)
		{
			System.out.println((link.getText()+ "    " +link.getAttribute("href")));
			
			URL url = new URL(link.getAttribute("href"));                               //   create object for url
			
			HttpURLConnection httpcon = (HttpURLConnection) url.openConnection(); // create connection object
			
			httpcon.connect();             //create connection
			
			int rescode=httpcon.getResponseCode();
			
			if(rescode >= 400)
			{
			System.out.println(link.getAttribute("href") +                  "link is broken");
			}
			else
				
			{
				System.out.println(link.getAttribute("href") + "      " +   "link is not broken");
			}
			
		}
		
		
	}

}
