package StepDefinition;

import org.TestObjects.PageTestObjects;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utility.Elements;
import utility.FrameWorkconstants;

public class stepdefinition {
	PageTestObjects pto = new PageTestObjects();
	
	
	@Given("User on Google chrome page")
	public void user_on_google_chrome_page() {
	    // Write code here that turns the phrase above into concrete actions
		Elements.mainDriver.get(FrameWorkconstants.url);
	}
	@Then("User Searches a flipkart on google page")
	public void user_searches_a_flipkart_on_google_page() {
	    // Write code here that turns the phrase above into concrete actions
		pto.ValidateTilte();
		System.out.println("Added new Line in Definition file");
	}

}
