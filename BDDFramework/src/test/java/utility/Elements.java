package utility;

import org.openqa.selenium.WebDriver;

public class Elements {
	
	public static WebDriver mainDriver = null;
	
	public String getTitle() {
		String Title_local_Aravind = mainDriver.getTitle();
		return Title_local_Aravind;
		
	}

}
