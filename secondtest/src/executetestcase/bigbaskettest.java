package executetestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.bigbasketproductcount;
import pages.bigbasketsearchpage;

public class bigbaskettest {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		bigbasketsearchpage test1 =new bigbasketsearchpage(driver);
		test1.searchbig("chocklate");
		test1.clickonsearchbig();
		
		
		bigbasketproductcount test2 = new bigbasketproductcount(driver);
		test2.listproduct1();
				
		
	}
}

