package secondtest;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coockietest {

	
	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.globalgarner.com/");
		
	//	driver.get("https://www.amazon.in/");
		
		Set<Cookie> cookies = driver.manage().getCookies();
		
		System.out.println(cookies.size());
		
	//	for(Cookie cookie:cookies)
			
		{
			
	//		System.out.println(cookie.getName() +" : "+cookie.getValue());
		}
		
	//System.out.println(	driver.manage().getCookieNamed("__cfduid"));
		
		
		Cookie cobj= new Cookie("mycookie","1234567890");
		
		driver.manage().addCookie(cobj);
		cookies = driver.manage().getCookies();
		
		
		
for(Cookie cookie:cookies)
			
		{
			
			System.out.println(cookie.getName() +" : "+cookie.getValue());
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}


