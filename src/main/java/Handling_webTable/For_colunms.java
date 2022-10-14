package Handling_webTable;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class For_colunms {

	WebDriver driver;
	@FindBy(xpath="//table[@id='customers']/tbody/tr/th")
	private List<WebElement> hederrow;
	
	@FindBy(xpath="//table[@id='customers']//tr[1]/th[2]")
	private WebElement Specificdata;
	
	public For_colunms(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	public void HeaderRow()
	{
		int size=hederrow.size();
		System.out.println(size);
		for(int i=0;i<=size-1;i++)
		{
			String s=hederrow.get(i).getText();
			System.out.println(s);
		}
	}
	public void PrintSecondHeaderRow()
	{
		System.out.println(Specificdata.getText());
	}
}
