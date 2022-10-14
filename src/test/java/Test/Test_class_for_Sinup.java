package Test;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base_package.Base_class1;
import Handling_multiple_browser.Confirm_friend_reqest;
import Handling_multiple_browser.Sin_up_facebook;

import utility.Utility;

public class Test_class_for_Sinup extends Base_class1{
	
	Sin_up_facebook sf;
	Confirm_friend_reqest cr;
	
	
	@BeforeClass
	public void launchBrowser()
	{
		Base_class1.luanch_browser();
	}
	@Test(priority=1)
	public void Sin_up() throws EncryptedDocumentException, IOException, InterruptedException
	{
		sf=new Sin_up_facebook(driver);
		sf.clickOnNewUserLinj();
		driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
		Thread.sleep(2000);
		sf.enterFirstName(Utility.parameterization(6, 0));
		sf.enterSirName(Utility.parameterization(7, 0));
		sf.enterMobileNumber(Utility.parameterization(8, 0));
		sf.enterPassword(Utility.parameterization(9, 0));
		sf.selectdayFromDropdown();
		sf.SelectMaonth();
		sf.Selectyear();
		sf.clickOnGenderbox();
		sf.clickOnSubmitButton();
		Utility.captureScreenshot(driver, "Homepage");
	String Exp=	driver.getCurrentUrl();
	String Act="https://en-gb.facebook.com/";
	
	Assert.assertEquals(Act, Exp, "Test Case is pass Sin_up succesfully");
		
		sf.selectdayFromDropdown();
		sf.SelectMaonth();
		sf.Selectyear();	
	
	}
	@Test(priority=2)
	public void serchOfFreind() throws EncryptedDocumentException, IOException
	{
		cr=new Confirm_friend_reqest(driver);
		cr.enterStingInSerchBox(Utility.parameterization(10, 0));
		cr.DynamicSerch();
	}


}
