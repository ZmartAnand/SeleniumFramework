package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LastOptionAssignment {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://facebook.com/signup");
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropdown);
		
		List<WebElement> yearTaken = yearSelect.getOptions();
		int output = yearTaken.size()-1;
		System.out.println(output);
		
		
		
		

	}

}
