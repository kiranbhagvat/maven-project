package Base_package;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static WebDriver driver;
	public static void luanch_browser() throws EncryptedDocumentException, IOException
	{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();	
	}

}
