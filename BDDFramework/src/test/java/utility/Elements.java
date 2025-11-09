package utility;

import org.openqa.selenium.WebDriver;

public class Elements {
	
	public static WebDriver mainDriver = null;
	
	public String getTitle() {
		String Page_Title_remote = mainDriver.getTitle();
		return Page_Title_remote;
		
		
	}
	
	public void matter() {
		System.out.println("Matter");
	}
	
	public void Clickbytext(String Clickabletext) {
		System.out.println(Clickabletext);
		
	}

}
