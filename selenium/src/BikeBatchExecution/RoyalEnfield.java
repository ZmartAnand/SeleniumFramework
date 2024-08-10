package BikeBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield {
	@Test()
	public void LaunchBullet() {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.royalenfield.com/in/en/home/");
		Reporter.log("RoyalEnfeild Launched Successfully",true);
	}

}
