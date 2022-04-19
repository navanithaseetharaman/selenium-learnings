package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class infosys {
	@Test
	void info() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new EdgeDriver(options);
		driver.get("https://www.bankbazaar.com/personal-loan.html");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); 
	    driver.findElement(By.xpath("//*[@id=\"scrollableDiv\"]/div/div/div[2]/div/div/div/div[1]/label/span[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div/input")).sendKeys("infosys");
		driver.findElement(By.xpath("//span[@class='Select-arrow']")).click();
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//*[@id=\"react-select-2--value\"]/div/input"));
		search.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"scrollableDiv\"]/div/div/div[2]/div/div/div[2]/div/div[2]/div")).click();
		
	}

}
