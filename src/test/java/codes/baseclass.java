package codes;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
	public RemoteWebDriver driver;
	public Properties prop;
	
	public baseclass() {
		prop = new Properties();
	}
	public void launchurApplications() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		
	}
	

	
}
