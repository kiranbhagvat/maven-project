package Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_package.Base_class_e_banking;
import e_bankin.Delete_custmor;
import e_bankin.Login_to_appllication;
import e_bankin.New_user;
import utility.Utility;

public class Test_class_e_banking extends Base_class_e_banking  {

	Login_to_appllication lp;
	New_user nu;
	
	@BeforeClass
	public void luanchbrowser() throws EncryptedDocumentException, IOException
	{
		Base_class_e_banking.luanch_browser();
	}
	@Test(priority=1)
	public void loginapplication() throws EncryptedDocumentException, IOException, InterruptedException
	{
		lp=new Login_to_appllication(driver);
		lp.userId(Utility.parameterization(3, 0));
		lp.enterpassword(Utility.parameterization(4, 0));
		lp.ClickOnSubmitButton();
        Thread.sleep(3000);
        Alert al=driver.switchTo().alert();
        al.accept();
        System.out.println(al.getText());
        
		Utility.captureScreenshot(driver, "fisrt");
		
		String Act="https://demo.guru99.com/v4/manager/Managerhomepage.php";
		
		String Exp=driver.getCurrentUrl();
		
		Assert.assertEquals(Act, Exp);
	}
	@Test(priority=2)
	public void CreateNewUser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		nu=new New_user(driver);
		nu.ClicOnNewUser();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		Thread.sleep(2000);
		nu.entercustmerName(Utility.parameterization(0, 1));
		nu.clickOnGenderButton();
		nu.SelectDateOfBirth(Utility.parameterization(1, 1),Utility.parameterization(2, 1), Utility.parameterization(3, 1));
		nu.enterAdress(Utility.parameterization(4, 1));
		nu.enterCityName(Utility.parameterization(5, 1));
		nu.EnterState(Utility.parameterization(6, 1));
		nu.enterPinNumber(Utility.parameterization(7, 1));
		nu.enterMobileNumber(Utility.parameterization(0, 2));
		nu.enterEmail(Utility.parameterization(8, 1));
		nu.enterPassword(Utility.parameterization(9, 1));
		nu.clickOnSubmiteButton();
		Utility.captureScreenshot(driver, "newuser");
		Thread.sleep(3000);
		
		
	
	}
	@AfterMethod
	public void logoutTheApplication(ITestResult result) throws InterruptedException, IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			Utility.captureScreenshot(driver, "Failed1");
		}
	}
	@AfterClass
	public void CloseTheBrowser()
	{
		
	}
}
