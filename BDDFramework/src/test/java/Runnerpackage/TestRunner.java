package Runnerpackage;

import org.testng.annotations.BeforeTest;
import io.cucumber.


@CucumberOptions(
		features = {"src\\main\\java\\Feature\\login.feature"},
		glue = {"stepdefinition"},
		plugin = {"pretty"},
		publish = true,
		monochrome = true,
		dryRun = true,
		tags = ("@Search_on_google")
		)

public class TestRunner extends AbstractTestNGCucumberTests {
	baseclass bs = new baseclass();
	
	@BeforeTest
	public void intiateprocess() {
		try {
			bs.Login();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}
