package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetTagName {

	public static void main(String[] args) {

		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login/");
		
		String tagName = driver.findElement(By.id("Email")).getTagName();
		
		System.out.println(tagName);


	}

}
