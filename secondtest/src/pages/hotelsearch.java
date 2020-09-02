package pages;

import java.time.LocalDate;
import java.time.ZoneId;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hotelsearch {

	WebDriver driver;
	
	public hotelsearch(WebDriver driver) {
		
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	ZoneId z = ZoneId.of( "Asia/Kolkata" ) ; 
	LocalDate today = LocalDate.now( z ) ;
	

	
	@FindBy(xpath="//div[contains(@class,'css-yk16xz-control')]")
	public WebElement search;
	
	
	
	
	@FindBy(xpath="//input[@placeholder='From']")	
	public WebElement from;
	
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement to;
	
	@FindBy(className="dropdown-toggle px-1 py-3")
	public WebElement selectguest;
	
	@FindBy(xpath="//button[@class='bp3-button bp3-intent-primary search_btn d-block w-100 text-center']")
	public WebElement searchkey;
	
	public void searchhotel() throws InterruptedException
	{
			search.click();
		
		Thread.sleep(5000);
		Actions act=new Actions(driver);
		act.sendKeys("goa",Keys.DOWN,Keys.DOWN).build().perform();
		Thread.sleep(5000);
		
		
		
	}
	
	public void from() throws InterruptedException
	{
		Thread.sleep(5000);
		from.sendKeys(today.toString());
	}
	public void to()
	
	{
		to.sendKeys(today.toString());
	}
	
	public void selectguest()
	{
		
		selectguest.click();
	}
	
	public void searchkey()
	{
		searchkey.click();
	}
}
