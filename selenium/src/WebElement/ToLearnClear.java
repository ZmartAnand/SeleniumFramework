package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnClear {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement username = driver.findElement(By.id("username"));
		
		Thread.sleep(2000);
		
		username.sendKeys("Anand");
		

	}

}
