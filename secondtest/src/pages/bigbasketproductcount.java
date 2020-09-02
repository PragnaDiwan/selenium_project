package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class bigbasketproductcount {
	public bigbasketproductcount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
	@FindBy(xpath="//div[@class='items']//div[@class='item prod-deck row ng-scope']")
	private List<WebElement> list;
	
	
	public void listproduct1()
	
	{
      
		for(int i=0;i<=list.size();i++)
		{
			System.out.println(list.get(i).getText());
			list.get(5).click();
		}
	}
}
