package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_package.Flipkard_Base_class;
import Flipkard.Login_page;
import Flipkard.Select_product;

public class Test_class_Flipkard extends Flipkard_Base_class{

	Login_page lp;
	Select_product s;
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		Flipkard_Base_class.luanch_browser();
	}
	@Test
	public void LoginToApllication() throws InterruptedException {
		
		lp=new Login_page(driver);
		lp.enterUsername("9370713427");
		lp.enterPassword("Patil@123");
		Thread.sleep(3000);
		lp.clickOnLoginButton();
		
		String Expurl="https://www.flipkart.com/";
		String Acturl=driver.getCurrentUrl();
		
		Assert.assertEquals(Acturl, Expurl, "We are login Succesful");
		lp.entertheProductName("T-Shirts");
		lp.ClickOnSubmitButton();
		
	}
	@Test
	
	public void SelectProduct()
	{
		s=new Select_product(driver);
		s.SelectProductFromOption();
		
	}
}
