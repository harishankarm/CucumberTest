package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalinfoPage  extends BasePage {
	
	public PersonalinfoPage(WebDriver driver) {
		super(driver);
	}
	
	//My Account Page
	
	@FindBy(className= "account") 
	private WebElement myAccount;
	
	@FindBy(xpath= "//*[@title='Information']") 
	private WebElement personalinfo_btn;

	//Your Personal info page
	@FindBy(id= "firstname") 
	private WebElement firstname_txt;
	
	@FindBy(id= "old_passwd") 
	private WebElement oldpasswd_txt;
	
	@FindBy(name= "submitIdentity") 
	private WebElement submitIdentity_btn;
	

	@FindBy(xpath= "//*[contains(@class,'alert-success')]") 
	private WebElement successMsg;
	
	
	public void clickmyAccountLink() {
		myAccount.click();
	}
	
	
	public void clickPersonalinfo() {
		personalinfo_btn.click();
	}
	
	public void setFirstname(String firstname)
	{
		String preFirstname = firstname_txt.getText();
		firstname_txt.clear();
		if(preFirstname.equals(firstname))
		{
			firstname_txt.sendKeys(firstname+"_1");
		}else {
		firstname_txt.sendKeys(firstname);
		}
	}
	public void setOldPassword(String password)
	{
		oldpasswd_txt.sendKeys(password);
	}
	
	
	public void clickSaveButton() {
		submitIdentity_btn.click();
	}
	
	public String getSuccessMsg() {
		return successMsg.getText();
	}

}
