package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPOpUp {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
////	driver.get("https://www.agoda.com/?ds=lXVecgkcx8VYfh2i");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@role='button']")).click();
		
		
		driver.get("https://www.woodenstreet.com/?");
		Thread.sleep(2000);
		driver.findElement(By.id("loginclose1")).click();
	}

}
