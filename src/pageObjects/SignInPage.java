package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends BasePage{
	
	
	
	public SignInPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id= "email") 
	private WebElement email_txtBox;
	
	@FindBy(id= "passwd") 
	private WebElement pass_txtBox;
	
	@FindBy(id= "SubmitLogin") 
	private WebElement submitLogin_btn;
	
	@FindBy(className= "logout") 
	private WebElement logout_btn;
	
	
	
	public void setEmailID(String emailID)
	{
		email_txtBox.sendKeys(emailID);
	}
	public void setPassword(String password)
	{
		pass_txtBox.sendKeys(password);
	}
	public void clickSignIn()
	{
		submitLogin_btn.click();
	}
	public String getSignOut()
	{
		return logout_btn.getText();
	}

}
