package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

		driver.get("https://facebook.com/signup");
		
		WebElement dayDropdown = driver.findElement(By.id("day"));
		Select daySelect = new Select(dayDropdown);
		daySelect.selectByVisibleText("10");
		
//		daySelect.selectByIndex(9);
//		daySelect.selectByValue("10");
		
		WebElement monthDropdown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropdown);
		monthSelect.selectByVisibleText("Aug");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropdown);
		yearSelect.selectByVisibleText("1947");
		
	
		
	}

}
