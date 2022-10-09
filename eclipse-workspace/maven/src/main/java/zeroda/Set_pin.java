package zeroda;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Set_pin {

	@FindBy(xpath="//input[@type='password']")
	private WebElement pin;
	
	@FindBy(xpath="//div[@class='actions']/child::button")
	private WebElement button;
	
	@FindBy(xpath="'//input[@type='text']'")
	private WebElement Mobilepin;
	
	public Set_pin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void enterPin(String pi)
	{
		pin.sendKeys(pi);
	}
	public void clickOnLoginbutton()
	{
		button.click();
	}
	public void enterMObilePin() {
		Mobilepin.sendKeys("123456");
	}
}
