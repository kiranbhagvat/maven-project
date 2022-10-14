package e_bankin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Delete_custmor {

	@FindBy(xpath="//a[text()='Delete Customer']")
	private WebElement deletetab;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement Accountid;
	
	@FindBy(xpath="//input[@name='AccSubmit']")
	private WebElement submitbutton;
	
	@FindBy(xpath="//a[text()='Log out']")
	private WebElement logout;
	
	public Delete_custmor(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClickOndeletecustmer()
	{
		deletetab.click();
	}
	public void enterAccountId(String id)
	{
		Accountid.sendKeys(id);
	}
	public void submitButton()
	{
		submitbutton.click();
	}
	public void ClockonLogout()
	{
		logout.click();
	}
	
}
