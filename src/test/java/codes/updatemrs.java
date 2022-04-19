package codes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class updatemrs {
	@Test
	void update() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://o3.openmrs.org/openmrs/spa/login");
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"single-spa-application:@openmrs/esm-login-app-page-0\"]/div/div[1]/form/div/button")).click();
		driver.findElement(By.id("password")).sendKeys("Admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		  //driver.findElement(By.xpath("//*[@id=\"single-spa-application:@openmrs/esm-login-app-page-0\"]/div/form/div/div[3]/div/div[1]/fieldset/div[2]/label/span[1]")).click();
         //JavascriptExecutor jse = (JavascriptExecutor) driver;
         //WebElement location = driver.findElement(By.xpath("//input[@id='Inpatient Ward']/..//span[2]"));
         //jse.executeScript("arguments[0].click();", location);
         //driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		//driver.findElement(By.xpath("//*[@id=\"single-spa-application:@openmrs/esm-login-app-page-0\"]/div/form/div/div[3]/div/div[1]/fieldset/div[2]/label/span[1]")).click(); 		
        //driver.findElement(By.xpath("//*[@id=\"single-spa-application:@openmrs/esm-login-app-page-0\"]/div/form/div"));        

        //driver.findElement(By.xpath("//*[@id=\"single-spa-application:@openmrs/esm-login-app-page-0\"]/div/form/div/div[3]/div/div[1]/fieldset/div[2]/label/span[1]")).click(); 		
		
		
		
	}
}
