package SelectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment28 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");
		
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("982167674");
		
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
		

	}

}
