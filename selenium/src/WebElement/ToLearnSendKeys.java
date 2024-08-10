package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnSendKeys {

	public static void main(String[] args) {

		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://flipkart.com");

		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);

	}

}
