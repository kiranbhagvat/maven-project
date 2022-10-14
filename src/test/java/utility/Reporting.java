package utility;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting
{
	static ExtentTest logger;
	static ExtentReports reports;
	
	public void StartTest()
	{
		reports=new ExtentReports(System.getProperty("user.dir")+"/test=output/ExtentReportsResult.html",true);
		
	}
	@Test
	public void verfyPageTitle() {
		logger=reports.startTest("Verfy page title tc");
		String exp="Google";
		String Act="Google";
		
		Assert.assertEquals(Act, exp);
		logger.log(LogStatus.PASS,"Test case passed");
	}
	@Test
	public void verifyPageUrl() {
		logger=reports.startTest("verify Page url tc");
		String exp="Google";
		String act="facebook";
		Assert.assertEquals(act, exp);
		logger.log(LogStatus.PASS, "Test case passed");
	}
	@AfterMethod
	public void getResult(ITestResult result) {
		if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.log(LogStatus.FAIL, "Test case Failed" +result.getName());
			logger.log(LogStatus.FAIL, "Test case Failed" +result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP) {
			
			logger.log(LogStatus.SKIP, "Test case Failed" +result.getName());
			logger.log(LogStatus.SKIP, "Test case Failed" +result.getThrowable());
		}
		
	}
	@AfterClass
	public void endTest() {
		
		reports.endTest(logger);
		reports.flush();
		reports.close();
	}
	
}
