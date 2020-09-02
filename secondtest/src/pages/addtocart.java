package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class addtocart {

	public addtocart(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=2']//img[@class='s-image']")
	public WebElement clickonproduct;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")	
	public WebElement cart;
	
	
	
	public void clickonproduct() throws InterruptedException
	{
		Thread.sleep(2000);
		clickonproduct.click();
	}
	
	
	public void cart() throws InterruptedException
	{
		
		cart.click();
	}
	
	
				
				
}