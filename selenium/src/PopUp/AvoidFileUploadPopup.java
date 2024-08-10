package PopUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvoidFileUploadPopup {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.naukri.com/registration/createAccount");
		driver.findElement(By.xpath("//h2[text()=\"I'm experienced\"]")).click();
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\ASUS\\eclipse-workspace\\selenium\\Resume\\Anand-Front-End-Development-Resume (1).pdf");


		

	}

}
