package Flipkard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page{

	@FindBy(xpath="/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")
	private WebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement loginbutton;
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement Serchbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Submitbutton;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void enterPassword(String password)
	{
		pass.sendKeys(password);
	}
	public void clickOnLoginButton()
	{
		loginbutton.click();
	}
	public void entertheProductName(String name)
	{
		Serchbox.sendKeys(name);
	}
	public void ClickOnSubmitButton()
	{
		Submitbutton.submit();
	}
	
	
}
