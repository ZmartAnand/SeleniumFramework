package SelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnListBoxAssignment {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/signup"); 

		WebElement monthListbox = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthListbox);
		
		 List<WebElement> allOptions = monthSelect.getOptions();
		
		 System.out.println(allOptions.size());
		 
		 for(WebElement option:allOptions) {
			 System.out.println(option.getText());
		 }
		

	}

}
