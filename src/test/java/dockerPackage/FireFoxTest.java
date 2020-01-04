package dockerPackage;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FireFoxTest {
	
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		URL url = new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);
		driver.get("http://yahoo.com");
		System.out.println("The Title from FF: "+driver.getTitle());
		driver.quit();
	}
}
