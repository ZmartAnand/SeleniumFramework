package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://yonobusiness.sbi/");
		driver.findElement(By.partialLinkText("LOGIN")).click();
		driver.findElement(By.id("password")).sendKeys("test@123");
		WebElement Hold = driver.findElement(By.xpath("//div[@class='showPassword shownhide']"));
		
		Actions act = new Actions(driver);
		act.clickAndHold(Hold).perform();
		Thread.sleep(2000);
		act.release(Hold).perform();
		act.release(Hold).perform();
		
		

	}

}
