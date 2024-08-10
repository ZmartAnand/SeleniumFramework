package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Lamborghin {
	@Test
	public void LaunchLamborghin() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.lamborghini.com/en-en");
		Reporter.log("Lamborghin Launched Succesfully");
	}

}


