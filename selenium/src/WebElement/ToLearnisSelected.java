package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnisSelected {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement price = driver.findElement(By.xpath("//option[@value='99']"));
		
		System.out.println(price.isSelected());
		
		price.click();
		System.out.println("===after clicking===");
		
		System.out.println(price.isSelected());
		
	}

}
