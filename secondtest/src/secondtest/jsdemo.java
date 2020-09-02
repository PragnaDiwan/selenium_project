package secondtest;



import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsdemo {
	
	public static void main(String [] args)
	
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.globalgarner.com/");
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//js.executeScript("window.scrollby(0,5000)");
		
		//WebElement Element = driver.findElement(By.linkText("food"));
		
		//js.executeScript("arguments[0].scrollIntoView();", Element);

		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		String str = "test123";
		
		byte[] encodesting = Base64.encodeBase64(str.getBytes());
		System.out.println("encoded string:"+new String(encodesting));
		
		byte[] decodestring = Base64.decodeBase64(encodesting);
		
		System.out.println("decode string:"+new String(decodestring));
		
		
		
	}

}
