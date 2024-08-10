package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TOoLearnIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver= new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://instagram.com/");
		
		Thread.sleep(2000);
		
	//	driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		System.out.println("===before sending data====");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		
		driver.findElement(By.name("username")).sendKeys("testing");
		driver.findElement(By.name("password")).sendKeys("test123");
		
		System.out.println("===after sending data====");
		System.out.println(loginButton.isDisplayed());
		System.out.println(loginButton.isEnabled());
		
	}	

}
