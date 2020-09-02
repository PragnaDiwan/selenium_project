package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rechargeapplyggvoucher {

	WebDriver driver;
	
	public rechargeapplyggvoucher(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	//@FindBy(xpath="//button[@class='bp3-button bp3-button-sm bp3-intent-primary']")
	//public WebElement clickonapplybutton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div/div[2]/div[3]/div[2]/button/span")
	public WebElement clickonpayowbutton;
			
	public void applyvoucher() throws InterruptedException
	
	{
		
		Actions act1=new Actions(driver);
		act1.moveToElement(clickonpayowbutton).click().build().perform();
		//clickonpayowbutton.click();
		//clickonapplybutton.click();
		Thread.sleep(5000);
		/*if(driver.getPageSource().contains("You have not any voucher" ))
				{
			System.out.println("there is no GG voucher");
				}
				*/
	}
}

