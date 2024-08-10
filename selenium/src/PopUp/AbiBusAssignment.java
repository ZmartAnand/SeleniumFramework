package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbiBusAssignment {

	public static void main(String[] args) throws InterruptedException {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

		driver.get("https://www.abhibus.com/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//div[@class=\"container text-input  \"]//input)[3]")).click();
		Thread.sleep(2000);
//		
//		String month = "September";
//		int year = 2024;
//		int date = 20;

		while (true) {
			try {

				driver.findElement(By.xpath("//div[@style=\"text-align: center;\"]/../..//span[text()='24']")).click();
				break;
			} catch (Exception e) {

				driver.findElement(By.xpath("(//*[@viewBox='0 0 8.414 14.828'])[1]")).click();
			}
		}


	}

}
