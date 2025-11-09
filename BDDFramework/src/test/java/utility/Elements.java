package utility;

import org.openqa.selenium.WebDriver;

public class Elements {
	
	public static WebDriver mainDriver = null;
	
	public String getTitle() {
		String Page_Title = mainDriver.getTitle();
		return Page_Title;
		
	}

}
