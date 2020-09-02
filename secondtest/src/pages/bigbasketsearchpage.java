package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bigbasketsearchpage {
	
	public bigbasketsearchpage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"input\"]")
	public WebElement search;
	
	@FindBy(xpath="//*[@id=\"navbar-main\"]/div/div[3]/div/div/button")
	public WebElement searchonclick;
	
	
	public void searchbig(String Product) {
		
	search.sendKeys(Product);
		
	}
	
	public void clickonsearchbig()
	{
		searchonclick.click();
	}
}

