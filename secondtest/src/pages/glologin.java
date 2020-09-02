package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class glologin {
	
	public glologin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/nav/div/div/div[4]/div/ul/li[4]/span/span/a")
	
	public WebElement imgclick;
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/ul/li[1]/a/div")
	public WebElement loginclick;
	
	@FindBy(name="username")
	public WebElement usertxt;
	
	@FindBy(name="password")
	public WebElement userpass;
	
	@FindBy(xpath="//button[@class='bp3-button bp3-button bp3-intent-primary bp3-button bp3-default bp3-fill login-btn']")
	public WebElement usrlogin;
	
	
	
	
	
	
	public void loginsetup(String uid,String pass)
	{
		imgclick.click();
		loginclick.click();
		usertxt.sendKeys(uid);
		userpass.sendKeys(pass);
		usrlogin.click();	
		
		
		
		
	
	
	}
}
