package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShopingCartPage extends BasePage{

	public ShopingCartPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath= "//*[contains(text(),'Summary')]//following::a[@title='Proceed to checkout']") 
	private WebElement summaryProCheckout_btn;
	
	@FindBy(name= "processAddress") 
	private WebElement addressProCheckout_btn;
	
	@FindBy(id= "cgv") 
	private WebElement TnC_Chk;
	
	
	@FindBy(name= "processCarrier") 
	private WebElement shippingProCheckout_btn;
	
	@FindBy(className= "bankwire") 
	private WebElement payByBank_link;
	
	@FindBy(xpath= "//*[text()='I confirm my order']/parent::button") 
	private WebElement confirmMyOrder_btn;
	
	@FindBy(xpath= "//*[@class='box']") 
	private WebElement orderDetails;
	
	@FindBy(xpath= "//a[@title='Back to orders']") 
	private WebElement BackToOrder_btn;
	

	
	
	public void clickSummaryProCheckout() {
		summaryProCheckout_btn.click();
	}

	public void clickAddressProCheckout() {
		addressProCheckout_btn.click();
	}

	public void clickTeamandCondition() {
		TnC_Chk.click();
	}

	public void clickShippingProCheckout() {
		shippingProCheckout_btn.click();
	}

	public void clickPayByBank() {
		payByBank_link.click();
	}

	public void clickConfirmMyOrder() {
		confirmMyOrder_btn.click();
	}
	
	public String getOrderDetails() {
		return orderDetails.getText();
	}
	
	public void clickBackToOrder() {
		BackToOrder_btn.click();
	}
}
