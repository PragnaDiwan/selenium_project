package secondtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsclass {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		

		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		//driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		//driver.findElement(By.id("btnLogin")).click();
		
		
		
		
		//WebElement admin = driver.findElement(By.id("menu_admin_viewAdminModule"));
		//WebElement useradmin = driver.findElement(By.id("menu_admin_UserManagement"));
		//WebElement user = driver.findElement(By.id("menu_admin_viewSystemUsers"));
		
		//Actions act = new Actions(driver);
		
		
		//act.moveToElement(admin).build().perform();
		
		//act.moveToElement(useradmin).build().perform();
		
		//act.moveToElement(user).click().build().perform();
		
		
			
		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("box6"));
		WebElement dest = driver.findElement(By.id("box106"));
		
		act.clickAndHold(source).moveToElement(dest).release().build().perform();
		
		
		
		
		
		
		
		
		
}
}
