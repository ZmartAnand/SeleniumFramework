package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bmw {
	@Test(groups="system")
	public void LaunchBmw() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.bmw.in/en/index.html");
		Reporter.log("Bmw Launched Succesfully");
	}

}
