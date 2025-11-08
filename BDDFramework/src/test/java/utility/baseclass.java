package utility;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseclass extends Elements {
	//FrameWorkconstants fs = new FrameWorkconstants();
	String name = "Aravind";
	
	public void Login() {
		if(FrameWorkconstants.browser == "chrome") {
			  ChromeOptions chromeOptions = new ChromeOptions();
			    chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			    mainDriver  = new ChromeDriver(chromeOptions);
			
		}
		mainDriver.get(FrameWorkconstants.url);
	}

}
