package runners;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "functionalTest",glue = {"stepDefinitions"})
public class TestRunner {
	

}
