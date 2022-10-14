package e_bankin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_user {

	@FindBy(xpath="//a[text()='New Customer']")
	private WebElement Newuser;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="(//input[@name='rad1'])[1]")
	private WebElement gender;
	
	@FindBy(xpath="//input[@id='dob']")
	private WebElement Dob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement Adress;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement State;
	
	@FindBy(xpath="//input[@name='pinno']")
	private WebElement pinno;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	private WebElement Mobileno;
	
	@FindBy(xpath="//input[@name='emailid']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='sub']")
	private WebElement submitbutton;
	
	public New_user(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void ClicOnNewUser()
	{
		Newuser.click();
	}
	public void entercustmerName(String cname)
	{
		name.sendKeys(cname);
	}
	public void clickOnGenderButton()
	{
		gender.click();
	}
	public void SelectDateOfBirth(String dd,String mm,String yyyy)
	{
		Dob.sendKeys(dd);
		Dob.sendKeys(mm);
		Dob.sendKeys(yyyy);
	}
	public void enterAdress(String add)
	{
		Adress.sendKeys(add);
	}
	public void enterCityName(String City)
	{
		city.sendKeys(City);
	}
	public void EnterState(String st)
	{
		State.sendKeys(st);
	}
	public void enterPinNumber(String Pin)
	{
		pinno.sendKeys(Pin);
	}
	public void enterMobileNumber(String mo)
	{
		Mobileno.sendKeys(mo);
	}
	
	public void enterEmail(String email)
	{
		Email.sendKeys(email);
	}
	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void clickOnSubmiteButton()
	{
		submitbutton.click();
	}
	
	
	
	
}
