package codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myntra<WebElements> {
	@Test
	
        void onlinepurchase() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		RemoteWebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=EAIaIQobChMIn6-84Z7j9gIVI5NmAh2M-g5hEAAYASAAEgLbq_D_BwE");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	    driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("sunglasses",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/div[1]/span")).click();
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/div[1]/input")).sendKeys("Polaroid");
        driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[3]/div[1]/section/div/div[4]/ul/li/label")).click();
        List<WebElement> glasssize = driver.findElements(By.xpath("//h4[contains(text(),'Rectangle')]"));
        int noofglass = glasssize.size();
      System.out.println(glasssize);
      System.out.println(noofglass);
      WebElement Psize= driver.findElement(By.xpath("(//h3[@class='product-brand'])[1]"));
      Actions action = new Actions(driver);
      action.moveToElement(Psize).perform();
      driver.findElement(By.xpath("//span[text()='VIEW SIMILAR']/..")).click();
      List <WebElement> similarproduct = driver.findElements(By.xpath("//ul[contains(@class,'similarGrid')]//h3"));
      int list= similarproduct.size();
      System.out.println(list);
      
      driver.quit();
      
        
        
        
	}

}
