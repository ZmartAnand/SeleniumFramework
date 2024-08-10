package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGetText {

	public static void main(String[] args) {
		

		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		String errorMsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		
		System.out.println(errorMsg);
		
		if(errorMsg.contains("Login was unsuccessful")) {
			System.out.println("error message is displayed");
		}else {
			System.out.println("error message is not displayed");
		}

	}

}
