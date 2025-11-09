package utility;

import org.openqa.selenium.WebDriver;

public class Elements {
	
	public static WebDriver mainDriver = null;
	
	public String getTitle() {
		String Title = mainDriver.getTitle();
		return Title;
		
	}

}
