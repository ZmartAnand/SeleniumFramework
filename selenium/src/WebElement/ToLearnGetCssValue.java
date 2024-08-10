package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetCssValue {

	public static void main(String[] args) throws InterruptedException {

		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login/");

		driver.findElement(By.xpath("//input[@value='Log in']")).click();

//		String color = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
//
//		String font = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-family");
//
//		String size = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("font-size");
//		
//		System.out.println(color);
//		
//		System.out.println(font);
//		
//		System.out.println(size);
		
		WebElement errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
		
		String color = errorMsg.getCssValue("color");
		
		String fontfamily = errorMsg.getCssValue("font-family");
		
		System.out.println("color");
		
		System.out.println("font-family");
		


	}

}
