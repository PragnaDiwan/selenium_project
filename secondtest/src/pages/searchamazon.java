package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchamazon {
	
	
	public searchamazon(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="twotabsearchtextbox")
	public WebElement searchproduct;
	
	@FindBy(xpath="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")

	public WebElement searchonclick;


public void searchproduct()
{
	searchproduct.sendKeys("cycle");
}

public void seachonclick()
{
	
	searchonclick.click();
}

}