package Handling_webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Table1 {

	WebDriver driver;
	@FindBy(xpath="//table[@id='customers']/tbody/tr")
	List<WebElement> trow;
	
	@FindBy(xpath="//table[@id='customers']/tbody/tr/td")
	List<WebElement> totalcolunm ;
	
	public Table1(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	public void TotalNumberOfRow()
	{
		int rowcount=trow.size();
		System.out.println(rowcount);
		String Beforexpath="//table[@id='customers']/tbody/tr[";
		String Afterxpath="]/td[1]";
		for(int i=2;i<=rowcount;i++)
		{
		    String Actxpath=Beforexpath+i+Afterxpath;
		    WebElement element=driver.findElement(By.xpath(Actxpath));
		    System.out.println(element.getText());
		    if(element.getText().equals("Island Trading"))
		    {
		    	System.out.println("Company Name :"+element.getText()+ "is found "+ " at Position :"+(i-1));
		    	break;
		    }
		}
		
	}
	public void TotalCoulunmCount()
	{
		System.out.println(totalcolunm.size());
		String Beforexpath="//table[@id='customers']/tbody/tr[";
		String Afterxpath="]/td[2]";
		
		for(int i=2;i<=trow.size();i++)
		{
			String Actualxpath=Beforexpath+i+Afterxpath;
			
			WebElement element=driver.findElement(By.xpath(Actualxpath));
			System.out.println(element.getText());
		}
		
	}
	public void ThirdrdColunm()
	{
		System.out.println(totalcolunm.size());
		String Beforexpath="//table[@id='customers']/tbody/tr[";
		String Afterxpath="]/td[3]";
		//System.out.println(totalcolunm.size());
		
		for(int i=2;i<=trow.size();i++)
		{
			System.out.println(totalcolunm.size());
						
			String Actualxpath=Beforexpath+i+Afterxpath;
			
			WebElement element=driver.findElement(By.xpath(Actualxpath));
			System.out.println(element.getText());
			
		}
		
	}
	
	
}
