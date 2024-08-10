package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RollsRoyce {
	@Test
	public void LaunchRollsRoyce() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		Reporter.log("RollsRoyce Launched Succesfully");
	}

}
