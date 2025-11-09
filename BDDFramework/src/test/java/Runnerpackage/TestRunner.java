package Runnerpackage;



import org.testng.annotations.AfterSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.baseclass;



@CucumberOptions(
		features = {"src/main/java/Feature/login.feature"},
		glue = {"StepDefinition"},
		plugin = {"pretty"},
		publish = true,
		monochrome = true,
		dryRun = false,
		tags = ("@Search_on_google")
		)
//extends AbstractTestNGCucumberTests
public class TestRunner extends AbstractTestNGCucumberTests{
	baseclass bs = new baseclass();
	
	@BeforeTest
	public void intiateprocess() {
		try {
			bs.Login();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@AfterSuite
	public void CloseBrowser() {
		try {
			bs.EndBrowser();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}


