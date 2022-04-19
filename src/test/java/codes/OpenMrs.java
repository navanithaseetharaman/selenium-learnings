package codes;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenMrs {
	@Test
	void Autopract() {
		 WebDriverManager.chromedriver().setup();
		    RemoteWebDriver driver = new ChromeDriver();
		    driver.get("https://demo.openmrs.org/openmrs/login.htm");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		    driver.findElement(By.id("username")).sendKeys("Admin");
		    driver.findElement(By.id("password")).sendKeys("Admin123");
		    driver.findElement(By.id("Isolation Ward")).click();
		    driver.findElement(By.id("loginButton")).click();
		    driver.findElement(By.linkText("Register a patient")).click();
		    driver.findElement(By.xpath("//input[@name='givenName']")).sendKeys("sathish");
		    driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("s");
		    driver.findElement(By.xpath("//input[@name='familyName']")).sendKeys("Navanitha");
		    driver.findElement(By.id("next-button")).click();
		    WebElement gen = driver.findElement(By.id("gender-field"));
		    Select genSelection = new Select(gen);
		    genSelection.selectByValue("M");
		    driver.findElement(By.id("next-button")).click();
		    driver.findElement(By.name("birthdateDay")).sendKeys("10");
		    WebElement month = driver.findElement(By.name("birthdateMonth"));
		    Select months = new Select(month);
		    months.selectByVisibleText("June");
		    driver.findElement(By.name("birthdateYear")).sendKeys("1996");
		    driver.findElement(By.id("next-button")).click();
		    driver.findElement(By.id("address1")).sendKeys("No.4th cross saram");
		    driver.findElement(By.id("address2")).sendKeys("Thendral nagar");
		    driver.findElement(By.id("cityVillage")).sendKeys("pondicherry");
		    driver.findElement(By.id("stateProvince")).sendKeys("py");
		    driver.findElement(By.id("country")).sendKeys("india");
		    driver.findElement(By.id("postalCode")).sendKeys("605013");
		    driver.findElement(By.id("next-button")).click();
		    driver.findElement(By.name("phoneNumber")).sendKeys("9786749457");
		    driver.findElement(By.id("next-button")).click();
		    WebElement selection= driver.findElement(By.id("relationship_type"));
		    Select relationSelection = new Select(selection);
		    relationSelection.selectByVisibleText("Doctor");
		    driver.findElement(By.xpath("//input[contains(@class,'person-typeahead')]")).sendKeys("john");
     	    driver.findElement(By.id("next-button")).click();
     	    driver.findElement(By.id("submit")).click();
     	   File source = driver.getScreenshotAs(OutputType.FILE);
   		File destination2 = new File("./snaps/snap" + System.currentTimeMillis() + ".jpg");
   		//String dest = destination2.getAbsolutePath();
   		try {
   			FileUtils.copyFile(source, destination2);
   		} catch (IOException e) {
   			System.out.println("Exception occured :: " + e);
   		}

	}
		
	}

