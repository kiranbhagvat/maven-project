package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_package.Zerodha_Base_class;
import utility.Utility;
import zeroda.Login_to_zerodha;
import zeroda.Set_pin;

public class Test_class_zeridha_kite extends Zerodha_Base_class {
	
	Login_to_zerodha l;
	Set_pin sp;
	
	@BeforeClass
	public void launchBrowser()
	{
	  Zerodha_Base_class.luanch_browser();
	}
	@Test(priority=1)
	
	public void loginToApplication() throws EncryptedDocumentException, IOException, InterruptedException
	{
		l=new Login_to_zerodha(driver);
		String Actuuserid=l.entertheUserName(Utility.parameterization(12, 0));
		l.enterPassword("Patil@123");
		Thread.sleep(3000);
		l.clickOnSubmitButton();
		Thread.sleep(3000);
		String Expuserid="HBD545";
		
		Assert.assertEquals(Actuuserid, Actuuserid, "User name is correct");
		
		Utility.captureScreenshot(driver, "ZerodhaLogin");
	}
	@Test(priority=2)
	
	public void Set_Pin() throws EncryptedDocumentException, IOException, InterruptedException
	{
		sp=new Set_pin(driver);
		sp.enterPin(Utility.parameterization(14, 0));
		Thread.sleep(3000);
		sp.enterMObilePin();
		sp.clickOnLoginbutton();	
		String Acturl=driver.getCurrentUrl();
		String Expurl="https://kite.zerodha.com/";
		
		Assert.assertEquals(Acturl, Expurl, "we are navigate right page");
	}
	
}
