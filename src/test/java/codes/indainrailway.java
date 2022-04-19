package codes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class indainrailway {
	
	@Test
	public void railway() {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); 
	    driver.findElement(By.id("txtStationFrom")).clear();
	    driver.findElement(By.id("txtStationFrom")).sendKeys("pondicherry",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("chennai",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		List<WebElement> trainList = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		int rowCount = trainList.size();
		System.out.println(rowCount);
		for(int i=1;i<=rowCount;i++) {
		String trainlists = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a")).getText();
		System.out.println(trainlists);

	}
	}
}
