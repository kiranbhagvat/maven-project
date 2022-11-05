package Flipkard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Select_product {

	
	WebDriver driver;
	WebDriverWait wait;
	@FindBy(xpath="//a[text()='Color Block Men Round Neck Black T-Shirt']")
	private WebElement Shirt;
	
	public Select_product(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	public void SelectProductFromOption()
	{
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Solid Men Polo Neck Light Green T-Shirt']")));
		
	     Shirt.click();
	}
	
	
}
