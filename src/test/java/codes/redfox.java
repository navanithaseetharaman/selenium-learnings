package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redfox {
	@Test
	void redfoxeducation() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://redfoxschools.com/users/sign_in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.id("login_user_email")).sendKeys("946869");
	    driver.findElement(By.id("login_user_password")).sendKeys("stud123");
	    driver.findElement(By.xpath("//*[@id=\"login_user\"]/div[4]/small/input")).click();	
	    driver.findElement(By.xpath("//*[@id=\"areaFocusForm\"]/div[1]/div[1]/div/div/div[2]/span/img")).click();
	    //driver.findElement(By.id("submitAreaFocus")).click();
	    driver.findElement(By.xpath("//*[@id=\"english\"]/div[2]/div[2]/div/div[1]/div[1]/div/a")).click();	    
	}
	

}
