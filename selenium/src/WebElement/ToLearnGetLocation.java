package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetLocation {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		

		//	Point position = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
		
		Point position = driver.findElement(By.xpath("//input[@value='Vote']")).getLocation();
		System.out.println(position.getX());
		System.out.println(position.getY());

	}

}
