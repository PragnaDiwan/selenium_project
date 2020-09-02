package secondtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sortedornot {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.id("animals"));
		
		Select se = new Select(element);
		
		ArrayList orignallist= new ArrayList();
		
		
		
		List<WebElement>options = se.getOptions();
		
		ArrayList templist = new ArrayList();
           for(WebElement e:options)
			 
		 {
        	   System.out.println(orignallist.add(e.getText()));
        	   System.out.println(templist.add(e.getText()));
		 }
           
           
          System.out.println(orignallist);
                 
          
       
          System.out.println(templist);
          
          Collections.sort(templist);
          
          System.out.println("after sorting templise:"+templist);
          System.out.println("after sorting templise:"+orignallist);
          
          if(orignallist==templist)
          {
        	  System.out.println("dropdown is sorted");
          }

          else
          {
        	  System.out.println("dropdown is not sorted");
          }
        	  
	}
	
	

}
