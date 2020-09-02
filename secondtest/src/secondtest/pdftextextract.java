package secondtest;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pdftextextract {
	
	WebDriver driver;
	@Test
	public void pdfextract() throws IOException
	{
	//	System.setProperty("webdriver.chrome.driver","F:\\java\\chromedriver_win32\\chromedriver.exe");
	//	driver=new ChromeDriver();
		FileInputStream obj=new FileInputStream("F:\\Electronics Brocher_5.pdf");
		PDDocument objpd=new PDDocument().load(obj);
		PDFTextStripper objstrip=new PDFTextStripper();
		String pdfcontent=objstrip.getText(objpd);
		System.out.println(pdfcontent);
		
		
	}

}
