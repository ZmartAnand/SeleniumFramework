package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class StaleElemen {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapp.skillrary.com/");
		Skillary sk= new Skillary(driver);
		sk.getSearchtextfiled().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		
		sk.getSearchtextfiled().sendKeys("testng",Keys.ENTER);
	}

}
