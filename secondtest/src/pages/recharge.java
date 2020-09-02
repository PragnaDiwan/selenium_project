package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class recharge { WebDriver driver;

	
	public recharge(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/section[1]/div[1]/div/div[1]/a")
	public WebElement billpay;

	
	@FindBy(xpath="//div[@class=' css-1wa3eu0-placeholder']")
	public WebElement operator;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/div/form/div[3]/div/label")
	public WebElement mobileno;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/div/form/div[4]/div/label")
	public WebElement amount;

	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[3]/div[1]/div/form/div[5]/button")
	public WebElement proceedbutton;
	
	
	public void recharge1() throws InterruptedException
	{
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[contains(@alt,'Bill Pay & Recharge')]")));


		billpay.click();

	Actions act=new Actions(driver);
		act.moveToElement(operator).click().sendKeys("vodafone",Keys.ENTER).build().perform();
		Thread.sleep(5000);


		act.moveToElement(mobileno).click().sendKeys("8141143966").build().perform();

		Thread.sleep(5000);

		act.moveToElement(amount).click().sendKeys("10").build().perform();
		Thread.sleep(5000);
		proceedbutton.click();

		
	}

	


}
