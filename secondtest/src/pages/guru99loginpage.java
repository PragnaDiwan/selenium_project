package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99loginpage {
	
	public guru99loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="uid")	
	public WebElement usen;
	
	@FindBy(name="password")
	public WebElement passwrodtext;
	
	@FindBy(name="btnLogin")
	public WebElement login;
	
	@FindBy(name="btnReset")
	public WebElement reset;
	
	
	public void name(String userid)
	{
		usen.sendKeys(userid);
	}
	
	public void password1(String password)
	
	{
		passwrodtext.sendKeys(password);
	}
	
	public void loginb()
	{
		login.click();
	}
}
