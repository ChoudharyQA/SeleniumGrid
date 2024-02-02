import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTestFirefox {

	@Test
	public void homePageCheck() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("firefox");
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.8.177:4444"),caps);
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		driver.close();
		
		
	}
	
	
	
	
	
	
}
