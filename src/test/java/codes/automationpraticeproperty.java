package codes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class automationpraticeproperty  extends baseclass{
	public automationpraticeproperty() throws FileNotFoundException,IOException{
		prop.load(new FileInputStream(new File("./src/test/resources/`configuration.properties")));
	}
	@Test
	public void BaseClass() {
		 launchurApplications();
		driver.get(prop.getProperty("URL"));
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email_create")).sendKeys(prop.getProperty("NAME"));
		driver.findElement(By.id("SubmitCreate")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys(prop.getProperty("FRIST"));
		driver.findElement(By.name("customer_lastname")).sendKeys(prop.getProperty("LAST"));
		driver.findElement(By.id("passwd")).sendKeys(prop.getProperty("PASS"));
		driver.findElement(By.id("days")).sendKeys(prop.getProperty("DAYS"));
		driver.findElement(By.id("months")).sendKeys(prop.getProperty("MONTHS"));
		driver.findElement(By.name("years")).sendKeys(prop.getProperty("YEAR"));
		driver.findElement(By.id("uniform-newsletter")).click();
		driver.findElement(By.name("company")).sendKeys(prop.getProperty("COMPANY"));
	    driver.findElement(By.id("address1")).sendKeys(prop.getProperty("ADDRESS1"));
	    driver.findElement(By.id("address2")).sendKeys(prop.getProperty("ADDRESS2"));
	    driver.findElement(By.id("city")).sendKeys(prop.getProperty("CITY"));
	    driver.findElement(By.id("id_state")).sendKeys(prop.getProperty("IDSTATE"));
	    driver.findElement(By.name("postcode")).sendKeys(prop.getProperty("POSTCODE"));
	    driver.findElement(By.id("id_country")).sendKeys(prop.getProperty("COUNTRY"));
	    driver.findElement(By.id("other")).sendKeys(prop.getProperty("OTHER"));
	    driver.findElement(By.id("phone")).sendKeys(prop.getProperty("PHONE"));
        driver.findElement(By.id("phone_mobile")).sendKeys(prop.getProperty("MOBILE"));
        driver.findElement(By.id("alias")).sendKeys(prop.getProperty("ALIAS"));
        driver.findElement(By.id("submitAccount")).click();
		
		
		  
	
	}
}
