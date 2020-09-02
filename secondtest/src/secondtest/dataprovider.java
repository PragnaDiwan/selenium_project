package secondtest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	
	@Test(dataProvider="getdata")
	public void setdata(String username,String password)
	{
		
		System.out.println("the username is ::"+username);
		System.out.println("the password is ::"+password);
		
	}
	
	@DataProvider
	public Object[][] getdata()
			{
				
		Object[][] data =new Object[3][2];
		
		
		data[0][0] ="user1";
		data[0][1]="abcdef";
		
		return data;
			}
	
	
	

}
