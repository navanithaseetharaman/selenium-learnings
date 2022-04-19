package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zomoto {
	@Test
	void food() throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50)); 
	    //search
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant')]")).sendKeys("A2B");
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/div[2]/div[2]/div/div[3]/div[2]/div[1]/div[2]/div[1]/p[1]")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[contains(@placeholder,'Search for restaurant']")).click();
	    WebElement search = driver.findElement(By.xpath("//p[text()='A2B')]"));
	    search.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	    
	    
	    
	    
		}
	
	
	

}
