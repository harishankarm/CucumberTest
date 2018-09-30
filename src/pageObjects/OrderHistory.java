package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistory  extends BasePage {
	
	public OrderHistory(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath= "(//*[@id='order-list']//td[1]/a)[1]") 
	private WebElement firstOrderRef;
	

	public String getFirstOrderRef() {
		waitToElementClickable(firstOrderRef,20);
		return firstOrderRef.getText();
	}
	
}
