package codes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autopratice {
	@Test
	void Sign() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.id("email_create")).sendKeys("navanithakrishnan1098@gmail.com");
        driver.findElement(By.id("SubmitCreate")).click();
        driver.findElement(By.id("id_gender1")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("sathish");	
		driver.findElement(By.name("customer_lastname")).sendKeys("s");
		driver.findElement(By.id("passwd")).sendKeys("sathsih123");
		driver.findElement(By.id("days")).sendKeys("3");
		driver.findElement(By.id("months")).sendKeys("January");
		driver.findElement(By.name("years")).sendKeys("2021");
		driver.findElement(By.id("uniform-newsletter")).click();
        driver.findElement(By.name("company")).sendKeys("tcs");
        driver.findElement(By.id("address1")).sendKeys("No.3 main raod");
        driver.findElement(By.id("address2")).sendKeys("frist floor");
        driver.findElement(By.id("city")).sendKeys("chennai");
        driver.findElement(By.id("id_state")).sendKeys("Alabama");
        driver.findElement(By.name("postcode")).sendKeys("00000");
        driver.findElement(By.id("id_country")).sendKeys("United States");
        driver.findElement(By.id("other")).sendKeys("8822556644");
        driver.findElement(By.id("phone")).sendKeys("0413-222564");
        driver.findElement(By.id("phone_mobile")).sendKeys("8838367952");
        driver.findElement(By.id("alias")).sendKeys("Main street");
        driver.findElement(By.id("submitAccount")).click();
        File source = driver.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("./snaps/snap" + System.currentTimeMillis() + ".jpg");
		//String dest = destination2.getAbsolutePath();
		try {
			FileUtils.copyFile(source, destination2);
		} catch (IOException e) {
			System.out.println("Exception occured :: " + e);
			System.out.println("my frist ");
		}

	}
	

}
