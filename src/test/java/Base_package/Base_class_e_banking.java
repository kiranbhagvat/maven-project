package Base_package;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class_e_banking {
	
	public static WebDriver driver;
    public static Logger logger;
	public static void luanch_browser() throws EncryptedDocumentException, IOException
	{
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();	
	}

}
               //logger=Logger.getLogger("e-banking");
               //PropertyConfigurator.configure("Log4j.properties");

		//	System.setProperty("webdriver.gegho.driver", "C:\\Users\\kiran\\Downloads\\Firefox Setup 104.0.2\\Firefox Setup 104.0.2.exe");
		  //   driver=new ChromeDriver();
			//driver.get("http://demo.guru99.com/v4/index.php");
			//driver.manage().window().maximize();
		
	

