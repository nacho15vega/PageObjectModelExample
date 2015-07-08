package baseConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseConfigs {
	
	public static WebDriver createDriver(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			return new FirefoxDriver();			
		}else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "/Users/avega/Desktop/Drivers/IEDriverServer.exe");
			return new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/avega/Desktop/Drivers/chromedriver.exe");
			return new ChromeDriver();
		}else{
		return null;
		}
	}
}