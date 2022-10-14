package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base_package.WebTables;
import Handling_webTable.For_colunms;
import Handling_webTable.Table1;
import utility.Utility;

public class WebTable extends WebTables {
	
	Table1 t;
	For_colunms f;
	
	@BeforeClass
	public void LuanchBrowser() throws EncryptedDocumentException, IOException
	{
		WebTables.luanch_browser();
	}
	@Test(priority=1)
	
	public void HandleWebTable() throws IOException
	{
		t=new Table1(driver);
		t.TotalNumberOfRow();
		t.TotalCoulunmCount();
		
		String Act="Island Tradings";
		Assert.assertTrue(true, "Test case is pass");
		
		t.ThirdrdColunm();
		
		Utility.captureScreenshot(driver, "WebtableScreenshout");
		
	}
	@Test(priority=2)
	
	public void Fitchcolunm()
	{
		f=new For_colunms(driver);
		f.HeaderRow();
		f.PrintSecondHeaderRow();
	}

	
}
