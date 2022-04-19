package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class indainrail {
	@Test
	public void railwaysystem() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver  = new ChromeDriver();
		driver.get("https://indiarailinfo.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		 String titleName = driver.getTitle();
	     System.out.println(titleName);
	     String windowName = driver.getWindowHandle();
	     System.out.println(windowName);
		 driver.findElement(By.xpath("//*[@id=\"MainBody\"]/table/tbody/tr/td[2]/table[2]/tbody/tr/td[4]/a")).click();
		 driver.findElement(By.linkText("pinkColor")).getText();
		 System.out.println("value");
		 
	}

}
