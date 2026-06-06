package utility;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class baseclass extends Elements {
	//FrameWorkconstants fs = new FrameWorkconstants();
	String name = "Aravind";
	
	public void Login() {
		if(FrameWorkconstants.browser == "chrome") {
			    //chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
			    //mainDriver  = new ChromeDriver(chromeOptions);
				 ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");  // Run in headless mode for CI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        
        WebDriver driver = new ChromeDriver(options);
        Elements.mainDriver = driver;  // Initialize the static driver
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
			
		}
		mainDriver.get(FrameWorkconstants.url);
	}
	
	public void EndBrowser() {
		mainDriver.quit();
	}

}
