package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentsat {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
//
//		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
//		
//		driver.switchTo().frame(parentFrame);
//		driver.switchTo().frame(0);
//		driver.findElement(By.id("email")).sendKeys("s.anandsiva7897@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Anand123");
		
		
		
		// multiple iframes
		
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(parentFrame);
		driver.findElement(By.id("email")).sendKeys("s.anandsiva7897@gmail.com");
		
		//class
		driver.switchTo().defaultContent();
		WebElement SecondFrame = driver.findElement(By.xpath("(//iframe[@class='w-full h-96'])[2]"));
		driver.switchTo().frame(SecondFrame);
		driver.findElement(By.id("username")).sendKeys("Anand");
		
		




	}

}
