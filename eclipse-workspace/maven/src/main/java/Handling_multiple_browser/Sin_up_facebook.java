package Handling_multiple_browser;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Sin_up_facebook {

	@FindBy(xpath="(//a[@role='button'])[2]")
	private WebElement newuser;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement sirname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement monumber;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement pass;
	
	@FindBy(xpath="//Select[@id='day']")
	private WebElement daydropdown;
	
	@FindBy(xpath="//Select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//Select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[2]")
	private WebElement sex;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement button;
	
	public Sin_up_facebook(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnNewUserLinj()
	{
		newuser.click();
	}
	public void enterFirstName(String name)
	{
		firstname.sendKeys(name);
	}
	public void enterSirName(String lname)
	{
		sirname.sendKeys(lname);
	}
	public void enterMobileNumber(String mo)
	{
		monumber.sendKeys(mo);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void selectdayFromDropdown()
	{
		Select s=new Select(daydropdown);
		s.selectByIndex(4);
	}
	public void SelectMaonth()
	{
		Select s1=new Select(month);	
		s1.selectByVisibleText("Oct");
		java.util.List<WebElement> li=s1.getOptions();
		int Size=li.size();
		System.out.println(Size);
		
		for(int i=1;i<Size;i++)
		{
			String text=li.get(i).getText();
			System.out.println(text);
		}
	}
	public void Selectyear()
	{
		Select s2=new Select(year);
		s2.selectByVisibleText("1997");
	}
	public void clickOnGenderbox()
	{
		sex.click();
	}
	public void clickOnSubmitButton()
	{
		button.click();
	}
}    
