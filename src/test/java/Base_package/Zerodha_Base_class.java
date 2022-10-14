package Base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zerodha_Base_class {

	public static WebDriver driver;

	public static void luanch_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kiran\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	     driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
	}
}
