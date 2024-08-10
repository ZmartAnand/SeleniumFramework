package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class staleelement {

	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement search = driver.findElement(By.id("navbar-search-input"));
		search.sendKeys("selenium",Keys.ENTER);
		search.sendKeys("testng",Keys.ENTER);

	}

}
