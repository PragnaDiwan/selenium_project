package secondtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import de.bezier.data.XlsReader;

public class bigbasket {
	public static void main(String args[]) throws InterruptedException, IOException
	{
		   WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30 ,TimeUnit.SECONDS);
	/*	driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='gplusBtn smGlobalBtn']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
		Thread.sleep(5000);
		// enter password and click next
		driver.findElement(By.name("password")).sendKeys("sagar1997" +Keys.ENTER);
		Thread.sleep(5000); */
		
	driver.findElement(By.xpath("//*[@id=\"input\"]")).sendKeys("chocklate");
		
		driver.findElement(By.xpath("//*[@id=\"navbar-main\"]/div/div[3]/div/div[1]/button/i[1]")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("scrollBy(0, 2500)");
	    
	    WebElement pageNumberdisplayer = (new WebDriverWait(driver, 10)).until
	            (ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.row")));

		
	//	List<WebElement>list=driver.findElements(By.xpath("//div[@class='items']//div[@class='item prod-deck row ng-scope']"));
		
		List<WebElement>list=driver.findElements(By.xpath("//div[@class='item prod-deck row ng-scope']//div[@class='col-sm-12 col-xs-7 prod-name']"));
		List<WebElement>pri=driver.findElements(By.xpath("//div[@class='item prod-deck row ng-scope']//span[@class='discnt-price']"));
		Thread.sleep(5000);
		System.out.println(list.size());
		Thread.sleep(5000);
		
         
		
		
		
		

		for(int i=0;i<=list.size();i++)
		{
			System.out.println("product name:"+list.get(i).getText());
			System.out.println("price:"+pri.get(i).getText());
			
			System.out.println("**********************************************");
						
			//	list.get(5).click();
			
		
	} 
		
			
	} 
	
}
