package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		Dimension size = driver.findElement(By.xpath("//input[@value='Search store']")).getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());

	}

}
