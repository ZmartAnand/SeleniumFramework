package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFileUpload {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.freshersworld.com/user/register");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ASUS\\eclipse-workspace\\selenium\\Resume\\Anand-Front-End-Development-Resume (1).pdf");


		

	}

}
