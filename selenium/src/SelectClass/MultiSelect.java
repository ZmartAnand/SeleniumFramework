package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));

		driver.get("https://demoapp.skillrary.com/");
		
		WebElement priceListbox = driver.findElement(By.id("cars"));
		Select priceSelect = new Select(priceListbox);
		
		priceSelect.selectByIndex(0);
		priceSelect.selectByValue("99");
		priceSelect.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		
		Thread.sleep(2000);
		priceSelect.deselectByIndex(0);
		priceSelect.deselectByValue("99");
		priceSelect.deselectAll();
		
	}

}
