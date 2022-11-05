package Base_package;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkard_Base_class {

	public static WebDriver driver;
	
	public static void luanch_browser() throws EncryptedDocumentException, IOException
	{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
	}

}
