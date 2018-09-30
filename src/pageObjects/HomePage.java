package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className= "login") 
	private WebElement signIn_btn;
	
	@FindBy(xpath= "(//a[text()='T-shirts'])[2]/parent::li") 
	private WebElement tshirt_tab;
	
	public void clickLoginBtn()
	{
		signIn_btn.click();
	}
	public void ClicktShirtTab()
	{
		tshirt_tab.click();
	}
	
	

}
