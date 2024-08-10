package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignmentpoorselect {

	public static void main(String[] args) {


		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement rb = driver.findElement(By.xpath("//input[@value='3']"));
		rb.click();

		System.out.println(rb.isSelected());

		String radio = driver.findElement(By.xpath("//label[@for='pollanswers-3']")).getText();
		System.out.println(radio);

		if (radio.contains("Poor"))
			System.out.println("Poor Radio Button Is Selected");
		else
			System.out.println("Poor Radio Button Is Not Selected");

	}

}

