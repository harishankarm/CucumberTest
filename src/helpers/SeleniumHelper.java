package helpers;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class SeleniumHelper {
	
	protected  WebDriver driver = null;
	  public WebDriver getBrowser(String browserName)
      {          
		  String exePath = "./driver/"+browserName+".exe";
          switch(browserName)
          {
              case "Firefox":
            	  
                  System.setProperty("webdriver.gecko.driver", exePath);
              		driver = new FirefoxDriver();
                      break;

              case "IE":
                	  System.setProperty("webdriver.ie.driver", exePath);
                	  driver = new InternetExplorerDriver();
                         break;

              case "chromedriver":
              System.setProperty("webdriver.chrome.driver", exePath);
              		driver = new ChromeDriver();
              		break;
          }    
          return driver;
      }
	  
	  public void assertContains(String actual, String expect, String msg) throws Exception {
		  
		  if(actual.contains(expect))
		  {
			  System.out.println("Pass: " + msg);
		  } else {
			  throw new Exception("Fail: "+msg);
		  }
	  }
}
