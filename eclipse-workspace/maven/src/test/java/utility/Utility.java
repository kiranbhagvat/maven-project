package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler; 

public class Utility {

	public static String parameterization(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\kiran\\OneDrive\\Documents\\Book1.xlsx");
		
		Workbook w=WorkbookFactory.create(f);
		
		org.apache.poi.ss.usermodel.Sheet sh=w.getSheet("Sheet2");
		
		String s=sh.getRow(row).getCell(cell).getStringCellValue();
		return s;
	}
	public static void captureScreenshot(WebDriver driver,String tname) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\kiran\\eclipse-workspace\\maven\\Screenshout"+tname+".jpg");
		FileHandler.copy(source, dest);	
		DateFormat dateformate=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date=new Date();
		String date1=dateformate.format(date);
		System.out.println(date1);
		
	}
	{
		
	}
}