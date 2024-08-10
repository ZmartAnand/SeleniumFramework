package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetRect {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Vote']")).getRect();
		System.out.println("Height :"+rect.getHeight());
		System.out.println("Width :"+rect.getWidth());
		System.out.println("X :"+rect.getX());
		System.out.println("Y  :"+rect.getY());

	}

}
