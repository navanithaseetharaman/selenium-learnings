package codes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jellwery  {
	@Test
	void shops() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://thejewelleryroom.com");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); 
		driver.findElement(By.xpath("//*[@id=\"section-header\"]/div/div[1]/nav/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"shopify-section-collection-template\"]/section/div[4]/div[1]/div[1]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"collection-sort-popover\"]/div/button[4]")).click();
	    driver.findElement(By.xpath("//*[@id=\"sleeknote-form\"]/form/ul/li[4]/ul/li[7]/div/input")).sendKeys("sathish");
	    driver.findElement(By.xpath("//*[@id=\"sleeknote-form\"]/form/ul/li[4]/ul/li[2]/div/input")).sendKeys("navanithakrishnan0906@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"sleeknote-form\"]/form/ul/li[4]/ul/li[3]/div/div/p/strong")).click();
	   } 
	
	
	
	
	

}
