package secondtest;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.xmlgraphics.image.loader.cache.ImageCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.asprise.ocr.Ocr;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class captcharead {
	static WebDriver driver;

	public static void main(String[] args) throws TesseractException, IOException {
		
		
		
		ITesseract image = new Tesseract();
		String path="F:\\font\\friendship_quotes_2.jpg";
		
				
String str=image.doOCR(new File(path));
System.out.println(str);
		
		
	}

}
    