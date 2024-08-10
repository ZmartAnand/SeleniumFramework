package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/"); 
		
	
		
		WebElement successMsg = driver.findElement(By.xpath("(//a[text()='14.1-inch Laptop'])/../..//input[@value='Add to cart']"));
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.invisibilityOf(successMsg));
		
		driver.findElement(By.linkText(null)).click();
		
		
		

		

	}

}
