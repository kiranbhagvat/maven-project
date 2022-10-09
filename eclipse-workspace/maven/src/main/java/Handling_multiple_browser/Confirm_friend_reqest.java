package Handling_multiple_browser;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_friend_reqest {

	@FindBy(xpath="//input[@type='search']")
	private WebElement Serchbox;
	
	@FindBy(xpath="//ul[@role='listbox']//li/ul/descendant::div[@role='option']")
	private List<WebElement> patternserch;
	
	public Confirm_friend_reqest(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterStingInSerchBox(String st)
	{
		Serchbox.sendKeys(st);
	}
	public void DynamicSerch()
	{
		int size=patternserch.size();
		System.out.println(size);
		for(int i=0;i<=size;i++)
		{
			String s=patternserch.get(i).getText();
			System.out.print(s);
            if(patternserch.get(size).getText().contains("Dnyneshwar Wankhede Patil"))
		     {
		    	 patternserch.get(i).click();
		    	 break;
		     }
		}
	}
}
