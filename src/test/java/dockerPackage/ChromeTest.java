package dockerPackage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.manage().window().fullscreen();
		driver.get("http://google.com");
		System.out.println("The Title from Chrome: "+driver.getTitle());
		driver.quit();
	}
	
}
