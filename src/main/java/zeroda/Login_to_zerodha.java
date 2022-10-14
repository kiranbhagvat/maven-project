package zeroda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_to_zerodha {

	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass;
	

	@FindBy(xpath="//button[@type='submit']")
	private WebElement button;
	
	public Login_to_zerodha(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String entertheUserName(String name)
	{
		userid.sendKeys(name);
		return name;
	}
	public void enterPassword(String password)
	{
		wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='password']"))).sendKeys(password);
		//pass.sendKeys(password);
	}
	public void clickOnSubmitButton()
	{
		button.click();
	}
	
	
}
