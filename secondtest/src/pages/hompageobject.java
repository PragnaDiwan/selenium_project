package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hompageobject {
	
	public hompageobject(WebDriver driver) 
	
	{PageFactory.initElements(driver, this);
	
}

	@FindBy(linkText="New Customer")
	public WebElement custom;
	
	public void newcustom()
	{
		custom.click();
	}
	
	
}
