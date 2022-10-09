package e_bankin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_to_appllication {

	@FindBy(name="uid")
	private WebElement userid;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(name="btnLogin")
	private WebElement button;
	
	public Login_to_appllication(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void userId(String id)
	{
		userid.sendKeys(id);
	}
	public void enterpassword(String password)
	{
		pass.sendKeys(password);
	}
	public void ClickOnSubmitButton()
	{
		button.click();
	}
}
