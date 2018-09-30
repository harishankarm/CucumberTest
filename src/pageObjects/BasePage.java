package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void waitToElementClickable(WebElement element, int timeout)
	  {
		  WebDriverWait wait = new WebDriverWait(driver, timeout);
		  wait.until(ExpectedConditions.elementToBeClickable(element));
	  }
	  public void waitToElementVisible(WebElement element, int timeout)
	  {
		  WebDriverWait wait = new WebDriverWait(driver, timeout);
		  wait.until(ExpectedConditions.visibilityOf(element));
	  }
}
