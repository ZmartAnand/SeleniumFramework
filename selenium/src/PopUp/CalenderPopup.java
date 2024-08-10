package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();
		Thread.sleep(2000);

		String month = "October";
		int year = 2024;
		int date = 20;

		while (true) {
			try {

				driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//p[text()='"+date+"']")).click();
				break;
			} catch (Exception e) {

				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();

			}

		}

	}

}
