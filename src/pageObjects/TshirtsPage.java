package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtsPage extends BasePage{
	
	
	public TshirtsPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(className= "right-block") 
	private WebElement tShirt;
	
	@FindBy(xpath= "//a[@title='Add to cart']") 
	private WebElement addToCart_btn;
	
	@FindBy(xpath= "//*[@class='clearfix']//following::a[@title='Proceed to checkout']") 
	private WebElement proceedToCheckout_btn;
	
	
	public void moveTotShirt(WebDriver driver)
	{
		 Actions action = new Actions(driver);
	     action.moveToElement(tShirt).build().perform();
	}
	public void clickAddToCart()
	{
		addToCart_btn.click();
	}
	public void clickProceedToCheckout()
	{
		waitToElementVisible(proceedToCheckout_btn,20);
		proceedToCheckout_btn.click();
	}

}
