package secondtest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import sun.net.www.protocol.http.HttpURLConnection;

public class GLOBALGARNER {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalgarner.com/");
		
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("div.retail:nth-child(1) div.header-bar nav.bp3-navbar.pl-s-2.pr-s-2.pl-sm-2.pr-sm-2.bp3-blue div.bp3-navbar-container div.d-flex.retail-header div.col-xl-2.col-lg-2.col-md-3.col-sm-3.col-5.pl-s-2.pl-sm-0.pr-sm-2.pr-s-2.pl-md-2.pl-lg-1.pl-xl-0.icon-menu:nth-child(4) div.row.pull-right ul.bp3-navbar-group.bp3-align-right li:nth-child(4) span.bp3-popover-wrapper.login-menu span.bp3-popover-target > a.dropdown-toggle.header-profile-name.p-0")).click();
		//driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click(); 
		
		
		//driver.findElement(By.name("username")).sendKeys("8141143966");
	//	driver.findElement(By.name("password")).sendKeys("global916");
		
		//driver.findElement(By.xpath("//span[@class='bp3-button-text login-btn-text']")).click();
		
		driver.findElement(By.id("mobile")).sendKeys("8141143966");
		
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		
		
		
		List<WebElement>links =driver.findElements(By.tagName("a"));
		
		System.out.println("total links are:"+"  " +links.size());
		
		
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