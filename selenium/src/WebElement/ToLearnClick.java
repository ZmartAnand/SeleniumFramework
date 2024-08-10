package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import graphql.schema.diffing.Edge;

public class ToLearnClick {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		
		WebElement searchButton = driver.findElement(By.xpath("//input[@value='Search']"));
		searchButton.click();

	}

}
