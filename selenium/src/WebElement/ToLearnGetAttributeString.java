package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetAttributeString {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://flipkart.com");
		
		String value = driver.findElement(By.name("q")).getAttribute("title");
		
		System.out.println(value);
	}

}
